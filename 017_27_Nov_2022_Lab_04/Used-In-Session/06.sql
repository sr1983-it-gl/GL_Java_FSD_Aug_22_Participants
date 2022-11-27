select PSP.*, c.cat_name from category c 
inner join
(
select p.pro_id, p.pro_name, p.cat_id, SP.MinProductPrice from product p inner join
(
select pro_id, min(supp_price) as MinProductPrice from supplier_pricing group by pro_id
) as SP
where SP.pro_id = p.pro_id
)
as PSP
where PSP.CAT_ID = c.cat_id;