CREATE TABLE passwords (
    id bigint NOT NULL auto_increment,
    url varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    primary key (id)
);

INSERT INTO passwords (url, username, password) VALUES
    ('https://example.com', 'johndoe', 'password123'),
    ('https://mail.example.com', 'janedoe', 'securePass!'),
    ('https://banking.example.com', 'mike123', 'bank$ecure987'),
    ('https://social.example.com', 'emily', 'Pa$$word!1'),
    ('https://store.example.com', 'alice_wonder', 'alice$h0pp1ng');