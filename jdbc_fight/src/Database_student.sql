use students_db;

CREATE TABLE student
(
   id int AUTO_INCREMENT ,
   age INT NOT NULL,
   first VARCHAR(255),
   last VARCHAR(255),
   PRIMARY KEY ( id )
);



insert into student(age, first, last)
values(24,'baba', 'neo');

insert into student(age, first, last)
values(18,'rani', 'makinda');

select * from student s;
select * from student s where first='baba';
update student s set first = "bada baba" where s.id =1;
/** delete from student  where id=1; **/

create table address (
   id int AUTO_INCREMENT,
	lane varchar(250),
	street varchar(250),
	city varchar(250),
	state varchar(250),
	student_id int,
	PRIMARY KEY ( id ),
	FOREIGN KEY (student_id) REFERENCES student(id)
)

insert into address(lane, street, city, state, student_id)  values("lane 3", "Saraswati Vihar", "Doon", "UK", 1);
insert into address(lane, street, city, state, student_id)  values("kali ghaati", "baris wala pahad", "Chennai", "UG", 2);

select * from address;
select * from student s , address a where a.student_id=s.id and s.id =1;