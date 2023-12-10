-- drop database if exists robots;
-- create database robots;

\c robots;

drop table if exists jaegers;

create table jaegers (
    id         serial primary key,
    model_name varchar(20),
    mark       varchar(20),
    height     numeric,
    weight     numeric,
    status     varchar(16),
    origin     varchar(30),
    launch     DATE,
    kaiju_kill int
);

\ir 'init_db.sql'
\ir 'queries.sql'