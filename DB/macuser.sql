-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema JPACRUDProject
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `JPACRUDProject` ;

-- -----------------------------------------------------
-- Schema JPACRUDProject
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `JPACRUDProject` DEFAULT CHARACTER SET utf8 ;
USE `JPACRUDProject` ;

-- -----------------------------------------------------
-- Table `table1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `table1` ;

CREATE TABLE IF NOT EXISTS `table1` (
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
