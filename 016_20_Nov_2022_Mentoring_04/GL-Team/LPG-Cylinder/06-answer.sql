select C.Id as Cust_Id, C.Name, Delivery_Date from cust_details as C inner join (
select cust_id, Delivery_Date from 
(select O.id, O.cust_id, D.Inv_Id, D.Delivery_Date from orders as O inner join 
(select Inv_Id, Order_Id, date as Delivery_Date from billing_details where Delivery_Status = 'Delivered') 
as D on O.id = D.Order_id) 
as P) 
as Q on Q.cust_id = C.Id order by Cust_Id;
