package assignment_30Jun;

public class FlyableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};
        for (Flyable obj : flyingObjects) {
            obj. fly_obj();
        }
	}

}
