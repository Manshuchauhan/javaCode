class continueKey{

    int i=0;
    void data(){
        for(i=0;i<10;i++){
            if(i==5)
                continue;//continue keyword skip the condition
            System.out.println(i);
        }
    }

}
class mainClass{
    public static void main(String args[]){
        continueKey t1=new continueKey();
        t1.data();
    }
}