
/*新闻分类表*/
create table news_cate(
	id tinyint unsigned auto_increment key ,
    cateName varchar(50) not null unique ,
    cateDesc varchar(100) not null default ''
);

insert news_cate(cateName) values('国内新闻'),
('国际新闻'),
('娱乐新闻'),
('体育新闻');

/*新闻表*/
create table news(
  id int unsigned auto_increment key ,
  title varchar(100) not null unique,
  content varchar(1000) not null ,
  cateId tinyint unsigned not null 
);

insert news(title,content ,cateId ) values('a1','aaaaa1',1),
('a2','aaaa2',1),
('a3','aaaa3',4),
('a4','aaaa4',2),
('a5','aaaa5',3);

/*查询news id title content 
news_cate cateName*/
select n.id,n.title,n.content,c.cateName 
from news as n 
join news_cate as c 
on n.cateId = c.id;

/*取消国际新闻*/
delete from news_cate where id =2 ;

/*添加外键*/

/*新闻分类表*/
create table news_cate(
	id tinyint unsigned auto_increment key ,
    cateName varchar(50) not null unique ,
    cateDesc varchar(100) not null default ''
)engine=innodb;

insert news_cate(cateName) values('国内新闻'),
('国际新闻'),
('娱乐新闻'),
('体育新闻');

/*新闻表*/
create table news(
  id int unsigned auto_increment key ,
  title varchar(100) not null unique,
  content varchar(1000) not null ,
  cateId tinyint unsigned not null,
  constraint cateId_fk_newsCate foreign key(cateId) references news_cate(id)
)engine =innodb;

insert news(title,content ,cateId ) values('a1','aaaaa1',1),
('a2','aaaa2',1),
('a3','aaaa3',4),
('a4','aaaa4',2),
('a5','aaaa5',3);

/*测试非法记录*/
insert news(title ,content ,cateId ) values('b1','bbb1',8);

/*测试删除父表中的记录 和删除父表*/
delete from news_cate where id =1; 

update news_cate set id=10 where id =1;

insert news_cate(cateName) values('教育新闻');

/*将教育新闻改成教育*/
update news_cate set cateName ='教育' where id = 5;
update news_cate set id =50 where cateName='教育';
