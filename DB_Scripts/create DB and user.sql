
Create database  IF NOT EXISTS `vodafone_Iot_devices_Warehouse`;

CREATE USER 'vodafoneUser'@'localhost' IDENTIFIED BY 'vodafoneUser';

GRANT ALL PRIVILEGES ON * . * TO 'vodafoneUser'@'localhost';
ALTER USER 'vodafoneUser'@'localhost' IDENTIFIED WITH mysql_native_password BY 'vodafoneUser';
