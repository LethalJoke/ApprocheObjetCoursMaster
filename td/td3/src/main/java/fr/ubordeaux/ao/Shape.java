package fr.ubordeaux.ao;

public abstract class  Shape {
	
	protected Point2D points[];
	protected Color color;
	
	public abstract String toSvg();
	public Shape(int nbPoints)
	{
		this(nbPoints, 0,0,0);
	}
	
	public Shape(int nbPoints, int r, int g, int b)
	{
		points = new Point2D[nbPoints];
		color = new Color(r,g,b);
	}
	
}
