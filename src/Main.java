public class Main {
    static String [] names =  {"Petya","Kolya","Dima","Alina","Lesha","Danya","Anton","Vadim","Lera","Tanya","Saha"};
    public static void main(String[] args) {
        Dekan oleg = new Dekan();
        oleg.setName("Oleg");
        Teacher denis = new Teacher();
        Teacher sonya = new Teacher();
        denis.setName("Denis");
        sonya.setName("Sonya");
        denis.setDekan(oleg);
        sonya.setDekan(oleg);
        Teacher [] teacher = {sonya,denis};
        oleg.setTeachers(teacher);
        Student[] st1 = new Student[5];
        Student[] st2 = new Student[5];
        for (int i=0; i<10; i++ ){
            if (i<5){
                Student tmp = new Student();
                tmp.setName(names[i]);
                tmp.setTeacher(denis);
                tmp.setGroup("Group #1 ");
                st1[i] = tmp;
            }else {Student tmp = new Student();
                tmp.setName(names[i]);
                tmp.setTeacher(sonya);
                tmp.setGroup("Group #2 ");
                st2[i-5] = tmp;
            }
        }
        denis.setStudents(st1);
        sonya.setStudents(st2);
        oleg.Study();
        oleg.Teach();
        sonya.Study();
        sonya.Teach();
        denis.Study();
        denis.Teach();
        for(int i=0; i<5; i++){
            denis.getStudents()[i].Study();
            denis.getStudents()[i].Teach();
            sonya.getStudents()[i].Study();
            sonya.getStudents()[i].Teach();

        }
    }
}
