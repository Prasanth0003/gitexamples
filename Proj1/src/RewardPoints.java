public class RewardPoints {
	private int points;

	public RewardPoints() {
		this.points = 0;
	}

	public void addPoints(int points) {
		if (points > 0) {
			this.points += points;
			System.out.println("Added " + points + " points. Total points: " + this.points);
		} else {
			System.out.println("Invalid points to add.");
		}
	}

	public void redeemPoints(int points) {
		if (points > 0 && this.points >= points) {
			this.points -= points;
			System.out.println("Redeemed " + points + " points. Remaining points: " + this.points);
		} else {
			System.out.println("Insufficient points to redeem.");
		}
	}

	public int getPoints() {
		return this.points;
	}
}
