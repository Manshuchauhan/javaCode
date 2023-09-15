class Box{
    private int length,birth,height;
    public void setDimentions(int l,int b,int h){
        length=l;birth=b;height=h;
    }
    public void showDimentions(){
        System.out.println(length+" "+birth+" "+height);
    }
}

class Example{
    public static void main(String[] args){
        Box smallBox=new Box();
        smallBox.setDimentions(12,3,43);
        smallBox.showDimentions();
        smallBox=new Box();
        smallBox.showDimentions();
    }
}