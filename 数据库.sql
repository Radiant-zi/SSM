/*
Navicat MySQL Data Transfer

Source Server         : 王孜
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-07-05 15:51:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `countrycode` varchar(40) DEFAULT NULL,
  `district` varchar(40) DEFAULT NULL,
  `population` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('2', 'Qandahar', 'gf', 'Qandahar', '237500');
INSERT INTO `city` VALUES ('3', 'Herat', 'AFG', 'Herat', '186800');
INSERT INTO `city` VALUES ('4', 'Mazar-e-Sharif', 'AFG', 'Balkh', '127800');
INSERT INTO `city` VALUES ('5', 'Amsterdam', 'NLD', 'Noord-Holland', '731200');
INSERT INTO `city` VALUES ('6', 'Rotterdam', 'NLD', 'Zuid-Holland', '593321');
INSERT INTO `city` VALUES ('7', 'Haag', 'NLD', 'Zuid-Holland', '440900');
INSERT INTO `city` VALUES ('8', 'Utrecht', 'NLD', 'Utrecht', '234323');
INSERT INTO `city` VALUES ('9', 'Eindhoven', 'NLD', 'Noord-Brabant', '201843');
INSERT INTO `city` VALUES ('10', 'Tilburg', 'NLD', 'Noord-Brabant', '193238');
INSERT INTO `city` VALUES ('11', 'Groningen', 'NLD', 'Groningen', '172701');
INSERT INTO `city` VALUES ('12', 'Breda', 'NLD', 'Noord-Brabant', '160398');
INSERT INTO `city` VALUES ('13', 'Apeldoorn', 'NLD', 'Gelderland', '153491');
INSERT INTO `city` VALUES ('14', 'Nijmegen', 'NLD', 'Gelderland', '152463');
INSERT INTO `city` VALUES ('15', 'Enschede', 'NLD', 'Overijssel', '149544');
INSERT INTO `city` VALUES ('16', 'Haarlem', 'NLD', 'Noord-Holland', '148772');
INSERT INTO `city` VALUES ('17', 'Almere', 'NLD', 'Flevoland', '142465');
INSERT INTO `city` VALUES ('18', 'Arnhem', 'NLD', 'Gelderland', '138020');
INSERT INTO `city` VALUES ('19', 'Zaanstad', 'NLD', 'Noord-Holland', '135621');
INSERT INTO `city` VALUES ('20', 'Â´s-Hertogenbosch', 'NLD', 'Noord-Brabant', '129170');
INSERT INTO `city` VALUES ('21', 'Amersfoort', 'NLD', 'Utrecht', '126270');
INSERT INTO `city` VALUES ('155', '中国', '荷兰', 'asas', '32');
