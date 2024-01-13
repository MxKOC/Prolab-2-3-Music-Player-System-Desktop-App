-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: proje2
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `album`
--

DROP TABLE IF EXISTS `album`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `album` (
  `albumId` int NOT NULL,
  `album_adı` varchar(45) DEFAULT NULL,
  `tarih` date DEFAULT NULL,
  `tür` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`albumId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `album`
--

LOCK TABLES `album` WRITE;
/*!40000 ALTER TABLE `album` DISABLE KEYS */;
INSERT INTO `album` VALUES (1,'ATEŞ','2020-05-06','JAZZ'),(2,'KAHRAMAN','2020-05-06','POP'),(3,'HIZ','2020-05-06','KLASİK'),(4,'ALEM','2020-05-06','JAZZ'),(5,'SESLİ','2020-05-06','POP');
/*!40000 ALTER TABLE `album` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kul_kul`
--

DROP TABLE IF EXISTS `kul_kul`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kul_kul` (
  `kullanıcıId` int NOT NULL,
  `kullanıcıId1` int NOT NULL,
  PRIMARY KEY (`kullanıcıId`,`kullanıcıId1`),
  KEY `fk_kul_kul_kullanıcı1_idx` (`kullanıcıId`),
  KEY `fk_kul_kul_kullanıcı2_idx` (`kullanıcıId1`),
  CONSTRAINT `fk_kul_kul_kullanıcı1` FOREIGN KEY (`kullanıcıId`) REFERENCES `kullanıcı` (`kullanıcıId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_kul_kul_kullanıcı2` FOREIGN KEY (`kullanıcıId1`) REFERENCES `kullanıcı` (`kullanıcıId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kul_kul`
--

LOCK TABLES `kul_kul` WRITE;
/*!40000 ALTER TABLE `kul_kul` DISABLE KEYS */;
INSERT INTO `kul_kul` VALUES (1,2),(1,4),(2,3),(3,2);
/*!40000 ALTER TABLE `kul_kul` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kullanıcı`
--

DROP TABLE IF EXISTS `kullanıcı`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kullanıcı` (
  `kullanıcıId` int NOT NULL,
  `kullanıcı_adı` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `şifre` varchar(45) DEFAULT NULL,
  `abonelik_türü` varchar(45) DEFAULT NULL,
  `ülke` varchar(45) DEFAULT NULL,
  `ödendi` int DEFAULT NULL,
  PRIMARY KEY (`kullanıcıId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanıcı`
--

LOCK TABLES `kullanıcı` WRITE;
/*!40000 ALTER TABLE `kullanıcı` DISABLE KEYS */;
INSERT INTO `kullanıcı` VALUES (1,'MUHAMMED','XX','XXX','P','TÜRKİYE',1),(2,'OSMAN','YY','YYY','P','AMERİKA',1),(3,'AHMET','ZZ','ZZZ','N','TÜRKİYE',1),(4,'ASIM','KK','KKK','P','TÜRKİYE',1),(5,'HASAN','LL','LLL','N','JAPONYA',0),(6,'MEHMET','MM','MMM','N','G.KORE',0);
/*!40000 ALTER TABLE `kullanıcı` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanatçı`
--

DROP TABLE IF EXISTS `sanatçı`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanatçı` (
  `ID` int NOT NULL,
  `Sanatçı_adı` varchar(45) DEFAULT NULL,
  `Ülkesi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanatçı`
--

LOCK TABLES `sanatçı` WRITE;
/*!40000 ALTER TABLE `sanatçı` DISABLE KEYS */;
INSERT INTO `sanatçı` VALUES (1,'FATİH','AMERİKA'),(2,'HAMZA','JAPONYA'),(3,'KAHRAMAN','TÜRKİYE'),(4,'YUSUF','G.KORE'),(5,'ABDULLAH','JAPONYA');
/*!40000 ALTER TABLE `sanatçı` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `çalma_listesi`
--

DROP TABLE IF EXISTS `çalma_listesi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `çalma_listesi` (
  `Kullanıcı` int NOT NULL,
  `şarkı` int NOT NULL,
  PRIMARY KEY (`Kullanıcı`,`şarkı`),
  KEY `fk_çalma_listesi_kullanıcı1_idx` (`Kullanıcı`),
  KEY `fk_çalma_listesi_şarki1_idx` (`şarkı`),
  CONSTRAINT `fk_çalma_listesi_kullanıcı1` FOREIGN KEY (`Kullanıcı`) REFERENCES `kullanıcı` (`kullanıcıId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_çalma_listesi_şarki1` FOREIGN KEY (`şarkı`) REFERENCES `şarki` (`SarkıID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `çalma_listesi`
--

LOCK TABLES `çalma_listesi` WRITE;
/*!40000 ALTER TABLE `çalma_listesi` DISABLE KEYS */;
INSERT INTO `çalma_listesi` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),(1,12),(1,14),(1,15),(1,16),(1,18),(1,19),(1,22),(1,23),(1,24),(2,1),(2,2),(2,4),(2,5),(2,6),(2,7),(2,8),(2,12),(2,15),(2,17),(2,18),(3,1),(3,2),(3,3),(3,4),(3,5),(3,6),(3,10),(4,6),(4,7),(4,8),(4,9),(4,10),(4,11),(4,12),(4,13),(5,1),(5,2),(5,3),(6,2),(6,4),(6,5),(6,9),(6,12),(6,15),(6,16);
/*!40000 ALTER TABLE `çalma_listesi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `şarki`
--

DROP TABLE IF EXISTS `şarki`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `şarki` (
  `SarkıID` int NOT NULL,
  `Şarkı_Adı` varchar(45) DEFAULT NULL,
  `tür` varchar(45) DEFAULT NULL,
  `tarih` date DEFAULT NULL,
  `süre` int DEFAULT NULL,
  `dinlenme_sayısı` int DEFAULT NULL,
  `ülke` varchar(45) DEFAULT NULL,
  `albüm` int DEFAULT NULL,
  PRIMARY KEY (`SarkıID`),
  KEY `fk_şarki_album1_idx` (`albüm`),
  CONSTRAINT `fk_şarki_album1` FOREIGN KEY (`albüm`) REFERENCES `album` (`albumId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `şarki`
--

LOCK TABLES `şarki` WRITE;
/*!40000 ALTER TABLE `şarki` DISABLE KEYS */;
INSERT INTO `şarki` VALUES (1,'AAA','POP','1111-03-09',10,1,'TÜRKİYE',1),(2,'BBB','POP','2019-05-06',20,2,'TÜRKİYE',1),(3,'CCC','JAZZ','2019-05-06',10,2,'AMERİKA',2),(4,'DDD','JAZZ','2019-05-06',10,1,'TÜRKİYE',2),(5,'FFF','POP','2019-05-06',10,2,'JAPONYA',3),(6,'EEE','KLASİK','2019-05-06',10,1,'JAPONYA',3),(7,'GGG','POP','2019-05-06',12,26,'JAPONYA',2),(8,'III','POP','2019-05-06',12,2,'TÜRKİYE',3),(9,'İİİ','POP','2019-05-06',12,4,'G.KORE',1),(10,'JJJ','POP','2019-05-06',13,3,'G.KORE',1),(11,'KKK','JAZZ','2019-05-06',13,52,'TÜRKİYE',2),(12,'LLL','KLASİK','2019-05-06',13,5,'JAPONYA',3),(13,'MMM','KLASİK','2019-05-06',12,2,'TÜRKİYE',NULL),(14,'NNN','KLASİK','2019-05-06',33,6,'G.KORE',NULL),(15,'OOO','JAZZ','2019-05-06',5,3,'TÜRKİYE',1),(16,'ÖÖÖ','JAZZ','2019-05-06',5,3,'G.KORE',1),(17,'PPP','JAZZ','2019-05-06',5,21,'G.KORE',NULL),(18,'RRR','JAZZ','2019-05-06',7,3,'TÜRKİYE',NULL),(19,'SSS','KLASİK','2019-05-06',9,9,'G.KORE',NULL),(20,'TTT','KLASİK','2019-05-06',2,17,'G.KORE',NULL),(21,'UUU','JAZZ','2019-05-06',6,25,'TÜRKİYE',NULL),(22,'ÜÜÜ','POP','2019-05-06',4,4,'AMERİKA',NULL),(23,'VVV','POP','2019-05-06',2,16,'TÜRKİYE',NULL),(24,'YYY','KLASİK','2019-05-06',7,32,'AMERİKA',NULL),(25,'ZZZ','POP','2019-05-06',15,14,'TÜRKİYE',NULL);
/*!40000 ALTER TABLE `şarki` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `şarkı_sanatçı`
--

DROP TABLE IF EXISTS `şarkı_sanatçı`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `şarkı_sanatçı` (
  `sanatcı` int NOT NULL,
  `sarkı` int NOT NULL,
  PRIMARY KEY (`sanatcı`,`sarkı`),
  KEY `fk_şarkı_sanatçı_sanatçı1_idx` (`sanatcı`),
  KEY `fk_şarkı_sanatçı_şarki1_idx` (`sarkı`),
  CONSTRAINT `fk_şarkı_sanatçı_sanatçı1` FOREIGN KEY (`sanatcı`) REFERENCES `sanatçı` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_şarkı_sanatçı_şarki1` FOREIGN KEY (`sarkı`) REFERENCES `şarki` (`SarkıID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `şarkı_sanatçı`
--

LOCK TABLES `şarkı_sanatçı` WRITE;
/*!40000 ALTER TABLE `şarkı_sanatçı` DISABLE KEYS */;
INSERT INTO `şarkı_sanatçı` VALUES (1,1),(1,2),(1,3),(2,1),(2,6),(2,7),(2,8),(3,8),(3,9),(4,5);
/*!40000 ALTER TABLE `şarkı_sanatçı` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-19 12:39:41
