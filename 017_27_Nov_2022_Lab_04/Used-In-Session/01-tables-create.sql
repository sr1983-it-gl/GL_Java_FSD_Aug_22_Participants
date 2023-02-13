create table Cust_Details (Id int primary key auto_increment, Name varchar(50), Gender varchar(1), Address varchar(100), Phone_NO bigint, Connection_Type decimal(3,1), No_Of_Cylinders int);

create table Orders (Id int primary key auto_increment, Date date, Cust_Id int, Quantity int, Payment_type varchar(30), Status varchar(30), foreign key(Cust_Id) references Cust_details(Id));

create table Cancelled_Orders (Order_Id int, Date date, Reason varchar(50), foreign key(Order_Id) references Orders(Id));

create table Billing_Details(Inv_Id int Primary key auto_increment, Date date, Order_Id int, Delivery_Status varchar(30), foreign key(Order_Id) references Orders(Id));

create table Cancelled_Bills (Inv_Id int, Date date, Reason varchar(50), foreign key(Inv_Id) references billing_details(Inv_Id));

create table Pricing (Type decimal(3,1), Month varchar(10), Year int, Price int);
