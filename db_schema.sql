CREATE DATABASE IF NOT EXISTS fastagdb;
USE fastagdb;

CREATE TABLE IF NOT EXISTS vehicles (
    vehicleNumber VARCHAR(20) PRIMARY KEY,
    ownerName VARCHAR(50),
    balance INT
);

INSERT INTO vehicles VALUES ('UP11ABC1234', 'Kanishk', 300);
