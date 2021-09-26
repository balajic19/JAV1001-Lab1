/*
Name: Balaji Chandupatla
Student Number: A00245077
Program Description: 

Java code used to convert the following metrics
KM to Mi, CM to Inches, KGs to lbs, gms to oz, °C to F and K, Litre to cups and vice versa.

The code requires the use to input data along with metric and the code automatically converts it accordingly. 
The input is case insensitive too.
*/

import java.util.Scanner;
public class Convert{
    public static void main(String[] args){
        // Requesting system to input
        // The input is stored in the form of string 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value to Convert: ");
        String systemInput = s.nextLine();

        systemInput = systemInput.toLowerCase();

        // Checking if the give input is correct
        Boolean checkInput = Character.isDigit(systemInput.charAt(0));
        if (checkInput == false){
            System.out.println(systemInput + ", Wrong input provided.\nCode Exited");
            s.close();
            System.exit(0);
        }

        else{
            // Parsing the input and converting it to suitable metric

            // KILO METERS to MILES
            // The snippet code checks for the metric and parses it to double to make the 
            // conversion and stores it in a variable called tempResult.
            // The same logic is used in every if condtion written below.
            if (systemInput.contains("km")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("km", "").trim());
                Double tempResult = tempVar * 0.62;
                System.out.println(tempVar + " km is equal to " + tempResult + " mi");
            }

            // MILES TO KILO METERS
            else if (systemInput.contains("mi")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("mi", "").trim());
                Double tempResult = tempVar * 1.61;
                System.out.println(tempVar + " mi is equal to " + tempResult + " km");
            }

            // CENTIMETERS TO INCHES
            else if (systemInput.contains("cm")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("cm", "").trim());
                Double tempResult = tempVar * 0.39;
                System.out.println(tempVar + " cm is equal to " + tempResult + " in");
            }

            // INCHES TO CENTIMETERS
            else if (systemInput.contains("in")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("in", "").trim());
                Double tempResult = tempVar * 2.54;
                System.out.println(tempVar + " in is equal to " + tempResult + " cm");
            }

            // GRAMS TO OUNCE
            // Since g is also a substring of kgs, to avoid improper conversion, 
            // we are adding a new condition that should not accept if the metric is KGS.
            // Same logic is applied in Celsius and Litres as well
            else if (systemInput.contains("g") && !systemInput.contains("kg")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("g", "").trim());
                Double tempResult = tempVar * 0.04;
                System.out.println(tempVar + " g is equal to " + tempResult + " oz");
            }

            // OUNCE TO GRAMS
            else if (systemInput.contains("oz")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("oz", "").trim());
                Double tempResult = tempVar * 28.35;
                System.out.println(tempVar + " oz is equal to " + tempResult + " g");
            }

            // KILO GRAMS TO POUNDS
            else if (systemInput.contains("kg")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("kg", "").trim());
                Double tempResult = tempVar * 2.2;
                System.out.println(tempVar + " kg is equal to " + tempResult + " lbs");
            }

            // POUNDS TO KILO GRAMS
            else if (systemInput.contains("lbs")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("lbs", "").trim());
                Double tempResult = tempVar * 0.45;
                System.out.println(tempVar + " lbs is equal to " + tempResult + " kg");
            }

            // LITRES TO CUPS
            else if (systemInput.contains("l") && !systemInput.contains("lbs")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("l", "").trim());
                Double tempResult = tempVar * 4.17;
                System.out.println(tempVar + " L is equal to " + tempResult + " cups");
            }
            
            // CUPS TO LITRES
            else if (systemInput.contains("cups")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("cups", "").trim());
                Double tempResult = tempVar * 0.24;
                System.out.println(tempVar + " cups is equal to " + tempResult + " L");
            }

            // CELSIUS TO FAHRENHEIT and KELVIN
            else if (systemInput.contains("c") && !systemInput.contains("cups")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("c", "").trim());
                Double tempResultToF = (tempVar * 9/5) + 32;
                Double tempResultToK = tempVar + 273;
                System.out.println(tempVar + " C is equal to " + tempResultToF + " F");
                System.out.println(tempVar + " C is equal to " + tempResultToK + " K");
            }

            // FAHRENHEIT TO CELSIUS and KELVIN
            else if (systemInput.contains("f")){
                Double tempVar = Double.parseDouble(systemInput.replaceAll("f", "").trim());
                Double tempResultToC = (tempVar - 32) * 5/9;
                Double tempResultToK = (tempVar - 32) * 5/9 + 273;
                System.out.println(tempVar + " F is equal to " + tempResultToC + " C");
                System.out.println(tempVar + " F is equal to " + tempResultToK + " K");
            }

            else{
                System.out.println(systemInput + ", Wrong input provided.\nCode Exited");
            }
        }
        s.close();    
    }
        
}