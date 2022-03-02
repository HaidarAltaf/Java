package Person;

public class Person {
	private String Name;
	private int age;
	private String jobTitle;

	public Person(String Name, int age, String jobTitle) {
		this.Name = Name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return  "Name: " + Name 
				+ " Age: " + age 
				+ " Job: " + jobTitle;
	}
	
}
