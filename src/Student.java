public class Student extends Human implements Scientist {

    private Teacher teacher = new Teacher();
    private String group;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    @Override
    public void Study(){
        System.out.println("I study in " + group);
    }
    @Override
    public void Teach(){
        System.out.println("My teacher " + teacher.getName());
    }
}
