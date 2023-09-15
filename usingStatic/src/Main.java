class UseStatic{
    private int x;
   public static int y=1;//static only created ones for class;
    public void setData(int data){
        x=data;
    }
    public void showData(){
        System.out.println(x);
    }
}

class MainMethod{
    public static void main(String[] args){
        UseStatic us=new UseStatic();
        us.setData(12);
        us.showData();
//        UseStatic.y;
        System.out.println(UseStatic.y);//static variables call without object
    }
}