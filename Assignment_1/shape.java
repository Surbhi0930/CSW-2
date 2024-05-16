
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle rectangle=new Rectangle(2,6);
System.out.println(rectangle.displayArea());
System.out.println(rectangle.displayPerimeter());
rectangle.setlength(5);
rectangle.setwidth(10);
System.out.println(rectangle.displayArea());
System.out.println(rectangle.displayPerimeter());

	}

}
class Rectangle{
	int length;
	int width;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public int getlength() {
		return this.length;
	}
	public void setlength(int length) {
		this.length=length;
	}
	public int getwidth() {
		return this.width;
	}
	public void setwidth(int width) {
		this.width=width;
	}
	public double displayArea() {
		return length*width;
	}
	public double displayPerimeter() {
		return 2*(length+width);
	}

}
