CREATE DATABASE  IF NOT EXISTS `lms` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `lms`;
-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: localhost    Database: lms
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `canhan`
--

DROP TABLE IF EXISTS `canhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canhan` (
  `id_cn` bigint(20) NOT NULL,
  `hoten_cn` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gioitinh_cn` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaysinh_cn` date DEFAULT NULL,
  `nguyenquan_cn` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdt_cn` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `facebook_cn` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trello_cn` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `slack_cn` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `skype_cn` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email_tk` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_cn`),
  KEY `fk_canhan_id_cn` (`email_tk`),
  CONSTRAINT `fk_canhan_taikhoan_email_tk` FOREIGN KEY (`email_tk`) REFERENCES `taikhoan` (`email_tk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canhan`
--

LOCK TABLES `canhan` WRITE;
/*!40000 ALTER TABLE `canhan` DISABLE KEYS */;
/*!40000 ALTER TABLE `canhan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datts`
--

DROP TABLE IF EXISTS `datts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `datts` (
  `id_datts` bigint(20) NOT NULL,
  `pm_datts` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `congviec_datts` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_nn` bigint(20) DEFAULT NULL,
  `id_tts` bigint(20) DEFAULT NULL,
  `id_da` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_datts`),
  KEY `fk_datts_id_nn` (`id_nn`),
  KEY `fk_datts_id_tts` (`id_tts`),
  KEY `fk_datts_id_da` (`id_da`),
  CONSTRAINT `fk_datts_duan_id_da` FOREIGN KEY (`id_da`) REFERENCES `duan` (`id_da`) ON UPDATE CASCADE,
  CONSTRAINT `fk_datts_ngonngu_id_nn` FOREIGN KEY (`id_nn`) REFERENCES `ngonngu` (`id_nn`) ON UPDATE CASCADE,
  CONSTRAINT `fk_datts_thuctapsinh_id_tts` FOREIGN KEY (`id_tts`) REFERENCES `thuctapsinh` (`id_tts`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datts`
--

LOCK TABLES `datts` WRITE;
/*!40000 ALTER TABLE `datts` DISABLE KEYS */;
/*!40000 ALTER TABLE `datts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doitac`
--

DROP TABLE IF EXISTS `doitac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doitac` (
  `id_dt` bigint(20) NOT NULL,
  `ten_dt` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `truso_dt` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `vanphong_dt` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdt_dt` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email_dt` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `website_dt` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bdhoptac_dt` date DEFAULT NULL,
  `kthoptac_dt` date DEFAULT NULL,
  PRIMARY KEY (`id_dt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doitac`
--

LOCK TABLES `doitac` WRITE;
/*!40000 ALTER TABLE `doitac` DISABLE KEYS */;
INSERT INTO `doitac` VALUES (1496286861121,'Hackademics Hà Nội','23 Tô Vĩnh Diện','23 Tô Vĩnh Diện','0963349571','hackademics-hanoi@gmail.com','hackademics-hanoi.vn','2017-01-01','2020-01-01'),(1496287086777,'CodeLover Việt Nam','210 Lê Trọng Tấn','210 Lê Trọng Tấn','0963349572','codelover-vietnam@gmail.com','codelover-vietnam.vn','2017-01-01','2020-01-01');
/*!40000 ALTER TABLE `doitac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dttd`
--

DROP TABLE IF EXISTS `dttd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dttd` (
  `id_dttd` bigint(20) NOT NULL,
  `vitri_dttd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soluong_dttd` date DEFAULT NULL,
  `id_nn` bigint(20) DEFAULT NULL,
  `id_dt` bigint(20) DEFAULT NULL,
  `id_td` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_dttd`),
  KEY `fk_dttd_id_nn` (`id_nn`),
  KEY `fk_dttd_id_dt` (`id_dt`),
  KEY `fk_dttd_id_td` (`id_td`),
  CONSTRAINT `fk_dttd_doitac_id_dt` FOREIGN KEY (`id_dt`) REFERENCES `doitac` (`id_dt`) ON UPDATE CASCADE,
  CONSTRAINT `fk_dttd_ngonngu_id_nn` FOREIGN KEY (`id_nn`) REFERENCES `ngonngu` (`id_nn`) ON UPDATE CASCADE,
  CONSTRAINT `fk_dttd_tuyendung_id_td` FOREIGN KEY (`id_td`) REFERENCES `tuyendung` (`id_td`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dttd`
--

LOCK TABLES `dttd` WRITE;
/*!40000 ALTER TABLE `dttd` DISABLE KEYS */;
/*!40000 ALTER TABLE `dttd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `duan`
--

DROP TABLE IF EXISTS `duan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `duan` (
  `id_da` bigint(20) NOT NULL,
  `ten_da` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `tenkhachhang_da` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bd_da` date DEFAULT NULL,
  `kt_da` date DEFAULT NULL,
  PRIMARY KEY (`id_da`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `duan`
--

LOCK TABLES `duan` WRITE;
/*!40000 ALTER TABLE `duan` DISABLE KEYS */;
INSERT INTO `duan` VALUES (1496291584849,'Quản lý học viên, thực tập sinh','Hackademics Hà Nội','2017-01-01','2017-04-01');
/*!40000 ALTER TABLE `duan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giangday`
--

DROP TABLE IF EXISTS `giangday`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `giangday` (
  `id_gd` bigint(20) NOT NULL,
  `noicongtac_dg` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chucvu_gd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bd_gd` date DEFAULT NULL,
  `kt_gd` date DEFAULT NULL,
  `id_cn` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_gd`),
  KEY `fk_giangday_id_cn` (`id_cn`),
  CONSTRAINT `fk_giangday_canhan_id_cn` FOREIGN KEY (`id_cn`) REFERENCES `canhan` (`id_cn`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giangday`
--

LOCK TABLES `giangday` WRITE;
/*!40000 ALTER TABLE `giangday` DISABLE KEYS */;
/*!40000 ALTER TABLE `giangday` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocphi`
--

DROP TABLE IF EXISTS `hocphi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hocphi` (
  `id_hp` bigint(20) NOT NULL,
  `phainop_hp` int(11) unsigned DEFAULT '0',
  `lan1_hp` int(11) unsigned DEFAULT '0',
  `ngaynop1_hp` date DEFAULT NULL,
  `lan2_hp` int(11) unsigned DEFAULT '0',
  `ngaynop2_hp` date DEFAULT NULL,
  `lan3_hp` int(11) unsigned DEFAULT '0',
  `ngaynop3_hp` date DEFAULT NULL,
  `lan4_hp` int(11) unsigned DEFAULT '0',
  `ngaynop4_hp` date DEFAULT NULL,
  PRIMARY KEY (`id_hp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocphi`
--

LOCK TABLES `hocphi` WRITE;
/*!40000 ALTER TABLE `hocphi` DISABLE KEYS */;
INSERT INTO `hocphi` VALUES (1496311841934,5000000,1000000,'2017-01-01',1000000,'2017-01-16',1000000,'2017-01-22',2000000,'2017-01-30'),(1496312186205,5000000,1000000,'2017-01-01',1000000,'2017-01-12',1000000,'2017-01-16',2000000,'2017-01-29');
/*!40000 ALTER TABLE `hocphi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocvien`
--

DROP TABLE IF EXISTS `hocvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hocvien` (
  `id_hv` bigint(20) NOT NULL,
  `thpt_hv` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `daihoc_hv` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `totnghiep_hv` date DEFAULT NULL,
  `id_cn` bigint(20) DEFAULT NULL,
  `id_loph` bigint(20) DEFAULT NULL,
  `id_hp` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_hv`),
  KEY `fk_hocvien_id_cn` (`id_cn`),
  KEY `fk_hocvien_id_loph` (`id_loph`),
  KEY `fk_hocvien_id_hp` (`id_hp`),
  CONSTRAINT `fk_hocvien_canhan_id_cn` FOREIGN KEY (`id_cn`) REFERENCES `canhan` (`id_cn`) ON UPDATE CASCADE,
  CONSTRAINT `fk_hocvien_hocphi_id_hp` FOREIGN KEY (`id_hp`) REFERENCES `hocphi` (`id_hp`) ON UPDATE CASCADE,
  CONSTRAINT `fk_hocvien_lophoc_id_loph` FOREIGN KEY (`id_loph`) REFERENCES `lophoc` (`id_loph`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocvien`
--

LOCK TABLES `hocvien` WRITE;
/*!40000 ALTER TABLE `hocvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `hocvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hvtts`
--

DROP TABLE IF EXISTS `hvtts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hvtts` (
  `id_hv` bigint(20) NOT NULL,
  `id_tts` bigint(20) NOT NULL,
  PRIMARY KEY (`id_hv`,`id_tts`),
  KEY `fk_hvtts_id_hv` (`id_hv`),
  KEY `fk_hvtts_id_tts` (`id_tts`),
  CONSTRAINT `fk_hvtts_hocvien_id_hv` FOREIGN KEY (`id_hv`) REFERENCES `hocvien` (`id_hv`) ON UPDATE CASCADE,
  CONSTRAINT `fk_hvtts_thuctapsinh_id_tts` FOREIGN KEY (`id_tts`) REFERENCES `thuctapsinh` (`id_tts`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hvtts`
--

LOCK TABLES `hvtts` WRITE;
/*!40000 ALTER TABLE `hvtts` DISABLE KEYS */;
/*!40000 ALTER TABLE `hvtts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lhlh`
--

DROP TABLE IF EXISTS `lhlh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lhlh` (
  `id_loph` bigint(20) NOT NULL,
  `id_lichh` bigint(20) NOT NULL,
  PRIMARY KEY (`id_loph`,`id_lichh`),
  KEY `fk_lhlh_id_loph` (`id_loph`),
  KEY `fk_lhlh_id_lichh` (`id_lichh`),
  CONSTRAINT `fk_lhlh_lichhoc_id_lichh` FOREIGN KEY (`id_lichh`) REFERENCES `lichhoc` (`id_lichh`) ON UPDATE CASCADE,
  CONSTRAINT `fk_lhlh_lophoc_id_loph` FOREIGN KEY (`id_loph`) REFERENCES `lophoc` (`id_loph`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lhlh`
--

LOCK TABLES `lhlh` WRITE;
/*!40000 ALTER TABLE `lhlh` DISABLE KEYS */;
/*!40000 ALTER TABLE `lhlh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lichhoc`
--

DROP TABLE IF EXISTS `lichhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lichhoc` (
  `id_lichh` bigint(20) NOT NULL,
  `thu` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bd_lichh` time DEFAULT NULL,
  `kt_lichh` time DEFAULT NULL,
  `diadiem_lichh` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_lichh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lichhoc`
--

LOCK TABLES `lichhoc` WRITE;
/*!40000 ALTER TABLE `lichhoc` DISABLE KEYS */;
INSERT INTO `lichhoc` VALUES (1496370045724,'Hai	','18:30:00','21:00:00','Phòng 601, Tầng 6, 23 Tô Vĩnh Diện');
/*!40000 ALTER TABLE `lichhoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lophgd`
--

DROP TABLE IF EXISTS `lophgd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lophgd` (
  `id_lophgd` bigint(20) NOT NULL,
  `vitri_gd` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_loph` bigint(20) DEFAULT NULL,
  `id_gd` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_lophgd`),
  KEY `fk_lophgd_id_loph` (`id_loph`),
  KEY `fk_lophgd_id_gd` (`id_gd`),
  CONSTRAINT `fk_llophgd_giangday_id_gd` FOREIGN KEY (`id_gd`) REFERENCES `giangday` (`id_gd`) ON UPDATE CASCADE,
  CONSTRAINT `fk_lophgd_lophoc_id_loph` FOREIGN KEY (`id_loph`) REFERENCES `lophoc` (`id_loph`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lophgd`
--

LOCK TABLES `lophgd` WRITE;
/*!40000 ALTER TABLE `lophgd` DISABLE KEYS */;
/*!40000 ALTER TABLE `lophgd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lophoc`
--

DROP TABLE IF EXISTS `lophoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lophoc` (
  `id_loph` bigint(20) NOT NULL,
  `ten_loph` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `bd_loph` date NOT NULL,
  `kt_loph` date DEFAULT NULL,
  PRIMARY KEY (`id_loph`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lophoc`
--

LOCK TABLES `lophoc` WRITE;
/*!40000 ALTER TABLE `lophoc` DISABLE KEYS */;
INSERT INTO `lophoc` VALUES (1496198664593,'H17JB1','2017-01-21','2017-04-21'),(1496198691282,'H17JB2','2017-01-22','2017-04-22'),(1496201772056,'H17JB3','2017-01-23','2017-04-23');
/*!40000 ALTER TABLE `lophoc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngonngu`
--

DROP TABLE IF EXISTS `ngonngu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ngonngu` (
  `id_nn` bigint(20) NOT NULL,
  `ten_nn` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id_nn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngonngu`
--

LOCK TABLES `ngonngu` WRITE;
/*!40000 ALTER TABLE `ngonngu` DISABLE KEYS */;
INSERT INTO `ngonngu` VALUES (1496630617342,'Java'),(1496630623788,'Php');
/*!40000 ALTER TABLE `ngonngu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taikhoan` (
  `email_tk` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `loai_tk` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `matkhau_tk` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fullname_tk` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaymo_tk` date DEFAULT NULL,
  `ngaykhoa_tk` date DEFAULT NULL,
  PRIMARY KEY (`email_tk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` VALUES ('tuananhvu17@gmail.com','Thực Tập Sinh','ntt1234','Vũ Tuấn Anh','2017-01-01','2020-01-01'),('tuannt39@gmail.com','HV-TTS','ntt123','Nguyễn Thế Tuân','2017-01-01','2020-01-01');
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thuctapsinh`
--

DROP TABLE IF EXISTS `thuctapsinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `thuctapsinh` (
  `id_tts` bigint(20) NOT NULL,
  `bd_tts` date DEFAULT NULL,
  `kt_tts` date DEFAULT NULL,
  `cv_tts` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_cn` bigint(20) DEFAULT NULL,
  `id_nn` bigint(20) DEFAULT NULL,
  `id_dt` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_tts`),
  KEY `fk_thuctapsinh_id_cn` (`id_cn`),
  KEY `fk_thuctapsinh_id_nn` (`id_nn`),
  KEY `fk_thuctapsinh_id_dt` (`id_dt`),
  CONSTRAINT `fk_thuctapsinh_canhan_id_cn` FOREIGN KEY (`id_cn`) REFERENCES `canhan` (`id_cn`) ON UPDATE CASCADE,
  CONSTRAINT `fk_thuctapsinh_doitac_id_dt` FOREIGN KEY (`id_dt`) REFERENCES `doitac` (`id_dt`) ON UPDATE CASCADE,
  CONSTRAINT `fk_thuctapsinh_ngonngu_id_nn` FOREIGN KEY (`id_nn`) REFERENCES `ngonngu` (`id_nn`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thuctapsinh`
--

LOCK TABLES `thuctapsinh` WRITE;
/*!40000 ALTER TABLE `thuctapsinh` DISABLE KEYS */;
/*!40000 ALTER TABLE `thuctapsinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuyendung`
--

DROP TABLE IF EXISTS `tuyendung`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuyendung` (
  `id_td` bigint(20) NOT NULL,
  `tin_td` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bd_td` date DEFAULT NULL,
  `kt_td` date DEFAULT NULL,
  PRIMARY KEY (`id_td`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuyendung`
--

LOCK TABLES `tuyendung` WRITE;
/*!40000 ALTER TABLE `tuyendung` DISABLE KEYS */;
INSERT INTO `tuyendung` VALUES (1496631273824,'05 Lập trình viên JAVA (Backend)','2017-01-01','2017-01-15'),(1496631368378,'05 PHP Developer – Upto $1200','2017-01-01','2017-02-15');
/*!40000 ALTER TABLE `tuyendung` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-21 13:57:46
