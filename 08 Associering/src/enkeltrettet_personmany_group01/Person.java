package enkeltrettet_personmany_group01;

public class Person {
	private String name;
	// Person 0...* --> 0..1 Group
	private Group group;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// -------------------------------------------------------------------------

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
}
