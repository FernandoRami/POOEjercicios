import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
    	students.add(student);
        System.out.println(student.firstName + " " + student.lastName + " en " + courseName);
        student.changeYearIfApproved();
    }

    public void unEnroll(Student student) {
    	if (students.contains(student)) {
    		students.remove(student);
    		System.out.println("Se dio de baja: " + student.firstName + " " + student.lastName + " de " + courseName);
    	} else {
    		System.out.println("No se encuentra el alumno : " + student.firstName + " " + student.lastName);
    	}
    }

    public int countStudents() {
        return students.size();
    }

    public int bestGrade() {
        return students.stream().mapToInt(s -> s.grade).max().orElse(0);
    }

    public void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            enroll(student);
        }
    }
    
    public void printCourseInfo() {
    	System.out.println("Curso: " + courseName);
    	System.out.println("Profesor: " + professorName);
    	System.out.println("Año actual: " + year);
    	System.out.println("Total de estudiantes: " + countStudents());
    }
    public static void main(String[] args) {
    	Student student1 = new Student("Fernando", "Ramirez", 1, 95, 1);
    	Student student2 = new Student("Kris", "Jaramillo", 2, 70, 2);
    	Student student3 = new Student("Fer", "Coronel", 3, 50, 1);
    	Student student4 = new Student("Ivan", "Morales", 4, 40, 1);

    	Courses course = new Courses("matematicass", "Valencia", 2024);

    	course.enroll(student1);
    	course.enroll(student2);

    	Student[] moreStudents = {student3, student4};
    	course.enroll(moreStudents);

    	course.printCourseInfo();

    	course.unEnroll(student4);

    }
}
