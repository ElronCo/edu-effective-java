public enum MenuOptions {

	BALANCE_INQUIRY(1), //
	WITHDRAWAL(2), //
	DEPOSIT(3), //
	EXIT(4);

	private int index;

	private MenuOptions(int index) {
		this.index = index;
	}

	public int index() {
		return index;
	}

	public static MenuOptions findOption(int index) {
		for (MenuOptions opt : MenuOptions.values()) {
			if (opt.index() == index) {
				return opt;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(MenuOptions.valueOf("EXIT").name());
	}

}