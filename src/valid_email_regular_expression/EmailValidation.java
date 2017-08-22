package valid_email_regular_expression;

public class EmailValidation {
	public static void main(String[] args) {
		String[] adresy = { "josef.mladek65@mail.cz", "meno.priezvisko@gmail.com", "Ja.On.Ona@gmail.com", "a@aol.com",
				"me@o5n.sk", "Peter87@zoznam.sk", "robert@vlada76.info", "jonaThan@disc0very.co.uk",
				"peto_lenard@post.sk", "meno@priezvisko", "meno&domena.sk", "8statocnych@schranka.sk",
				"puk@adress..com", "sun@.solar.it", "janko@4oci.sk", "you&me@posta.sk", "prezyvka@yahoo.",
				"ja@posta.com.", "som.@gmail.com" };
		for (String email : adresy) {
			EmailValidator.validator(email);
		}
	}
}
