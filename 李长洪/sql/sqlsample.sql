	--����
	INSERT INTO public."T_user1"(
	username, name, id, age, password)
	VALUES ('user','��', '000003', 19, 123456);
	--��?�r��
	select sum(age) from public."T_user1" group by age
	--��?�ځC�r��
	select u1.* from public."T_user1" u1 left join public."T_user2" u2 on u1.username = u2.username order by username desc
	--��?��
	select u1.* from public."T_user1" u1 inner join public."T_user2" u2 on u1.username = u2.username order by username
	--����
	INSERT into public."T_user1"  select * from public."T_user2"
	--�X�V
	update public."T_user1" set id='000005' where name='��'
	
	