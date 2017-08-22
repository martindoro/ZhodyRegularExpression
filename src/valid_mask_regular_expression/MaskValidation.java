package valid_mask_regular_expression;

public class MaskValidation {
	static String[] masky = { "255.255.255.0", "255.255.240.0", "255.255.0.0", "255.240.255.0", "174.250.255.255",
			"255.254.255.0" };
	static String maskID;

	public static void main(String[] args) {
		for (String mask : masky) {
			maskID = mask;
			MaskValidator.validator1(mask);
			MaskValidator.validator2(mask);
			System.out.println();
		}
	}
}
