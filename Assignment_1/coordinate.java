public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Point p=new Point(2,4);
System.out.println("original value");
System.out.println(p.x);
System.out.println(p.y);
Point p1=new Point(6,7);
System.out.println("updated value");
System.out.println(p1.x);
System.out.println(p1.y);

	}

}
class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	Point(Point p1){
         this.x=p1.x;	
         this.y=p1.y;		
	}
}
