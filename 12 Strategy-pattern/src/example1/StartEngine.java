package example1;

public interface StartEngine {

	String startEngine();

}

class EngineStarts implements StartEngine {

	@Override
	public String startEngine() {
		
		return "Engine starts";
	}

}

class EngineWontStart implements StartEngine {

	@Override
	public String startEngine() {
		
		return "Engine doesn't start";
	}

}
