package example2;

public interface WillSheCum {

	String tryToCum();

}

class ItCums implements WillSheCum {

	@Override
	public String tryToCum() {

		return "I just came :D";
	}

}

class ItWontCum implements WillSheCum {

	@Override
	public String tryToCum() {

		return "Didn't cum at all :(";
	}

}