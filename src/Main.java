import javax.xml.namespace.QName;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       /* Scanner sc= new Scanner(System.in);

        System.out.print("Add your first number");

        int x = sc.nextInt();

        System.out.print("Add your second number");

        int y = sc.nextInt();

        System.out.print("Add your third number");

        int z = sc.nextInt();

        int zz = x+y+z;

        System.out.println(zz);
        NAME();*/

        do_while();
        do_while2();
    }

    public static void NAME(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name and classes");
        String name = sc.nextLine();
        String Class1= sc.nextLine();
        String Class2= sc.nextLine();
        String Class3= sc.nextLine();

        System.out.println("My name is " + name + " I have the following classes:" +"\t\n" + Class1 + "\n" + Class2 + "\n" + Class3 );


    }

        public static void do_while(){
        int num = 1;
        int sum = 0;

        do{
            sum+= num;
            num++;

        }while(num<=100);{
            System.out.println(sum);
            }


    }

    public static void do_while2(){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
    }


}