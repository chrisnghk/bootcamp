create table players(
	player_id integer not null unique,
	group_id integer not null
);

create table matches(
	match_id integer not null unique,
	first_player integer not null,
	second_player integer not null,
	first_score integer not null,
	second_score integer not null
);

insert into players values(20,2);
insert into players values(30,1);
insert into players values(40,3);
insert into players values(45,1);
insert into players values(50,2);
insert into players values(65,1);

insert into matches values (1, 30, 45, 10, 12);
insert into matches values (2, 20, 50, 5, 5);
insert into matches values (13, 65, 45, 10, 10);
insert into matches values (5, 30, 65, 3, 15);
insert into matches values (42, 45, 65, 8, 4);

with u_match as (
  select p1.group_id,p1.player_id,m.first_score as score 
  from players p1, matches m
  where p1.player_id = m.first_player
  UNION
  select p2.group_id,p2.player_id,m.second_score as score 
  from players p2, matches m
  where p2.player_id = m.second_player
),sum_score as(
select player_id, sum(score)
from u_match
group by player_id
),final_table as(
select ROW_NUMBER() over(partition by p3.group_id order by s.sum desc,p3.player_id asc ) as ranking,
p3.* 
from players p3
left join sum_score s
on p3.player_id = s.player_id
)

select group_id, player_id as winner_id
from final_table
where ranking = 1 ;
;