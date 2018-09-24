package fr.ubordeaux.ao;

public class Circle extends Ellipse{
	
	@Override
	public String toSvg()
	{
		return "<circle cx='"+this.points[0].x+"' cy='"+this.points[0].y+"' r='"+this.radius_x+"'"
				+ " style=\"fill:rgb("+this.color.red+','+this.color.green+','+this.color.blue+")\" />";
	}
	
	public Circle(double cx, double cy, double rad) {
		this(cx, cy, rad, 0,0,0);
	}

	public Circle(double cx, double cy, double rad, int r, int g, int b) {
		super(cx,cy, rad,rad ,r,g,b);
	}
    
}