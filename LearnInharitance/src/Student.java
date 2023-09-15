class Student extends Person{
    private int rollnumber;
    public int setStudent(int r){
        rollnumber=r;
        return rollnumber;
    }
}
class Inarit{
    public static void main(String[] args){
        Student s1=new Student();
        s1.setPerson("Manshu","Chauhan");
        System.out.println(s1.showPerson());
        System.out.println(s1.setStudent(232));
    }
}

