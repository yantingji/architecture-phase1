
public class ShowTruck extends Vehicle {
	public float load;
	public ShowTruck() {}
	public ShowTruck(float load) {
		this.load=load;
	}
	public void showTruck() {
		System.out.println("дижи"+load+"Жж");
	}
	
}
