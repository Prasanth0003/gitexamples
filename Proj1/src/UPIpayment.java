public class UPIpayment {
	public String pay(String upiId, double amount) {
		if (upiId == null || upiId.isEmpty()) {
			return "Invalid UPI ID";
		}
		if (amount <= 0) {
			return "Invalid amount";
		}
		return "Payment of " + amount + " made to " + upiId;
	}

	public String refund(String upiId, double amount) {
		if (upiId == null || upiId.isEmpty()) {
			return "Invalid UPI ID";
		}
		if (amount <= 0) {
			return "Invalid amount";
		}
		return "Refund of " + amount + " initiated to " + upiId;
	}
}
//helo