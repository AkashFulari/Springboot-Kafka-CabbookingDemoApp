package com.apaka.kafka.cabbookinguser.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Akash K. Fulari
 * @Contact-mail: akashfulari31@gmail.com
 * @Package: com.apaka.kafka.cabbookinguser.service
 * @Description: cabbooking-driver - Project Development
 * @Created: 2024/03/21 8:14 AM
 **/
@Data
public class Interval {
    private Date startDate;
    private Date endDate;
}
