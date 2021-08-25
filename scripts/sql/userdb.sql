# create database
#-------------------------------------------
create database if not exists tianyena default character set=utf8mb4;

use tianyena;
#-------------------------------------------

# dump of table user
#-------------------------------------------
drop table if exists user;

create table user(
id bigint(20) unsigned not null auto_increment comment '主键',
user_id varchar(512) not null comment '用户id',
user_name varchar(512) not null comment '姓名',
user_avatar varchar(512) not null comment '用户头像',
union_id varchar(512) not null comment '统一号',
admin tinyint(4) not null default '0' comment '0-非管理员，1-管理员',
leader tinyint(4) not null default '0' comment '0-非leader，1-leader',
boss tinyint(4) not null default '0' comment '0-非boss，1-boss',
department_Id varchar(512) not null default '0' comment '所属部门，多个部门用逗号分隔',
department_order bigint(20) not null comment '部门次序',
exclusive_account tinyint(4) not null default '0' comment '0-非独占账户，1-独占账户',
hide_mobile tinyint(4) not null default '0' comment '0-不隐藏手机号，1-隐藏手机号',
active tinyint(4) not null default '0' comment '0-非激活用户，1-激活用户',
create_time datetime not null default current_timestamp comment '修改时间',
update_time datetime not null default current_timestamp on update current_timestamp comment '修改时间',
primary key (id),
unique key (user_id)
)engine=innodb default charset =utf8mb4 comment='用户表';
