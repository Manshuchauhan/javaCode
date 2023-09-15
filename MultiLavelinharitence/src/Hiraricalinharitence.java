public class Hiraricalinharitence {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setPerson("Manshu","Madan singh Chauhan","Anju devi","Gaindikhata");
        s1.setRoll(11);
        System.out.println(s1.showPerson());
        System.out.println(s1.showRoll());
        teacher t1=new teacher();
        t1.setPerson("Pooja vishwakarma","Null","Null","Haridwar");
        t1.setTeacherId(23);
        System.out.println(t1.showPerson());
        System.out.println(t1.showTeacher());


    }
}
