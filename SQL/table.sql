-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema denary
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema denary
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `denary` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
USE `denary` ;

-- -----------------------------------------------------
-- Table `denary`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`student` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`student_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `denary`.`classes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`classes` (
  `classes_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `student_student_id` INT NOT NULL,
  PRIMARY KEY (`classes_id`),
  INDEX `fk_classes_student_idx` (`student_student_id` ASC) VISIBLE,
  CONSTRAINT `fk_classes_student`
    FOREIGN KEY (`student_student_id`)
    REFERENCES `denary`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`subject`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`subject` (
  `subject_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`subject_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`teacher` (
  `teachers_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `hire_date` DATE NOT NULL,
  `classes_classes_id` INT NOT NULL,
  `subject_subject_id` INT NOT NULL,
  PRIMARY KEY (`teachers_id`),
  INDEX `fk_teacher_classes1_idx` (`classes_classes_id` ASC) VISIBLE,
  INDEX `fk_teacher_subject1_idx` (`subject_subject_id` ASC) VISIBLE,
  CONSTRAINT `fk_teacher_classes1`
    FOREIGN KEY (`classes_classes_id`)
    REFERENCES `denary`.`classes` (`classes_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_teacher_subject1`
    FOREIGN KEY (`subject_subject_id`)
    REFERENCES `denary`.`subject` (`subject_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`classroom`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`classroom` (
  `classroom_id` INT NOT NULL AUTO_INCREMENT,
  `room_number` VARCHAR(45) NOT NULL,
  `capacity` INT NULL,
  PRIMARY KEY (`classroom_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`schedule`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`schedule` (
  `schedule_id` INT NOT NULL AUTO_INCREMENT,
  `week_day` VARCHAR(45) NOT NULL,
  `duration` VARCHAR(45) NOT NULL,
  `classroom_classroom_id` INT NOT NULL,
  `teacher_teachers_id` INT NOT NULL,
  PRIMARY KEY (`schedule_id`),
  INDEX `fk_schedule_classroom1_idx` (`classroom_classroom_id` ASC) VISIBLE,
  INDEX `fk_schedule_teacher1_idx` (`teacher_teachers_id` ASC) VISIBLE,
  CONSTRAINT `fk_schedule_classroom1`
    FOREIGN KEY (`classroom_classroom_id`)
    REFERENCES `denary`.`classroom` (`classroom_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_schedule_teacher1`
    FOREIGN KEY (`teacher_teachers_id`)
    REFERENCES `denary`.`teacher` (`teachers_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`grades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`grades` (
  `grades_id` INT NOT NULL AUTO_INCREMENT,
  `grade` CHAR(2) NOT NULL,
  `date_awarded` DATE NOT NULL,
  `student_student_id` INT NOT NULL,
  PRIMARY KEY (`grades_id`, `student_student_id`),
  INDEX `fk_grades_student1_idx` (`student_student_id` ASC) VISIBLE,
  CONSTRAINT `fk_grades_student1`
    FOREIGN KEY (`student_student_id`)
    REFERENCES `denary`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`attendance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`attendance` (
  `attendance_id` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `student_student_id` INT NOT NULL,
  PRIMARY KEY (`attendance_id`),
  INDEX `fk_attendance_student1_idx` (`student_student_id` ASC) VISIBLE,
  CONSTRAINT `fk_attendance_student1`
    FOREIGN KEY (`student_student_id`)
    REFERENCES `denary`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`parent`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`parent` (
  `parent_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`parent_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`results`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`results` (
  `results_id` INT NOT NULL AUTO_INCREMENT,
  `mark_obtain` INT NOT NULL,
  `date` DATE NOT NULL,
  PRIMARY KEY (`results_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`exams`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`exams` (
  `exams_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `total_mark` VARCHAR(45) NOT NULL,
  `subject_subject_id` INT NOT NULL,
  `results_results_id` INT NOT NULL,
  PRIMARY KEY (`exams_id`, `results_results_id`),
  INDEX `fk_exams_subject1_idx` (`subject_subject_id` ASC) VISIBLE,
  INDEX `fk_exams_results1_idx` (`results_results_id` ASC) VISIBLE,
  CONSTRAINT `fk_exams_subject1`
    FOREIGN KEY (`subject_subject_id`)
    REFERENCES `denary`.`subject` (`subject_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_exams_results1`
    FOREIGN KEY (`results_results_id`)
    REFERENCES `denary`.`results` (`results_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`subject_has_classes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`subject_has_classes` (
  `subject_subject_id` INT NOT NULL,
  `classes_classes_id` INT NOT NULL,
  PRIMARY KEY (`subject_subject_id`, `classes_classes_id`),
  INDEX `fk_subject_has_classes_classes1_idx` (`classes_classes_id` ASC) VISIBLE,
  INDEX `fk_subject_has_classes_subject1_idx` (`subject_subject_id` ASC) VISIBLE,
  CONSTRAINT `fk_subject_has_classes_subject1`
    FOREIGN KEY (`subject_subject_id`)
    REFERENCES `denary`.`subject` (`subject_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_subject_has_classes_classes1`
    FOREIGN KEY (`classes_classes_id`)
    REFERENCES `denary`.`classes` (`classes_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `denary`.`student_has_parent`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`student_has_parent` (
  `student_student_id` INT NOT NULL,
  `parent_parent_id` INT NOT NULL,
  PRIMARY KEY (`student_student_id`, `parent_parent_id`),
  INDEX `fk_student_has_parent_parent1_idx` (`parent_parent_id` ASC) VISIBLE,
  INDEX `fk_student_has_parent_student1_idx` (`student_student_id` ASC) VISIBLE,
  CONSTRAINT `fk_student_has_parent_student1`
    FOREIGN KEY (`student_student_id`)
    REFERENCES `denary`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_parent_parent1`
    FOREIGN KEY (`parent_parent_id`)
    REFERENCES `denary`.`parent` (`parent_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `denary`.`exams_has_student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `denary`.`exams_has_student` (
  `exams_exams_id` INT NOT NULL,
  `student_student_id` INT NOT NULL,
  PRIMARY KEY (`exams_exams_id`, `student_student_id`),
  INDEX `fk_exams_has_student_student1_idx` (`student_student_id` ASC) VISIBLE,
  INDEX `fk_exams_has_student_exams1_idx` (`exams_exams_id` ASC) VISIBLE,
  CONSTRAINT `fk_exams_has_student_exams1`
    FOREIGN KEY (`exams_exams_id`)
    REFERENCES `denary`.`exams` (`exams_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_exams_has_student_student1`
    FOREIGN KEY (`student_student_id`)
    REFERENCES `denary`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
