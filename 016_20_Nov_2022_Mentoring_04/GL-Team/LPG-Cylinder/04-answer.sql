-- Using Rank
-- ---------------------------------
select a.Cust_Id, a.Name, a.no_of_cylinders, a.Connection_Type from
(select C.Id as Cust_Id, C.Name, P.no_of_cylinders, C.Connection_Type, 
	rank() over(partition by C.Connection_Type order by P.no_of_cylinders desc) as rnk
    from Cust_Details as C inner join 
(select Cust_Id, sum(Quantity) as no_of_cylinders from orders where status = 'ordered' group by cust_Id) 
as P on P.Cust_Id = C.Id
) a
where a.rnk=1;


-- Using joins
-- --------------------------------
select S.* from (
select Connection_Type, max(no_of_cylinders) as cyl from (
select C.Id as Cust_Id, C.Name, P.no_of_cylinders, C.Connection_Type from Cust_Details as C inner join 
(select Cust_Id, sum(Quantity) as no_of_cylinders from orders where status = 'ordered' group by cust_Id) 
as P on P.Cust_Id = C.Id) as Q group by connection_Type)
as R inner join 
(
	select C.Id as Cust_Id, C.Name, P.no_of_cylinders, C.			Connection_Type from Cust_Details 
as C 
inner join 
(
	select Cust_Id, sum(Quantity) as no_of_cylinders from orders 	where status = 'ordered' group by cust_Id
) 
as P 
on 
P.Cust_Id = C.Id
) 

as S 

where R.cyl = S.no_of_cylinders and R.connection_type = S.connection_type;
