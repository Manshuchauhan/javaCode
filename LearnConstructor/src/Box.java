class Box {
    private int length,height,birth;
    public Box(int l,int b,int h){
        length=l;
        height=h;
        birth=b;
    }
    public void getBox(){
        System.out.println("Box length is :"+length+" Box height is : "+height+" Box birth :"+birth);
    }
}

class mainTh{
    public static void main(String[] args){
        Box b1=new Box(12,34,55);
        b1.getBox();
    }
}
