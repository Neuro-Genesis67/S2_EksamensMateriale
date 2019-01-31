package eksempel;

public class HandicappedPersonAdapter implements Activities {

	PersonInWheelchair piw;

	public HandicappedPersonAdapter(String name) {
		piw = new PersonInWheelchair(name);
	}

	@Override
	public String walk() {
		return piw.rollWheelchair();
	}

	@Override
	public String playFootball() {
		return piw.watchOthersPlayFootball();
	}

	@Override
	public String dance() {
		return piw.danceInWheelchair();
	}

}
