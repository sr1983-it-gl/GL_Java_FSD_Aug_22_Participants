select CD.id, CD.name, OID, INV_ID, DD from cust_details as CD 
inner join 
(
select O.id as OID, O.cust_id, BD.inv_id as INV_ID, BD.Delivery_Date AS DD from orders as O
inner join
(select inv_id, order_id, date as Delivery_Date  from billing_details where Delivery_status = 'Delivered')
as BD
on 
O.id = BD.order_id
) as OBD
on CD.id = OBD.cust_id