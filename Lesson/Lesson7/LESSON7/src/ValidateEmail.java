import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateEmail {
	public static void isValidate() {
		String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập email: ");
		String email = sc.nextLine();
		if (email.matches(EMAIL_REGEX)) {
			System.out.println("Email hợp lệ");
		} else {
			System.out.println("Email không hợp lệ");
		}
	}
 
}


