public class Dekan extends Human implements Scientist{
    private Teacher[] teachers = new Teacher[2];
    private int experience;

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public void Study(){
        System.out.println("My experience is " + experience);
    }
    @Override
    public void Teach(){
        System.out.println("In my submission " + teachers[0].getName() + " " + teachers[1].getName());
    }
}
