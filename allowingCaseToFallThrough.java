package mainPackage;

public class allowingCaseToFallThrough {
	
	public static void main(String[] args) {
		int tempAdjustment = 0;
		String taste = "way too hot";
	
		switch (taste){
			case "too cold":	tempAdjustment += 1 ;
				break;
			case "way too hot":	tempAdjustment -= 1;
				break;
			case "too hot":		tempAdjustment -= 1;
				break;
			case "just right":
			default:
				break;
				
		}
		System.out.println("Adjust temperature: " + tempAdjustment);
	}
}
