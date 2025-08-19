
public class CardPayment {
	
	private String cardNumber;
	private String cardHolderName;
	private String expiryDate;
	private String cvv;

	public CardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}

	public boolean validateCard() {
		// Simple validation logic (for demonstration purposes)
		return cardNumber.length() == 16 && cvv.length() == 3 && !cardHolderName.isEmpty();
	}

	public void processPayment(double amount) {
		if (validateCard()) {
			System.out.println("Processing payment of $" + amount + " using card: " + cardNumber);
		} else {
			System.out.println("Invalid card details.");
		}
	}
	public String getCardNumber() {
		return cardNumber;
		//hello
	}
}
