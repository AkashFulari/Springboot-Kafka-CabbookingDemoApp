package com.apaka.kafka.cabbookinguser.service;

import com.apaka.kafka.cabbookinguser.constants.KafkaConst;
import com.apaka.kafka.cabbookinguser.pojo.Interval;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: Akash K. Fulari
 * @Contact-mail: akashfulari31@gmail.com
 * @Package: com.apaka.kafka.cabbookinguser.service
 * @Description: cabbooking-driver - Project Development
 * @Created: 2024/03/21 12:18 AM
 **/
@Service
public class KafkaConsumerService {
    private Map<Date, String> msgMap = new HashMap();

    @KafkaListener(topics = KafkaConst.TOPIC, groupId = "kafka-listener")
    public void updateLocation(String locationMessage){
        msgMap.put(new Date(), locationMessage);
        // System.out.println(locationMessage);
    }
    public String filterMessages(Interval interval) {
        return msgMap.entrySet()
                .stream()
                .filter(map -> map.getKey().after(interval.getStartDate()) && map.getKey().before(interval.getEndDate()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())).toString();
    }
    public String filterMessages() {
        return msgMap.entrySet().stream().collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())).toString();
    }
}
