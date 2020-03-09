-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema myprojectdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `myprojectdb` ;

-- -----------------------------------------------------
-- Schema myprojectdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `myprojectdb` DEFAULT CHARACTER SET utf8 ;
USE `myprojectdb` ;

-- -----------------------------------------------------
-- Table `myprojectdb`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myprojectdb` ;

CREATE TABLE IF NOT EXISTS `myprojectdb` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `screen_size` INT NULL,
  `hd_capacity` INT NULL,
  `color` VARCHAR(45) NULL,
  `year` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS macuser;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'macuser' IDENTIFIED BY 'macuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'macuser';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `myprojectdb`
-- -----------------------------------------------------
START TRANSACTION;
USE `myprojectdb`;
INSERT INTO `myprojectdb` (`id`, `screen_size`, `hd_capacity`, `color`, `year`) VALUES (1, 13, 256, 'silver', 2019);

COMMIT;

