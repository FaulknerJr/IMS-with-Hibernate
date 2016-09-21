--------------------------------
Inventory Management System (IMS)
--------------------------------
--------------------------------
Requirements
--------------------------------
-No login/register.
-No roles.
-No CRUD on suppliers, retailers, products, categories, sales (at least not required).
-The purpose of IMS is to give the user the ability to manage retailers.
	-This includes ordering inventory when needed
	 and generating reports to give the user a good understanding
	 of how each retailer is performing - you can be creative in how you handle this.
--------------------------------
User Stories
--------------------------------
-As a user I can view suppliers, retailers, products, categories.
-As a user I can view previous purchase orders (by supplier? by retailer? both? whatever makes sense).
-As a user I can view previous sales (by retailer?).
-As a user I can submit a purchase order (from a supplier, to a retailer).
	-NOTE: each purchase order can have many products and their quantities.
-As a user I am notified when a retailer has a product below a certain threshold.
-As a user I can see the state of each retailer.
-As a user I can view reports to give me a good understanding of each retailers' performance.

------------------------------------
Technologies currently used
------------------------------------
Java 1.8
Hibernate

---------------------
Environment
---------------------
Tomcat
Oracle 11g DB
Eclipse
SQL Developer

--------------------
Setting up DB
--------------------
Install and Set up Oracle 11g with default settings
SYSTEM - admin for Admin user.
In the Oracle DB run the following lines:
   CREATE USER ims IDENTIFIED BY p4ssword;
   GRANT CONNECT, RESOURCE TO ims;
Log into the ims user then drag and drop the imsdb.sql file into SQL Developer
after that is finished drag and drop the imsdbv0.2.sql file into SQL Developer


--------------------
How to use
--------------------
As this is a project currently in development there is very little functionality.
As it stands you can use the DaoImpl classes to perform create, read, update, delete(CRUD) operations.
Running the main class will insert those data fields into the DB and read back the java reference.
