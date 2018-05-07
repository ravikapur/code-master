package com.ubs.opsit.interviews;


public class BerlinTimeConverter implements TimeConverter {

    @Override
    public String convertTime(String aTime) {
	BerlinClockBuilder builder = new BerlinClockBuilder();

	String[] split = aTime.split("\\:");
	try {
	    int hours = Integer.valueOf(split[0]);
	    int minutes = Integer.valueOf(split[1]);
	    int seconds = Integer.valueOf(split[2]);
	    builder.appendHours(hours).appendMinutes(minutes).appendSeconds(seconds);
	} catch (Exception exception) {
	    throw new RuntimeException("Could not parse the time");
	}
	return builder.build();
    }

}
