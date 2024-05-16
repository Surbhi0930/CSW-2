public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Laptop L=new Laptop(null,0);
L.setmodel("ASUS");
L.setprice(100000);
System.out.println(L.getmodel()+ " "+ L.getprice());
System.out.println(L);
	}

}
class Laptop{
	private String model;
	private double price;
	Laptop(String model,double price){
		this.price=price;
		this.model=model;
	}
	public String getmodel() {
		return this.model;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public double getprice() {
		return this.price;
	}
	public void setprice(double price) {
		this.price=price;
	}
	@Override
	public String toString() {
		return price + " "+ model;
	}

}
