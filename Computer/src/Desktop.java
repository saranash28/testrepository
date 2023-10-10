
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size is about "
				+ "19 to 34 inches");
	}
	public static void main(String[] args) {
		Desktop n=new Desktop();
		n.computerModel();
		n.desktopSize();
	}
}
