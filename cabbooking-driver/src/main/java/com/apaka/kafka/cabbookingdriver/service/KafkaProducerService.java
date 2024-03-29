package com.apaka.kafka.cabbookingdriver.service;

import com.apaka.kafka.cabbookingdriver.constants.KafkaConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: Akash K. Fulari
 * @Contact-mail: akashfulari31@gmail.com
 * @Package: com.apaka.kafka.cabbookingdriver.service
 * @Description: cabbooking-driver - Project Development
 * @Created: 2024/03/23 8:26 AM
 **/
@Service
public class KafkaProducerService {
    @Autowired
    KafkaTemplate<Object, String> kafkaTemplate;
    public void sendMessage(String message) {
        kafkaTemplate.send(KafkaConst.TOPIC, message);
    }
}
