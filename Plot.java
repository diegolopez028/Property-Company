

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Plots
 * Due: 11/08/22
 *  * Platform/compiler: EC
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Diego Lopez________
*/

public class Plot {
	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	
	
	public Plot()
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;

	}
	

	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
		
		
	}
	
	public Plot(Plot newPlot)
	{
		this.x = newPlot.x;
		this.y = newPlot.y;
		this.width = newPlot.width;
		this.depth = newPlot.depth;
		
	}

	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	
	
	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getDepth() {
		return depth;
	}
	
	public boolean overlaps(Plot p) {

		    boolean aOverlapsXY1 = (p.x >= getX() && p.x < (getX() + getWidth())) &&  (p.y >= getY() && p.y < (getY() + getDepth()));
		    boolean aOverlapsXY2 = (getX() >= p.x && getX() < (p.x + width)) &&  (getY() >= p.y && y < (p.y + p.depth));
		    boolean bOverlapsXY1 = (p.x + p.width) > getX() && (p.x + p.width) < (getX() + getWidth()) && p.y >= getY() && p.y <= (getY() + getDepth()); 
		    boolean bOverlapsXY2 = (getX() + getWidth()) > p.x && (getX() + getWidth()) < (p.x + p.width) && getY() >= p.y && getY() <= (p.y + p.depth); 
		    boolean cOverlapsXY1 = p.x >= getX() && p.x < (getX() + getWidth()) && (p.y + p.depth) > getY() && (p.y + p.depth) <= (getY() + getDepth());
		    boolean cOverlapsXY2 = x >= p.x && getX() < (p.x +  p.width) && (getY() + getDepth()) > p.y && (getY() + getDepth()) <= (p.y + p.depth);
		    boolean dOverlapsXY1 = (p.x + p.width) > getX() && (p.x +  p.width) <= (getX() + getWidth()) && (p.y + p.depth) > getY() && (p.y + p.depth) <= (getY() + getDepth());
		    boolean dOverlapsXY2 = (getX() + getWidth()) > p.x && (getX() + getWidth()) <= (p.x + p.width) && (getY() + getDepth()) > p.y && (getY() + getDepth()) <= (p.y + p.depth);
		    
		    return aOverlapsXY1 || aOverlapsXY2 || bOverlapsXY1 || bOverlapsXY2 || cOverlapsXY1 || cOverlapsXY2 || dOverlapsXY1 || dOverlapsXY2;
	}

	
	public boolean encompasses(Plot p) {
		boolean x = false;
		if((p.x >= getX()) == true)
		{
			x = true;
		}
		if((p.y >= getY()) == true)
		{
			x = true;
		}
		if((p.x + p.width <= getX() + getWidth()) == true)
		{
			x = true;
			
		}
		if((p.y + p.depth <= getY() + getDepth()) == true)
		{
			x = true;
		}
	    
	    return x;
	}
	
	public String toString()
	{
		return x+","+y+","+width+","+ depth;
	}

}
