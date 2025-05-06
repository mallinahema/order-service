Order Microservice
Overview
The Order Micro service offers a range of endpoints that handles creating, reading, updating, and deleting customer orders.
order Endpoints
Description: 
This group of endpoints provides all the core operations for managing customer orders, including creating new orders, retrieving existing ones, updating order details or status, and deleting or canceling orders. It also covers managing order line-items.
1.	api/orders/addOrder ->	POST ->	Create a new order with customer info and line-items.
2.	/api/orders	GET	Retrieve a list of all orders
3.	/api/order/{id}	GET	Fetch details of a single order by its ID
4.	/api/order/{id}	PUT	Update order header.
5.	/api/order/{id}	DELETE	delete an order
6.	/api/order/{item}/{id}	DELETE	Remove an item from an existing order
7. 	/api/order/{userId}/id	PUT	Update quantity or details of a specific order-item

Installation
Prerequisites
Ensure that you have the following prerequisites installed on your machine:

Intellj
Docker
MySql workbench
