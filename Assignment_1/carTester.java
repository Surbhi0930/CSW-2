public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car("Audi","#6f");
Car c2=new Car("null","null");
 c2.setmake("benz");
 c2.setmodel("q7");
System.out.println(c1.getMake()+" " +c1.getModel());
System.out.println(c2.getMake()+" " +c2.getModel());


	}

}
class Car{
	private String make;
	private String model;
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
		public String getMake() {
			return this.make;
		}
		public void setmake(String make) {
			this.make=make;
		
	}
		public String getModel() {
			return this.model;
		}
		public void setmodel(String model) {
			this.model=model;	
	}

}
