package com.apaka.kafka.cabbookingdriver.config;

import com.apaka.kafka.cabbookingdriver.constants.KafkaConst;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @Author: Akash K. Fulari
 * @Contact-mail: akashfulari31@gmail.com
 * @Package: com.apaka.kafka.cabbookingdriver.api
 * @Description: cabbooking-driver - Project Development
 * @Created: 2024/03/23 8:22 AM
 **/
@Configuration
public class KafkaProducerConfig {
    @Bean
    public NewTopic createNewTopic(){
        return TopicBuilder.name(KafkaConst.TOPIC).build();
    }
}
