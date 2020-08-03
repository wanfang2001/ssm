/*
 Navicat Premium Data Transfer

 Source Server         : T242
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 03/08/2020 10:34:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_jz_business
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_business`;
CREATE TABLE `t_jz_business`  (
  `t_business_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长,类别编号',
  `t_business_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类别称名',
  PRIMARY KEY (`t_business_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_message
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_message`;
CREATE TABLE `t_jz_message`  (
  `t_message_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长,留言编号',
  `t_message_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '留言的内容',
  `t_message_createdate` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`t_message_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_permission`;
CREATE TABLE `t_jz_permission`  (
  `t_per_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限编号',
  `t_per_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限名称',
  `t_pid` int(255) NOT NULL COMMENT '父ID',
  `t_per_permission` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限',
  PRIMARY KEY (`t_per_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_role
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_role`;
CREATE TABLE `t_jz_role`  (
  `t_role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号，主键',
  `t_role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名',
  `t_role_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色描述',
  PRIMARY KEY (`t_role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_role_permission`;
CREATE TABLE `t_jz_role_permission`  (
  `t_rp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表编号',
  `t_role_id` int(11) NOT NULL COMMENT '角色id',
  `t_per_id` int(11) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`t_rp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_shope
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_shope`;
CREATE TABLE `t_jz_shope`  (
  `t_shope_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长,店铺编号',
  `t_shope_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺称名',
  `t_shope_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺地址',
  `t_shope_createdate` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`t_shope_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_staffrole
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_staffrole`;
CREATE TABLE `t_jz_staffrole`  (
  `t_staffrole_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长',
  `t_staffrole_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工角色名',
  `t_staffrole_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工角色描述',
  PRIMARY KEY (`t_staffrole_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_staffrole_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_staffrole_permission`;
CREATE TABLE `t_jz_staffrole_permission`  (
  `t_sp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表编号',
  `t_staffrole_id` int(11) NOT NULL COMMENT '员工角色id',
  `t_per_id` int(11) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`t_sp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_team
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_team`;
CREATE TABLE `t_jz_team`  (
  `t_team_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长,团队编号',
  `t_team_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '团队名',
  PRIMARY KEY (`t_team_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_tool
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_tool`;
CREATE TABLE `t_jz_tool`  (
  `t_tool_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长,工具编号',
  `t_tool_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工具名称',
  `t_tool_count` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工具库存',
  PRIMARY KEY (`t_tool_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_users
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_users`;
CREATE TABLE `t_jz_users`  (
  `t_users_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号，主键',
  `t_users_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称 ',
  `t_users_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `t_users_sale` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '盐',
  `t_users_createdate` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`t_users_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_jz_users_role
-- ----------------------------
DROP TABLE IF EXISTS `t_jz_users_role`;
CREATE TABLE `t_jz_users_role`  (
  `t_ur_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增长',
  `t_users_id` int(11) NOT NULL COMMENT '用户编号',
  `t_role_id` int(11) NOT NULL COMMENT '角色编号',
  PRIMARY KEY (`t_ur_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `t_order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `t_order_createdate` datetime(0) NOT NULL COMMENT '订单创建时间',
  PRIMARY KEY (`t_order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_order_team
-- ----------------------------
DROP TABLE IF EXISTS `t_order_team`;
CREATE TABLE `t_order_team`  (
  `t_ors_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_order_id` int(11) NOT NULL COMMENT '订单编号',
  `t_team_id` int(11) NOT NULL COMMENT '团队编号',
  PRIMARY KEY (`t_ors_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_order_users
-- ----------------------------
DROP TABLE IF EXISTS `t_order_users`;
CREATE TABLE `t_order_users`  (
  `t_os_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_order_id` int(11) NOT NULL COMMENT '订单编号',
  `t_users_id` int(11) NOT NULL COMMENT '用户(客户)编号',
  PRIMARY KEY (`t_os_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_order_userss
-- ----------------------------
DROP TABLE IF EXISTS `t_order_userss`;
CREATE TABLE `t_order_userss`  (
  `t_ost_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_order_id` int(11) NOT NULL COMMENT '订单编号',
  `t_users_id` int(11) NOT NULL COMMENT '用户(员工)编号',
  PRIMARY KEY (`t_ost_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_staff_business
-- ----------------------------
DROP TABLE IF EXISTS `t_staff_business`;
CREATE TABLE `t_staff_business`  (
  `t_sb_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_team_id` int(11) NOT NULL COMMENT '团队编号',
  `t_business_id` int(11) NOT NULL COMMENT '业务编号',
  PRIMARY KEY (`t_sb_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_staff_team
-- ----------------------------
DROP TABLE IF EXISTS `t_staff_team`;
CREATE TABLE `t_staff_team`  (
  `t_st_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_users_id` int(11) NOT NULL COMMENT '用户(员工)编号',
  `t_team_id` int(11) NOT NULL COMMENT '团队编号',
  PRIMARY KEY (`t_st_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_tool_team
-- ----------------------------
DROP TABLE IF EXISTS `t_tool_team`;
CREATE TABLE `t_tool_team`  (
  `t_tt_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_tool_id` int(11) NOT NULL COMMENT '工具编号',
  `t_team_id` int(11) NOT NULL COMMENT '团队编号',
  PRIMARY KEY (`t_tt_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_users_message
-- ----------------------------
DROP TABLE IF EXISTS `t_users_message`;
CREATE TABLE `t_users_message`  (
  `t_um_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_users_id` int(11) NOT NULL COMMENT '用户编号',
  `t_message_id` int(11) NOT NULL COMMENT '留言的编号',
  PRIMARY KEY (`t_um_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_users_shope
-- ----------------------------
DROP TABLE IF EXISTS `t_users_shope`;
CREATE TABLE `t_users_shope`  (
  `t_ms_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '桥接表的编号',
  `t_users_id` int(11) NULL DEFAULT NULL COMMENT '用户（商家）id',
  `t_shope_id` int(11) NULL DEFAULT NULL COMMENT '店铺的编号',
  PRIMARY KEY (`t_ms_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
