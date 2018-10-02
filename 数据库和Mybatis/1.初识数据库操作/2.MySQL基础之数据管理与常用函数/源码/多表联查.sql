create table user(
		id tinyint unsigned auto_increment key , 
        username varchar(20) not null unique,
        email varchar(50) not null default '382771946@qq.com',
        proId tinyint unsigned not null 
);

insert user(username, proId) values('a',1),
('b',1),
('c',1),
('d',2),
('e',3),
('f',1),
('g',1);


select u.id, u.username,p.proName 
from user as u 
join provinces as p 
on u.proId = p.id ;

update provinces set proName ='北京' where id = 1 ;

create table admin(
	id tinyint unsigned auto_increment key ,
    username varchar(20) not null unique ,
    email varchar(50) not null default '38277194@qq.com',
    proId tinyint unsigned not null 
);

insert admin(username,proId) values('king',1),('queen',2);

create table cate(
  id tinyint unsigned auto_increment key ,
  cateName varchar(50) not null unique,
  cateDesc varchar(100) not null default ''
);

insert cate(cateName) values('母婴'),('服装'),('电子');



create table products(
	id int unsigned auto_increment key ,
    productName varchar(50) not null unique,
    price float(8,2) not null default 0,
    cateId tinyint unsigned not null , 
    adminId tinyint unsigned not null 
);

insert products(productName,price,cateId ,adminId ) values('iphone9',9888,3,1),
('adidas',388 ,2,2),
('nike',888,2,2),
('奶瓶',288,1,1);


/* sad*/
select p.id,p.productName,p.price ,c.cateName 
from products as p 
join cate as c 
on p.cateId = c.id;

select a.id,a.username,a.email,p.proName 
from admin as a 
join provinces as p 
on a.proId = p.id;

select p.id,p.productName ,p.price,c.cateName, a.username,a.email 
from products as p  
join admin as a  
on p.adminId =a.id  
join cate as c  
on p.cateId =c.id;


