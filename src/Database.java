import java.util.ArrayList;

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
}
