package com.anderscore.samples.junit5.exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateResolverTest {

    @ExtendWith(DateResolver.class)
    @Test
    void testWithDate(Date today) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        assertEquals(sdf.format(today), sdf.format(new Date()),
                () -> today + " sollte das heutige Datum sein!");
    }
}
