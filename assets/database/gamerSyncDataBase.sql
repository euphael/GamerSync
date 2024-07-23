SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `gamerSync` DEFAULT CHARACTER SET utf8 ;
USE `gamerSync` ;


CREATE TABLE IF NOT EXISTS `gamerSync`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  `Genero` VARCHAR(45) NULL,
  `Idioma` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `gamerSync`.`Jogos` (
  `idJogo` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  `Tipo_Jogo` VARCHAR(45) NOT NULL,
  `Dados_Usuario_Jogo_idDados Usuario por jogo` INT NOT NULL,
  `Dados_Usuario_Jogo_Usuario_idUsuario` INT NOT NULL,
  `Dados_Usuario_Jogo_Jogos_idJogo` INT NOT NULL,
  PRIMARY KEY (`idJogo`),
  INDEX `fk_Jogos_Dados_Usuario_Jogo1_idx` (`Dados_Usuario_Jogo_idDados Usuario por jogo` ASC, `Dados_Usuario_Jogo_Usuario_idUsuario` ASC, `Dados_Usuario_Jogo_Jogos_idJogo` ASC) VISIBLE,
  CONSTRAINT `fk_Jogos_Dados_Usuario_Jogo1`
    FOREIGN KEY (`Dados_Usuario_Jogo_idDados Usuario por jogo` , `Dados_Usuario_Jogo_Usuario_idUsuario` , `Dados_Usuario_Jogo_Jogos_idJogo`)
    REFERENCES `gamerSync`.`Dados_Usuario_Jogo` (`idDados Usuario por jogo` , `Usuario_idUsuario` , `Jogos_idJogo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `gamerSync`.`Times` (
  `idTimes_Disponveis` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NOT NULL,
  `Status` TINYINT NOT NULL,
  `Jogos_idJogo` INT NOT NULL,
  PRIMARY KEY (`idTimes_Disponveis`, `Jogos_idJogo`),
  INDEX `fk_Times_Disponveis_Jogos1_idx` (`Jogos_idJogo` ASC) VISIBLE,
  CONSTRAINT `fk_Times_Disponveis_Jogos1`
    FOREIGN KEY (`Jogos_idJogo`)
    REFERENCES `gamerSync`.`Jogos` (`idJogo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `gamerSync`.`Dados_Usuario_Jogo` (
  `idDados Usuario por jogo` INT NOT NULL AUTO_INCREMENT,
  `Nickname` VARCHAR(45) NOT NULL,
  `nivelExp` DOUBLE(9,2) NOT NULL,
  `Avaliação` DOUBLE(9,2) NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `Jogos_idJogo` INT NOT NULL,
  `Times_idTimes_Disponveis` INT NOT NULL,
  `Times_Jogos_idJogo` INT NOT NULL,
  PRIMARY KEY (`idDados Usuario por jogo`, `Usuario_idUsuario`, `Jogos_idJogo`),
  INDEX `fk_Dados Usuario por jogo_Usuario_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  INDEX `fk_Dados Usuario por jogo_Times1_idx` (`Times_idTimes_Disponveis` ASC, `Times_Jogos_idJogo` ASC) VISIBLE,
  CONSTRAINT `fk_Dados Usuario por jogo_Usuario`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `gamerSync`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Dados Usuario por jogo_Times1`
    FOREIGN KEY (`Times_idTimes_Disponveis` , `Times_Jogos_idJogo`)
    REFERENCES `gamerSync`.`Times` (`idTimes_Disponveis` , `Jogos_idJogo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `gamerSync`.`Postagens` (
  `idPostagens` INT NOT NULL AUTO_INCREMENT,
  `Conteudo` VARCHAR(250) NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idPostagens`, `Usuario_idUsuario`),
  INDEX `fk_Postagens_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Postagens_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `gamerSync`.`Historico Partidas` (
  `idHistorico Partidas` INT NOT NULL AUTO_INCREMENT,
  `Data` DATE NOT NULL,
  `Resumo` VARCHAR(45) NOT NULL,
  `Dados Usuario por jogo_idDados Usuario por jogo` INT NOT NULL,
  `Dados Usuario por jogo_Usuario_idUsuario` INT NOT NULL,
  `Dados Usuario por jogo_Jogos_idJogo` INT NOT NULL,
  PRIMARY KEY (`idHistorico Partidas`),
  INDEX `fk_Historico Partidas_Dados Usuario por jogo1_idx` (`Dados Usuario por jogo_idDados Usuario por jogo` ASC, `Dados Usuario por jogo_Usuario_idUsuario` ASC, `Dados Usuario por jogo_Jogos_idJogo` ASC) VISIBLE,
  CONSTRAINT `fk_Historico Partidas_Dados Usuario por jogo1`
    FOREIGN KEY (`Dados Usuario por jogo_idDados Usuario por jogo` , `Dados Usuario por jogo_Usuario_idUsuario` , `Dados Usuario por jogo_Jogos_idJogo`)
    REFERENCES `mydb`.`Dados_Usuario_Jogo` (`idDados Usuario por jogo` , `Usuario_idUsuario` , `Jogos_idJogo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `gamerSync`.`amigos` (
  `idamigos` INT NOT NULL AUTO_INCREMENT,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idamigos`, `Usuario_idUsuario`),
  INDEX `fk_amigos_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_amigos_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `gamerSync`.`Avaliacao` (
  `idAvaliacao` INT NOT NULL AUTO_INCREMENT,
  `Nota` DOUBLE(9,2) NULL,
  `Descrição` VARCHAR(45) NULL,
  `Dados_Usuario_Jogo_idDados Usuario por jogo` INT NOT NULL,
  `Dados_Usuario_Jogo_Usuario_idUsuario` INT NOT NULL,
  `Dados_Usuario_Jogo_Jogos_idJogo` INT NOT NULL,
  PRIMARY KEY (`idAvaliacao`),
  INDEX `fk_Avaliacao_Dados_Usuario_Jogo1_idx` (`Dados_Usuario_Jogo_idDados Usuario por jogo` ASC, `Dados_Usuario_Jogo_Usuario_idUsuario` ASC, `Dados_Usuario_Jogo_Jogos_idJogo` ASC) VISIBLE,
  CONSTRAINT `fk_Avaliacao_Dados_Usuario_Jogo1`
    FOREIGN KEY (`Dados_Usuario_Jogo_idDados Usuario por jogo` , `Dados_Usuario_Jogo_Usuario_idUsuario` , `Dados_Usuario_Jogo_Jogos_idJogo`)
    REFERENCES `mydb`.`Dados_Usuario_Jogo` (`idDados Usuario por jogo` , `Usuario_idUsuario` , `Jogos_idJogo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
show tables;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
