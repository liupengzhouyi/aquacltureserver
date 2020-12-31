create table position
(
    positionId int auto_increment comment '自增ID',
    position varchar(20) not null comment '职位名称',
    description_position varchar(200) not null comment '职位描述',
    constraint position_pk
        primary key (positionId)
)
    comment '职位表';


