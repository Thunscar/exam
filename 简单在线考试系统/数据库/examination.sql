/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50151
Source Host           : localhost:3306
Source Database       : examination

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2020-06-18 16:01:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `time` varchar(255) NOT NULL,
  `count` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('2020-12-22 12:00:00', '2');

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `name` varchar(255) NOT NULL,
  `score` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('111', '0');
INSERT INTO `score` VALUES ('张三', '100');
INSERT INTO `score` VALUES ('张三', '100');
INSERT INTO `score` VALUES ('张三', '100');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ques` text NOT NULL,
  `answer` varchar(255) NOT NULL,
  `A` text NOT NULL,
  `B` text NOT NULL,
  `C` text NOT NULL,
  `D` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('2', '1+0=?', 'b', '0', '1', '2', '3');
INSERT INTO `test` VALUES ('3', '1+2=?', 'c', '1', '2', '3', '4');
INSERT INTO `test` VALUES ('4', '1+3=?', 'b', '2', '4', '3', '5');
INSERT INTO `test` VALUES ('5', '1+7=?', 'a', '8', '9', '6', '5');
INSERT INTO `test` VALUES ('6', '1+9', 'c', '8', '2', '10', '45');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `userpwd` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('张三', '111', '学生');
INSERT INTO `user` VALUES ('ng', 'niegang', '老师');
