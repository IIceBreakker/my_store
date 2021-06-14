package com.boss.mystore.util;

import cn.hutool.core.bean.BeanUtil;
import com.boss.mystore.pojo.dto.AccountDTO;
import io.jsonwebtoken.*;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * JWT工具类
 *
 * @author fanghan
 */
public class JwtUtil {


    /**
     * 默认过期时间
     */
    private static final long TOKEN_EXPIRED_TIME = 30 * 24 * 60 * 60;

    /**
     * JWT秘钥
     */
    private static final String JWT_SECRET = "ADMIN";

    /**
     * 生成用户Token
     *
     * @param accountDTO 用户数据传输对象
     * @return Token字符串
     */
    public static String generateToken(AccountDTO accountDTO) {
        Map<String, Object> claims = BeanUtil.beanToMap(accountDTO);
        return creatJwt(claims, TOKEN_EXPIRED_TIME);
    }

    /**
     * @param token token字符串
     * @return 用户DTO对象
     */
    public static AccountDTO getAccountInfoFromToken(String token) {
        Claims claims = parseJwt(token);
        AccountDTO accountDTO = new AccountDTO();
        if (claims != null) {
            accountDTO.setUsername((String) claims.get("username"));
            accountDTO.setCountry((String) claims.get("country"));
            accountDTO.setCity((String) claims.get("city"));
            accountDTO.setAddress((String) claims.get("address"));
            accountDTO.setPhone((Long) claims.get("phone"));
            accountDTO.setZip((Long) claims.get("zip"));
        }
        return accountDTO;
    }
    
    /**
     * 生成JWT
     *
     * @param claims JWT声明部分
     * @param time 过期时间
     * @return 生成的JWT字符串
     */
    public static String creatJwt(Map<String, Object> claims, Long time) {
        SecretKey key = generalKey();
        Date now = new Date(System.currentTimeMillis());

        //构建JWT
        JwtBuilder builder = Jwts.builder()
                .setClaims(claims)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(now)
                .signWith(key, SignatureAlgorithm.HS256);

        //以下是过期时间设置
        long nowMillis = System.currentTimeMillis();
        Date expire;
        if (time >= 0) {
            expire = new Date(nowMillis + time);
        } else {
            expire = new Date(nowMillis + TOKEN_EXPIRED_TIME);
        }
        builder.setExpiration(expire);

        return builder.compact();
    }

    /**
     * 解析JWT
     *
     * @param token 客户端的请求token
     * @return JWT中解析出的声明
     */
    public static Claims parseJwt(String token) {
        SecretKey key = generalKey();
        Claims claims;
        try {
            claims = Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        } catch (JwtException ignored) {
            //使用原来的key解析失败
            claims = null;
        }
        return claims;
    }

    /**
     * 生成JWT的秘钥
     *
     * @return 生成的JWT秘钥
     */
    private static SecretKey generalKey() {
        byte[] encodeKey = Base64.decodeBase64(JWT_SECRET);
        return new SecretKeySpec(encodeKey, 0, encodeKey.length, "AES");
    }
}
