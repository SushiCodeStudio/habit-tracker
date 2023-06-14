create table "user" (
  id char(36) not null,
  email varchar(100) not null,
  register_type varchar(10) not null,
  create_time timestamp without time zone not null,
  update_time timestamp without time zone not null,
  primary key (id)
);