
public class TriangleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.1
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(1.0, 2.0);
		Triangle t3 = new Triangle(t1);
		Triangle t4 = new Triangle(1.0, 2.0, t1);
		Triangle t5 = new Triangle(t1, 1.0, 2.0);
		
		// 2.2
		System.out.println(t5.getBase());
		System.out.println(t5.getHeight());
		System.out.println(t5.getTri());
		
		// 2.3
		t1.setBase(3.0);
		t1.setHeight(4.0);
		t1.setTri(t2);
		
		// 2.4
		System.out.println(t1.toString());
	}

}
