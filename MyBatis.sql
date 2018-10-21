use mybatis;


show tables;

drop table invoice

describe customer;

drop table invoice,Customer;

create table Customer(
	CustomerId int auto_increment,		#用户表ID
	FirstName varchar(10),					#姓
	LastName varchar(10),					#名
	Company varchar(20),						#公司
	Address varchar(100),					#地址
	City varchar(20),							#城市
	State varchar(10),						#国家
	Country varchar(10),						#乡村
	PostalCode varchar(10),					#区号
	Phone varchar(11),						#电话
	Fax varchar(8),							#传真号
	Email varchar(16),						#邮箱
	SupportRepId int,							#
	Primary key(CustomerId)
)

insert into Customer values
(null,'林','某某','腾讯','广东省湛江市城月镇','湛江市','中国','城月镇','110','178','666','131232@qq.com',3)


select * from Customer


create table Invoice(
	InvoiceId int auto_increment,		#发票表ID
	CustomerId int,						#用户表ID
	InvoiceDate datetime,				#发票生成日期
	BillingAddress varchar(100),		#地址
	BillingCity varchar(20),			#城市
	BillingState varchar(10),			#国家
	BillingCountry varchar(10),		#乡村
	BillingPostalCode varchar(10),	#区号
	Total int,								#总数
	primary key(InvoiceId),
	foreign key(CustomerId) references customer(CustomerId)
)

insert into Invoice values
(null,3,'2018/10/15','广东省湛江市城月镇','珠海市','中国','斗门区','000',100)

select * from Invoice