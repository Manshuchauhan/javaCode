class Condition {
    public String check_condition(int a, int b){
        if(a<b){
            return "a is smallest than b";
        }else{
            if(a>b){
                return "a is bigger than b";
            }
        }
        return "not applied";
    }
}

class CallMain{
    public static void main(String args[]){
        Condition t1=new Condition();
        System.out.println(t1.check_condition(121,121));
    }
}