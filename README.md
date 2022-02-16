# FeignClientDemo
Small SpringBoot project to demonstrate easy HTTP requests between services using FeignClient

How to:

1. Run both modules, Client and Server
3. Open your Postman and launch a GET request, to the next endPoint:
`http://localhost:19951/data`

Your request has been launched to the Client, which makes a request to the server using Feign Client. The data is returned to the client and this one returns to Postman that shows the data.
