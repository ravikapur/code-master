package com.ubs.opsit.interviews;

import static com.ubs.opsit.interviews.LampStatus.O;
import static com.ubs.opsit.interviews.LampStatus.R;
import static com.ubs.opsit.interviews.LampStatus.Y;

public class ClockUtils {

    private static final int NUM_OF_TOP_LAMPS = 4;
    private static final int NUM_OF_BOTTOM_LAMPS = 11;
    private static final int NUM_OF_LAMP_HOURS = 5;

    private ClockUtils() {
	throw new AssertionError();
    }

    public static String getTopHours(int hours) {
	int lampsTurnedOn = getTopNumberOfOnSigns(hours);
	return getOnOffLamps(lampsTurnedOn, NUM_OF_TOP_LAMPS - lampsTurnedOn, R);
    }

    public static String getBottomHours(int hours) {
	int lampsTurnedOn = hours % NUM_OF_LAMP_HOURS;
	return getOnOffLamps(lampsTurnedOn, NUM_OF_TOP_LAMPS - lampsTurnedOn, R);
    }

    public static String getTopMinutes(int minutes) {
	int lampsTurnedOn = getTopNumberOfOnSigns(minutes);
	return getOnOffLamps(lampsTurnedOn,
		NUM_OF_BOTTOM_LAMPS - lampsTurnedOn, Y)
		.replaceAll("YYY", "YYR");
    }

    public static String getBottomMinutes(int minutes) {
	int lampsTurnedOn = minutes % NUM_OF_LAMP_HOURS;
	return getOnOffLamps(lampsTurnedOn, NUM_OF_TOP_LAMPS - lampsTurnedOn, Y);
    }

    private static String getOnOffLamps(int turnedOnLamps, int turnedOffLamps,
	    LampStatus status) {
	StringBuilder builder = new StringBuilder();
	for (int j = 1; j <= turnedOnLamps; j++)
	    builder.append(status.toString());
	for (int j = 1; j <= turnedOffLamps; j++)
	    builder.append(O.toString());
	return builder.toString();
    }

    private static int getTopNumberOfOnSigns(int number) {
	return (number - (number % NUM_OF_LAMP_HOURS)) / NUM_OF_LAMP_HOURS;
    }

    public static String getSeconds(int seconds) {
	if ((seconds % 2) == 0)
	    return Y.toString();
	else
	    return O.toString();
    }
}
