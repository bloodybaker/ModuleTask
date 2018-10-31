public class Teacher extends Human implements Scientist {
    private Student[] students = new Student[5];
    private Dekan dekan = new Dekan();

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Dekan getDekan() {
        return dekan;
    }

    public void setDekan(Dekan dekan) {
        this.dekan = dekan;
    }
    @Override
    public void Study(){
        System.out.println("My dekan is " + dekan.getName());
    }
    @Override
    public void Teach(){
        System.out.println("I teach ");
        for (int i= 0; i<5; i++) {
            students[i].getName();
            System.out.println(students[i].getName());
        }
    }
}
