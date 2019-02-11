package ua.lviv.iot.lab1;

public class Main {

	public static void main(String[] args) {

		Student Diana = new Student();
		System.out.println(Diana.toString());
		Diana.printStaticCourse();
		Diana.printCourse();
		Student Oleh = new Student("Oleh", "Kuzyk", 1, 186);
		System.out.println(Oleh.toString());
		Oleh.printStaticCourse();
		Oleh.printCourse();
		Student Mariia = new Student("Mariia", "Mostova", 2, 171, 17, "art", "st.Happiness,1", "red");
		System.out.println(Mariia.toString());
		Mariia.printStaticCourse();
		Mariia.printCourse();
	}

}
