package valid_ip_regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidator {
	private static String UP_TO_199 = "([0-1]?[\\d]?[\\d]?)";
	private static String UP_TO_249 = "(2[0-4][\\d])";
	private static String UP_TO_255 = "(2[5][0-5])";

	public static void validator(String ipAddress) {
		Pattern pattern = Pattern.compile("((" + UP_TO_255 + "|" + UP_TO_249 + "|" + UP_TO_199 + ")\\.)" + "{3}" + "("
				+ UP_TO_255 + "|" + UP_TO_249 + "|" + UP_TO_199 + ")");
		Matcher matcher = pattern.matcher(ipAddress);
		if (matcher.matches()) {
			System.out.println("IP adresa (" + ipAddress + ") JE validná.");
		} else {
			System.out.println("IP adresa (" + ipAddress + ") NIE JE validná.");
		}
	}
}
