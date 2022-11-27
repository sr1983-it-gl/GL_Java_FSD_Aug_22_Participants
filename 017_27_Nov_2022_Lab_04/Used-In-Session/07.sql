
select P.PRO_ID, P.PRO_NAME from `order` as O, supplier_pricing as SP, product as P
	where O.pricing_id = SP.PRICING_ID AND
    SP.pro_id = P.pro_id AND
    O.ORD_DATE > "2021-10-05";
    