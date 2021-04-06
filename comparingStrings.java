package mainPackage;

public class comparingStrings {
	
	public static void main(String[] args) {
		String cat = new String("cat");
		String dog = new String("dog");
		if (cat.equals(dog)){
			System.out.println("Cats and dogs are the same.");
		}
		
		if (!cat.equals(dog)){
			System.out.println("Dogs are dogs.");
		}
		
		if (dog.equals("dog")){
			System.out.println("Dogs are dogs.");
		}
	}
}
