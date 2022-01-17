package br.com.claitonp.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.claitonp.kafka.model.Login;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class OutroTopicoConsumer {

	@KafkaListener(topics = "${kafka.topic.outrotopico}", properties = {"spring.json.value.default.type= br.com.claitonp.kafka.model.Login"})
    public void consumerOutro(final ConsumerRecord<String, Login> consumerRecord) {
//		try {
//			String a = null;
//			a.getBytes();
//		} catch (Exception exc) {
//			throw new IllegalArgumentException("erro");
//		}
        log.info("record: " + consumerRecord);
    }

}