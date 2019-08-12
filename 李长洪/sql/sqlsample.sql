INSERT INTO public."T_user1"(
	username, name, id, age, password)
	VALUES ('user','—›', '000003', 19, 123456);
	
	select * from public."T_user1";
	
	select * from public."T_user2";
	
	select u1.* from public."T_user1" u1 left join public."T_user2" u2 on u1.username = u2.username order by username;

	INSERT into public."T_user1"  select * from public."T_user2";
	
	update public."T_user1" set id='000005' where name='—›';
	
	