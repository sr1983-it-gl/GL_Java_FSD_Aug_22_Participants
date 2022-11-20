select C.Id as Cust_Id, C.Name, R.Cancelled_Bill_Date, R.Reason from cust_details as C inner join 
(select cust_id, Cancelled_Bill_Date, Reason from orders as O inner join 
(select B.order_id, P.Date as Cancelled_Bill_Date, P.Reason from billing_details as B inner join 
(select * from cancelled_bills) 
as P on P.Inv_Id = B.Inv_Id) 
as Q on Q.order_id = O.Id) 
as R on R.cust_id = C.Id;
