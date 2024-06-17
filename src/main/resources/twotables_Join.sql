select product_name
from Orders
left join Customers
on Orders.id = Customers.id
where lower(Customers.name) = 'alexey';