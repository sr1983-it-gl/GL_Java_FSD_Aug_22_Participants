DELIMITER %%

CREATE PROCEDURE PriceOfCurrentMonth()
Begin
select * from Pricing where (Month, Year) In (select monthname(curdate()) as Month, year(curdate()) as Year);
End %%

-- in the editor, execute the below line
call PriceOfCurrentMonth();

select * from Pricing where (Month, Year) In (select monthname(curdate()) as Month, year(curdate()) as Year);

-- v2

# Procedure Definition

DELIMITER %%

CREATE PROCEDURE PriceOfCurrentMonth
(I_MONTH VARCHAR(100), I_YEAR INT)

BEGIN
	select * from Pricing WHERE MONTH = I_MONTH AND YEAR = I_YEAR;
END

# To run the procedure

call PriceOfCurrentMonth('January', '2022');





