import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Step 1, read in first 2 depth
		 * Step 2, determine the original direction.
		 * Step 3, Repeat following:
		 * 	Step 3.1: read in depth.
		 * 	Step 3.2: compare with previous depth and determine diretion.
		 * 	Step 3.3: If direction changed, return "No Fish"
		 * Step 4: return the direction.
		 */
		Scanner sc = new Scanner(System.in);
		int depth1 = sc.nextInt();
		int depth2 = sc.nextInt();
		int direction = getDirection(depth1, depth2);
		for (int i=0;i<2;i++) {
			int depth = sc.nextInt();
			int curdir = getDirection(depth2, depth);
			if (curdir != direction) {
				System.out.println("No Fish");
				return;
			}
		}
		String directionMessage=getDirMsg(direction);
		System.out.println(directionMessage);
	}

	private static String getDirMsg(int direction) {
		// TODO Auto-generated method stub
		if (direction>0) return "Fish Rising";
		else if (direction<0) return "Fish Diving";
		else return "Fish at constant depth";
	}

	private static int getDirection(int depth1, int depth2) {
		// TODO Auto-generated method stub
		return depth2-depth1;
	}
	
	

}
