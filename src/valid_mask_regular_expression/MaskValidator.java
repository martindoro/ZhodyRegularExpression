package valid_mask_regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskValidator {
	public static void validator1(String mask) {
		String[] maska = mask.split("[.]");
		int x = 0;
		String[] mArray = { "", "", "", "" };
		for (String maskPart : maska) {
			int m = Integer.parseInt(maskPart);
			mArray[x] = Integer.toBinaryString(m);
			x++;
		}
		String binMask = mArray[0] + mArray[1] + mArray[2] + mArray[3];
		Pattern pattern = Pattern.compile("[1]+[0]*");
		Matcher matcher = pattern.matcher(binMask);
		if (matcher.matches()) {
			System.out.println("Maska siete " + MaskValidation.maskID + " podľa 1. postupu JE validná.");
		} else {
			System.out.println("Maska siete " + MaskValidation.maskID + " podľa 1. postupu NIE JE validná.");
		}
	}

	public static void validator2(String mask) {
		Pattern pattern = Pattern.compile(
				"(((254|252|248|240|224|192|128)\\.0\\.0\\.0)|(255\\.(0|128|192|224|240|248|252|254|0)\\.0\\.0)|"
						+ "(255\\.255\\.(0|128|192|224|240|248|252|254|0)\\.0)|(255\\.255\\.255\\.(0|128|192|224|240|248|252|254|0)))");
		Matcher matcher = pattern.matcher(mask);
		if (matcher.matches()) {
			System.out.println("Maska siete " + MaskValidation.maskID + " podľa 2. postupu JE validná.");
		} else {
			System.out.println("Maska siete " + MaskValidation.maskID + " podľa 2. postupu NIE JE validná.");
		}
	}
}
