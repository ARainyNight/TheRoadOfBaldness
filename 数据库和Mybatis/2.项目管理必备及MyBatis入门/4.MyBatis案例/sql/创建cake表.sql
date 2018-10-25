CREATE TABLE `cake` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) NOT NULL,
  `name` varchar(45) NOT NULL,
  `level` int(2) not  NULL,
  `price` int(9) not NULL,
  `small_img` mediumblob not null,
  `create_time` datetime not  NULL,
  `update_time` datetime not null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;