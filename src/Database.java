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

	public GoldMember[] getGoldMembers() {
		return goldMembers.toArray(new GoldMember[0]);
	}

	public SilverMember[] getSilverMembers() {
		return silverMembers.toArray(new SilverMember[0]);
	}

	public PlatinumMember[] getPlatinumMembers() {
		return platinumMembers.toArray(new PlatinumMember[0]);
	}

	public Member[] getMembers() {
		ArrayList<Member> members = new ArrayList<>();
		members.addAll(goldMembers);
		members.addAll(silverMembers);
		members.addAll(platinumMembers);
		return members.toArray(new Member[0]);
	}

	public void addPlatinumMember(PlatinumMember platinumMember) {
		platinumMembers.add(platinumMember);
	}

	public void addGoldMember(GoldMember goldMember) {
		goldMembers.add(goldMember);
	}

	public void addSilverMember(SilverMember silverMember) {
		silverMembers.add(silverMember);
	}
}
