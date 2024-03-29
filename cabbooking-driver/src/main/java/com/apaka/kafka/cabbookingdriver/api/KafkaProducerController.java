package com.apaka.kafka.cabbookingdriver.api;

import com.apaka.kafka.cabbookingdriver.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Akash K. Fulari
 * @Contact-mail: akashfulari31@gmail.com
 * @Package: com.apaka.kafka.cabbookingdriver.api
 * @Description: cabbooking-driver - Project Development
 * @Created: 2024/03/23 8:26 AM
 **/
@RestController
@RequestMapping("kafka/api/v1/producer/")
public class KafkaProducerController {
    @Autowired
    KafkaProducerService kafkaProducerService;

    @PutMapping("produce")
    public ResponseEntity produceMessage() throws InterruptedException {
        int i = 100;
        while(i>0){
            kafkaProducerService.sendMessage(Math.random()+","+Math.random());
            Thread.sleep(1000);
            i--;
        }
        return new ResponseEntity<>(Map.of("Message","Sent Successfully!!!"), HttpStatus.OK);
    }
}
