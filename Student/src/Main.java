
public class Main {

	public static void main(String[] args) {
		
		Student Diana = new Student();
		System.out.println(Diana.toString());
	    Diana.printStaticCourse();
		Diana.printCourse();
		Student Oleh = new Student("Олег", "Кузик", 1, 186);
		System.out.println(Oleh.toString());
		Oleh.printStaticCourse(); 
		Oleh.printCourse();
		Student Mariia = new Student("Марія","Мостова", 2, 171, 17, "малювання", "вул.Щастя,1", "червоний");
		System.out.println(Mariia.toString());
		Mariia.printStaticCourse();
		Mariia.printCourse();
	}

}
