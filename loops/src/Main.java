import java.util.Scanner;
class MainClass{
    public static void main(String args[]){
        int d=0;
        System.out.println("1.Do while");
        System.out.println("2.While");
        System.out.println("3.For");
        System.out.print("Enter Value : ");
        Scanner sc=new Scanner(System.in);

        int i=sc.nextInt();

        switch (i){
            case 1:

                    do{
                        System.out.println("This is do statemnet "+d);
                        d++;
                    }while(d<10);
                break;
            case 2:
                    while(d<10){
                        System.out.println("This is while loop "+d);
                        d++;
                    }
                break;
            case 3:
                for(d=0;d<10;d++){
                    System.out.println("This is For loop "+d);
                }
                break;
        }

    }


}