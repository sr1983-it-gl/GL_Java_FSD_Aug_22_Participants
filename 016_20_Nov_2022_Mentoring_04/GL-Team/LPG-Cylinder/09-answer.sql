select C.Id as Cust_Id, C.Name, Q.Last_Delivery_Date, Q.Quantity from cust_details as C inner join 
(select cust_id, max(Delivery_Date) as Last_Delivery_Date, Quantity from 
(select O.id, O.cust_id, O.Quantity,D.Delivery_Date from orders as O inner join 
(select Order_Id, date as Delivery_Date from billing_details where Delivery_Status = 'Delivered') 
as D on O.id = D.Order_id) 
as P group by (cust_id)) 
as Q on Q.cust_id = C.Id
order by cust_id;
