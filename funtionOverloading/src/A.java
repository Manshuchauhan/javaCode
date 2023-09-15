class A {
    public void f1(int x){
        System.out.println("Class A Called");
    }
}
class B extends  A{
    public void f1(int x,int y){ //function overloading if method name is same but the signature is defrent is call method overloading
        System.out.println("Class B Called");
    }

    public static void main(String[] args){
        B obj=new B();
        obj.f1(1);
        obj.f1(1,2);

    }
}


