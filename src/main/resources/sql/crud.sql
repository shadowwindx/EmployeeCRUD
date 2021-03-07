/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.21 : Database - inceptime
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`inceptime` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `inceptime`;

/*Table structure for table `emp` */

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `empId` int NOT NULL AUTO_INCREMENT,
  `empName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `empEmail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `empAddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `empBirthday` date DEFAULT NULL,
  `empSalary` int DEFAULT NULL,
  `empGender` tinytext CHARACTER SET utf8 COLLATE utf8_general_ci,
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `emp` */

insert  into `emp`(`empId`,`empName`,`empEmail`,`empAddress`,`empBirthday`,`empSalary`,`empGender`) values 
(1,'王建民','Chien-Ming@gmail.com','台南市關廟區中山路一段40號','1980-03-31',500000,'男'),
(2,'戴資穎','TzuYing@gmail.com','高雄市前鎮區沱江街166巷20號','1994-06-20',700000,'女'),
(3,'張忠謀','MorrisChang@gmail.com','台北市中山區北安路608巷4弄6','1931-07-10',1000000,'男'),
(4,'吳青峰','Qing-Feng@gmail.com','台北市中正區福州街53號','1982-08-30',66000,'男');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userId` int NOT NULL AUTO_INCREMENT,
  `accountName` varchar(50) DEFAULT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`userId`,`accountName`,`userName`,`password`) values 
(1,'admin','admin','admin');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
