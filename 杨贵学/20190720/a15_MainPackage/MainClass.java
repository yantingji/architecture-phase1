package a15_MainPackage;

public abstract class MainClass {
	private String name;
	public abstract String food() ;
		
	public String play() {
		return "ÕıÔÚÔÚÍæË£";
		
	}
	public MainClass() {}
	public MainClass(String name) {
		this.setName(name);
		System.out.println(this.getName()+play()+food());
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
