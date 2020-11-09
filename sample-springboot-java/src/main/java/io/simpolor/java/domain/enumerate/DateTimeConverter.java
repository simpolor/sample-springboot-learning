package io.simpolor.java.domain.enumerate;

import org.springframework.core.convert.converter.Converter;

import java.time.*;

public enum DateTimeConverter implements Converter<LocalDateTime, ZonedDateTime> {

    INSTANCE;

    @Override
    public ZonedDateTime convert(LocalDateTime source){
        return ZonedDateTime.ofInstant(source.toInstant(ZoneOffset.UTC), ZoneId.systemDefault());
    }

}
