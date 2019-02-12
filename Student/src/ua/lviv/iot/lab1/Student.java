package ua.lviv.iot.lab1;

public class Student {

	private static int course = 1;

	private String firstName;
	private String lastName;
	private int rating;
	private int height;
	private int age;
	private String hobby;

	protected String address;
	protected String favoriteColor;

	Student(String firstName, String lastName, int rating, int height, int age, String hobby, String address,
			String favoriteColor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rating = rating;
		this.height = height;
		this.age = age;
		this.hobby = hobby;
		this.address = address;
		this.favoriteColor = favoriteColor;
		System.out.println("The object of Student Class is created.");
	}

	Student(String firstName, String lastName, int rating, int height) {
		this(firstName, lastName, rating, height, 0, null, null, null);
	}

	Student() {
		this(null, null, 0, 0, 0, null, null, null);
	}

	public String toString() {
		return "First name of the student: " + firstName + ". " + "\n" + "Last name of the student: "
				+ lastName + "." + "\n" + "Number of student`s rating: " + rating + ". " + "\n"
				+ "Height it the student: " + height + ". " + "\n" + "Age ot the student -- " + age
				+ ". " + "\n" + "Hobby of the student: " + hobby + ". " + "\n" + "Adress of the student: "
				+ address + ". " + "\n" + "Favorite color of the student is " + favoriteColor + ". ";
	}

	public static void printStaticCourse() {
		System.out.println("Using static method: " + course);
	}

	public void printCourse() {
		System.out.println("Using unstatic method: " + course + "\n");
	}

	public void resetValues(String firstName, String lastName, int rating, int height, int age, String hobby,
			String address, String favoriteColor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rating = rating;
		this.height = height;
		this.age = age;
		this.hobby = hobby;
		this.address = address;
		this.favoriteColor = favoriteColor;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
