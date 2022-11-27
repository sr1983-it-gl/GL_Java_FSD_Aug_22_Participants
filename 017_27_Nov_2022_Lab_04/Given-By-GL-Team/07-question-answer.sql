-- Q7) Display the Id and Name of the Product ordered after “2021-10-05”. 

select product.pro_id,product.pro_name from `ORDER` inner join supplier_pricing on supplier_pricing.pricing_id=`ORDER`.pricing_id inner join product on product.pro_id=supplier_pricing.pro_id where `ORDER`.ord_date>"2021-10-05";