-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema TaskManager
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `TaskManager` ;

-- -----------------------------------------------------
-- Schema TaskManager
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `TaskManager` DEFAULT CHARACTER SET utf8 ;
USE `TaskManager` ;

-- -----------------------------------------------------
-- Table `TaskManager`.`Roles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TaskManager`.`Roles` ;

CREATE TABLE IF NOT EXISTS `TaskManager`.`Roles` (
  `roleId` INT NOT NULL,
  `roleName` VARCHAR(45) NULL,
  PRIMARY KEY (`roleId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TaskManager`.`Users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TaskManager`.`Users` ;

CREATE TABLE IF NOT EXISTS `TaskManager`.`Users` (
  `userId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(45) NULL,
  `userPassword` VARCHAR(45) NULL,
  `userEmail` VARCHAR(45) NULL,
  `Roles_roleId` INT NOT NULL,
  PRIMARY KEY (`userId`, `Roles_roleId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TaskManager`.`Priority`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TaskManager`.`Priority` ;

CREATE TABLE IF NOT EXISTS `TaskManager`.`Priority` (
  `priorityId` INT NOT NULL AUTO_INCREMENT,
  `priorityName` VARCHAR(45) NULL,
  PRIMARY KEY (`priorityId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TaskManager`.`ProjectList`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TaskManager`.`ProjectList` ;

CREATE TABLE IF NOT EXISTS `TaskManager`.`ProjectList` (
  `projectId` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `projectSrart` TIMESTAMP NULL,
  `projectRedLine` TIMESTAMP NULL,
  `projectDeadLine` TIMESTAMP NULL,
  `projectTimeLeft` TIMESTAMP NULL,
  `Users_userId` INT UNSIGNED NOT NULL,
  `Priority_priorityId` INT NOT NULL,
  PRIMARY KEY (`projectId`, `Priority_priorityId`, `Users_userId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TaskManager`.`Tasks`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TaskManager`.`Tasks` ;

CREATE TABLE IF NOT EXISTS `TaskManager`.`Tasks` (
  `taskId` INT NOT NULL AUTO_INCREMENT,
  `taskName` VARCHAR(195) NULL,
  `taskDescription` VARCHAR(255) NULL,
  `taskStartTime` TIMESTAMP NULL,
  `taskRedLine` TIMESTAMP NULL,
  `taskDeadLine` TIMESTAMP NULL,
  `taskTimeLeftToRedLine` TIMESTAMP NULL,
  `taskTimeLeftToDeadLine` VARCHAR(45) NULL,
  `Priority_priorityId` INT NOT NULL,
  `Users_userId` INT UNSIGNED NOT NULL,
  `Users_Roles_roleId` INT NOT NULL,
  PRIMARY KEY (`taskId`, `Priority_priorityId`, `Users_userId`, `Users_Roles_roleId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Data for table `TaskManager`.`Roles`
-- -----------------------------------------------------
START TRANSACTION;
USE `TaskManager`;
INSERT INTO `TaskManager`.`Roles` (`roleId`, `roleName`) VALUES (1, 'user');
INSERT INTO `TaskManager`.`Roles` (`roleId`, `roleName`) VALUES (2, 'guest');
INSERT INTO `TaskManager`.`Roles` (`roleId`, `roleName`) VALUES (3, 'admin');

COMMIT;


-- -----------------------------------------------------
-- Data for table `TaskManager`.`Priority`
-- -----------------------------------------------------
START TRANSACTION;
USE `TaskManager`;
INSERT INTO `TaskManager`.`Priority` (`priorityId`, `priorityName`) VALUES (1, 'hi');
INSERT INTO `TaskManager`.`Priority` (`priorityId`, `priorityName`) VALUES (2, 'medium');
INSERT INTO `TaskManager`.`Priority` (`priorityId`, `priorityName`) VALUES (3, 'low');

COMMIT;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
