-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: springgroup
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `kiosk`
--

DROP TABLE IF EXISTS `kiosk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kiosk` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `part` varchar(20) NOT NULL,
  `product` varchar(30) NOT NULL,
  `detail` varchar(50) NOT NULL,
  `content` text,
  `calorie` int DEFAULT '0',
  `image` varchar(50) NOT NULL,
  `price` int NOT NULL,
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kiosk`
--

LOCK TABLES `kiosk` WRITE;
/*!40000 ALTER TABLE `kiosk` DISABLE KEYS */;
INSERT INTO `kiosk` VALUES (1,'오리지널스&맥시멈','오리지널스 메이플 갈릭','#달달한맛 #150g패티','밀, 대두, 우유, 돼지고기, 토마토, 쇠고기. 난류',873,'오리지널스 메이플 갈릭.jpg',10500),(2,'오리지널스&맥시멈','오리지널스 뉴욕 스테이크','#치즈 #150g패티','밀, 대두, 우유, 돼지고기, 토마토, 쇠고기, 조개류, 난류',826,'오리지널스 뉴욕 스테이크.jpg',10500),(3,'오리지널스&맥시멈','불끈버거 맥시멈','#소고기 #맥시멈 #매콤함맛','밀, 대두, 우유, 토마토, 쇠고기, 난류, 새우',1023,'불끈버거 맥시멈.jpg',12500),(4,'오리지널스&맥시멈','불끈버거 맥시멈 더블','#소고기 #새우 #매콤한맛 #더블패티','밀, 대두, 우유, 토마토, 쇠고기, 난류, 새우',1278,'불끈버거 맥시멈 더블.jpg',15000),(5,'프리미엄','크리미 할라피뇨 파퍼','#매콤한맛 #달달한맛 #파퍼','밀, 대두, 으우, 돼지괴, 쇠고기, 난류',884,'크리미 할라피뇨 파퍼.jpg',8900),(6,'프리미엄','치폴레 할라피뇨 파퍼','#매콤한맛 #크림치츠 #파퍼','밀, 대두, 우유, 돼지고기, 토마토, 쇠고기, 난류',895,'치폴레 할라피뇨 파퍼.jpg',8900),(7,'프리미엄','불맛 더블치즈베이컨버거','#치즈 #진한맛 #더블패티','밀, 대두, 우유, 돼지고기, 토마토, 쇠고기',977,'불맛 더블치즈비이컨버거.jpg',9500),(8,'프리미엄','몬스터 와퍼','#와퍼 #치즈 #매콤한맛','밀, 대두, 우유, 돼지고기, 토마토, 닭고기, 쇠고기, 난류',1094,'몬스터와퍼.jpg',9300),(9,'와퍼&주니어','치즈와퍼','#와퍼 #치즈 #진한맛','밀, 대두, 우유, 토마토, 쇠고기, 난류',799,'치즈와퍼.jpg',7700),(10,'와퍼&주니어','갈릭불고기 와퍼','#와퍼 #달달한 맛','밀, 대두, 토마토, 쇠고기, 난류',768,'갈릭불고기와퍼.jpg',8300),(11,'와퍼&주니어','불고기와퍼','#와퍼 #달달한맛','밀, 대두, 토마토, 쇠고기, 난류',738,'불고기와퍼.jpg',8300),(12,'와퍼&주니어','와퍼','#와퍼 #담백한 맛','밀, 대두, 토마토, 쇠고기, 난류',706,'와퍼.jpg',7101),(13,'음료&디저트','코카콜라(L)','코카-콜라로 더 짜릿하게!','코카콜라(L)',215,'코카콜라(L).jpg',2100),(14,'음료&디저트','코카콜라(R)','코카-콜라로 더 짜릿하게!','코카콜라(R)',150,'코카콜라(R).jpg',1500),(15,'음료&디저트','스프라이트(L)','나를 깨우는 상쾌함!','스프라이트(L)',237,'스프라이트(L).jpg',2100),(17,'음료&디저트','스프라이트(R)','나를 꺠우는 상쾌함','스프라이트(R)',165,'스프라이트(R).jpg',1500);
/*!40000 ALTER TABLE `kiosk` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-22  1:21:17
