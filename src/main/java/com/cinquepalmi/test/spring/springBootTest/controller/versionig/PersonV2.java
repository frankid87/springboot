package com.cinquepalmi.test.spring.springBootTest.controller.versionig;

public class PersonV2 {

	private Name name;	
	
	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public static class Name{
		private String firstname;
		private String surname;

		public Name(String firstname, String surname) {
			super();
			this.firstname = firstname;
			this.surname = surname;
		}
		
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		
	}
	
}