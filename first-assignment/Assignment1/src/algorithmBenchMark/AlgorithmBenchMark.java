package algorithmBenchMark;

//for user input
import java.util.Scanner;


// for a dialox box
import javax.swing.JOptionPane;

public class AlgorithmBenchMark {

    //    Question 1
    public void question1() {
        double temp, weight, age;

        System.out.println("Question 1");
        System.out.println("Temp , weight and age has a data type of double");
        System.out.println(" ");
    }


    // Question 2
    public void question2() {
        int months = 2, days, years = 3;

        System.out.println("Question 2");
        System.out.println("Months = " + months);
        System.out.println("years = " + years);
        System.out.println(" ");

    }


    //    Question 3
    public void question3() {

        int b = 0;
        int a = 0;
        char c;

        b = a + 2;
        a = b * 4;
        b = (int) (a / 3.14);
        a = b - 8;
        c = 'K';
        c = (char) Character.codePointAt(new char[]{'B'}, 0); // check it out

        System.out.println("Question 3");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(" ");

    }


    //    Question 4
    public void question4() {

        int w = 5, x = 4, y = 8, z = 2;
        Object result;

        System.out.println("Question 4");
        result = x + y;
        System.out.println("x + y = " + result);

        result = z * 2;
        System.out.println("z * 2 = " + result);

        result = y / x;
        System.out.println("y / x = " + result);

        result = y - z;
        System.out.println("y - z = " + result);

        result = w % 2;
        System.out.println("w % 2 = " + result);


    }

    //Question 5

    public void question5() {

        System.out.println("Question 5");
        // a 3.287 × 106
        double a = 3.287e6;
        System.out.println("a = " + a);

        // b. −9.7865 × 1012
        double b = 9.7865e12;
        System.out.println("b = " + b);

        // c. 7.65491 × 10−3
        double c = 7.654916 - 3;
        System.out.println("c = " + c);


    }


    //    Question 6

    public void question6() {

        System.out.println("Question 6");
        System.out.print("Hearing in the distance");
        System.out.println("");
        System.out.println("");
        System.out.print("Two mandolins like creatures in the");
        System.out.println("");
        System.out.println("");
        System.out.print("dark");
        System.out.println("");
        System.out.println("");
        System.out.print("Creating the agony of ecstasy.");
        System.out.println("");
        System.out.println("");
        System.out.println(" - George Barker");
    }


    // Question 7
    public void question7() {

        int apples = 0, bananas = 2, pears = 10;

        apples += 10;
        bananas *= 10;
        pears /= 10;

        System.out.println("Question 7");
        System.out.println(apples + " " + bananas + " " + pears);
    }


    //Question 8

    public void question8() {

        double d = 12.9;
        int i = (int) d;

        System.out.println("Question 8");
        System.out.println(i);
    }

    //Question 9

    public void question9() {

        String message = "Have a great day!";

        System.out.println("Question 9");
        System.out.println(message.charAt(5));

    }

    //Question 10
    public void question10() {

        String message = "Have a great day!";

        System.out.println("Question 10");
        System.out.println(message.toUpperCase());

        System.out.println(message);
    }

    //Question 11
    public void question11() {

        int speed = 20;
        int time = 10;

        int distance = speed * time;

        System.out.println("Question 11");
        System.out.println("Distance = " + distance);


    }

    //Question 12
    public void question12() {

        double force = 172.5;
        double area = 27.5;

        double pressure = area / force;

        System.out.println("Question 12");
        System.out.println("Pressure =" + pressure);

    }


    //Question 13
    public void question13() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Question 13");
        System.out.println("Enter your anual income :");

        int desiredAnualIncome = scn.nextInt();

        System.out.println("Desired anual income : " + desiredAnualIncome);

        double anualIncome1 = desiredAnualIncome;

    }


    //Question 14
    public void question14() {

        System.out.println("Question 14");
        System.out.println("Check your screen for the dialogue box");

        String userInput = JOptionPane.showInputDialog("Enter your desired annual income:");

        double annualIncome2 = Double.parseDouble(userInput);

        JOptionPane.showMessageDialog(null, "Your desired annual income is: $" + annualIncome2);


    }


//    Question 15
    public void question15(){

        float total;
        double number = 3.4;

        total = (float) number;
    }

}


