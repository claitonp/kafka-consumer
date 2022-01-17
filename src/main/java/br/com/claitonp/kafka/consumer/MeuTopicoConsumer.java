package br.com.claitonp.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.claitonp.kafka.model.User;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class MeuTopicoConsumer {

	@KafkaListener(topics = "${kafka.topic.meutopico}", properties = {"spring.json.value.default.type= br.com.claitonp.kafka.model.User"})
    public void consumer(final ConsumerRecord<String, User> consumerRecord) {
        log.info("record: " + consumerRecord);
    }

//    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
//    public void consume(ConsumerRecord<String, User> payload){
//        log.info("Tópico: {}", topicName);
//        log.info("key: {}", payload.key());
//        log.info("Headers: {}", payload.headers());
//        log.info("Partion: {}", payload.partition());
//        log.info("Order: {}", payload.value());
//    }

    
//    @KafkaListener(topics = "${kafka.topic.meutopico}", groupId = "group_id")
//    public void consume(User user){
//        log.info("user: {}", user);
//    }
    

//	@KafkaListener(topics = "${kafka.topic.meutopico}", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
//	public void consumer(ConsumerRecord<String, User> cr, @Payload User payload) {
//	    log.info("received id: {} key {}; payload: {}; record: {}", payload.getLogin(), payload, cr.toString());
//	}

//	@KafkaListener(topics = "${kafka.topic.meutopico}", groupId = "${spring.kafka.consumer.group-id}")
//	public void consumer(User user) {    
//		log.info("received user: {}", user);
//	}
//	


}