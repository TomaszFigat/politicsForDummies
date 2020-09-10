insert into user(first_name,last_name,email,password,id) values ('Piotr','Ducki','duc@mail.com','123',1);
insert into user(first_name,last_name,email,password,id) values ('Piotr','Skoupy','skoupy@mail.com','123',2);
insert into user(first_name,last_name,email,password,id) values ('Tomasz','Figat','figat@mail.com','123',3);
insert into user(first_name,last_name,email,password,id) values ('Tadeusz','Norek','norek@mail.com','123',4);

insert into post(text,id,user_id,title,date) values ('jakis tekst', 1, 1,'pierwszy','2019-09-01T00:00');
insert into post(text,id,user_id,title,date) values ('jakis tekst deuig', 2, 1,'drugi','2019-09-01T00:00');
insert into post(text,id,user_id,title,date) values ('jakis tekst trzeci', 3, 1,'trzeci','2019-09-01T00:00');
insert into post(text,id,user_id,title,date) values ('jakis tekst', 4, 2,'pierwszy sk','2019-09-01T00:00');
insert into post(text,id,user_id,title,date) values ('jakis tekst', 5, 2,'drugi sk','2019-09-01T00:00');
insert into post(text,id,user_id,title,date) values ('tralalal', 6, 3,'Tomasz','2019-09-01T00:00');

insert into comment(text,post_id,date,id,user_id) values ('chujowe',1,'2019-09-01T00:00',1,3);
insert into comment(text,post_id,date,id,user_id) values ('dla mnie fajne',1,'2019-09-01T00:00',2,4);
insert into comment(text,post_id,date,id,user_id) values ('średnie',1,'2019-09-01T00:00',3,1);
insert into comment(text,post_id,date,id,user_id) values ('chujowe',2,'2019-09-01T00:00',4,2);
insert into comment(text,post_id,date,id,user_id) values ('chujowe',2,'2019-09-01T00:00',5,4);
insert into comment(text,post_id,date,id,user_id) values ('lala',4,'2019-09-01T00:00',6,2);
insert into comment(text,post_id,date,id,user_id) values ('pioqjtopitwq',5,'2019-09-01T00:00',7,1);
insert into comment(text,post_id,date,id,user_id) values ('zajebiste',6,'2019-09-01T00:00',8,3);