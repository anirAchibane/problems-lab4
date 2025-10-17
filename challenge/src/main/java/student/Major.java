package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public static final Major DEFAULT_MAJOR = new Major("CS", "Computer Science");

    public Major(){
        this.id = nextId++;
        this.students = new Student[50];
    }

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
    }

    // Method to add a student
    public boolean addStudent(Student s) {
        if (studentCount < 50){
            students[studentCount] = s;
            studentCount++;
            return true;
        }
        return false;
    }

    // Getters and Setters

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Major.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        for (Student student : students){
            if (student == null){
                break;
            }
            System.out.println(student);
        }
    }

    // findStudentByCNE()
    public Student findStudentByCNE(String cne){
        for (int i = 0; i < studentCount; i++){
            if (students[i].getCne().equals(cne)){
                return students[i];
            }
        }
        return null;
    }
    // removeStudentByCNE():
    public boolean removeStudentByCNE(String cne){
        for (int i = 0; i < studentCount; i++){
            if (students[i].getCne().equals(cne)){
                for (int j = i; j < studentCount; j++){
                    students[j] = students[j+1];
                    System.out.println("Student " + cne + " removed successfully from " + name);
                    return true;
                }
            }
        }
        return false;
    }
    // getOccupancyRate():
    public double getOccupancyRate(){
        return (studentCount / 50.0) * 100.0;
    }
    // getStudentListAsString()
    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder(name + " : {");
        for(int i = 0; i < studentCount; i++) {
            sb.append(students[i].getFirstName() + " "
                    + students[i].getSecondName());
            if (i != studentCount - 1) {
                sb.append(" , ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override
    public String toString(){
        return String.format("%s : %s", code, name);
    }


}
