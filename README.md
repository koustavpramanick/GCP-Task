# Microservice on GCP K8S

## Problem Statement:
1.	Create 3 microservices (Any comfortable programming language Java, NodeJS, Python, C#)
•	Customer API (get and post/put) to store customer detail (ID, Name, address)
•	Order API (get and post/put) to store order detail for the customer (Order name, id, price, qty)
•	Delivery API (get and post/put) to store delivery details and status
•	for storing you can use any DB or cloud storage
2.	Create docker/container images for the above microservice and push to container registry (Through gcloud cli)
3.	Create GKE cluster (2 nodes) through gcloud cli
4.	Deploy Images to GKE cluster through kubectl
5.	Out come should be
•	Create Customer through Customer API call through postman/curl
•	Create order through Order API call, it should take customer details from customer data based on ID and add customer details to order details and then store
•	When you call delivery API, it should take order details and put it in delivery store

Resources:
Docker images are available under docker repository https://docker.io/koustav12
