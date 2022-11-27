
select SP.supp_id,  ORD_RAT.ORD_ID, ORD_RAT.RAT_ID, ORD_RAT.rat_ratstars from supplier_pricing as SP inner join
(
select O.ORD_ID, O.pricing_id, R.RAT_ID, R.RAT_RATSTARS from `order` O inner join rating R ON
O.ord_id = R.ord_id
) as ORD_RAT
on ORD_RAT.pricing_id = SP.pricing_id