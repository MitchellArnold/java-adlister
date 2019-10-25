USE adlister_db;
CREATE TABLE users (
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    username VARCHAR(50) NOT NULL,
                    email VARCHAR(100) NOT NULL,
                    password VARCHAR(50) DEFAULT NULL,
                    PRIMARY KEY (id),
                    FOREIGN KEY (user_id) REFERENCES ads(user_id)
);

CREATE TABLE ads (
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    user_id INT NOT NULL,
                    title VARCHAR(100) NOT NULL,
                    description VARCHAR(255) NOT NULL,
                    PRIMARY KEY (id)
);
