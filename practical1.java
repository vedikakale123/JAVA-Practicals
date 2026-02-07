class Circle{
	double radius = 1.0;
	// Default Constructor
	Circle(){
		System.out.println("This is Default constructor. Radius = "+radius);
	}

	// Parameterized Constructor
	Circle(int r){
		radius = r;
		System.out.println("This is Parameterized constructor. Radius = "+radius);
	}

	// Copy constructor
	Circle(Circle c){
		radius = c.radius;
		System.out.println("This is Copy constructor. Radius = "+radius);
	
	}

	// Methods
	double Cal_Circumference(){
		return 2*3.14*radius;
	}
	double Cal_Area(){
		return 3.14*radius*radius;
	}
	double Cal_Diameter(){
		return 2*radius;
	}
}

public class practical1{
	public static void main(String[] args){
		// Using default constructor
        Circle c1 = new Circle();
        System.out.println("Area: " + c1.Cal_Area());
        System.out.println("Circumference: " + c1.Cal_Circumference());
        System.out.println("Diameter: " + c1.Cal_Diameter());

        System.out.println();
		
		// using parameterized constructor
		Circle c2 = new Circle(5);
        System.out.println("Area: " + c2.Cal_Area());
        System.out.println("Circumference: " + c2.Cal_Circumference());
        System.out.println("Diameter: " + c2.Cal_Diameter());

        System.out.println();

		// Using copy constructor
        Circle c3 = new Circle(c2);
        System.out.println("Area: " + c3.Cal_Area());
        System.out.println("Circumference: " + c3.Cal_Circumference());
        System.out.println("Diameter: " + c3.Cal_Diameter());
	}
}