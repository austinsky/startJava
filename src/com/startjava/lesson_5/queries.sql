\echo Все роботы
select *
  from jaegers
 order by model_name;

\echo Не уничтоженные работы
select *
  from jaegers
 where status = 'Active'
 order by model_name;

\echo Роботы mark-1 и mark-4
select *
  from jaegers
 where mark in ('Mark 1', 'Mark 4')
 order by model_name;

\echo Все роботы, кроме mark-1 и mark-4 в порядке убывания
select *
  from jaegers
 where mark not in ('Mark 1', 'Mark 4')
 order by mark desc;

\echo Самый старый робот
select *
  from jaegers
 where launch = (select min(launch)
                   from jaegers)
 order by model_name;

\echo Роботы, которые уничтожили больше всех kaiju
select *
  from jaegers
 where kaiju_kill = (select max(kaiju_kill)
                       from jaegers)
 order by kaiju_kill desc;

\echo Средний вес роботов
select round(avg(weight), 3) as "Средний вес"
  from jaegers;

\echo Увеличение количества убитых kaiju на 1 у не уничтоженных роботов
update jaegers
   set kaiju_kill = kaiju_kill + 1
 where status = 'Active';

select *
  from jaegers
 order by model_name;

\echo Удаление уничтоженных роботов
delete from jaegers
 where status = 'Destroyed';

select *
  from jaegers
 order by model_name;