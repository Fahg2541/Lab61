public class Line {
	private int xStart;
	private int yStart;
	private int xEnd;
	private int yEnd;
	private String color;
	private double weight;
	
	public Line() {
		
	}
	
	public Line(int xS, int yS, int xE, int yE) {
		this.xStart = xS;
		this.yStart = yS;
		this.xEnd = xE;
		this.yEnd = yE;
	}
	
	public double getLength() {
		double d;
		return d = Math.sqrt(Math.pow(Math.abs(this.yEnd - this.yStart),2) + Math.pow(Math.abs(this.xEnd - this.xStart), 2));
	}
	
	public double getSlope() {
		double m;
		return m = (this.yEnd - this.yStart) + (this.xEnd - this.xStart);	
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void translate(int tx, int ty) {
		int xnew;
		int xold = 0;
		xnew = xold + tx;
		
		int ynew;
		int yold = 0;
		ynew = yold + ty;
	}
	
	public String toString() {
		String s;
		s = "";
		return s;
	}
	
	

}
