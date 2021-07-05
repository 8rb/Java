CREATE TABLE IF NOT EXISTS `products` (`id` INTEGER PRIMARY KEY AUTO_INCREMENT,`name` VARCHAR(250) NOT NULL,`code` VARCHAR(250) NOT NULL,`description` VARCHAR(250) NOT NULL,`price` FLOAT NOT NULL);

CREATE TABLE IF NOT EXISTS `stores` (`id` INTEGER PRIMARY KEY AUTO_INCREMENT,`name` VARCHAR(250) NOT NULL,`location` VARCHAR(250) NOT NULL,`phone` VARCHAR(250) NOT NULL);

INSERT INTO products (`id`,`name`,`code`,`description`, `price`) VALUES (1,'Polo Azul','293426', 'Polo Azul de la empresa Lacoste talla M', 45.6);
INSERT INTO products (`id`,`name`,`code`,`description`, `price`) VALUES (2,'Polo Verde','295426', 'Polo Verde de la empresa Lacoste talla M', 45.6);
INSERT INTO products (`id`,`name`,`code`,`description`, `price`) VALUES (3,'Polo Rojo','293526', 'Polo Rojo de la empresa Lacoste talla M', 45.6);

INSERT INTO stores (`id`,`name`,`location`,`phone`) VALUES (1,'Tienda Lacoste','Av. Garcia Rada 356', '+51 999333777');
INSERT INTO stores (`id`,`name`,`location`,`phone`) VALUES (2,'Tienda Topitop','Av. Aviacion 123', '+51 999888777');
INSERT INTO stores (`id`,`name`,`location`,`phone`) VALUES (3,'Tienda Oeschle','Av. Angamos 1630', '+51 998877665');