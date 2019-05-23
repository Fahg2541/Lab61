public class Cube extends Square{
	
	public Cube(double width) {
		super(width);
	}
	
	public double getArea() {
		return Math.pow(width, 3);
	}

}
