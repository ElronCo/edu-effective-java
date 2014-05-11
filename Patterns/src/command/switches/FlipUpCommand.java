package command.switches;

public class FlipUpCommand implements Command {
	private Light theLight;

	public FlipUpCommand(Light light) {
		this.theLight = light;
	}

	public void execute() {
		theLight.turnOn();
	}
}

/* The Command for turning off the light - ConcreteCommand #2 */
