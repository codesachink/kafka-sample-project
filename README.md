This code is basically written on ubuntu machine.

Download the Kafka: 
https://archive.apache.org/dist/kafka/3.0.0/kafka_2.13-3.0.0.tgz 

Open Terminal: Run the following commands
tar -xvzf kafka_2.13-3.0.0.tgz 
cd kafka_2.13-3.0.0/config 
vim server.properties 

Press i to enter in insert mode 
uncomment the line :  listeners=PLAINTEXT://:9092
Press-> Esc:wq 
Check whether the changes reflected or not by runnig: cat server.properties 
Go back to ptrevious directory: cd ..

Up the Zookiper: 
bin/zookeeper-server-start.sh config/zookeeper.properties  

Broker creation: 
bin/kafka-server-start.sh config/server.properties 

Create topic: 
bin/kafka-topics.sh --create --topic topic-sachin_kumar --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1 

Create Consumer: 
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic-sachin_kumar --from-beginning 

Producer is called using our application by postman hit with @param message like this:
http://localhost:8080/kafka/producer?message=hello_world

Now we can check, the message is consumed by our consumer.
