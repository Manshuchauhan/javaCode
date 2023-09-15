public class person {
    private String name,fatherName,motherName,address;
    public void setPerson(String n,String f,String m,String add){
        name=n;
        fatherName=f;
        motherName=m;
        address=add;
    }
    public String showPerson(){
        return name+" "+fatherName+" "+motherName+" "+address;
    }
}
