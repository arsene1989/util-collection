package com.andres.utils;

import com.andres.utils.constants.TimeConstants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author hjs
 */
public class TimeUtil {

    private TimeUtil(){}

    public static LocalDateTime getDateTimeByString(String value){
        return LocalDateTime.parse(value, DateTimeFormatter.ofPattern(TimeConstants.PATTERN));
    }
}
