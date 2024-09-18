// public class T01_IO{
//     public static void main(String[] args) {
//         System.out.println("hello anmol");
//     }
// }


import java.util.Scanner;
public class T01_IO {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = inp.nextLine();
        System.out.print("Enter your age: ");
        int age = inp.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age);
        inp.close();
    }
}

