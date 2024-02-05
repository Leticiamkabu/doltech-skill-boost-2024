package pragrammingchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProgrammingChallenge {

    //Question 1
    public void question1(){

        String name = "Joe Mahoney";
        int age = 26;
        double annualPay = 100000.0 ;

        System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per year.");


    }

    //Question 2
    public void question2(){

        String firstname = "Leticia";
        String lastname = "Kabu";
        String middlename = "Mamley";

        char firstInitial = 'L';
        char middleInitial = 'M';
        char lastInitial = 'K';

        System.out.println(firstname);
        System.out.println(middlename);
        System.out.println(lastname);
        System.out.println(firstInitial);
        System.out.println(middleInitial);
        System.out.println(lastInitial);




    }

//    Question 3
    public void question3(){
        String name = "Leticia Kabu";
        String address = "Home";
        String telephoneNumber = "0556852682" ;
        String collegeMajor = "Computer Science";

        System.out.print(name + "\n" + address + "\n" + telephoneNumber + "\n" + collegeMajor);
    }

//    Question 4
    public void question4(){

        int n = 4;

        // Upper part of the pattern
        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (int t = 1; t <= 2 * r - 1; t++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int t = 2; t <= n; t++) {
            for (int k = 1; k < t; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - t) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//    Question 5
    public void question5(){
        double eastCoastSales = 0.62;
        int totalCompanySales = 4600000;
        float totalEastCoastSalesForTheYear;

        totalEastCoastSalesForTheYear = (int) ((eastCoastSales/100) * totalCompanySales);

        System.out.println("East Coast Total Sales for the year is : $" + totalEastCoastSalesForTheYear);

    }

//    Question 6

    public void question6(){

        int oneAcreOfLand = 43560;
        int tractOfLand = 389767;

        double totalNumberOfAcres = (double)(tractOfLand / oneAcreOfLand);

        System.out.println("The number of acres of a land with size " + tractOfLand +" square feet, is : " + totalNumberOfAcres + " acres");

    }


//    Question 7

    public void question7(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount purchased :");
        double amountPurchase = scanner.nextDouble();

        double stateSalesTaks = 0.04;
        double countrySalesTaks = 0.02;
        double totalSalesTakes = stateSalesTaks + countrySalesTaks;
        double totalSales = (totalSalesTakes * amountPurchase);

        System.out.println("Purchase amount is :" + amountPurchase);
        System.out.println("State sales Taxs is :" + stateSalesTaks);
        System.out.println("Country sales Taxs is :" + countrySalesTaks);
        System.out.println("Total sales Taxs is :" + totalSalesTakes);
        System.out.println("Total sales is :" + totalSales);


    }

//    Question 8

    public void question8(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of cookies consumed");
        int cookiesConsumedByUser = scn.nextInt();
        int numberOfCaloriesPer10Serving = 300;
        int totalNumberOfCookiesInABag = 40;


        int totalNumberOfCaloriesConsumed = cookiesConsumedByUser * 30;

        System.out.println("The user ate "+ cookiesConsumedByUser + " and consumed "+ totalNumberOfCaloriesConsumed + " calories in total");
    }


//    Question 9

    public void question9(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of mile driven: ");
        int numberOfMiles = userInput.nextInt();

        System.out.println("Enter number of gallons used: ");
        int gallonsOfGasUsed = userInput.nextInt();

        double milesPerGalon = (double)(numberOfMiles / gallonsOfGasUsed);

        System.out.println("Car miles per galon is : "+ milesPerGalon);



    }


//    Question 10



    public void question10(){

        Scanner testScoreInput = new Scanner(System.in);

        System.out.println("Enter numbers separated by space : ");
        String testScore = testScoreInput.nextLine();

        //this is spliting the list
        String[] number = testScore.split(" ");
        ArrayList<Double> numbers = new ArrayList<>();
        for (String numberString : number){
            numbers.add(Double.parseDouble(numberString));
        }


        //this is finding the average of the numbers
        double sum = 0;
        for (Double number_loop : numbers) {
            System.out.println(number_loop);
            sum += number_loop;
        }

        double average = sum / numbers.size();


        System.out.println("The average if the test score is : " + average);

    }



//    Question 11

    public void question11(){

        Scanner retailInput = new Scanner(System.in);

        System.out.println("Enter retail price : ");
        double retailPrice = retailInput.nextDouble();

        double profit = retailPrice * 0.4;
        System.out.println("The profit for the product is :" + profit);
    }

//    Question 12

    public void question12(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the name of your favourite city :");
        String city = userInput.nextLine();

        System.out.println("The number of characters in the city name is :" + city.length());
        System.out.println("The name of the city in all uppercase letters is :" + city.toUpperCase());
        System.out.println("The name of the city in all lowercase letters is :" + city.toLowerCase());
        System.out.println("The first character in the name of the city is :" + city.charAt(0));
    }



//  Question 13

    public void question13(){

        Scanner mealInput = new Scanner(System.in);

        System.out.println("Enter the meal charge");
        double mealCharge = mealInput.nextDouble();

        double mealTax = mealCharge * 6.75;

        double totalMealWithTax = mealCharge + mealTax;

        double mealsTip = (double)((totalMealWithTax * 20)/100);

        double totalBill = totalMealWithTax + mealsTip;

        System.out.println("The meal charge is : " + mealCharge);
        System.out.println("The tax amount is :" + totalMealWithTax);
        System.out.println("The tip amount is :" + mealsTip);
        System.out.println("Total bill is :" + totalBill);



    }


//    Question 14


    public void question14(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of males registered in a class: ");
        int registedMales = userInput.nextInt();

        System.out.println("Enter the number of females registered in a class: ");
        int registedFemales = userInput.nextInt();
//        System.out.println(registedFemales);

        int totalNumberOfStudents = registedMales + registedFemales;
        System.out.println(totalNumberOfStudents);

        double percentageOfMales = (double)(registedMales / totalNumberOfStudents) * 100;
        double percentageOfFemales = (double)(registedFemales / totalNumberOfStudents) * 100;

        System.out.println(" Percentage of males is " + percentageOfMales);
        System.out.println(" Percentage of females is " + percentageOfFemales);


    }

//    Question 15



    public void question15(){

        double amountPaid = 21.77 * 600;
        System.out.println("The amount paid for all the 600 stock is : $" +amountPaid);

        double amountCommission = amountPaid * 0.02;
        System.out.println("The commission is :" +amountCommission);

        double totalAmountPaid = amountPaid + amountCommission;
        System.out.println(totalAmountPaid);

    }


}
