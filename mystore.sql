/*
 Navicat Premium Data Transfer

 Source Server         : fanghan
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : mystore

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 19/06/2021 17:29:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `city` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '城市',
  `country` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '国家',
  `zip` bigint(0) NULL DEFAULT NULL COMMENT '邮编',
  `phone` bigint(0) NULL DEFAULT NULL COMMENT '电话',
  `address` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('acid', 'acid', '长沙市', '中国', 133300, 15274954583, '湖南省长沙市中南大学');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `id` bigint(0) NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `item_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品ID',
  `quantity` int(0) NOT NULL COMMENT '购买数量',
  PRIMARY KEY (`id`, `username`, `item_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `item_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品ID',
  `list_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `description` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品描述',
  PRIMARY KEY (`item_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('AIRCONDITION-024', 623.90, '空调系统24型');
INSERT INTO `item` VALUES ('AIRCONDITION-025', 700.00, '空调系统25型');
INSERT INTO `item` VALUES ('BACKPACK-257', 279.00, '背包257型');
INSERT INTO `item` VALUES ('CLOCK-377', 10.28, '闹钟377型');
INSERT INTO `item` VALUES ('CUP-337', 21.40, '杯子337型');
INSERT INTO `item` VALUES ('FAN-222', 100.10, '风扇222型');
INSERT INTO `item` VALUES ('INK-023', 10.25, '墨水23型');
INSERT INTO `item` VALUES ('KEYBOARD-089', 230.70, '键盘89型');
INSERT INTO `item` VALUES ('MOUSE-057', 257.40, '鼠标57型');
INSERT INTO `item` VALUES ('MOUSE-099', 390.80, '鼠标99型');
INSERT INTO `item` VALUES ('PEN-001', 3.15, '钢笔1型');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` bigint(0) NOT NULL COMMENT '订单编号',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  `total_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '订单总价',
  `card_number` bigint(0) NULL DEFAULT NULL COMMENT '付款卡号',
  `card_type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '卡种类',
  `ship_addr` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收件地址',
  `ship_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收件人',
  `ship_phone` bigint(0) NULL DEFAULT NULL COMMENT '收件人电话',
  `order_date` datetime(0) NULL DEFAULT NULL COMMENT '订单日期',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (12343432243476, 'acid', 12.20, 324353465465476576, 'Master Card', 'CSU', 'FH', 1334343454, '2021-06-07 01:58:16');
INSERT INTO `order` VALUES (202123003320139101, 'acid', 12.20, 134234324, 'Master Card', '中南大学', '方晗', 134344343543, '2021-06-07 02:15:20');
INSERT INTO `order` VALUES (202123003877691101, 'acid', 12.20, 134234324, 'Master Card', '中南大学', '方晗', 134344343543, '2021-06-08 00:35:01');

SET FOREIGN_KEY_CHECKS = 1;
