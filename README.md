# Kafka POC
## This code is basically written on ubuntu machine.
Download the Kafka from [here](https://archive.apache.org/dist/kafka/3.0.0/kafka_2.13-3.0.0.tgz).
Now Open the terminal and run the following commands:

```sh
tar -xvzf kafka_2.13-3.0.0.tgz
cd kafka_2.13-3.0.0/config 
vim server.properties 
```
 
Press **i** to enter in insert mode and uncomment the line :  
```sh
listeners=PLAINTEXT://:9092
```
Now Press the **Esc** button and type:
```sh
:wq
```
We can check if the change is reflected or not, using the command: 
```sh
cat server.properties 
```
Now we have to move back to ptrevious directory as: 
```sh
cd ..
```
#### We have completed the installation process of Kafka, now how to use it?
> Step 1: Up the Zookiper: 
```sh
bin/zookeeper-server-start.sh config/zookeeper.properties  
```
> Step 2: Create a Broker: 
```sh
bin/kafka-server-start.sh config/server.properties 
```
> Step 3: Create a Topic: 
```sh
bin/kafka-topics.sh --create --topic topic-sachin_kumar --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1 
```
> Step 4: Create a Consumer: 
```sh
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic-sachin_kumar --from-beginning 
```
> Producer is called using our application by postman hit with **@param** message like this:
```sh
http://localhost:8080/kafka/producer?message=hello_world
```
Now we can check, the message is consumed by our consumer and this ends this basic POC of Kafka.
