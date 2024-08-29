create table if not exists users (
    id bigint not null auto_increment,
    username varchar(255),
    password varchar(255),
    primary key (id)
);

INSERT INTO users (username, password)
VALUES
('joao123', '$2a$12$HO/pEmlk7oKEDFxWjLRghezFGB0qw/lsUo00gWzyGdntjitl.NELa'),
('maria456', '$2a$12$8o48CraJplX8.QCQmSHxvOAvhsBq7UQijRN53lQspf6jPxBeI7w72'),
('pedro789', '$2a$12$ojLNOalSGBGuN8FPGzGYwO90vq1iioetQvAXyrX4N//bG3pjrweKK');