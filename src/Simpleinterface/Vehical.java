package Simpleinterface;

public class Vehical implements Moveable {
	public void move() {
		System.out.println("Average speed is"+ Avgspeed);
	}

	public static void main(String[] args) {
		Vehical vc = new Vehical();
		vc.move();
	}

}
