package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BerlinTimeConverterTest {

    private BerlinTimeConverter converter;

    @Before
    public void setUp() {
	converter = new BerlinTimeConverter();
    }

    @Test
    public void convertTime_whenTimeIs00_00_00_shouldBuildBelowBerlinClock() {
	assertEquals("Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO",
		converter.convertTime("00:00:00"));
    }

    @Test
    public void convertTime_whenTimeIs13_17_01_shouldBuildBelowBerlinClock() {
	assertEquals("O\n" + "RROO\n" + "RRRO\n" + "YYROOOOOOOO\n" + "YYOO",
		converter.convertTime("13:17:01"));
    }

    @Test
    public void convertTime_whenTimeIs24_00_00_shouldBuildBelowBerlinClock() {
	assertEquals("Y\n" + "RRRR\n" + "RRRR\n" + "OOOOOOOOOOO\n" + "OOOO",
		converter.convertTime("24:00:00"));
    }
    
    @Test
    public void convertTime_whenTimeIs16_38_16_shouldBuildBelowBerlinClock() {
	assertEquals("Y\n" + "RRRO\n" + "ROOO\n" + "YYRYYRYOOOO\n" + "YYYO",
		converter.convertTime("16:38:16"));
    }
    
    @Test
    public void convertTime_whenTimeIs23_59_59_shouldBuildBelowBerlinClock() {
	assertEquals("O\n" + "RRRR\n" + "RRRO\n" + "YYRYYRYYRYY\n" + "YYYY",
		converter.convertTime("23:59:59"));
    }
}
