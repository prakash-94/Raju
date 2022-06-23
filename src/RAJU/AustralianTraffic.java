package RAJU;

public class AustralianTraffic implements CentralTraffic, ContentialTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
		ContentialTraffic ct = new AustralianTraffic();
		ct.Trainsymbol();
		AustralianTraffic at = new AustralianTraffic();
		at.Walking();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop Implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow Implementation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("rainsymbol Implementation");
	}

	public void Walking() {

		System.out.println("walking Implementation");
	}
}
