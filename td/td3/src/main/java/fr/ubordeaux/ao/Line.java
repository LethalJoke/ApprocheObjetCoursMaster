package fr.ubordeaux.ao;

public class Line extends Rectangle{
   
	@Override
	public String toSvg()
	{
		return "<line x1='"+this.points[0].x+"' y1='"+this.points[0].y+"' x2='"+this.points[1].x+"' y2='"+this.points[1].y+"' style=\"stroke:rgb("+this.color.red+','+this.color.green+','+this.color.blue+");stroke-width:2\" />";
	}
	
	public Line(double xone, double yone, double xtwo, double ytwo) {
		super( xone,  yone,  xtwo,  ytwo);
	}
	

	public Line(double xone, double yone, double xtwo, double ytwo, int r, int g, int b) {
		super( xone,  yone,  xtwo,  ytwo,  r,  g,  b); 
	}
	
	
}