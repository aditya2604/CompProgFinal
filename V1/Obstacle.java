import java.awt.*;

public class Obstacle {

	// READ THIS BEFORE CHANGES ARE MADE: THIS IS A STARTER FILE. IT WILL EVENTUALLY BECOME AN ABSTRACT CLASS WITH AN IMAGE.
	
	private int x, y, x1;
	private static int width, height;
	public static double vX;
	//private Color color;
	//private static Image image;

	public static final Color BROWN = new Color(102, 51, 0);
	
	static {
		vX = 10;
	}
	
	public Obstacle(int x1, int y1, int w, int h) {
		x = x1;
		this.x1 = x1;
		y = y1;
		width = w;
		height = h;
	}
	
	public void drawOb() {
		DrawingBoard.getCanvas().setColor(BROWN);
		DrawingBoard.getCanvas().fillRect(x, y, width, height);
		Main.ball.isHit();
	}

	public void move() {
		x -= vX;
		Main.ball.isHit();
	}

	public int getX() { return x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public void reset() {x = x1;}

}