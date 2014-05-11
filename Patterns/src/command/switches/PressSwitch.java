package command.switches;

public class PressSwitch {
	public static void main(String[] args) {
		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);

		Switch mySwitch = new Switch();

		switch (args[0]) {
		case "ON":
			mySwitch.storeAndExecute(switchUp);
			break;
		case "OFF":
			mySwitch.storeAndExecute(switchDown);
			break;
		default:
			System.out.println("Argument \"ON\" or \"OFF\" is required.");
		}
	}
}