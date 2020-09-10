CREATE TABLE comment (
    text text NULL,
    post_id int NOT NULL,
    date timestamp NOT NULL,
    user_id int NOT NULL,
    id int NOT NULL AUTO_INCREMENT,
    CONSTRAINT comment_pk PRIMARY KEY (id)
);

-- Table: post
CREATE TABLE post (
    text text NULL,
    id int NOT NULL AUTO_INCREMENT,
    user_id int NULL,
    title varchar(100) NULL,
    date timestamp NULL,
    CONSTRAINT post_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE user (
    first_name varchar(50) NULL,
    last_name varchar(50) NULL,
    email varchar(50) NULL,
    password varchar(100) NULL,
    id int NOT NULL AUTO_INCREMENT,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: comment_post (table: comment)
ALTER TABLE comment ADD CONSTRAINT comment_post FOREIGN KEY comment_post (post_id)
    REFERENCES post (id);

-- Reference: post_user (table: post)
ALTER TABLE post ADD CONSTRAINT post_user FOREIGN KEY post_user (user_id)
    REFERENCES user (id);

ALTER TABLE comment ADD CONSTRAINT comment_user FOREIGN KEY comment_user (user_id)
    REFERENCES user (id);
-- End of file.