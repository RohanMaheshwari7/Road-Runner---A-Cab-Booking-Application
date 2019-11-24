-- MySQL dump 10.13  Distrib 5.7.27, for Win64 (x86_64)
--
-- Host: localhost    Database: oop_project_driver
-- ------------------------------------------------------
-- Server version	5.7.27-log

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
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `driver` (
  `driver_name` varchar(25) DEFAULT NULL,
  `cur_status` int(11) DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `car` varchar(20) DEFAULT NULL,
  `car_number` varchar(10) DEFAULT NULL,
  `car_type` int(11) DEFAULT NULL,
  `num_trips` int(11) DEFAULT NULL,
  `initial_pos` int(11) DEFAULT NULL,
  `cur_pos` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
INSERT INTO `driver` VALUES ('Mohan',0,4.4,'Accent','TS09CC9878',1,4,1,1),('Jagan',0,4,'Innova','TS09DD9999',2,5,1,1),('Amitabh',0,3.5,'Xylo','TS09DD2111',2,3,1,1),('Roy',0,3,'Xylo','TS09DD6767',2,3,2,2),('John',0,2.9,'Innova','TS09DD5656',2,7,2,2),('Kevin',0,3.2,'Sonata','TS09CC3434',1,5,2,2),('Shyam',0,4.7,'i10','TS09CC2323',1,5,2,2),('Rama',0,4.9,'i20','TS10CC1293',1,6,3,3),('Ram',0,4.5,'Toyota','TS09CC9867',1,4,1,1),('Nishant',0,4.5,'Innova','TS09DD1121',1,4,3,3),('Aditya',0,4.4,'Innova','TS09DD9875',1,4,3,3),('Joquain',0,4,'Xylo','TS09DD9998',2,5,4,4),('Timer',0,3.5,'Xylo','TS09DD2112',2,3,4,4),('Blain',0,3,'Indica','TS09CC6757',2,3,3,3),('Tenali',0,4.8,'Indica','TS09CC6656',2,7,3,3),('Birbal',0,3.3,'i10','TS09CC3431',1,5,4,4),('Achilles',0,4.7,'i10','TS09CC2223',1,5,4,4),('Shant',0,4.4,'Innova','TS09DD3121',1,4,5,5),('Hikaru',0,2.4,'Innova','TS09DD1875',1,4,5,5),('Magnus',0,5,'Xylo','TS09DD7299',2,5,6,6),('Anand',0,4.9,'Xylo','TS09DD2712',2,3,6,6),('Caprio',0,3,'Indica','TS09CC7757',2,3,5,5),('Krishna',0,4.8,'Indica','TS09CC1656',2,7,5,5),('Prag',0,3.3,'i10','TS09CC3430',1,5,6,6),('Samarth',0,4.7,'i10','TS09CC2023',1,5,6,6),('Sergey',0,4.5,'Innova','TS09DD9121',1,4,7,7),('Fabiano',0,4.4,'Innova','TS09DD8875',1,4,7,7),('Ankit',0,4,'Xylo','TS09DD9993',2,5,8,8),('Aman',0,3.5,'Xylo','TS09DD2172',2,3,8,8),('Leneir',0,3,'Indica','TS09CC0757',2,3,7,7),('Marsh',0,3.8,'Indica','TS09CC6056',2,7,8,8),('Smith',0,4.3,'i10','TS09CC3401',1,5,7,7),('Rohit',0,3.7,'i10','TS09CC2023',1,5,8,8);
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-10 23:50:20
