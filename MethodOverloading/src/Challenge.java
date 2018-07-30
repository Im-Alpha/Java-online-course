public class Challenge {
    // Notes for method overloading
    // Method overloading is a feature that allows us to have more
    // than one method with the same name, so long
    // as we use different parameters. It's the ability to create multiple methods of the
    // same name with different implementations.

    public static void main(String[] args) {
        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters
        // feet is the first parameter, inches is the 2nd

        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >= 0 and <= 12
        // return -1 from the method if either of the above is not true

        //If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.


        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >= 0
        // return -1 if it not true
        // But if its valid, then calculate how many feet are in the inches
        // calculated so that it can calculate correctly.
        // hints : Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54 cm and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(157);
        // Possible way for checking parameters instead of
        // Putting invalid in the if statement in the method
        /*
            double centimeters = calcFeetAndInchesToCentimeters(6.0)
            if(centimeters < 0.0){
            System.out.println("Invalid parameters");
            }
         */
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if ((feet < 0) || (inches < 0) || (inches > 12)){
            System.out.println("Invalid feet or inches.");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        System.out.println(feet + " Feet, " + inches + " inches = " + centimeters + " cm");

        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet =(int) inches/12;
        double remainingInches = (int) inches %12;
        System.out.println(inches + " inches is equal to " + feet + " feet and "
                + remainingInches + " inches");

        // The second parameter should be remainingInches
        // If we use Inches then it gets passed to the first method and
        // Shows up to trigger the if statement
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
