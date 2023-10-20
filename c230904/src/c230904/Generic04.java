package c230904;

//class parents<T>{
//	T t;
//	public T getT() {
//		return t;
//	}
//	public void setT(T t) {
//		this.t=t;
//	}
//	
//}
//class Child01<T> extends parents<T>{
//	
//}
//class Child02<T1, T2> extends parents<T1>{
//	
//}

class Shape<T> {
	public T name;
	public Shape(T name) {
		this.name=name;
	}
	public double getArea() {
		return 0.0;
	}
	public void PrintInfo() {
		System.out.println("도형 : " +name);
		System.out.println("Area : " +getArea());
	}
}
class Circle<T> extends Shape<T>{
	private double radius;
	public Circle(T name, double radius) {
		super(name);
		this.radius = radius;
	}
	public double getArea() {
		return radius*3.14/2;
	}
}
class Rectangle<T> extends Shape<T>{
	private double width;
	private double height;
	
	public Rectangle(T name, double width, double height) {
		super(name);
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		return width*height;
		}	
	}

public class Generic04 {
	public static void main(String[] args) {
		Circle<String>circle=new Circle<>("원", 5.0);
		Rectangle<String>rec=new Rectangle<>("사각형",5.5,4.5);
		circle.PrintInfo();
		rec.PrintInfo();
		System.out.println(rec.name);
		System.out.println(rec.getArea());
		
		
	}


}


