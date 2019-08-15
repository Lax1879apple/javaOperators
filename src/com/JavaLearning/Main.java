package com.JavaLearning;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 5 + 10; // Here "+" is additional operator and "=" is assignment operator which is just means that right hand side value is assigned to left side.
        System.out.println("Result = " + result);
        int previousResult = result;
        System.out.println("Previous is = " + previousResult);

        result = previousResult - 4; // this should give 11
        System.out.println(" result = " + result);

        result = result * 10;
        System.out.println("The new  result  is = " + result);

        result = result / 3;
        System.out.println(" 110 / 3  = " + result );

        result = result % 5;
        System.out.println("36 % 5 = " + result);

        // result = result + 1;
        result ++;
        System.out.println("1 + 1 =" + result);

        result --; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2; // 1 + 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30;
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3; // 30 / 3 = 10;
        System.out.println("30 / 3 = " + result );

        // result = result - 2;
        result -= 2; // 10 -2 = 8;
        System.out.println("10 - 2 = " + result);

        // logical operators
        boolean isAlien = false;
        if(isAlien == false) { // this makes it true so the code below is excuted but if you make it true, code will not excute.
            System.out.println("It is not an Alien");
        }

        int topScore = 100;
        if(topScore == 100){
            System.out.println("You scored the high score");
        }

        int secondTopScore = 95;
        if(secondTopScore != 100){
            System.out.println("You  are not the topper");
        }
        if(secondTopScore >= 95){
            System.out.println("You are  almost a topper");
            // below using double "and" percent operator.
            if((topScore > secondTopScore) && (topScore <= 100)){
                System.out.println("The second top score is less than first topScore");
            }
            // below using or condition operator
            if((topScore < 80) || (secondTopScore <= 100)){
                System.out.println("Either one or both conditions are true");
            }

            boolean isCar = false;
            if(!isCar){ //below statement will print because, isCar is set to false and in if condition, we are saying isCar is not true, which is false corresponding to boolean variable.
                System.out.println("This is not a car I wanted");
            }
            // ternary operators
            isCar = true;
            boolean wasCar = isCar ? true : false;
            if(wasCar){
                System.out.println("wasCar is true");
            }

            int isStudent = 18;
            boolean isEighteenOrOver = (isStudent == 23) ? true : false;
            if(isEighteenOrOver = true){
                System.out.println("The is student is of legal age to drive");
            }

        }

        }


    }

