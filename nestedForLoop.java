package mainPackage;

public class nestedForLoop {
	
	public static void main(String[] args) {
		
		int speed = 75;
		int maxSpeed = 60;
		int speedForFine = 70;
		
		if (speed >= maxSpeed){
			System.out.println("You're over the speed limit!");
			if (speed >= speedForFine){
				System.out.println("You are eligible for a fine!");
			}
		}
	}
}
