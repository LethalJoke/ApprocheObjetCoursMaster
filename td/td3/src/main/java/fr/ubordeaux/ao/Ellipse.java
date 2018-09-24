package fr.ubordeaux.ao;

public class Ellipse extends Shape{
	protected double radius_x, radius_y;
	
	@Override
	public String toSvg()
	{
		return "<ellipse cx='"+this.points[0].x+"' cy='"+this.points[0].y+"' rx='"+this.radius_x+"' ry='"+this.radius_y+"'"
				+ " style=\"fill:rgb("+this.color.red+','+this.color.green+','+this.color.blue+")\" />";
	}
	
	public Ellipse(double cx, double cy, double radx, double rady) {
		this(cx,cy,radx,rady,0,0,0);
	}
	

	public Ellipse(double cx, double cy, double radx, double rady, int r, int g, int b) {
		super(1,r,g,b);
		points[0] = new Point2D(cx,cy);
		radius_y = rady;
		radius_x = radx;
	}
	
}