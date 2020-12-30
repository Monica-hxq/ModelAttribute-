/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : cruddemo

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2020-12-30 19:36:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王五', '1', '123456');
INSERT INTO `user` VALUES ('2', '哼哼哼', '16', '123456');
