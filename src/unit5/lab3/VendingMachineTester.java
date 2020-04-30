package unit5.lab3;

public class VendingMachineTester {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		machine.fillUp(10);
		machine.insertToken();
		machine.insertToken();
		System.out.print("Token count: ");
		System.out.println(machine.getTokenCount());
		System.out.println("Expected: 2");
		System.out.print("Can count: ");
		System.out.println(machine.getCanCount());
		System.out.println("Expected: 18");
		VendingMachine machine2 = new VendingMachine(8);
		machine2.fillUp(2);
		System.out.println("Can count: " + machine.getCanCount());
	}

	// Strings methods for the textbook pages
	public static String removeDashes(String str) {
		return str.replaceAll("-", "");
	}

	public static String dateStr(String str) {
		return str.replaceAll("/", "-");
	}

	public static String scroll(String str) {
		String temp = str.substring(1);
		temp += str.charAt(0);
		return temp;
	}

	public static String convertName(String str) {
		String firstName = str.substring(str.indexOf(',')).replaceAll("\\{Punct}|\\s+|,", "");
		String lastName = str.substring(0, str.indexOf(','));
		return firstName + " " + lastName;
	}

	public static String negativeString(String str) {
		str = str.replaceAll("0", "a");
		str = str.replaceAll("1", "0");
		str = str.replaceAll("a", "1");
		return str;
	}

	public static boolean digitsOnly(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}
		catch (IllegalArgumentException e) {
			return false;
		}
	}
}