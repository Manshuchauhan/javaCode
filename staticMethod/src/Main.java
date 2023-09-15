class staticMethod{
    private static String name; //static member variable this is private variable so we can not access this vaiable directorly
    public static int age=12;//this is public variable we can access this directorly
//    because the upper variabe is a privte so we do not access this outside the class
    public static void setStatic(String n){
        name=n;
        System.out.println(name);
    }
}

class MainClass{
    public static void main(String[] args){
        staticMethod.setStatic("Manshu");
        System.out.println(staticMethod.age);
    }
}