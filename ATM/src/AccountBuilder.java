public class AccountBuilder {

	int accountNumber; // account number
	int pin; // PIN for authentication
	double availableBalance; // funds available for withdrawal
	double totalBalance; // funds available + pending deposits

	public AccountBuilder(int accountNumber, int pin) {
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public AccountBuilder availableBalance(double balance) {
		this.availableBalance = balance;
		return this;
	}

	public AccountBuilder totalBalance(double balance) {
		this.totalBalance = balance;
		return this;
	}

	public Account build() {
		return new Account(this);
	}

}
