-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema creatinedb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema creatinedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `creatinedb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `creatinedb` ;

create user 'user'@'localhost' identified by '1234';

grant select, insert, delete, update on creatinedb.* to user@'localhost';

-- -----------------------------------------------------
-- Table `creatinedb`.`creatine`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `creatinedb`.`creatine` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
   `name` TEXT NULL DEFAULT NULL,
   `short_description` VARCHAR(255) NULL DEFAULT NULL,
  `long_description` TEXT NULL DEFAULT NULL,
  `price` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
