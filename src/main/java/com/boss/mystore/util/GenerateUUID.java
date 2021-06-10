package com.boss.mystore.util;

import java.text.SimpleDateFormat;

/**
 * @author fanghan
 */
public class GenerateUUID {
    private static final Long MAX_SUFFIX = 9999999L;
    private static int GUID = 100;
    public static Long getUUID() {
        	GUID += 1;
			long now = System.currentTimeMillis();
			//获取4位年份数字
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
			//获取时间戳
			String time = dateFormat.format(now);
			String info = now + "";

			if (GUID > MAX_SUFFIX) {
				GUID = 100;
			}
			int ran = GUID;

			return Long.parseLong(time + info.substring(2) + ran);
    }
}
