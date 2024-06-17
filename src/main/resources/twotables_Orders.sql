REATE TABLE Orders (
                           id bigserial primary key,
                           date date NOT NULL,
                           customer_id int,
                           product_name varchar(256),
                           amount int
);

INSERT INTO Orders (date, customer_id, product_name, amount)
    VALUES (TO_TIMESTAMP('2023-07-20 12:31:12', 'YYYY-MM-DD HH:MI:SS'), '234', 'Тапочки', 2),
     (TO_TIMESTAMP('2022-09-11 02:24:21', 'YYYY-MM-DD HH:MI:SS'), '202','Расческа', 5),
     (TO_TIMESTAMP('2023-02-02 06:47:10', 'YYYY-MM-DD HH:MI:SS'), '206','Носки', 4),
     (TO_TIMESTAMP('2023-08-30 11:01:56', 'YYYY-MM-DD HH:MI:SS'), '212','Трусы', 3),
     (TO_TIMESTAMP('2022-06-27 04:24:45','YYYY-MM-DD HH:MI:SS'), '241','Футболка', 3);
