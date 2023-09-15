class thiskey {
    private int l,b,h;
    public void showBox(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
        System.out.println(l+" "+b+" "+h);
    }
}
class Main{
    public static void main(String[] args){
        thiskey s1=new thiskey();
        s1.showBox(12,12,12);
    }
}
