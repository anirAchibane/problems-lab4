package student;

public class Test {
    public static void main(String[] args) {
            Major medecine = new Major("FMS", "Medecine");
            Major business = new Major("SHBM", "Business");

            Student student1 = new Student("achibane","Anir","066666666","anir@gmail.com","12345678");
            Student student2 = new Student("student2","sss","21293","student2gmail.com","2", medecine);
            Student student3 = new Student("student3","sgg","21294","student3gmail.com","3", business);
            Student student4 = new Student("safi","Amal","066666666","SAFI@gmail.com","22885676");
            Student student5 = new Student("alami","Samir","066666666","ALAMI@gmail.com","23855976");

            // Display computer science students
            System.out.println("Displaying computer science students: ----------------------------");
            Major.DEFAULT_MAJOR.displayStudents();
            // student.getFullName():
            System.out.println("\nGet Full Name: ----------------------------");
            System.out.println(student1.getFullName());
            // major.findStudentByCNE():
            System.out.println("\nFind Student By CNE: ----------------------------");
            System.out.println(Major.DEFAULT_MAJOR.findStudentByCNE("12345678"));
            System.out.println(business.findStudentByCNE("12345678"));
            // get Student Count:
            System.out.println("\nGet Student Count: ------------------------------------");
            System.out.println("CS enrollement: " + Major.DEFAULT_MAJOR.getStudentCount());
            // removing student from class
            System.out.println("\nRemoving students: ------------------------------------");
            System.out.println("removing 3 from business: " + business.removeStudentByCNE("3"));
            System.out.println("removing 3 from medecine: " + medecine.removeStudentByCNE("3"));
            // Displaying occupied percentage:
            System.out.println("\n-------------------------------------------------------");
            System.out.println(Major.DEFAULT_MAJOR.getName() + " capacity : 50 students");
            System.out.println("Current enrollement: " + Major.DEFAULT_MAJOR.getStudentCount());
            System.out.println("Occupancy rate = " + Major.DEFAULT_MAJOR.getOccupancyRate() + "%");
            System.out.println("\nGet Students list as String: ---------------------------");
            String list = Major.DEFAULT_MAJOR.getStudentListAsString();
            System.out.println(list);
    }
}

