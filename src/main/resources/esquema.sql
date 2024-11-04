-- --------------------------------------------------------
-- Sistema de Stock
-- Ejemplo para curso de java UTN
--
-- --------------------------------------------------------

-- Esquema para crear la base de datos de ejemplo
CREATE TABLE `clientes` (
	`id` INT NOT NULL DEFAULT '0',
	`nombre` VARCHAR(255) NULL DEFAULT NULL,
	`cuit` VARCHAR(20) NULL DEFAULT NULL,
	`domicilio` VARCHAR(255) NULL DEFAULT NULL,
	`Localidad` VARCHAR(255) NULL DEFAULT NULL,
	`codpos` VARCHAR(255) NULL DEFAULT NULL,
	`Provincia` VARCHAR(255) NULL DEFAULT NULL,
	`Estado` VARCHAR(255) NULL DEFAULT NULL,
	`imp_iva` VARCHAR(255) NULL DEFAULT NULL,
	`EMail` VARCHAR(50) NULL DEFAULT NULL,
	`NumTelefono1` VARCHAR(50) NULL DEFAULT NULL,
	`NumTelefono2` VARCHAR(50) NULL DEFAULT NULL,
	`NumFax1` VARCHAR(50) NULL DEFAULT NULL,
	`NumFax2` VARCHAR(255) NULL DEFAULT NULL,
	`tipo_responsable_id` INT NULL DEFAULT '0',
	`NumCelular` VARCHAR(50) NULL DEFAULT NULL,
	`LimiteCredito` DECIMAL(19,4) NULL DEFAULT '0.0000',
	`vendedore_id` INT NULL DEFAULT '0',
	`Observaciones` LONGTEXT NULL DEFAULT NULL,
	`Anulado` VARCHAR(255) NULL DEFAULT NULL,
	`Pais` VARCHAR(255) NULL DEFAULT NULL,
	`Cat_Monotributo` VARCHAR(1) NULL DEFAULT NULL,
	`created` DATETIME NULL DEFAULT NULL,
	`modified` DATETIME NULL DEFAULT NULL,
	`deleted` DATETIME NULL DEFAULT NULL,
	PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB;

-- Condicicion de IVA
CREATE TABLE IF NOT EXISTS `tipo_responsables` (
  `id` int NOT NULL DEFAULT '0',
  `nombre` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `abreviatura` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `IdTipoIVA` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Datos de Tipos de IVA
INSERT INTO `tipo_responsables` (`id`, `nombre`, `abreviatura`) VALUES
	(1, 'IVA Responsable Inscripto', 'RI'),
	(2, 'IVA Responsable no Inscripto', 'RNI'),
	(3, 'IVA no Responsable', 'NR'),
	(4, 'IVA Sujeto Exento', 'EX'),
	(5, 'Consumidor Final', 'CF'),
	(6, 'Responsable Monotributo', 'MON'),
	(7, 'Sujeto no Categorizado', 'S/C'),
	(8, 'Proveedor del Exterior', 'S/C'),
	(9, 'Cliente del Exterior', 'S/C'),
	(10, 'IVA Liberado – Ley Nº 19.640', 'S/C'),
	(11, 'IVA Responsable Inscripto – Agente de Percepción', 'S/C'),
	(12, 'Pequeño Contribuyente Eventual', 'S/C'),
	(13, 'Monotributista Social', 'S/C'),
	(14, 'Pequeño Contribuyente Eventual Social', 'S/C');

-- Almacenes
CREATE TABLE IF NOT EXISTS `almacenes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `direccion` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `Predeterminado` tinyint DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2;
INSERT INTO `almacenes` (`id`, `nombre`, `direccion`, `Predeterminado`, `created`, `modified`) VALUES
	(1, 'Almacen Principal', 'Casa Central', 1, '2024-11-03 10:22:48', '2024-11-03 10:22:49');

-- Mercaderias
CREATE TABLE IF NOT EXISTS `mercaderias` (
  `id` int NOT NULL DEFAULT '0',
  `nombre` varchar(150) CHARACTER SET latin1 DEFAULT NULL,
  `nombre_resumido` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `NivelMinimo` int DEFAULT '0',
  `NivelOptimo` int DEFAULT '0',
  `Unidad` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `Descripcion` longtext CHARACTER SET latin1,
  `EnPedido` int DEFAULT '0',
  `PrecioContado` decimal(19,4) DEFAULT '0.0000',
  `PrecioFinanciado` decimal(19,4) DEFAULT '0.0000',
  `PrecioCosto` decimal(19,4) DEFAULT '0.0000',
  `Ingresar` int DEFAULT '0',
  `Vencimiento` tinyint DEFAULT NULL,
  `Composicion` longtext CHARACTER SET latin1,
  `FechaActualizacion` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `fe_condiciones_iva_id` int DEFAULT '0',
  `CodImpuesto` int DEFAULT '0',
  `moneda_id` int DEFAULT '0',
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `deleted` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;
INSERT INTO `mercaderias` (`id`, `nombre`, `nombre_resumido`, `NivelMinimo`, `NivelOptimo`, `Unidad`, `Descripcion`, `EnPedido`, `PrecioContado`, `PrecioFinanciado`, `PrecioCosto`, `Ingresar`, `Vencimiento`, `Composicion`, `FechaActualizacion`, `fe_condiciones_iva_id`, `CodImpuesto`, `moneda_id`, `created`, `modified`, `deleted`) VALUES
	(1, 'Dectomax Pfizer x 500 ml', 'Dectomax x 500 ml', 10, 20, 'ml', 'Doramectina 1%', 0, 15000.0000, 20000.0000, 10000.0000, 1, NULL, NULL, NULL, 1, 0, 1, '2024-11-03 10:31:06', '2024-11-03 10:31:07', NULL);

-- Entradas de Stock
CREATE TABLE IF NOT EXISTS `stock_entradas` (
  `id` int NOT NULL DEFAULT '0',
  `fecha` datetime DEFAULT NULL,
  `numero` varchar(50) DEFAULT NULL,
  `total` decimal(19,4) DEFAULT '0.0000',
  `observaciones` longtext,
  `almacene_id` int DEFAULT '0',
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `deleted` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- Detalles de Entradas de Stock
CREATE TABLE IF NOT EXISTS `stock_entradas_detalles` (
  `id` int NOT NULL,
  `stock_entrada_id` int DEFAULT '0',
  `Cantidad` double DEFAULT '0',
  `mercaderia_id` int DEFAULT '0',
  `descripcion` varchar(50) DEFAULT NULL,
  `precio_unitario` decimal(19,4) DEFAULT '0.0000',
  `total` decimal(19,4) DEFAULT '0.0000',
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `deleted` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- Salidas de Stock
CREATE TABLE IF NOT EXISTS `stock_salidas` (
  `id` int NOT NULL DEFAULT '0',
  `Fecha` datetime DEFAULT NULL,
  `Numero` varchar(50) DEFAULT NULL,
  `Total` decimal(19,4) DEFAULT '0.0000',
  `Observaciones` longtext CHARACTER SET latin1,
  `almacene_id` int DEFAULT '0',
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `deleted` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- Detalles de Salidas de Stock
CREATE TABLE IF NOT EXISTS `stock_salidas_detalles` (
  `id` int NOT NULL,
  `stock_salida_id` int DEFAULT '0',
  `Cantidad` double DEFAULT '0',
  `mercaderia_id` int DEFAULT '0',
  `descripcion` varchar(100) DEFAULT NULL,
  `precio_unitario` decimal(19,4) DEFAULT '0.0000',
  `Total` decimal(19,4) DEFAULT '0.0000',
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `deleted` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- Vendedores
CREATE TABLE IF NOT EXISTS `vendedores` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `Cuit` varchar(255) DEFAULT NULL,
  `Domicilio` varchar(255) DEFAULT NULL,
  `EMail` varchar(50) DEFAULT NULL,
  `NumTelefono1` varchar(50) DEFAULT NULL,
  `NumTelefono2` varchar(50) DEFAULT NULL,
  `NumFax1` varchar(50) DEFAULT NULL,
  `NumFax2` varchar(50) DEFAULT NULL,
  `Porcentaje` decimal(19,4) DEFAULT '0.0000',
  `NumCelular` varchar(50) DEFAULT NULL,
  `almacene_id` int DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- Monedas
CREATE TABLE IF NOT EXISTS `monedas` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Moneda` varchar(255) DEFAULT NULL,
  `Simbolo` varchar(255) DEFAULT NULL,
  `Cotizacion` double DEFAULT '0',
  `Predeterminada` tinyint DEFAULT '0',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
INSERT INTO `monedas` (`Id`, `Moneda`, `Simbolo`, `Cotizacion`, `Predeterminada`) VALUES
	(1, 'Pesos', '$', 1, 1),
	(2, 'USD Dolares', 'U$S', 995, 0);