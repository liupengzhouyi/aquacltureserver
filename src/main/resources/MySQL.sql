create table position
(
    positionId int auto_increment comment '自增ID',
    position varchar(20) not null comment '职位名称',
    description_position varchar(200) not null comment '职位描述',
    constraint position_pk
        primary key (positionId)
)
    comment '职位表';


create table staff
(
    id int auto_increment comment '自增ID',
    name varchar(30) not null comment '姓名',
    position_id int not null comment '职位',
    phone_number varchar(20) not null comment '联系方式',
    id_card_number varchar(25) not null comment '身份证号码',
    wage double default 0.0 not null comment '工资',
    entry_date date not null comment '入职日期',
    separation_date date null comment '离职日期',
    is_separation int default 0 not null comment '是否离职',
    constraint staff_pk
        primary key (id)
)
    comment '员工表';

create table finance
(
    id int auto_increment comment '自增ID',
    income_and_expenditure_type int default 0 not null comment '收入支出',
    number double default 0 not null comment '数额',
    why varchar(100) not null comment '缘由',
    note varchar(200) not null comment '备注',
    constraint finance_pk
        primary key (id)
)
    comment '财务数据表';

create table abstract_financial_data
(
    id int auto_increment comment '自增ID',
    livesto_species varchar(50) not null comment '牲畜种类',
    number_of_changes int default 0 not null comment '变动数量',
    why varchar(200) not null comment '变动原因',
    number int default 0 not null comment '总值',
    constraint abstract_financial_data_pk
        primary key (id)
)
    comment '抽象财务数据';

create unique index abstract_financial_data_number_of_changes_uindex
	on abstract_financial_data (number_of_changes);


create table depreciation_maintenance
(
    id int auto_increment comment ' 自增ID',
    project_name varchar(100) not null comment '项目名称',
    why varchar(200) not null comment '维护原因',
    spending double not null comment '花费',
    ordImg varchar(200) not null comment '旧照片',
    newImg varchar(200) not null comment '新照片',
    constraint depreciation_maintenance_pk
        primary key (id)
)
    comment '折旧维护数据库';



