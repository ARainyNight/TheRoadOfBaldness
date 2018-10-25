create table category(
	`id` bigint(20) not null auto_increment,
    `name` varchar(45) not null,
    `create_time` datetime not null ,
    `update_time` datetime not null ,
    primary key(`id`)
)engine=InnoDB auto_increment=1 default charset=utf8;