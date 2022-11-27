select `order`.ORD_ID, `order`.PRICING_ID, rating.RAT_RATSTARS from `order` inner join rating where `order`.ORD_ID=rating.ORD_ID;
select `order`.PRICING_ID, avg(rating.RAT_RATSTARS) as rating, 

case 
when avg(rating.RAT_RATSTARS)=5 then 'Excellent Service'
when avg(rating.RAT_RATSTARS)>4 then 'Good Service'
when avg(rating.RAT_RATSTARS)>2 then 'Average Service'
else 'Poor Service' end as Type_of_Service from `order` 
inner join rating where `order`.ORD_ID=rating.ORD_ID group by `order`.PRICING_ID;

--

select Y.Final_ID, Y. Final_Supp_Name, Y.FinalAverage,

case 
when Y.FinalAverage=5 then 'Excellent Service'
when Y.FinalAverage>4 then 'Good Service'
when Y.FinalAverage>2 then 'Average Service'
else 'Poor Service' 
end 
as Type_of_Service 


 from 

(
select S.supp_id as Final_ID, supp_name as Final_Supp_Name, X.SupplierAverage as FinalAverage from SUPPLIER as S inner join
(
select ORD_RAT_SP.SUPPLIER_ID,  avg(ORD_RAT_SP.RATING_STARS) as SupplierAverage FROM
(
select SP.supp_id as SUPPLIER_ID,  ORD_RAT.ORD_ID, ORD_RAT.RAT_ID, ORD_RAT.rat_ratstars as RATING_STARS from supplier_pricing as SP inner join
(
select O.ORD_ID, O.pricing_id, R.RAT_ID, R.RAT_RATSTARS from `order` O inner join rating R ON
O.ord_id = R.ord_id
) as ORD_RAT
on ORD_RAT.pricing_id = SP.pricing_id
)
as ORD_RAT_SP  
group by ORD_RAT_SP.SUPPLIER_ID
)
as X
on X.supplier_id = S.supp_Id
) as Y
