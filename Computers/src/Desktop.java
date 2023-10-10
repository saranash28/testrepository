
public class Desktop implements Hardware,Software {
	public void desktopModel() {
		System.out.println("Samsung");
	}
	public void hardwareResources() {
		System.out.println("Motherboard");
	}
	public void softwareResources() {
		System.out.println("windows 11");
	}

	public static void main(String[] args) {
		Desktop m = new Desktop();
		m.desktopModel();
		m.hardwareResources();
		m.softwareResources();

	}

}
