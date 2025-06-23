use world

select ID,Name,Population from city where Name='Dehra Dun';

select name,population from city where CountryCode='IND' and Name='Kanpur';

select name,population from city where CountryCode='IND' or Name='Kanpur';

select name from city where not CountryCode='AFG';

select * from city order by population;

select * from city order by population desc;

select * from city order by CountryCode, District;

insert into city(Name, CountryCode, District, Population)
values('Vansh City', 'IND', 'Vansh Island', '1');

select * from city where CountryCode IS NOT NULL;

select * from city where CountryCode IS NULL;

update city set population='2' where ID='4085';


delete from city where Name='Vansh City';

