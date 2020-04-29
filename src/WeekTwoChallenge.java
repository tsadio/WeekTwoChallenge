import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class WeekTwoChallenge {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String [] rice = {"white", "brown", "none", "all"};
        String [] meat = {"chicken", "steak", "carnidas", "chorizo", "sofritas",
                "veggie meat", "none", "all"};
        String [] beans = {"pinto", "black", "none", "all"};
        String [] salsa = {"mild", "medium", "hot", "none", "all"};
        String [] veggies = {"lettuce", "fajita veggies", "none", "all"};
        boolean[] cheese = {true, false};
        boolean[] guac = {true, false};
        boolean[] queso = {true, false};
        boolean[] sourCream = {true, false};
        String [][] burrito ={{"white rice", "brown rice", "no rice", "all"},
                {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "no meat", "all"},
                {"pinto beans", "black beans", "no beans", "all"}, {"mild", "medium", "hot", "no salsa", "all"},
                {"lettuce", "fajita veggies", "no veggies", "all"}, {"Cheese", "no cheese"},
                {"guac", "no guac"}, {"queso", "no queso"}, {"sour cream", "no sour cream"}};

        int counter = 10;
        int numRice, numMeat, numBeans, numSalsa, numVeggies;
        int numCheese, numGuac, numQueso, numSourCream;
        int whiteRice = 0, brownRice = 0, chicken = 0, steak = 0, carnidas = 0, chorizo =0;
        int sofritas = 0, veggiesMeat = 0, pintoBeans = 0, blackBeans = 0, mildSalsa = 0;
        int mediumSalsa = 0, hotSalsa = 0, lettuce = 0, fajita = 0, cheeseNum = 0;
        int guacNum = 0, quesoNum = 0, sourCreamNum = 0;

        for (int i = 1; i <= 25; i++) {
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
            for (int k = 0; k < numIng; k++) {
                if (k == 0) {
                    System.out.print(burrito [k][numRice - 1] + ", ");
                    if (burrito [k][numRice - 1].equals("no rice")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }

                    if (burrito [k][numRice - 1].equals("white rice")) {
                        whiteRice += 1;
                    }
                    else if (burrito [k][numRice - 1].equals("brown rice")){
                        brownRice += 1;
                    }
                    else if (burrito [k][numRice - 1].equals("all")) {
                        whiteRice += 1;
                        brownRice += 1;
                    }
                    else {
                        whiteRice += 0;
                        brownRice += 0;
                    }

                }
                else if (k == 1) {
                    System.out.print(burrito[k][numMeat - 1] + ", ");
                    if (burrito [k][numMeat - 1].equals("no meat")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }
                    if (burrito [k] [numMeat - 1].equals("chicken")){
                        chicken += 1;
                    }
                    else if (burrito[k][numMeat - 1].equals("steak")) {
                        steak += 1;
                    }
                    else if (burrito[k][numMeat - 1].equals("carnidas")) {
                        carnidas += 1;
                    }
                    else if (burrito[k][numMeat -1].equals("chorizo")) {
                        chorizo += 1;
                    }
                    else if (burrito[k][numMeat -1].equals("sofritas")) {
                        sofritas += 1;
                    }
                    else if (burrito[k][numMeat -1].equals("veggie meat")) {
                        veggiesMeat += 1;
                    }
                }
                else if (k == 2) {
                    System.out.print(burrito[k][numBeans - 1] + ", ");
                    if (burrito [k][numBeans - 1].equals("no beans")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }

                    if (burrito [k][numBeans - 1].equals("pinto beans")) {
                        pintoBeans += 1;
                    }
                    else if (burrito [k][numBeans - 1].equals("black beans")) {
                        blackBeans += 1;
                    }
                    else if (burrito [k][numBeans - 1].equals("all")) {
                        pintoBeans += 1;
                        blackBeans += 1;
                    }
                }
                else if (k == 3) {
                    System.out.print(burrito[k][numSalsa - 1] + ", ");
                    if (burrito [k][numSalsa - 1].equals("no salsa")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }

                    if (burrito [k][numSalsa - 1].equals("mild")) {
                        mildSalsa += 1;
                    }
                    else if (burrito [k][numSalsa - 1].equals("medium")) {
                        mediumSalsa += 1;
                    }
                    else if (burrito [k][numSalsa - 1].equals("hot")) {
                        hotSalsa += 1;
                    }
                }
                else if (k == 4) {
                    System.out.print(burrito[k][numVeggies - 1] + ", ");
                    if (burrito [k][numVeggies - 1].equals("no veggies")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }
                    if (burrito [k][numVeggies - 1].equals("lettuce")) {
                        lettuce += 1;
                    }
                    else if (burrito [k][numVeggies - 1].equals("fajita veggies")) {
                        fajita += 1;
                    }
                }
                else if (k == 5) {
                    System.out.print(burrito[k][numCheese - 1] + ", ");
                    if (burrito [k][numCheese - 1].equals("no cheese")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }
                    if (burrito [k][numCheese - 1].equals("Cheese")) {
                        cheeseNum += 1;
                    }
                }
                else if (k == 6) {
                    System.out.print(burrito[k][numGuac - 1] + ", ");
                    if (burrito [k][numGuac - 1].equals("no guac")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }

                    if (burrito [k][numGuac - 1].equals("guac")) {
                        guacNum += 1;
                    }
                }
                else if (k == 7) {
                    System.out.print(burrito[k][numQueso - 1] + ", ");
                    if (burrito [k][numQueso - 1].equals("no queso")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }
                    if (burrito [k][numQueso - 1].equals("queso")) {
                        quesoNum += 1;
                    }
                }
                else {
                    System.out.print(burrito[k][numSourCream - 1] + ", ");
                    if (burrito [k][numSourCream - 1].equals("no sour cream")) {
                        price += 0.0;
                    }
                    else {
                        price += 0.5;
                    }

                    if (burrito [k][numSourCream - 1].equals("sour cream")) {
                        sourCreamNum += 1;
                    }
                }

            }
            System.out.print("      Price: " + price);
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("This order has " + whiteRice + " white rice, " + brownRice + " brown rice, " +
                chicken + " chicken, " + steak + " steak, " + carnidas + " carnidas, " + chorizo +
                " chorizo, ");
        System.out.println(sofritas + " sofritas, " + veggiesMeat + " veggies meat, " + pintoBeans +
                " pinto beans, " + blackBeans + " black beans, " + mildSalsa + " mild salsa, " + mediumSalsa +
                " medium salsa, ");
        System.out.println(hotSalsa + " hot salsa, " + lettuce + " lettuce, " + fajita + " fajitas veggies, " +
                cheeseNum + " cheese, " + guacNum + " guac, " + quesoNum + " queso, " + sourCreamNum + " sour cream." );


    }
}