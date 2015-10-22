CREATE TABLE `comunitats` (
  `id_comunitat` tinyint(4) NOT NULL default '0',
  `nom_comunitat` varchar(20) NOT NULL default '',
  PRIMARY KEY  (`id_comunitat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `comunitats` VALUES (1, 'València');
INSERT INTO `comunitats` VALUES (2, 'La Rioja');
INSERT INTO `comunitats` VALUES (3, 'Navarra');
INSERT INTO `comunitats` VALUES (4, 'Murcia');
INSERT INTO `comunitats` VALUES (5, 'Madrid');
INSERT INTO `comunitats` VALUES (6, 'Galicia');
INSERT INTO `comunitats` VALUES (7, 'Extremadura');
INSERT INTO `comunitats` VALUES (8, 'Euskadi');
INSERT INTO `comunitats` VALUES (9, 'Catalunya');
INSERT INTO `comunitats` VALUES (10, 'Castilla y León');
INSERT INTO `comunitats` VALUES (11, 'Castilla-La Mancha');
INSERT INTO `comunitats` VALUES (12, 'Cantabria');
INSERT INTO `comunitats` VALUES (13, 'Canarias');
INSERT INTO `comunitats` VALUES (14, 'Balears');
INSERT INTO `comunitats` VALUES (15, 'Asturias');
INSERT INTO `comunitats` VALUES (16, 'Aragón');
INSERT INTO `comunitats` VALUES (17, 'Andalucía');
INSERT INTO `comunitats` VALUES (18, 'Ceuta');
INSERT INTO `comunitats` VALUES (19, 'Melilla');


CREATE TABLE `tipus` (
  `id_tipus` char(1) NOT NULL default '',
  `nom_tipus` varchar(10) NOT NULL default '',
  PRIMARY KEY  (`id_tipus`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `tipus` VALUES ('C', 'Cultural');
INSERT INTO `tipus` VALUES ('I', 'Immaterial');
INSERT INTO `tipus` VALUES ('M', 'Mixt');
INSERT INTO `tipus` VALUES ('N', 'Natural');


CREATE TABLE `monuments` (
  `id_monument` tinyint(4) NOT NULL auto_increment,
  `nom_monument` varchar(100) NOT NULL default '',
  `any_alta` smallint(6) NOT NULL default '0',
  `id_tipus` char(1) NOT NULL default '',
  `id_comunitat` tinyint(4) NOT NULL default '0',
  `nom_foto` varchar(30) NOT NULL default '',
  PRIMARY KEY  (`id_monument`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=42 ;

INSERT INTO `monuments` VALUES (1, 'Alhambra, Generalife y Albaicín de Granada', 1984, 'C', 17, 'alhambra.jpg');
INSERT INTO `monuments` VALUES (2, 'Catedral de Burgos', 1984, 'C', 10, 'catedral_burgos.jpg');
INSERT INTO `monuments` VALUES (3, 'Centro histórico de Córdoba', 1984, 'C', 17, 'cordoba.jpg');
INSERT INTO `monuments` VALUES (4, 'Monasterio y Sitio de El Escorial, Madrid', 1984, 'C', 5, 'escorial.jpg');
INSERT INTO `monuments` VALUES (5, 'Obras de Antoni Gaudí', 1984, 'C', 9, 'gaudi.jpg');
INSERT INTO `monuments` VALUES (6, 'Casco antiguo de Ávila e iglesias extramuros', 1985, 'C', 10, 'avila.jpg');
INSERT INTO `monuments` VALUES (7, 'Casco antiguo de Santiago de Compostela', 1985, 'C', 6, 'santiago.jpg');
INSERT INTO `monuments` VALUES (8, 'Casco antiguo y acueducto de Segovia', 1985, 'C', 10, 'acueducto_segovia.jpg');
INSERT INTO `monuments` VALUES (9, 'Monumentos de Oviedo y el Reino de Asturias', 1985, 'C', 15, 'santa_maria_naranco.jpg');
INSERT INTO `monuments` VALUES (10, 'Arquitectura mudéjar de Aragón', 1986, 'C', 16, 'catedral_teruel.jpg');
INSERT INTO `monuments` VALUES (11, 'Casco antiguo de Cáceres', 1986, 'C', 7, 'caceres.jpg');
INSERT INTO `monuments` VALUES (12, 'Ciudad histórica de Toledo', 1986, 'C', 11, 'toledo.jpg');
INSERT INTO `monuments` VALUES (13, 'Parque Nacional de Garajonay', 1986, 'N', 13, 'garajonay.jpg');
INSERT INTO `monuments` VALUES (14, 'Catedral, Alcázar y Archivo de Indias en Sevilla', 1987, 'C', 17, 'sevilla.jpg');
INSERT INTO `monuments` VALUES (15, 'Casco antiguo de Salamanca', 1988, 'C', 10, 'salamanca.jpg');
INSERT INTO `monuments` VALUES (16, 'Monasterio de Poblet', 1991, 'C', 9, 'poblet.jpg');
INSERT INTO `monuments` VALUES (17, 'Conjunto arqueológico de Mérida', 1993, 'C', 7, 'merida.jpg');
INSERT INTO `monuments` VALUES (18, 'Real Monasterio de Santa María de Guadalupe', 1993, 'C', 7, 'guadalupe.jpg');
INSERT INTO `monuments` VALUES (19, 'Parque Nacional de Doñana', 1994, 'N', 17, 'donyana.jpg');
INSERT INTO `monuments` VALUES (20, 'Ciudad histórica fortificada de Cuenca', 1996, 'C', 11, 'cuenca.jpg');
INSERT INTO `monuments` VALUES (21, 'La Lonja de la Seda de Valencia', 1996, 'C', 1, 'llotja_seda.jpg');
INSERT INTO `monuments` VALUES (22, 'Las Médulas de León', 1997, 'C', 10, 'medulas.jpg');
INSERT INTO `monuments` VALUES (23, 'Monasterios de San Millán de Yuso y de Suso', 1997, 'C', 2, 'san_millan.jpg');
INSERT INTO `monuments` VALUES (24, 'Palau de la Música Catalana y Hospital de Sant Pau, Barcelona', 1997, 'C', 9, 'palau.jpg');
INSERT INTO `monuments` VALUES (25, 'Universidad y casco histórico de Alcalá de Henares', 1998, 'C', 5, 'universidad_alcala.jpg');
INSERT INTO `monuments` VALUES (26, 'Ibiza, biodiversidad y cultura', 1999, 'M', 14, 'eivissa.jpg');
INSERT INTO `monuments` VALUES (27, 'San Cristóbal de La Laguna', 1999, 'C', 13, 'universidad_laguna.jpg');
INSERT INTO `monuments` VALUES (28, 'Conjunto arqueológico de Tarraco', 2000, 'C', 9, 'tarraco.jpg');
INSERT INTO `monuments` VALUES (29, 'Iglesias románicas catalanas del Valle de Boí', 2000, 'C', 9, 'taull.jpg');
INSERT INTO `monuments` VALUES (30, 'Muralla romana de Lugo', 2000, 'C', 6, 'muralla_lugo.jpg');
INSERT INTO `monuments` VALUES (31, 'Palmeral de Elche', 2000, 'C', 1, 'palmeral_elche.jpg');
INSERT INTO `monuments` VALUES (32, 'Yacimiento arqueológico de Atapuerca', 2000, 'C', 10, 'atapuerca.jpg');
INSERT INTO `monuments` VALUES (33, 'Misterio de Elche', 2001, 'I', 1, 'misterio_elche.jpg');
INSERT INTO `monuments` VALUES (34, 'Paisaje cultural de Aranjuez', 2001, 'C', 5, 'aranjuez.jpg');
INSERT INTO `monuments` VALUES (35, 'Conjuntos monumentales renacentistas de Úbeda y Baeza', 2003, 'C', 17, 'ubeda.jpg');
INSERT INTO `monuments` VALUES (36, 'Patum de Berga', 2005, 'I', 9, 'patum_berga.jpg');
INSERT INTO `monuments` VALUES (37, 'Puente de Vizcaya', 2006, 'C', 8, 'puente_vizcaya.jpg');
INSERT INTO `monuments` VALUES (38, 'Parque Nacional del Teide', 2007, 'N', 13, 'teide.jpg');
INSERT INTO `monuments` VALUES (39, 'Torre de Hércules', 2009, 'C', 6, 'torre_hercules.jpg');
INSERT INTO `monuments` VALUES (40, 'Silbo Gomero', 2009, 'I', 13, 'silbo_gomero.jpg');

ALTER TABLE `monuments` ADD CONSTRAINT fk1 FOREIGN KEY (`id_comunitat`) REFERENCES `comunitats` (`id_comunitat`);
ALTER TABLE `monuments` ADD CONSTRAINT fk2 FOREIGN KEY (`id_tipus`) REFERENCES `tipus` (`id_tipus`);
