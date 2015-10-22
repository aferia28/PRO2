-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-03-2014 a las 11:07:57
-- Versión del servidor: 5.6.15-log
-- Versión de PHP: 5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dbventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdetalleventa`
--

CREATE TABLE IF NOT EXISTS `tdetalleventa` (
  `CodVenta` char(15) NOT NULL DEFAULT '',
  `CodProducto` char(10) NOT NULL,
  `NombreProducto` varchar(700) NOT NULL,
  `PrecioCompra` decimal(18,2) NOT NULL,
  `PrecioVenta` decimal(18,2) NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`CodVenta`,`CodProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tdetalleventa`
--

INSERT INTO `tdetalleventa` (`CodVenta`, `CodProducto`, `NombreProducto`, `PrecioCompra`, `PrecioVenta`, `Cantidad`) VALUES
('1', '1', 'Miel', '1.15', '3.15', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tproducto`
--

CREATE TABLE IF NOT EXISTS `tproducto` (
  `CodProducto` char(10) NOT NULL DEFAULT '',
  `Nombre` varchar(700) NOT NULL,
  `PrecioCompra` decimal(18,2) NOT NULL,
  `PrecioVenta` decimal(18,2) NOT NULL,
  `FechaVencimiento` datetime NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`CodProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tproducto`
--

INSERT INTO `tproducto` (`CodProducto`, `Nombre`, `PrecioCompra`, `PrecioVenta`, `FechaVencimiento`, `Cantidad`) VALUES
('1', 'Miel', '1.15', '3.15', '2014-03-26 06:14:12', 5),
('2', 'Chocolate', '0.55', '1.10', '2014-03-12 00:00:00', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tusuario`
--

CREATE TABLE IF NOT EXISTS `tusuario` (
  `DNIUsuario` char(8) NOT NULL DEFAULT '',
  `Nombre` varchar(30) NOT NULL,
  `ApellidoPaterno` varchar(20) NOT NULL,
  `ApellidoMaterno` varchar(20) NOT NULL,
  `FechaNacimiento` datetime NOT NULL,
  PRIMARY KEY (`DNIUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tusuario`
--

INSERT INTO `tusuario` (`DNIUsuario`, `Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `FechaNacimiento`) VALUES
('41456217', 'Andres', 'Gimeno', 'Arduino', '2014-03-18 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tventa`
--

CREATE TABLE IF NOT EXISTS `tventa` (
  `CodVenta` char(15) NOT NULL DEFAULT '',
  `DNIUsuario` char(8) NOT NULL,
  `FechaVenta` datetime NOT NULL,
  PRIMARY KEY (`CodVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tventa`
--

INSERT INTO `tventa` (`CodVenta`, `DNIUsuario`, `FechaVenta`) VALUES
('1', '41456217', '2014-03-04 00:00:00');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tdetalleventa`
--
ALTER TABLE `tdetalleventa`
  ADD CONSTRAINT `TDetalleVenta_ibfk_1` FOREIGN KEY (`CodVenta`) REFERENCES `tventa` (`CodVenta`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
