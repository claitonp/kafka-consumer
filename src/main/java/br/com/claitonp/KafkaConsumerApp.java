package br.com.claitonp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaConsumerApp {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(KafkaConsumerApp.class, args);
    }

}
