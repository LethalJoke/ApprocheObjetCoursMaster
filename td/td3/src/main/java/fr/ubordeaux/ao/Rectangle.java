package fr.ubordeaux.ao;

public class Rectangle extends Shape{
	@Override
	public String toSvg()
	{
		double x = this.points[0].x;
		double y = this.points[0].y;
;		double length = this.points[1].x - this.points[0].x;
		double height = this.points[1].y - this.points[0].y;
		
		if(length < 0)
		{
			length *= -1;
			x -= length;
		}
		
		if(height < 0)
		{
			height *= -1;
			y -= height;
		}
			
		
		return "<rect x='"+x+"' y='"+y+"' width='"+length+"' height='"+height
				+ "' style=\"fill:rgb("+this.color.red+','+this.color.green+','+this.color.blue+")\" />";
	}
	
	public Rectangle(double xone, double yone, double xtwo, double ytwo) {
		this(xone,yone,xtwo,ytwo,0,0,0);
	}
	

	public Rectangle(double xone, double yone, double xtwo, double ytwo, int r, int g, int b) {
		super(2,r,g,b);
		points[0] = new Point2D(xone,yone);
		points[1] = new Point2D(xtwo, ytwo);
	}
}