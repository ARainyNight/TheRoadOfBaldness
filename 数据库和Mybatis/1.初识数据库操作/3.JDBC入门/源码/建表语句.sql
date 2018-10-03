create database jdbctest ;
use jdbctest; 
create table user(
   uid int primary key auto_increment,
   username varchar(20),
   password varchar(20),
   name varchar(20)
);

insert into user values(null,'aaa','111','张三'),(null,'bbb','222','李四'),(null,'ccc','333','王五');
