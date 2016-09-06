CREATE TABLE customer (
        `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        first_name varchar not null,
        second_name varchar not null,
        phone varchar null
        );

CREATE TABLE order (
        `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        `customer_id` INT NOT NULL,
        date DATE not null,
        FOREIGN KEY(customer_id) references customer(id)
        );

CREATE TABLE order_product (
        `order_id` INT NOT NULL,
        `product_id` INT NOT NULL,
        FOREIGN KEY(order_id) REFERENCES order(id),
        FOREIGN KEY(product_id) REFERENCES product(id)
        );

CREATE TABLE product (
        `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        name varchar not null,
        price Float  not null,
        category varchar null,
        desription varchar null
        );

