-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: locations
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `distances`
--

DROP TABLE IF EXISTS `distances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `distances` (
  `sNo` int(11) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `dist1` int(11) DEFAULT NULL,
  `dist2` int(11) DEFAULT NULL,
  `dist3` int(11) DEFAULT NULL,
  `dist4` int(11) DEFAULT NULL,
  `dist5` int(11) DEFAULT NULL,
  `dist6` int(11) DEFAULT NULL,
  `dist7` int(11) DEFAULT NULL,
  `dist8` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distances`
--

LOCK TABLES `distances` WRITE;
/*!40000 ALTER TABLE `distances` DISABLE KEYS */;
INSERT INTO `distances` VALUES (1,'Eriador',0,6,14,3,20,16,8,7),(2,'Gondor',6,0,18,4,3,5,19,16),(3,'Isengard',14,18,0,8,7,6,17,9),(4,'Rohan',3,4,8,0,13,9,6,7),(5,'Helms Deep',20,3,7,13,0,15,7,14),(6,'The Shire',16,5,6,9,15,0,12,19),(7,'Mordor',8,19,17,6,7,12,0,11),(8,'Moria',7,16,9,7,14,19,11,0);
/*!40000 ALTER TABLE `distances` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-11 18:09:20
