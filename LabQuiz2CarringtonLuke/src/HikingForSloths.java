
public class HikingForSloths {
	public static boolean isLevel(double[] trail) {
		double highest = trail[0], lowest = trail[0];
		for(int i = 1; i < trail.length; i++) {
			if(trail[i] > highest)
				highest = trail[i];
			if(trail[i] < lowest)
				lowest = trail[i];
		}
		
		if(highest - lowest <= 50)
			return true;
		else
			return false;
	}
	public static boolean isChallenging(double[] trail) {
		
		for(int i = 0; i < trail.length; i++) {
			if (trail[i+1] - trail[i] >= 100 || trail[i] - trail[i+1] >= 100)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		double[] x = {57.3, 270.0, -4.1, 528.3, 143.8};
		System.out.println("It is " + isLevel(x) + " that the provided trail is level.");
		System.out.println("It is " + isChallenging(x) + " that the provided trail is challenging.");

	}

}
