CREATE TABLE Customers (
    id bigserial primary key,
    name varchar(50) NOT NULL,
    surname varchar(50) NOT NULL,
    age INTEGER,
    phone_number varchar(12) NOT NULL
);

INSERT INTO Customers (name, surname, age, phone_number)
    VALUES ('Ivan', 'Smirnov', 27, '+79287894562'),
           ( 'Alexey', 'Ivanov', 34, '+79277214565'),
           ( 'Ivan', 'Sidorov', 31, '+79164758679'),
           ( 'Irina', 'Goriacheva', 25, '+78772134541'),
           ('Sergey', 'Sokolov', 37, '+79275890562');
