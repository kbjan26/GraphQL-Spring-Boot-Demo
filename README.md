# GraphQL-Spring-Boot-Demo
Demonstration of GraphQL service using Spring Boot Starter

This example is an demonstration of Graphl service in Spring Boot application

Schema definition can be found under resources directory - bank.graphqls

Under resolver package below resolvers are available which facilates addition of record and querying of records

BankMutationResolver - Implemented to facilitate addition of sample bank record

BankQueryResolver - Implemented to facilitate querying details in DB

For simplification , I have used in memory H2 DB

Testing Graphl Queries

http://localhost:8080/graphiql - rich GraphQL UI to test the mutation and queries

To add use the below mutation

mutation{
	newBank(bankName: "Bank of America",zipCode: "27519",city: "Cary",county: "Wake"){
    id
  }
}

To Query the added details and narrow down only on the fields you want , modify the below exammple as per your needs

query{
  getBankDetails(id: 1){
    city
  }
}
