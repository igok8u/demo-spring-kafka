# demo-spring-kafka


Download Kafka [last release](https://kafka.apache.org/downloads) and follow setup guide

1. Run <b>Zookeeper</b><br>
(centralized service for maintaining configuration information, naming, providing distributed synchronization, and providing group services.)
>```
>bin\windows\zookeeper-server-start.bat config\zookeeper.properties
>```
2. Run Kafka server 
> ```
> > bin\windows\kafka-server-start.bat config\server.properties    
> ```
3. Create a topic
> ```
> > bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092 
> ```