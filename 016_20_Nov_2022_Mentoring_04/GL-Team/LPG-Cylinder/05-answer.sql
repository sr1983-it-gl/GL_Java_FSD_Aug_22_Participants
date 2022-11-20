select Cust_Id, Successfully_Delivered,
Case
	when Successfully_Delivered >= 8 then 'Highly Valued'
    when Successfully_Delivered between 5 and 7 then 'Moderately Valued'
    Else 'Low Valued'
End as Value from 

(select O.Cust_Id, sum(O.Quantity) as Successfully_Delivered from Orders as O inner join 
(select Order_Id from billing_details where delivery_status = 'Delivered') 
as P on P.Order_Id = O.Id group by Cust_Id) 
as Q;
