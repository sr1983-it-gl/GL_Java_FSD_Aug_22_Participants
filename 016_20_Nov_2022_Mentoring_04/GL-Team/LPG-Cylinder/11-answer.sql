select C.Id, C.Name, R.Cancelled_Order_Date, R.Reason from cust_details as C inner join 
(select O.cust_id, Q.Cancelled_Order_Date, Q.Reason from orders as O inner join (select O.Id, P.Date as Cancelled_Order_Date, P.Reason from orders as O inner join (select * from cancelled_orders) 
as P on P.Order_Id = O.Id) 
as Q on Q.Id = O.Id) 
as R on R.cust_id = C.Id;
