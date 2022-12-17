package ec.edu.itsqmet.builder.person;

import java.time.LocalDate;
import java.util.Date;

import lombok.Builder;

@Builder
public class Person {

	private String name;
	private String lastName;
	private LocalDate birthday;
	private String address;
	private String profession;

	public Person(String name, String lastName, LocalDate birthday, String address, String profession) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
		this.address = address;
		this.profession = profession;
	}

	public Person(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;

	}
	
	public Person(String name, LocalDate birthday) {
		super();
		this.name = name;
		this.birthday = birthday;

	}

}
