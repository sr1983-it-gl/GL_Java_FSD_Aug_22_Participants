-- Q3) Display the total number of customers based on gender who have placed orders of worth at least Rs.3000.

select count(t2.cus_gender) as NoOfCustomers, t2.cus_gender from 
(select t1.cus_id, t1.cus_gender, t1.ord_amount, t1.cus_name from 
(select `ORDER`.*, customer.cus_gender, customer.cus_name from `ORDER` inner join customer where `ORDER`.cus_id=customer.cus_id having `ORDER`.ord_amount>=3000)
as t1  group by t1.cus_id) as t2 group by t2.cus_gender;
