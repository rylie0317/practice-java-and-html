package Math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myTarget = new Scanner(System.in);
////        double radius;
////        double circumference;
////        double area;
////        double volume;
////
////        System.out.println("Enter the radius ");
////        radius = myTarget.nextDouble();
////
////        circumference = 2 * Math.PI * radius;
////        area = Math.PI * Math.pow(radius, 2);
////        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
////
////        System.out.printf("The circumference is: %.1fcm\n", circumference);
////        System.out.printf("The area is: %.1fcm\n", area);
////        System.out.printf("The volume is: %.1fcm\n", volume);
//
////        double a;
////        double b;
////        double c;
//
////        System.out.println("Enter the length of side a");
////        a = myTarget.nextDouble();
////
////        System.out.println("Enter the length of side b");
////        b = myTarget.nextDouble();
////
////        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
////
////        System.out.println("The length of the hypotenuse is " + c );
//
////        System.out.println("Enter the length of side b");
////        b = myTarget.nextDouble();
////
////        System.out.println("Enter the length of the hypotenuse");
////        c = myTarget.nextDouble();
////
////        a = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));
////
////        System.out.println("The length of side a is " + a );
//        boolean isStudent;
//        boolean isSenior;
//        double price = 9.99;
//
//        System.out.println("Are you a student? (True or False)");
//        isStudent = myTarget.nextBoolean();
//        System.out.println("Are you a senior? (True or False)");
//        isSenior = myTarget.nextBoolean();
//
//        if (isStudent){
//            if (isSenior) {
//                System.out.println("You get a student discount of 10%");
//                System.out.println("You get a senior discount of 20%");
//                price *= 0.7;
//            } else {
//                System.out.println("You get a student discount of 10%");
//                price *= 0.9;
//            }
//
//        } else {
//            price *= 1;
//        }
//
//        System.out.printf("the total price is %.2f ", price);

//        String name = "Rylie Code";
//
//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf(" ");
//
//        System.out.println(index);
//        System.out.println("f(x) = -x² + 5x - 3");
//        System.out.println("Enter the value of x");
//        double x = myTarget.nextDouble();
//        double equation = Math.pow(-x,2) + (5 * x) - 3;
//        System.out.println("The answer is " + equation);


        int choice;
        // for binomial
        int exp1;
        double coefficient1;
        double var1;
        /* for trinomial*/
        int exp2;
        double coefficient2;
        double var2;
        double answer;
        double constantNum;

        System.out.println("Finding the total value");
        System.out.println("choose a number if the types of expression correspond to the equation");
        System.out.println("1 : Monomial");
        System.out.println("2 : Binomial");
        System.out.println("3 : Trinomial");
        choice = myTarget.nextInt();

        if (choice == 1) {
            System.out.println("enter the coefficient");
            coefficient1 = myTarget.nextDouble();
            System.out.println("enter the value of variable");
            var1 = myTarget.nextDouble();
            System.out.println("type the number of exponent in variable, if none just type none");
            exp1 = myTarget.nextInt();
            if (exp1 == 0){
                System.out.printf("the equation is %.1f(%.1f) \n " ,coefficient1, var1);
                answer = coefficient1 * var1;
                System.out.println("the total value is " + answer);
            } else {
                System.out.printf("the equation is %.1f(%.1f)^%d \n " ,coefficient1, var1,exp1);
                answer = coefficient1 * Math.pow(var1,exp1);
                System.out.println("the total value is " + answer);
            }
            /*for binomial*/
        } else if (choice == 2) {
            System.out.println("Enter the coefficient");
            coefficient1 = myTarget.nextDouble();
            System.out.println("Enter the value of variable");
            var1 = myTarget.nextDouble();
            System.out.println("Type the number of exponent in variable, if none just type 0");
            exp1 = myTarget.nextInt();
            System.out.println("Enter the constant number(positive or negative number)");
            constantNum = myTarget.nextDouble();
            System.out.printf("The equation is %.1f(%.1f)^%d+(%.1f) \n " ,coefficient1, var1, exp1,constantNum);
            answer = coefficient1 * Math.pow(var1,exp1) + constantNum;
            System.out.println("The total value is " + answer);
            /*for trinomial*/
        } else if (choice == 3) {
            System.out.println("Enter the coefficient");
            coefficient2 = myTarget.nextDouble();
            System.out.println("Enter the value of variable");
            var2 = myTarget.nextDouble();
            System.out.println("Type the number of exponent in varariable, if none just type 0");
            exp2 = myTarget.nextInt();
            System.out.println("Enter the coefficient");
            coefficient1 = myTarget.nextDouble();
            System.out.println("Enter the value of variable");
            var1 = myTarget.nextDouble();
            System.out.println("Type the number of exponent in variable, if none just type 0");
            exp1 = myTarget.nextInt();
            System.out.println("Enter the constant number(positive or negative number)");
            constantNum = myTarget.nextDouble();
            System.out.printf("The equation is %.1f(%.1f)^%d + %.1f(%.1f)^%d+(%.1f) \n " ,coefficient2,var2,exp2,coefficient1, var1, exp1,constantNum);
            answer = coefficient2 * Math.pow(var2,exp2) + coefficient1 * Math.pow(var1,exp1) + constantNum;
            System.out.println("The total value is " + answer);
        } else {
            System.out.println("Not Valid");
        }


        myTarget.close();






    }
}
