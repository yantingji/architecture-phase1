package Prectice04;

public class Number {
	private int n1;
	private int n2;

	public Number(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int addition() {
		return n1 + n2;
	}

	public int subtration() {
		return n1 - n2;
	}

	public int multiplication() {
		return n1 * n2;
	}

	public int division() {
		if (n2 == 0) {
			System.out.println("除数不能为0！");
			return -0xfffffff;
		}
		return n1 / n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
}
