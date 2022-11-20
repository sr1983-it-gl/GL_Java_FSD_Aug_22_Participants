select C.id, name, connection_type, O.total_cylinders from cust_details as C
inner join
(select cust_id, sum(quantity) as total_cylinders from orders group by cust_id) as O
on C.id = O.cust_id;