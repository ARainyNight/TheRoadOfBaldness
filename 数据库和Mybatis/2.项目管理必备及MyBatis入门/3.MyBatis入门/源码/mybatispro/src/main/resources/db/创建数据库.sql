#创建数据库
create database mybd ;

use mybd ;

#创建数据表
create table users(
	 id int auto_increment primary key comment '用户编号',
     username varchar(50) not null comment '用户名称',
	 userpass varchar(50) not null comment '登录密码',
     nickname varchar(50) comment '昵称',
     age int comment '用户年龄',
	 gender varchar(5) comment '用户性别',
     phone varchar(13) comment '联系方式',
     email varchar(20) comment '用户邮箱',
     createTime datetime comment '账号创建时间',
     updateTime datetime comment '账号最后修改时间',
     lastLogin datetime comment '账号最后一次登录时间',
     userStatus int comment '用户账号的状态 0正常 1锁定 2删除',
     remake text comment '备注'
);

