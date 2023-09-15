package pack1;
class PrintHello{
    public void printHello(){
        System.out.println("Hello packages");
    }
}
class packegesJava{
    public static void main(String[] args){
//        System.out.println("Hello packeges");
        PrintHello pac=new PrintHello();
        pac.printHello();
    }
}