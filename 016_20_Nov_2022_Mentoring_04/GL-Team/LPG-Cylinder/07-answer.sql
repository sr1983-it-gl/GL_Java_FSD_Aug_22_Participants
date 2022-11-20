select Q.Customer_Id, Q.Name, Q.Order_Id, Q.Order_Date, Q.Inv_Id, Q.Delivery_Date, Q.Connection_Type, Pricing.Price from Pricing inner join 
(select C.Id as Customer_Id, C.Name, P.Order_Id, P.Order_Date, P.Inv_Id, P.Delivery_Date, C.Connection_Type, monthname(Delivery_Date) as month, year(Delivery_Date) as Year from cust_details as C inner join 
(select O.Id as Order_Id, O.date as Order_Date, O.Cust_Id, D.Inv_Id, D.Delivery_Date from orders as O inner join 
(select Inv_Id, Order_Id, date as Delivery_Date from billing_details where Delivery_Status = 'Delivered') 
as D on D.Order_Id = O.Id) 
as P on P.Cust_Id = C.Id) 
as Q on Q.Month = Pricing.Month and Q.Year = Pricing.Year and Q.Connection_Type = Pricing.Type order by Customer_Id;
