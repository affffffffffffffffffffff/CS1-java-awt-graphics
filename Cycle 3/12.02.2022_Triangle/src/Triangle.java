
public class Triangle {
	// 1 Instance Variables
	private double height, base;
	Triangle tri;
	
	//2. Methods
	// 2.1 Constructor
	public Triangle() {
	}
	public Triangle(double h, double b) {
		height = h;
		base = b;
	}
	public Triangle(Triangle t) {
		tri = t;
	}
	public Triangle(double h, double b, Triangle t) {
		height = h;
		base = b;
		tri = t;
		
	}
	public Triangle(Triangle t, double h, double b) {
		tri = t;
		height = h;
		base = b;
	}
	
	// 2.2 Getter
	public double getHeight() {
		return height;
	}
	public double getBase() {
		return base;
	}
	public Triangle getTri() {
		return tri;
	}
	
	// 2.3 Mutator
	public void setHeight(double h) {
		height = h;
	}
	public void setBase(double b) {
		base = b;
	}
	public void setTri(Triangle t) {
		tri = t;
	}
	
	// 2.4 Auxiliary
	public String toString() {
		String str = "height :: " + getHeight() + "\n" +
				     "base :: " + getBase() + "\n" +
					 "t :: " + getTri();
		return str;
	}
	
}
