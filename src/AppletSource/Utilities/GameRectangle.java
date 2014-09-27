package AppletSource.Utilities;

public class GameRectangle {
	Vector2 position;
	Vector2 dimensions;
	
	public GameRectangle(double x, double y, double width, double height)
	{
		position = new Vector2(x, y);
		dimensions = new Vector2(width, height);
	}
	
	public GameRectangle()
	{
		position = new Vector2();
		dimensions = new Vector2();
	}
	
	public void setX(double x) { position.x = x; }
	public void setY(double y) { position.y = y; }
	public void setWidth(double width) { dimensions.x = width; }
	public void setHeight(double height) { dimensions.y = height; }
	
	public double getX() { return position.x; }
	public double getY() { return position.y; }
	public double getWidth() { return dimensions.x; }
	public double getHeight() { return dimensions.y; }
	
	public boolean contains(Vector2 v) { 
		return v.x >= position.x && v.x <= position.x + dimensions.x &&
				v.y >= position.y && v.y <= position.y + dimensions.y; 
	}
	
	public boolean intersects(GameRectangle r) {
		boolean horizontalInside = position.x + dimensions.x > r.position.x && position.x < r.position.x + r.dimensions.x;
		boolean verticalInside = position.y + dimensions.y > r.position.y && position.y < r.position.y + r.dimensions.y;

		return horizontalInside && verticalInside;
	}
}
