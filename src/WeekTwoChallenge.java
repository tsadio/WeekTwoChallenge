/**
 * This program is to randomly select ingredients to make 25 burrito
 * The 25 burrito will be display with the price of each of them
 * and a total price at the end
 *
 * First, declare and initialize a two dimensional array to store all
 *            the ingredients, each row for each kind of ingredients.
 * Declare an integer variable which will be used to randomly access
 *             ingredients of each kind of ingredients
 * Declare a double variable price and assign $3 as a basic price for all burrito
 * Declare a integer variable total representing the total number of ingredients
 *           total will be used to calculate the total price of the 25 burritos
 * Declare integers variables representing the number of each ingredients and assign 0
 * Declare an int variable representing the number of ingredients to be used for
 *           each burritos, the value will be randomly assign
 * Use an outer for loop to output the 25 burritos, in this for loop, randomly
 *           determine the index of the ingredients to be selected among each
 *           kind of ingredients.
 *           Use an inner for loop to access the two dimensions array of ingredients
 *           The row will go from 0 to the randomly chosen number of ingredients
 *           and the column will be the index of the randomly chosen ingredients
 *           For each ingredients choose, add $0.5 to price
 *           For each ingredients choose, add 1 to number of that ingredients
 *           For each ingredients choose, print out the ingredients name
 *           Print out the price of each burrito
 * Now print out the total number of ingredients for the 25 burritos, and the total
 * price for the 25 burritos. The total price will be evaluated by multiplying $0.5
 * to the total number of ingredients and adding $3
 *
 */

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class WeekTwoChallenge {
    public static void main (String [] args) {

        Random rand = new Random();

        //Declare a two dimensional array burrito and assign the name of all ingredients
        //The rows represent the ingredients type and the columns the ingredients names
        String [][] burrito ={{"white rice", "brown rice", "no rice", "all rice"},
                {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "no meat", "all meat"},
                {"pinto beans", "black beans", "no beans", "all beans"}, {"mild salsa", "medium salsa", "hot salsa",
                "no salsa", "all salsa"},
                {"lettuce", "fajita veggies", "no veggies", "all veggies"}, {"Cheese", "no cheese"},
                {"guac", "no guac"}, {"queso", "no queso"}, {"sour cream", "no sour cream"}};

        //Declare integers representing the position of the ingredient by ingredients type
        int numRice, numMeat, numBeans, numSalsa, numVeggies;
        int numCheese, numGuac, numQueso, numSourCream;

        //Declare integers variables representing the number of each ingredients and assign 0
        int whiteRice = 0, brownRice = 0, chicken = 0, steak = 0, carnidas = 0, chorizo =0;
        int sofritas = 0, veggiesMeat = 0, pintoBeans = 0, blackBeans = 0, mildSalsa = 0;
        int mediumSalsa = 0, hotSalsa = 0, lettuce = 0, fajita = 0, cheeseNum = 0;
        int guacNum = 0, quesoNum = 0, sourCreamNum = 0;

        System.out.println(" ");

        //Outer for loop to start building burritos from 1 to 25
        for (int i = 1; i <= 25; i++) {

            //for each burrito, randomly chose the number of ingredients
            //the position of the ingredients by ingredients type and
            //the basic price which is $0
            int numIng = rand.nextInt(5) + 5;
            double price = 3.0;
            numRice = rand.nextInt(4) + 1;
            numMeat = rand.nextInt(8) + 1;
            numBeans = rand.nextInt (4) + 1;
            numSalsa = rand.nextInt (5) + 1;
            numVeggies = rand.nextInt (4) + 1;
            numCheese = rand.nextInt(2) + 1;
            numGuac = rand.nextInt(2) + 1;
            numQueso = rand.nextInt(2) + 1;
            numSourCream = rand.nextInt(2) + 1;
            System.out.print("burrito " + i + ": ");

            //Inner for loop to build each burrito the for loop access the two dimension array
            //with k representing the rows. k will go  from 0 to the total number of ingredients -1
            //the column is basically the position of the ingredients - 1
            for (int k = 0; k < numIng; k++) {
                if (k == 0) {
                    //print the ingredients
                    System.out.print(burrito [k][numRice - 1] + ", ");
                    if (burrito [k][numRice - 1].equals("no rice")) {
                        //add $0.0 to price if there is no rice
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if there is any kind of rice
                        price += 0.5;
                    }

                    if (burrito [k][numRice - 1].equals("white rice")) {
                        //add 1 to the number of white rice if white rice is chosen
                        whiteRice += 1;
                    }
                    else if (burrito [k][numRice - 1].equals("brown rice")){
                        //add 1 to the number of brown rice if brown rice is chosen
                        brownRice += 1;
                    }
                    else if (burrito [k][numRice - 1].equals("all rice")) {
                        //add 1 to the number of white and brown rice if all rice is chosen
                        whiteRice += 1;
                        brownRice += 1;
                    }
                    else {
                        //add 0 to white and brown rice if no rice at all are chosen
                        whiteRice += 0;
                        brownRice += 0;
                    }

                }
                else if (k == 1) {
                    System.out.print(burrito[k][numMeat - 1] + ", ");
                    if (burrito [k][numMeat - 1].equals("no meat")) {
                        //add 0 to price if no meat is chosen
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if any meat is chosen
                        price += 0.5;
                    }
                    if (burrito [k] [numMeat - 1].equals("chicken")){
                        //add 1 to the number of chicken if chicken is chosen
                        chicken += 1;
                    }
                    else if (burrito[k][numMeat - 1].equals("steak")) {
                        //add 1 to the number of steak if steak is chosen
                        steak += 1;
                    }
                    else if (burrito[k][numMeat - 1].equals("carnidas")) {
                        //add 1 to the number of carnidas if carnidas is chosen
                        carnidas += 1;
                    }
                    else if (burrito[k][numMeat -1].equals("chorizo")) {
                        //add 1 to the number of chorizo if chorizo is chosen
                        chorizo += 1;
                    }
                    else if (burrito[k][numMeat -1].equals("sofritas")) {
                        //add 1 to the number of sofritas if sofritas is chosen
                        sofritas += 1;
                    }
                    else if (burrito[k][numMeat -1].equals("veggie meat")) {
                        //add 1 to the number of veggies meat if veggies meat is chosen
                        veggiesMeat += 1;
                    }
                }
                else if (k == 2) {
                    System.out.print(burrito[k][numBeans - 1] + ", ");
                    if (burrito [k][numBeans - 1].equals("no beans")) {
                        //add $0.0 to price if no beans is chosen
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if any beans is chosen
                        price += 0.5;
                    }

                    if (burrito [k][numBeans - 1].equals("pinto beans")) {
                        //add 1 to the number of pinto beans if pinto beans is chosen
                        pintoBeans += 1;
                    }
                    else if (burrito [k][numBeans - 1].equals("black beans")) {
                        //add 1 to the number of black beans if black beans is chosen
                        blackBeans += 1;
                    }
                    else if (burrito [k][numBeans - 1].equals("all beans")) {
                        //add 1 to the number of pinto and black beans if all beans is chosen
                        pintoBeans += 1;
                        blackBeans += 1;
                    }
                }
                else if (k == 3) {
                    System.out.print(burrito[k][numSalsa - 1] + ", ");
                    if (burrito [k][numSalsa - 1].equals("no salsa")) {
                        //add $0.0 to price if no salsa if chosen
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if any salsa is selected
                        price += 0.5;
                    }

                    if (burrito [k][numSalsa - 1].equals("mild salsa")) {
                        //add 1 to the number of mild salsa if mild salsa is chosen
                        mildSalsa += 1;
                    }
                    else if (burrito [k][numSalsa - 1].equals("medium salsa")) {
                        //add 1 to the number of medium salsa if medium salsa is chosen
                        mediumSalsa += 1;
                    }
                    else if (burrito [k][numSalsa - 1].equals("hot salsa")) {
                        //add 1 to the number of hot salsa if hot salsa is chosen
                        hotSalsa += 1;
                    }
                }
                else if (k == 4) {
                    System.out.print(burrito[k][numVeggies - 1] + ", ");
                    if (burrito [k][numVeggies - 1].equals("no veggies")) {
                        //add $0.0 to price if no veggies is selected
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if any veggies is selected
                        price += 0.5;
                    }
                    if (burrito [k][numVeggies - 1].equals("lettuce")) {
                        //add 1 to the number of lettuce if lettuce is chosen
                        lettuce += 1;
                    }
                    else if (burrito [k][numVeggies - 1].equals("fajita veggies")) {
                        //add 1 to the number of fajita veggies if fajita veggies is chosen
                        fajita += 1;
                    }
                    else if (burrito [k][numVeggies - 1].equals("all veggies")) {
                        //add 1 to the number of lettuce and fajita veggies if all veggies is chosen
                        lettuce += 1;
                        fajita += 1;
                    }
                }
                else if (k == 5) {
                    System.out.print(burrito[k][numCheese - 1] + ", ");
                    if (burrito [k][numCheese - 1].equals("no cheese")) {
                        //add $0.0 to price if no cheese is selected
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if cheese is selected
                        price += 0.5;
                    }
                    if (burrito [k][numCheese - 1].equals("Cheese")) {
                        //add 1 to the number of cheese if cheese is chosen
                        cheeseNum += 1;
                    }
                }
                else if (k == 6) {
                    System.out.print(burrito[k][numGuac - 1] + ", ");
                    if (burrito [k][numGuac - 1].equals("no guac")) {
                        //add $0.0 to price if no guac is selected
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if guac is selected
                        price += 0.5;
                    }

                    if (burrito [k][numGuac - 1].equals("guac")) {
                        //add 1 to the number of guac if guac is chosen
                        guacNum += 1;
                    }
                }
                else if (k == 7) {
                    System.out.print(burrito[k][numQueso - 1] + ", ");
                    if (burrito [k][numQueso - 1].equals("no queso")) {
                        //add $0.0 to price if queso is selected
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if no queso is selected
                        price += 0.5;
                    }
                    if (burrito [k][numQueso - 1].equals("queso")) {
                        //add 1 to the number of queso if queso is chosen
                        quesoNum += 1;
                    }
                }
                else {
                    System.out.print(burrito[k][numSourCream - 1] + ", ");
                    if (burrito [k][numSourCream - 1].equals("no sour cream")) {
                        //add $0.0 to price if no sour cream is selected
                        price += 0.0;
                    }
                    else {
                        //add $0.5 to price if sour cream is selected
                        price += 0.5;
                    }

                    if (burrito [k][numSourCream - 1].equals("sour cream")) {
                        //add 1 to the number of sour cream if sour cream is chosen
                        sourCreamNum += 1;
                    }
                }

            }
            //display the price for each burrito
            System.out.print("      Price: " + price + "$");
            //go to the next line to start building the next burrito
            System.out.println(" ");
        }

        //evaluate the total number of ingredients for the 25 burritos
        int total = whiteRice + brownRice + chicken + steak + carnidas + chorizo + veggiesMeat + pintoBeans
                + blackBeans + mildSalsa + mediumSalsa + lettuce + fajita + cheeseNum + guacNum + quesoNum
                + sourCreamNum;
        System.out.println(" ");

        //display the total number of ingredients for the 25 burritos
        System.out.println("This order has " + whiteRice + " white rice, " + brownRice + " brown rice, " +
                chicken + " chicken, " + steak + " steak, " + carnidas + " carnidas, " + chorizo +
                " chorizo, ");
        System.out.println(sofritas + " sofritas, " + veggiesMeat + " veggies meat, " + pintoBeans +
                " pinto beans, " + blackBeans + " black beans, " + mildSalsa + " mild salsa, " + mediumSalsa +
                " medium salsa, ");
        System.out.println(hotSalsa + " hot salsa, " + lettuce + " lettuce, " + fajita + " fajitas veggies, " +
                cheeseNum + " cheese, " + guacNum + " guac, " + quesoNum + " queso, " + sourCreamNum + " sour cream." );

        //total cost of the 25 burritos by multiplying the total number of ingredients by 0.5 and adding 3$
        System.out.println("The sum for the total order is: " + (3 + (0.5 * total)) + "$");

        //declare a string variable to concatenate and save the total number of ingredients by order and the
        //total price of the order
        String totalOrder;
        totalOrder = "This order has " + whiteRice + " white rice, " + brownRice + " brown rice, " +
                chicken + " chicken, " + steak + " steak, " + carnidas + " carnidas, " + chorizo +
                " chorizo, " + sofritas + " sofritas, " + veggiesMeat + " veggies meat, " + pintoBeans +
                " pinto beans, " + blackBeans + " black beans, " + mildSalsa + " mild salsa, " + mediumSalsa +
                " medium salsa, " + hotSalsa + " hot salsa, " + lettuce + " lettuce, " + fajita + " fajitas veggies, " +
                cheeseNum + " cheese, " + guacNum + " guac, " + quesoNum + " queso, " + sourCreamNum + " sour cream."
                + "The sum for the total order is: " + (3 + (0.5 * total)) + "$";

        System.out.println(" ");

        //for loop to display only 50 characters by line
        //the length of the total order which is now one string is
        //used as the limit of the loop
        for (int i = 0; i < totalOrder.length(); i++) {
            //It's a little hard, but the character at what the string go to the next line
            //is manually determine here, so the length of the string must be know to use this
            if (i == 51 || i == (51*2) || i == (51*3) || i == (51*4) || i == (51*5) || i == (51*6)) {
                System.out.println(" ");
            }
            //print every character if its position does not correspond to where the string
            //jump to the next line
            else  {
                System.out.print(totalOrder.charAt(i));
            }

        }
        //System.out.println(totalOrder);

    }
}