CREATE TABLE IF NOT EXISTS user_role(id BIGINT NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,
                                      role_id VARCHAR(36),
                                      user_role VARCHAR(36),
                                      user_id VARCHAR(36));

CREATE TABLE IF NOT EXISTS hibernate_sequence (
    next_val BIGINT);
