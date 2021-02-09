import java.util.ArrayList;

public class Database {
	
	private ArrayList<Member> goldMembers;
	private ArrayList<Member> platinumMembers;
	private ArrayList<Member> silverMembers;
	
	{
		goldMembers = new ArrayList<>();
	}
	
	public ArrayList<Member> getGoldMembers() {
		return goldMembers;
	}
	{
		platinumMembers = new ArrayList<>();
	}
		public ArrayList<Member> getSilverMembers () {
			return silverMembers;
		
	}
	{
		silverMembers = new ArrayList<>();
	}
	public ArrayList<Member> getPlatinumMembers() {
		return platinumMembers;
	}
}
