package javaAssignment6;

abstract class GeometricShape{
	final static double PI=3.14;
	
	abstract public void area();
	abstract public void permeter();
}
 class Circle extends GeometricShape{
	private int radius;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	 public void area() {
		 System.out.println("Area of circle is: "+ PI*radius*radius);
	 }
	 public void permeter() {
		 System.out.println("Perimeter of circle is: "+ 2*PI*radius);
	 }
 }
 class Rectangle extends GeometricShape{
	 private int length;
	 private int breadth;
	 
	 public void setValue(int length, int breadth) {
		 this.length=length;
		 this.breadth=breadth;
	 }
	 public void area() {
		 System.out.println("Area of Rectangle is: "+ length*breadth);
	 }
	 public void permeter() {
		 System.out.println("Perimeter of Rectangle is: "+ 2*(length+breadth));
	 }
 }
 class Triangle extends GeometricShape{
	 private int base;
	 private int rside;
	 private int lside;
	 private int height;
	 
	 public void setValue(int base, int height) {
		 this.base=base;
		 this.height=height;
	 }
	 public void setValueperi(int base, int rside, int lside) {
		 this.base=base;
		 this.lside=lside;
		 this.rside=rside;
	 }
	 public void area() {
		 System.out.println("Area of Triangle is: "+ (base*height)/2);
	 }
	 public void permeter() {
		 System.out.println("Perimeter of Triangle is: "+ (base+rside+lside));
	 }
 }


public class TestGeometricShape {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(4);
		c.area();
		c.permeter();
		System.out.println("-------------------------------");
		Rectangle r=new Rectangle();
		r.setValue(4, 5);
		r.area();
		r.permeter();
		System.out.println("-------------------------------");
		Triangle t=new Triangle();
		t.setValue(4, 5);
		t.area();
		t.setValueperi(4, 5, 9);
		t.permeter();

	}

}
