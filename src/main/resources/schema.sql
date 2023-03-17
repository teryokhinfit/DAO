create table mst1.CUSTOMERS
(
    id int primary key auto_increment,
    name varchar(225) not null default 'not specified',
    surname varchar(225) not null default 'not specified',
    age int not null check ( age>0 ),
    phone_number varchar(225) not null
);

create table mst1.ORDERS
(
    id int primary key auto_increment,
    date date ,
    customer_id int ,
    product_name varchar(255),
    amount int,
    foreign key (customer_id) references  mst1.CUSTOMERS(id)
);



