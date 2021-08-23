package section7_DesignPatterns.section67_bridge;

public class BridgeDesignPatternApplication {

	public static void main(String[] args) {
		Template art1 = new ButterflyWallArt();
		Template art2 = new TreeWallArt();
		
		Color blue = new Blue();
		Color red = new Red();
		
		art1.setColor(blue);
		art1.designWall();
		
		art1.setColor(red);
		art1.designWall();
		
		art2.setColor(red);
		art2.designWall();
	}

}
