package Simpleinterface;

public class Tyre implements Oveable, Rollable {
	int width;
	public boolean isMoveable() {
		return true;
	}
	public boolean isRollable() {
		return true;
	}
	public static void main(String[] args) {
		Tyre tr = new Tyre();
		System.out.println(tr.isMoveable());
		System.out.println(tr.isRollable());
	}
}


