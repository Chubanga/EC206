CREATE DATABASE IF NOT EXISTS HEALTHBOOK;
USE HEALTHBOOK;

CREATE TABLE IF NOT EXISTS PACIENTE(
	nome VARCHAR(100),
    telefone int,
    dataNascimento VARCHAR(10),
    cpf int not null PRIMARY KEY,
    endereco VARCHAR(100)
);


CREATE TABLE IF NOT EXISTS MEDICO(
	nome VARCHAR(100),
    crm int not null PRIMARY KEY,
    especializacao VARCHAR(100),
    telefone int
);

CREATE TABLE IF NOT EXISTS CONSULTA(
	dataConsulta VARCHAR(10),
    horario VARCHAR(5),
    crm int not null,
    convenio VARCHAR(100),
    cpf int not null,
    CONSTRAINT fk_crm FOREIGN KEY(crm) REFERENCES MEDICO(crm),
    CONSTRAINT fk_cpf FOREIGN KEY(cpf) REFERENCES PACIENTE (cpf)
);

CREATE TABLE IF NOT EXISTS LOGIN(
	senha int not null primary key,
    login VARCHAR(100)
);







