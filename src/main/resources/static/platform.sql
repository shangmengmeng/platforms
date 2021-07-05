/*
 Navicat Premium Data Transfer

 Source Server         : 丫丫
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 116.62.149.187:3306
 Source Schema         : platform

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 04/03/2021 23:20:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chat_friend
-- ----------------------------
DROP TABLE IF EXISTS `chat_friend`;
CREATE TABLE `chat_friend`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'chat_user 表的uuid',
  `uuid_friend` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '朋友的uuid',
  `friend_avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `friend_nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `uuid`(`uuid`) USING BTREE,
  CONSTRAINT `uuid` FOREIGN KEY (`uuid`) REFERENCES `chat_user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chat_friend
-- ----------------------------

-- ----------------------------
-- Table structure for chat_user
-- ----------------------------
DROP TABLE IF EXISTS `chat_user`;
CREATE TABLE `chat_user`  (
  `uid` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户uuid',
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '关联客户端用户',
  `nikename` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `offline` int(0) NOT NULL,
  `create_time` datetime(6) NOT NULL,
  `type` int(0) NOT NULL COMMENT '用户类型，默认为1：普通用户',
  `avatar` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chat_user
-- ----------------------------
INSERT INTO `chat_user` VALUES ('1212', '11213', '一朵小红花', 1, '2021-03-03 22:51:45.000000', 1, '1111');

-- ----------------------------
-- Table structure for star_user
-- ----------------------------
DROP TABLE IF EXISTS `star_user`;
CREATE TABLE `star_user`  (
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `user_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户id',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '密码',
  `telephone` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '邮箱',
  `avatorl` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `nickname` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `gender` tinyint(0) NULL DEFAULT NULL COMMENT '性别'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of star_user
-- ----------------------------
INSERT INTO `star_user` VALUES ('sam', '111232', '123', '18357001024', '123', NULL, NULL, 0);
INSERT INTO `star_user` VALUES ('hehe', '111122', '1111', '11111111', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
