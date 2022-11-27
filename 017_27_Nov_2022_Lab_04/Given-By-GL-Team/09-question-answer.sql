-- Q9) Create a stored procedure to display supplier id, name, rating and Type_of_supplier. If rating >4 then “Genuine Supplier” if rating >2 “Average Supplier” else “Supplier should not be considered”.
(Please explain with Delimiter and without Delimiter)

DELIMITER &&  
CREATE PROCEDURE proc()
BEGIN
select report.supp_id,report.supp_name,report.Average,
CASE
	WHEN report.Average =5 THEN 'Excellent Service'
    	WHEN report.Average >4 THEN 'Good Service'
    	WHEN report.Average >2 THEN 'Average Service'
    	ELSE 'Poor Service'
END AS Type_of_Service from 
(select final.supp_id, supplier.supp_name, final.Average from
(select test2.supp_id, sum(test2.rat_ratstars)/count(test2.rat_ratstars) as Average from
(select supplier_pricing.supp_id, test.ORD_ID, test.RAT_RATSTARS from supplier_pricing inner join
(select `ORDER`.pricing_id, rating.ORD_ID, rating.RAT_RATSTARS from `ORDER` inner join rating on rating.ord_id = `ORDER`.ord_id ) as test
on test.pricing_id = supplier_pricing.pricing_id) 
as test2 group by supplier_pricing.supp_id) 
as final inner join supplier where final.supp_id = supplier.supp_id) as report;
END &&  
DELIMITER ;  

call proc();
