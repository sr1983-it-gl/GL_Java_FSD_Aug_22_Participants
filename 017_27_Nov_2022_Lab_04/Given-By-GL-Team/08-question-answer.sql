-- Q8) Display customer name and gender whose names start or end with character 'A'.

select customer.cus_name,customer.cus_gender from customer where customer.cus_name like 'A%' or customer.cus_name like '%A';
