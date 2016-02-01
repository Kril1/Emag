package emag;

public class Customer extends User {

	private ShopingCart cart;
	private String address;
	private boolean hasCreditCard;
	private String creditCardNumber;

	Customer(String name, String password, String eMail) {
		super(name, password, eMail);
	}

	boolean paymantMethod(String willYouPayWithCreditCard) {

		if (willYouPayWithCreditCard.equals("yes")) {
			hasCreditCard = true;
			return true;
		} else {
			hasCreditCard = false;
			return false;
		}
	}

	boolean checkCreditCardNumber(String creditCardNumber) {

		boolean checksOut = false;
		if (this.hasCreditCard == true && creditCardNumber.length() == 15) {

			for (int index = 0; index < creditCardNumber.length(); index++) {

				char everyPartOfTheNumber = creditCardNumber.charAt(index);
				int everyNumberOfTheNumber = Character.getNumericValue(everyPartOfTheNumber);

				if (everyNumberOfTheNumber < 0 || everyNumberOfTheNumber > 9) {
					System.out.println("Invalid Number!");
					checksOut = false;
					break;
				} else {
					checksOut = true;
				}
			}
		}
		if (checksOut == true) {
			return true;
		} else {
			return false;
		}
	}

	void payForStuff(String willYouPayWithCreditCard, String creditCardNumber) {

		boolean willBePayingWithCredit = paymantMethod(willYouPayWithCreditCard);

		if (willBePayingWithCredit == true) {
			boolean checkCreditCard = checkCreditCardNumber(creditCardNumber);

			if (checkCreditCard == true) {
				System.out.println("Paymant accepted");
			} else {
				System.out.println("Enter a valid number");
			}

		} else {
			System.out.println("Pay at delivery at your address.");
		}
	}
}
