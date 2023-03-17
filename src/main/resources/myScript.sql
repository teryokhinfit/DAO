select mst1.ORDERS.product_name from  mst1.ORDERS
join mst1.CUSTOMERS  on  mst1.CUSTOMERS.id =  mst1.ORDERS.customer_id
where mst1.CUSTOMERS.name= :name;