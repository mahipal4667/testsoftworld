
public class Circle {
	int radius;
	double area;
	double circumference;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public void getDetails() {
		System.out.println("Area : "+area+"Circumference : "+circumference);
	}

	public void areas() {
		
		area = 2*Math.PI*radius;
			
		
	}
	
	public void circumferences() {
			circumference = Math.PI*radius*radius;
		
			

		}
	

}


