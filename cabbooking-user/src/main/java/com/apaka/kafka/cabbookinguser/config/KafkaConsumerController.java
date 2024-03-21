package com.apaka.kafka.cabbookinguser.config;

import com.apaka.kafka.cabbookinguser.service.KafkaConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Akash K. Fulari
 * @Contact-mail: akashfulari31@gmail.com
 * @Package: com.apaka.kafka.cabbookinguser.config
 * @Description: cabbooking-driver - Project Development
 * @Created: 2024/03/21 8:04 AM
 **/
@RestController
@RequestMapping("kafka/api/v1/consumer")
public class KafkaConsumerController {
    @Autowired
    KafkaConsumerService consumerService;

    @GetMapping("receive")
    public String recieveMessage(){
        return consumerService.filterMessages();
    }
}
