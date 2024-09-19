public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }//constructor atributos

    public void printFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }//imprime nombre y apellido

    public boolean isApproved() {
        return grade >= 60;
    }//calificaion arriba de 60 es true

    public int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("felicidades pasaste de año");
        }else {
        	System.out.println("no pasaste de año");
        }    	
        return year;
    }//condicional if, arroja mensaje 
    
    public Student(String firstName, String lastName, int registration, int year) {
        this(firstName, lastName, registration, 0, year);
    }//constructor sin calificacion

    public Student(String firstName, String lastName, int year) {
        this(firstName, lastName, 0, 0, year);
    }//constructor solo nombre, apellido y año

}

