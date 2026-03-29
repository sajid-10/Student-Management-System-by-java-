public class Student {
    String first_name, last_name, section;
    int id, standard;
    double grade;

    // default constructor
    public Student() {
        this.first_name = "unknown";
        this.last_name = "unknown";
        this.section = "not alloted";
        this.id = 0;
        this.standard = 0;
        this.grade = 0.00;
    }

    // overloaded constructor
    public Student(
            String first_name, String last_name, String section,
            int id, int standard, double grade) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.section = section;
        this.id = id;
        this.standard = standard;
        this.grade = grade;
    }
}
