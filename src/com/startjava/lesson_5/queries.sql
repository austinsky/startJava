\echo Все роботы
select *
from jaegers;

\echo Не уничтоженные работы
select *
from jaegers
where status = 'Active';

\echo Роботы mark-1 и mark-4
select *
from jaegers
where mark in ('Mark 1', 'Mark 4');

\echo Все роботы, кроме mark-1 и mark-4
select *
from jaegers
where mark not in ('Mark 1', 'Mark 4');

\echo Роботы отсортированы по полю mark в порядке убывания
select *
from jaegers
order by mark desc;

\echo Самый старый робот
select *
from jaegers
where launch = (select min(launch) from jaegers);

\echo Роботы, которые уничтожили больше всех kaiju
select *
from jaegers
where kaiju_kill = (select max(kaiju_kill) from jaegers);

\echo Средний вес роботов
select avg(weight) as "Средний вес"
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