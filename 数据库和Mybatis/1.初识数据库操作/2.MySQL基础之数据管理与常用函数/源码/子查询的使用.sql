/*测试由in引发的子查询*/
select * from emp 
where depId  in (select id from dep);

/*创建学员表*/
create table stu(
 id tinyint unsigned auto_increment key ,
 username varchar(20) not null unique,
 score tinyint unsigned not null 
);
insert stu(username,score) values('king',97),
('queen',78),
('zhangsan',69),
('lisi',78),
('wangwu',87),
('zhaoliu',88),
('tianqi',98),
('ceshi',99),
('tiancai',50);

/*创建分数级别表*/
create table level(
	id tinyint unsigned auto_increment key comment '编号',
    score tinyint unsigned comment '分数'
);

insert level(score) values(90),(80),(70);


/*查询出成绩优秀的成员*/
select score from level where id = 1 ;

select id,username,score from stu 
where score>=(select score from level where id = 1 );

/*查询出没有得到评级的学员*/
select id ,username,score from stu  
where score<=(select score from level where id =3);