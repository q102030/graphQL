# graphQL

## Spring Boot + Gradle + graphQL

## Resource
https://medium.com/swlh/how-to-write-a-simple-graphql-application-using-spring-boot-in-java-a8232a0decd5
https://iter01.com/34637.html
https://www.apollographql.com/blog/graphql/examples/4-simple-ways-to-call-a-graphql-api/
https://github.com/npalm/graphql-java-demo

## Postman 
```
POST
http://localhost:8080/graphql-demo/getData
raw
{
    stocks
    {
        ticker
        stockValue
        volume
        averageVolume
        PE_Ratio
        EPS
        dividend
        marketCap
        previousOpen
        previousClose
    }
}
```
