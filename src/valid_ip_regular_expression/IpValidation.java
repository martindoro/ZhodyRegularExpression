package valid_ip_regular_expression;

public class IpValidation {
	public static String[] ipAddressArray = { "192.15.15.255", "249.228.239.219", "1.1.1.1", "0.0.0.0",
			"255.255.255.255", "256.12.12.10", "1.1.1", "1..2.55.55", "95", "192.234.24.15.", ".123.12.14.255" };

	public static void main(String[] args) {
		for (String ip : ipAddressArray) {
			IpValidator.validator(ip);
		}
	}

}
