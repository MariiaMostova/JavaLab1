
public class Student {

	public String firstName;
	public String lastName;
	public int rating;
	public int height;
	private int age;
	private String hobby;
	public static int course = 1;
	protected String address;
	protected String favoriteColor;
	
	public int getAge() {
		return age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setAge(int age) {
		this.age=age;
	}
    public void setHobby(String hobby) {
		this.hobby=hobby;
	}
	Student(){
		System.out.println("The object of Student Class is created.");
	}
	Student(String firstName, String lastName, int rating, int height){
		this();
		this.firstName=firstName;
		this.lastName=lastName;
		this.rating=rating;
		this.height=height;
	}
	Student(String firstName, String lastName, int rating, int height, int age,  String hobby, 
			String address, String favoriteColor){
		this(firstName, lastName, rating, height);
		this.age=age;
		this.hobby=hobby;
		this.address=address;
		this.favoriteColor=favoriteColor;
	}
	 public String toString() {
	        return "First name of the student: " + this.firstName + ". " + "\n"
	                + "Last name of the student: " + this.lastName + "." + "\n"
	        		+ "Number of student`s rating: " + this.rating + ". " + "\n"
	        		+"Height it the student: " + this.height + ". " + "\n"
	        		+ "Age ot the student -- " + this.getAge() + ". " + "\n"
	        		+ "Hobby of the student: " + this.getHobby() + ". " + "\n"
	        		+ "Adress of the student: " + this.address + ". " + "\n"
	        		+ "Favorite color of the student is " + this.favoriteColor + ". ";
	    }
	 public static void printStaticCourse() {
		 System.out.println("Using static method: " + course);
	 }
	 public void printCourse() {
		 System.out.println("Using unstatic method: " + course  + "\n");
	 }
	 public void resetValues(String firstName, String lastName, int rating, int height, int age,  String hobby,
			 String address, String favoriteColor) {
		 this.firstName=firstName;
			this.lastName=lastName;
			this.rating=rating;
			this.height=height;
			this.age=age;
			this.hobby=hobby;
			this.address=address;
			this.favoriteColor=favoriteColor;
	 }

}
