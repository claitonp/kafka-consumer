package br.com.claitonp.consumer.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import br.com.claitonp.consumer.kafka.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
@Service
public class TopicListener {

    @Value("${topic.name.consumer")
    private String topicName;

//    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
//    public void consume(ConsumerRecord<String, User> payload){
//        log.info("Tópico: {}", topicName);
//        log.info("key: {}", payload.key());
//        log.info("Headers: {}", payload.headers());
//        log.info("Partion: {}", payload.partition());
//        log.info("Order: {}", payload.value());
//    }

    
//    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
//    public void consume(User user){
//        log.info("user: {}", user);
//    }
    

	@KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
	public void listenAsObject(ConsumerRecord<String, User> cr, @Payload User payload) {
	    log.info("received id: {} key {}; payload: {}; record: {}", payload.getLogin(), payload, cr.toString());
	}

}