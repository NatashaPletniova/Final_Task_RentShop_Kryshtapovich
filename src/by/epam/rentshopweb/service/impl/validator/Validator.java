package by.epam.rentshopweb.service.impl.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private final static String IS_DIGITS = "\\d+";

	private Validator() {

	}

	public static boolean validatehowParticularProductItem(String productItemID) {
		if(!validateStringForNullOrEmpry(productItemID)){
			return false;
		}

		if (!validateWithRegExp(IS_DIGITS, productItemID)) {
			return false;
		}

		return true;
	}
	
	public static boolean validateStringForNullOrEmpry(String string){
		if (string == null) {
			return false;
		}
		if (string.isEmpty()) {
			return false;
		}
		return true;
	}

	public static boolean validateWithRegExp(String regExp, String toValidate) {
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(toValidate);
		if (!m.matches()) {
			return false;
		}

		return true;
	}
}
