class Figure {
    String name;

    Figure(String name) {
        this.name = name;
    }

    double area() {
        return 0.0;
    }
}

class Rectangle extends Figure {
    double length, breadth;

    Rectangle(String name, double length, double breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

class Pentagon extends Figure {
    double side, apothem;

    Pentagon(String name, double side, double apothem) {
        super(name);
        this.side = side;
        this.apothem = apothem;
    }

    @Override
    double area() {
        return (5 * side * apothem) / 2;
    }
}

class practical3 {
    public static void main(String[] args) {
        Figure r = new Rectangle("Rectangle", 5, 4);
        Figure p = new Pentagon("Pentagon", 6, 4);

        System.out.println(r.name + " Area: " + r.area());
        System.out.println(p.name + " Area: " + p.area());
    }
}
