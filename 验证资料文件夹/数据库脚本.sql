

create database test;

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `tb_resume`;
CREATE TABLE `tb_resume` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `tb_resume` VALUES ('1', '北京', '张三', '131000000');
INSERT INTO `tb_resume` VALUES ('2', '上海', '李四', '151000000');
INSERT INTO `tb_resume` VALUES ('3', '广州', '王五', '153000000');
INSERT INTO `tb_resume` VALUES ('8', '苏州', '蝴蝶', '13057222555');
INSERT INTO `tb_resume` VALUES ('9', '成都', '赵六六', '132000000');
