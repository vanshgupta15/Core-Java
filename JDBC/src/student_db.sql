use students_db;

CREATE TABLE student
(
   id int not null,
   age INT NOT NULL,
   first VARCHAR(255),
   last VARCHAR(255),
   PRIMARY KEY ( id )
);


insert into student(id, age, first, last)
values(1,24,'baba', 'neo');

insert into student(id, age, first, last)
values(2,18,'rani', 'makinda');

select * from student s;
select * from student s where first='baba';
update student s set first = "bada baba" where s.id =1;
/** delete from student  where id=1; **/

create table address (
   id int not null,
	lane varchar(250),
	street varchar(250),
	city varchar(250),
	state varchar(250),
	student_id int,
	PRIMARY KEY ( id ),
	FOREIGN KEY (student_id) REFERENCES student(id)
);

insert into address(id, lane, street, city, state, student_id)  values(1, "lane 3", "Saraswati Vihar", "Doon", "UK", 1);
insert into address(id, lane, street, city, state, student_id)  values(2, "kali ghaati", "baris wala pahad", "Chennai", "UG", 2);

select * from address;

select * from student s , address a where s.id = a.student_id and s.id=1;