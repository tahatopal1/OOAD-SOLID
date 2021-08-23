package section7_DesignPatterns.section67_bridge;

public class ButterflyWallArt extends Template {

	@Override
	public void designWall() {
		System.out.println("Designing the wall with Butterfly wall art");
		if (color != null) {
			color.pickColor();
		}
	}

}
