class staticInnerClass{
    static class OwnPring{ //this is a static method
        static void print(int a){
            System.out.print(a);
        }

    }
}
class MainClass{
    public static void main(String[] args){

        staticInnerClass.OwnPring.print(34);
    }
}