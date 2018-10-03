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

/*由exists引发的子查询*/
select * from emp where exists (select depName from dep where id =10) ;


/*带有any some all的子查询*/
select * from stu 
where score>= any(select score from level);

select * from stu 
where score>= some(select score from level);

select * from stu 
where score>= all(select score from level);


/*创建数据库分类表cate*/
create table cate(
	id smallint unsigned auto_increment key,
    cateName varchar(100) not null unique ,
    pId smallint unsigned not null default 0
);

insert cate(cateName ,pId ) values('服装',0),('数码',0),('玩具',0);

insert cate(cateName ,pId ) values('男装',1),('女装',1),('内衣',1);

insert cate(cateName ,pId ) values('电视',2),('冰箱',2),('洗衣机',2);

insert cate(cateName ,pId ) values('爱马仕',3),('LV',3),('GUCCI',3);

insert cate(cateName ,pId ) values('夹克',4),('衬衫',4),('裤子',4);

insert cate(cateName ,pId ) values('液晶电视',10),('等离子电视',10),('背投电视',10);



/*查询所有分类信息，并且得到其父分类*/
select s.id ,s.cateName as sCateName ,p.cateName as pCateName  
from cate as s
left join cate as p 
on s.pId =p.id ;



