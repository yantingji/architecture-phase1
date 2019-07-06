package junior.season4.prectice08;

public class ShowTruck extends Vehicles {
	public float load;
	public ShowTruck() {}
	public ShowTruck(float load) {
		this.load=load;
	}
	public void showTruck() {
		System.out.println("����"+load+"��");
	}

}
