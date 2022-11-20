select CD.id, name, BDCBO.Undelivery_Date, BDCBO.Reason_For_Undelivery from cust_details as CD
inner join
(
select cust_id, Undelivery_Date, Reason_For_Undelivery 
from orders as O 
inner join
(
select BD.order_id, CB.date as Undelivery_Date, CB.reason as Reason_For_Undelivery, BD.inv_id from billing_details as BD
inner join
(select * from cancelled_bills) as CB
on BD.inv_id = CB.inv_id
) as BDCB
on O.id = BDCB.order_id
) as BDCBO
on CD.id = BDCBO.cust_id