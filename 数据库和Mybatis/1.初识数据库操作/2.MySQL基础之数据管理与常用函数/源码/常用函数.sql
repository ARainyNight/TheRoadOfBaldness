/*char_length():等到字符串的字符数*/
select char_length('abc');

/*length():等到字符串的长度*/
select length('你好啊');

/*concat(s1,s2,....):将多个字符串合并成一个字符串*/
select concat('jf','你好啊');
/*如果字符串中包含null，返回拼接结果就是null*/
select concat('jf','你好啊',null);

/*concat_ws(x,s1,s2,...):以x为拼接符来拼接字符串*/
select concat_ws('-','jf','你好啊');

/*将字符串转换成大写或者小写 upper()|ucase()|lower()|lcase()*/
select upper('hello king'),ucase('hello IMOOC'),lower('HELLO imooc'),lcase('HELLO IMOOC');

/*字符串的反转reverse()*/
select reverse('abc');

/*left()|right():返回字符串的前几个字符或者后几个字符*/
select left('hello',2),right('hello',2);

/*lpad()|rpad():用字符串填充到指定长度*/
select lpad('abc',10,'?');
select rpad('abc',10,'!');

/*去掉字符串两端的空格trim()|ltrim()|rtrim()*/
select concat('*',trim('  asd  '),'*'),concat('*',ltrim('   sd  '),'*'),concat('*',rtrim('   dsd    '),'*');

/*repeat():重复指定的次数*/
select repeat('hello',3);

/*字符串替换：replace()*/
select replace('hello king','king','queen');

/*截取字符串 substring*/
select substring('abcdef',1,3);

/*比较字符串 strcmp 按照字符串的ASCII来比较*/
select strcmp('a','b');

/*返回当前日期*/
select curdate(),current_date();

/*返回当前时间*/
select curtime(),current_time();

/*返回当前日期时间*/
select now(),current_timestamp(),sysdate();

/*返回日期中的月份*/
select month('2018-10-3');
select month(curdate()),monthname(curdate());

/*返回星期几*/
select dayname(now());

/*返回一周内的第几天*/
select dayofweek(now());

/*返回一年内第几个星期*/
select week(now());

select year(now()),month(now()),day(now()),hour(now()),minute(now()),second(now());

/*计算两个日期相差的天数：datediff()*/
select datediff('2018-03-01',now());

/*得到数据库版本和得到服务器连接数*/
select version(),connection_id();

/*得到当前用户*/
select user(),current_user(),system_user(),session_user();

/*得到上一步插入操作产生的auto_increment的值*/
select last_insert_id();