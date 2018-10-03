create table goods(
	id  int primary key auto_increment comment '商品编号', 
    name varchar(20) not null comment '商品名称',
    price float not null comment '商品价格',
    desp varchar(30) not null comment '商品描述' 
);

