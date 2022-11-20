select cust_id, Successful_Deliveries,
case
	when Successful_Deliveries >=8 then 'Highly Valued'
    when Successful_Deliveries between 5 and 7 then 'Moderately Value'
    else 'Low Valued'
end 
as 'Value of Customer' 

FROM

(

select cust_id, sum(quantity) as Successful_Deliveries from orders  as O
inner join
(select * from billing_details where delivery_status = 'Delivered')
as BD 
on O.id = BD.order_id
group by cust_id

)as OBD;
