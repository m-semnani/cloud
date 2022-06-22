# Micro Cloud
A toy microservice project using most of the spring cloud features

We have an Eureka server, and 2 services at the moment.

- service-baghali
- servcie-havij

By calling [http://localhost:8082/havij/greeting](http://localhost:8082/havij/greeting), we call service-havij, which in turns, will call servcie-baghali, and finally will call Eureka server to get the name of the baghali application and return the greeting to the client.  