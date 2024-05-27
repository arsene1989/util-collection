package com.andres.utils.constants;

import java.time.format.DateTimeFormatter;

/**
 * @author hjs
 */
public class TimeConstants {

    private TimeConstants(){}
    public static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS";

    public static final String STANDARD_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final DateTimeFormatter STANDARD_FORMATTER = DateTimeFormatter.ofPattern(STANDARD_PATTERN);
}
