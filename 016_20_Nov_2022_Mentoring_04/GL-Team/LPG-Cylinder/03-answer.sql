select C.Name, C.Connection_Type, Q.No_of_cylinders from Cust_Details as C inner join 
(select Cust_Id, sum(Quantity) as no_of_cylinders from orders where status = 'ordered' group by cust_Id) 
as Q on C.Id = Q.cust_id;
