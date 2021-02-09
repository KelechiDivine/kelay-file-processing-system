import java.util.ArrayList;
import java.util.Date;

public class Database {
	
	private final ArrayList<GoldMember> goldMembers;
	private final ArrayList<SilverMember> silverMembers;
	private final ArrayList<PlatinumMember> platinumMembers;

	public Database() {
		goldMembers = new ArrayList<>();
		silverMembers = new ArrayList<>();
		platinumMembers = new ArrayList<>();
	}
	
	public ArrayList<GoldMember> getGoldMembers() {
		return goldMembers;
	}

	public ArrayList<SilverMember> getSilverMembers() {
		return silverMembers;
	}

	public ArrayList<PlatinumMember> getPlatinumMembers() {
		return platinumMembers;
	}

	public ArrayList<Member> getMembers() {
		ArrayList<Member> members = new ArrayList<>();
		members.addAll(goldMembers);
		members.addAll(silverMembers);
		members.addAll(platinumMembers);
		return members;
	}
}
