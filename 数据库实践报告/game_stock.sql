/*
 Navicat Premium Data Transfer

 Source Server         : game
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : game

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 13/12/2023 21:24:29
*/

/*suppliers sql
insert into suppliers(publisher,developer,gmcount,avgprice,likes)
  select publisher,developer,count(*),avg(price),avg(lkrate) from gms g group by g.publisher
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for adm
-- ----------------------------
DROP TABLE IF EXISTS `adm`;
CREATE TABLE `adm`  (
  `userNo` int(4) NOT NULL AUTO_INCREMENT,
  `userName` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pwd` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`userNo`) USING BTREE,
  UNIQUE INDEX `userName`(`userName`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of adm
-- ----------------------------
INSERT INTO `adm` VALUES (1, 'voxhugh', '123456');
INSERT INTO `adm` VALUES (2, 'zhaifangbin', '123456');
INSERT INTO `adm` VALUES (3, 'lizonglun', '123456');

-- ----------------------------
-- Table structure for gms
-- ----------------------------
DROP TABLE IF EXISTS `gms`;
CREATE TABLE `gms`  (
  `id` int(7) NOT NULL AUTO_INCREMENT COMMENT '游戏id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `price` decimal(15, 0) NOT NULL COMMENT '价格',
  `lprice` decimal(15, 0) NOT NULL COMMENT '历史最低',
  `lkrate` int(3) NOT NULL COMMENT '好评率',
  `monline` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '月均在线人数',
  `avgtime` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '平均游戏时间',
  `developer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '开发商',
  `publisher` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发行商',
  PRIMARY KEY (`id`, `name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 53 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gms
-- ----------------------------
INSERT INTO `gms` VALUES (1, '艾尔登法环', 298, 197, 92, '28000', '90.3', 'FromSoftware', 'Bandai Namco');
INSERT INTO `gms` VALUES (2, '黑暗之魂三', 268, 45, 94, '7647', '71.9', 'FromSoftware', 'Bandai Namco');
INSERT INTO `gms` VALUES (3, '只狼：影逝二度', 268, 134, 95, '6878', '44.6', 'FromSoftware', 'CubeGame');
INSERT INTO `gms` VALUES (4, '怪物猎人：世界', 203, 67, 88, '28000', '147.5', 'CAPCOM', 'CAPCOM');
INSERT INTO `gms` VALUES (5, '生化危机4 重制版', 298, 149, 97, '4995', '32.7', 'CAPCOM', 'CAPCOM');
INSERT INTO `gms` VALUES (6, '鬼泣5', 148, 49, 96, '1387', '18.9', 'CAPCOM', 'CAPCOM');
INSERT INTO `gms` VALUES (7, '逆转裁判123成步堂精选集', 148, 53, 97, '1153', '18.6', 'CAPCOM', 'CAPCOM');
INSERT INTO `gms` VALUES (8, '怪物猎人：崛起', 198, 79, 86, '12000', '85.3', 'CAPCOM', 'CAPCOM');
INSERT INTO `gms` VALUES (9, '生化危机7', 123, 46, 95, '716', '13.1', 'CAPCOM', 'CAPCOM');
INSERT INTO `gms` VALUES (10, '生化危机8：村庄', 218, 87, 95, '1310', '17.6', 'CAPCOM', 'CAPCOM');
INSERT INTO `gms` VALUES (11, '女神异闻录5皇家版', 329, 197, 97, '5969', '51.1', 'ATLUS', 'SEGA');
INSERT INTO `gms` VALUES (12, '人中之龙 维新！极', 289, 159, 84, '356', '23.0', 'Ryu Ga Gotoku', 'SEGA');
INSERT INTO `gms` VALUES (13, '初音未来：歌姬计划39\'s', 239, 96, 93, '315', '18.9', 'SEGA', 'SEGA');
INSERT INTO `gms` VALUES (14, '刺客信条：奥德赛', 298, 60, 89, '5530', '54.2', 'Ubisoft', 'Ubisoft');
INSERT INTO `gms` VALUES (15, '孤岛惊魂6', 298, 75, 72, '2791', '18.1', 'Ubisoft', 'Ubisoft');
INSERT INTO `gms` VALUES (16, '彩虹六号', 88, 19, 0, '42000', '184.2', 'Ubisoft', 'Ubisoft');
INSERT INTO `gms` VALUES (17, '完美音浪', 125, 94, 97, '303', '7.4', 'Tango', 'Bethesda');
INSERT INTO `gms` VALUES (18, '星空', 298, 209, 68, '17000', '31.1', 'Bethesda', 'Bethesda');
INSERT INTO `gms` VALUES (19, '上古卷轴5：天际特别版', 165, 33, 94, '21000', '30.7', 'Bethesda', 'Bethesda');
INSERT INTO `gms` VALUES (20, '辐射4', 83, 20, 83, '16000', '44.2', 'Bethesda', 'Bethesda');
INSERT INTO `gms` VALUES (21, '植物大战僵尸', 21, 19, 97, '4493', '26.1', 'PopCap', 'Electronic Arts');
INSERT INTO `gms` VALUES (22, '双人成行', 198, 59, 95, '6357', '16.0', 'Hazelight', 'Electronic Arts');
INSERT INTO `gms` VALUES (23, '战地5', 228, 18, 70, '26000', '30.9', 'DICE', 'Electronic Arts');
INSERT INTO `gms` VALUES (24, '求生之路2', 42, 4, 97, '27000', '28.9', 'Valve', 'Valve');
INSERT INTO `gms` VALUES (25, '反恐精英', 37, 3, 96, '13000', '71.4', 'Valve', 'Valve');
INSERT INTO `gms` VALUES (26, '尼尔：机械纪元', 274, 137, 87, '542', '27.6', 'Square Enix', 'Sqaure Enix');
INSERT INTO `gms` VALUES (27, '最终幻想7 重制版', 446, 223, 89, '1360', '20.4', 'Square Enix', 'Square Enix');
INSERT INTO `gms` VALUES (28, '歧路旅人 II', 379, 265, 95, '493', '30.4', 'Square Enix', 'Square Enix');
INSERT INTO `gms` VALUES (29, '极限竞速：地平线 5', 248, 124, 88, '14000', '39.5', 'Playground', 'Xbox Game');
INSERT INTO `gms` VALUES (30, '精灵与萤火意志', 90, 18, 96, '1052', '11.3', 'Moon', 'Xbox Game');
INSERT INTO `gms` VALUES (31, '意航员2', 169, 42, 96, '92', '5.8', 'Double Fine', 'Xbox Game');
INSERT INTO `gms` VALUES (32, '战神', 345, 167, 96, '3040', '24.7', 'Santa Monica', 'PlayStation');
INSERT INTO `gms` VALUES (33, '漫威蜘蛛侠：重制版', 414, 254, 96, '3690', '22.7', 'Insomniac', 'PlayStation');
INSERT INTO `gms` VALUES (34, '侠盗猎车手5', 179, 40, 86, '135000', '148.8', 'Rockstar', 'Rockstar');
INSERT INTO `gms` VALUES (35, '荒野大镖客：救赎2', 279, 82, 91, '44000', '60.3', 'Rockstar', 'Rockstar');
INSERT INTO `gms` VALUES (36, '进击的巨人2', 217, 46, 93, '317', '26.3', 'KOEI TECMO', 'KOEI TECMO');
INSERT INTO `gms` VALUES (37, '莱莎的炼金工房3', 349, 244, 92, '158', '21.9', 'KOEI TECMO', 'KOEI TECMO');
INSERT INTO `gms` VALUES (38, '赛博朋克2077', 298, 149, 81, '50000', '56.2', 'CD PROJECT', 'CD PROJECT');
INSERT INTO `gms` VALUES (39, '巫师3：狂猎', 149, 25, 96, '18000', '34.7', 'CD PROJECT', 'CD PROJECT');
INSERT INTO `gms` VALUES (40, '博德之门3', 298, 298, 96, '113000', '63.9', 'Larian', 'Larian');
INSERT INTO `gms` VALUES (41, '空洞骑士', 58, 19, 97, '6240', '28.7', 'Team Cherry', 'Team Cherry');
INSERT INTO `gms` VALUES (42, '茶杯头', 68, 47, 96, '1711', '10.4', 'MDHR', 'MDHR');
INSERT INTO `gms` VALUES (43, '人狼村之谜', 88, 57, 96, '68', '18.5', 'KEMCO', 'KEMCO');
INSERT INTO `gms` VALUES (44, '魔戒：咕噜', 199, 80, 37, '6', '7.1', 'Daedalic', 'Nacon');
INSERT INTO `gms` VALUES (45, '哈迪斯', 92, 40, 98, '5940', '25.4', 'Supergiant', 'Supergiant');
INSERT INTO `gms` VALUES (46, '巧克力与香子兰 Vol.4', 42, 25, 97, '36', '21.2', 'NEKO', 'Sekai Project');
INSERT INTO `gms` VALUES (47, '港诡实录', 56, 28, 90, '89', '5.8', 'Ghostpie', 'Ghostpie');
INSERT INTO `gms` VALUES (48, '完蛋！我被美女包围了！', 42, 38, 95, '2241', '4.9', 'intiny', 'intiny');
INSERT INTO `gms` VALUES (49, '泰拉瑞亚', 42, 12, 97, '36000', '68.0', 'Re-Logic', 'Re-Logic');
INSERT INTO `gms` VALUES (50, '饥荒', 24, 6, 96, '1638', '21.6', 'Klei', 'Klei');
INSERT INTO `gms` VALUES (51, '武士 零', 58, 30, 98, '160', '7.1', 'Askiisoft', 'Devolver Digital');

-- ----------------------------
-- Table structure for suppliers
-- ----------------------------
DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE `suppliers`  (
  `publisher` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发行商',
  `developer` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '开发商',
  `gmcount` int(3) NOT NULL COMMENT '游戏数量',
  `avgprice` decimal(15, 0) NOT NULL COMMENT '游戏均价',
  `likes` int(3) NOT NULL COMMENT '受欢迎度',
  PRIMARY KEY (`publisher`) USING BTREE,
  INDEX `fk1`(`publisher`, `developer`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of suppliers
-- ----------------------------
INSERT INTO `suppliers` VALUES ('Bandai Namco', 'FromSoftware', 2, 283, 93);
INSERT INTO `suppliers` VALUES ('Bethesda', 'Tango', 4, 168, 86);
INSERT INTO `suppliers` VALUES ('CAPCOM', 'CAPCOM', 7, 191, 93);
INSERT INTO `suppliers` VALUES ('CD PROJECT', 'CD PROJECT', 2, 224, 89);
INSERT INTO `suppliers` VALUES ('CubeGame', 'FromSoftware', 1, 268, 95);
INSERT INTO `suppliers` VALUES ('Electronic Arts', 'PopCap', 3, 149, 87);
INSERT INTO `suppliers` VALUES ('Ghostpie', 'Ghostpie', 1, 56, 90);
INSERT INTO `suppliers` VALUES ('intiny', 'intiny', 1, 42, 95);
INSERT INTO `suppliers` VALUES ('KEMCO', 'KEMCO', 1, 88, 96);
INSERT INTO `suppliers` VALUES ('Klei', 'Klei', 1, 24, 96);
INSERT INTO `suppliers` VALUES ('KOEI TECMO', 'KOEI TECMO', 2, 283, 93);
INSERT INTO `suppliers` VALUES ('Larian', 'Larian', 1, 298, 96);
INSERT INTO `suppliers` VALUES ('MDHR', 'MDHR', 1, 68, 96);
INSERT INTO `suppliers` VALUES ('Nacon', 'Daedalic', 1, 199, 37);
INSERT INTO `suppliers` VALUES ('PlayStation', 'Santa Monica', 2, 380, 96);
INSERT INTO `suppliers` VALUES ('Re-Logic', 'Re-Logic', 1, 42, 97);
INSERT INTO `suppliers` VALUES ('Rockstar', 'Rockstar', 2, 229, 89);
INSERT INTO `suppliers` VALUES ('SEGA', 'ATLUS', 3, 286, 91);
INSERT INTO `suppliers` VALUES ('Sekai Project', 'NEKO', 1, 42, 97);
INSERT INTO `suppliers` VALUES ('Sqaure Enix', 'Square Enix', 1, 274, 87);
INSERT INTO `suppliers` VALUES ('Square Enix', 'Square Enix', 2, 413, 92);
INSERT INTO `suppliers` VALUES ('Supergiant', 'Supergiant', 1, 92, 98);
INSERT INTO `suppliers` VALUES ('Team Cherry', 'Team Cherry', 1, 58, 97);
INSERT INTO `suppliers` VALUES ('Ubisoft', 'Ubisoft', 3, 228, 54);
INSERT INTO `suppliers` VALUES ('Valve', 'Valve', 2, 40, 97);
INSERT INTO `suppliers` VALUES ('Xbox Game', 'Playground', 3, 169, 93);

SET FOREIGN_KEY_CHECKS = 1;
