package fr.ubordeaux.ao;

import java.util.ArrayList;

public class SVG {
    private int width;
    private int heigth;
    
    private ArrayList<Shape> children;

    public SVG(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
        children = new ArrayList<>();
    }
    
    public void addChild(Shape s)
    {
    	children.add(s);
    }
    
    public String toSvg()
    {
    	StringBuilder stb = new StringBuilder();
    	
    	stb.append("<?xml version='1.0' encoding='utf-8'?>\n<svg xmlns='http://www.w3.org/2000/svg' version='1.1' width='")
    	.append(width).append("' height='").append(heigth).append("'>\n");
    	
    	for(Shape s : children)
    		stb.append(s.toSvg()).append("\n");
    	
    	stb.append("</svg>");
    	return stb.toString();
    }
}