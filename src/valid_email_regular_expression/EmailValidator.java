package valid_email_regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static void validator(String email) {
		Pattern pattern = Pattern.compile(
				"[a-z]+[a-z0-9]*((\\.)*(_)*([a-z0-9]+))*@[a-z]+[0-9a-z]*\\.[a-z]+((\\.)+([a-z]+))*",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("Emailová adresa v tvare " + email + " JE validná.");
		} else {
			System.out.println("Emailová adresa v tvare " + email + " NIE JE validná.");
		}
	}
}
