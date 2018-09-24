package fr.ubordeaux.ao;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String [] args) throws IOException
	{
		SVG s = new SVG(1000,1000);
		s.addChild(new Ellipse(250, 250,30,80,128,128,0));
		s.addChild(new Circle(550,300, 10));
		s.addChild(new Line(250,250,550,300,255,0,0));
		s.addChild(new Line(250,450,150,300,128,255,0));
		s.addChild(new Rectangle(100,750,200,850,0,255,128));
		s.addChild(new Rectangle(750,300,600,350,255,0,128));
		FileWriter out = new FileWriter("test.svg");
		out.write(s.toSvg());
		out.close();
	}
}
