package net.davidtanzer.persons;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		Person other = (Person) o;
		if(other != null && other instanceof Person) {
			if(this.firstName==null && other.firstName != null) {
				return false;
			}
			if(!this.firstName.equals(other.firstName)) {
				return false;
			}
			
			if(this.lastName==null && other.lastName != null) {
				return false;
			}
			if(!this.lastName.equals(other.lastName)) {
				return false;
			}
			
			if(this.age != other.age) {
				return false;
			}
			
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = 13*age;
		
		if(firstName != null) {
			hashCode += 17*firstName.hashCode();
		}
		if(lastName != null) {
			hashCode += 31*lastName.hashCode();
		}
		
		return hashCode;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
