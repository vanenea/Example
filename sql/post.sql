create table User(
  id  int,
  name varchar(50),
  primary key(id)
);

insert into User (id, name) values (1,'范传奇');

create table Post(
  id int,
  u_id int,
  content varchar(100),
  primary key(id)
)

insert into Post(id, u_id, content) values
		(1, 1, '今天早晨出了一件大事!');

insert into Post(id, u_id, content) values
		(2, 1, '今天又出了一件大事!');

create table Comment(
  id int,
  p_id int, 
  name varchar(50),
  comment varchar(100),
  primary key(id)
);

insert into Comment (id, p_id, name, comment)
  values(1, 1, '王克晶', '粗啥事情了!');  
insert into Comment (id, p_id, name, comment)
  values(2, 1, '刘苍松', 'Duang!');
  
-- 动态SQL演示

create table Log1 (
  id int,
  u_id int,
  log varchar(100),
  primary key(id)
) 

create table Log2 (
  id int,
  u_id int,
  log varchar(100),
  primary key(id)
) 

insert into Log1 (id, u_id, log) 
		values (1, 1, '开始插卡');
insert into Log1 (id, u_id, log) 
		values (2, 1, '输入密码');
		
insert into Log2 (id, u_id, log) 
		values (1, 1, '开始输入密码');
insert into Log2 (id, u_id, log) 
		values (2, 1, '购买充值卡');
		










