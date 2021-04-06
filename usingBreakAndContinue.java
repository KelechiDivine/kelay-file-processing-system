package mainPackage;

public class usingBreakAndContinue {
	
	
	public static void main(String[] args) {
		
		String[] letters = {"A", "B", "C", "D"};
		
		for(String letter : letters){
			if (letter.equals("A")){
				continue;
			}
			System.out.println(letter);
			
			if (letter.equals("C")){
				break;
			}
			
		}

	}
	
}
