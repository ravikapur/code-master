package com.ubs.opsit.interviews;

public class BerlinClockBuilder {

    private StringBuilder hourBuilder;
    private StringBuilder minutesBuilder;
    private String seconds;

    public BerlinClockBuilder() {

	this.hourBuilder = new StringBuilder();
	this.minutesBuilder = new StringBuilder();
    }

    public BerlinClockBuilder appendHours(int hours) {
	this.hourBuilder.append(ClockUtils.getTopHours(hours));
	this.hourBuilder.append("\n");
	this.hourBuilder.append(ClockUtils.getBottomHours(hours));
	return this;
    }

    public BerlinClockBuilder appendMinutes(int minutes) {
	this.minutesBuilder.append(ClockUtils.getTopMinutes(minutes));
	this.minutesBuilder.append("\n");
	this.minutesBuilder.append(ClockUtils.getBottomMinutes(minutes));
	return this;
    }

    public BerlinClockBuilder appendSeconds(int seconds) {
	this.seconds = ClockUtils.getSeconds(seconds);
	return this;
    }

    public String build() {

	StringBuilder builder = new StringBuilder();
	builder.append(this.seconds);
	builder.append("\n");
	builder.append(this.hourBuilder.toString());
	builder.append("\n");
	builder.append(this.minutesBuilder.toString());
	return builder.toString();
    }

}
