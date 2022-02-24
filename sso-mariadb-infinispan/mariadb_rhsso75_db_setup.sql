CREATE USER 'rhsso74'@'%' IDENTIFIED BY 'redhat';

DROP DATABASE IF EXISTS `rhsso74`;

CREATE DATABASE IF NOT EXISTS `rhsso74`;

GRANT ALL PRIVILEGES ON rhsso74.* TO 'rhsso74'@'%' identified by 'redhat';