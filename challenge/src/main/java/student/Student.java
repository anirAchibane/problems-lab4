package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){
        super();
    }
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom,prenom,telephone,email);
        this.cne = cne;

        if (major.addStudent(this)){
            this.major = major;
        }
        else{
            this.major = null;
        }
    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email, cne, Major.DEFAULT_MAJOR);
    }

    // Getters and Setters
    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    // GetFullName method:
    public String getFullName(){
        return String.format("%S, %s", secondName, firstName);
    }
    @Override
    public String toString(){
        return cne + " : " + this.getFullName() + ".";
    }
}

