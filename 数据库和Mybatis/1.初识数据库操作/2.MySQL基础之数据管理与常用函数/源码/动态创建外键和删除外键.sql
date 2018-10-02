/*删除外键*/
alter table news 
drop foreign key cateId_fk_newsCate;

/*添加外键*/
alter table news 
add foreign key(cateId) references news_cate(id);

/*删除外键*/
alter table news 
drop foreign key news_ibfk_1;

/*添加外键*/
alter table news 
add constraint cateId_fk_newsCate foreign key(cateId) references news_cate(id);

/*指定级联操作*/
alter table news 
add foreign key(cateId) references news_cate(id) 
on delete cascade on update cascade;
