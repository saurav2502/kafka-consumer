package com.consumer.kafka.kafkalistener;

import com.consumer.kafka.model.UserResourse;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka_test", groupId = "GROUP_JSON",
          containerFactory = "kafkaListenerContainerFactory")
    public void consume(UserResourse userResourse){
        System.out.println("message Json consumed {}: "+userResourse);
    }

    @KafkaListener(topics = "test", groupId = "GROUP_ID", containerFactory = "kafkaContainerFactory")
    public void consumeConsumer(String message){
        System.out.println("message Json consumed {}: "+message);
    }
}
