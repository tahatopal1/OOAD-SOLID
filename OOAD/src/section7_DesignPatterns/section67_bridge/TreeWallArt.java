package section7_DesignPatterns.section67_bridge;

public class TreeWallArt extends Template {

	@Override
	public void designWall() {
		System.out.println("Designing the wall with Tree wall art");
		if (color != null) {
			color.pickColor();
		}
	}

}
