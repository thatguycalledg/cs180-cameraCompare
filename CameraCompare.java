import java.util.Scanner;

/**
 * Project 1 - Camera Comparer
 *
 * Description: This program uses several attributes that 2 cameras possess,
 *              alongside their user rating and price to compare them to each
 *              other, and output to the user, which camera is the better
 *              choice than the other to choose from.
 *
 * @author Gaurang Vinayak, LE2
 *
 * @version January 31st, 2019
 *
 */

public class CameraCompare {

    public static void main(String[] args) {

        boolean hasWiFi1;
        boolean hasWiFi2;
        boolean isWaterResistant1;
        boolean isWaterResistant2;
        boolean hasGPS1;
        boolean hasGPS2;
        boolean hasZoom1;
        boolean hasZoom2;
        String condition1;
        String condition2;
        double price1;
        double price2;
        int userRating1;
        int userRating2;
        int cameraValue1 = 0;
        int cameraValue2 = 0;
        String result = "";
        double epsilon = 0.001;

        Scanner echo = new Scanner(System.in);

        /**
         * Part 1 -- Obtaining Camera Details
         */

        System.out.println("Enter attributes of Camera 1:");  // DO NOT REMOVE THIS LINE
        System.out.println("Is it WiFi enabled? (true/false)");
        hasWiFi1 = echo.nextBoolean();
        System.out.println("Is it water resistant? (true/false)");
        isWaterResistant1 = echo.nextBoolean();
        System.out.println("Is it GPS enabled? (true/false)");
        hasGPS1 = echo.nextBoolean();
        System.out.println("Is the lens able to zoom? (true/false)");
        hasZoom1 = echo.nextBoolean();
        System.out.println("What is the condition? (New/Refurbished/Used)");
        echo.nextLine();
        condition1 = echo.nextLine();
        System.out.println("Enter price from $0.00 to $1000.00");
        price1 = echo.nextDouble();
        price1 = Math.round(price1 * 100.0) / 100.0;
        System.out.println("Enter user rating from 0 to 5");
        userRating1 = echo.nextInt();

        /**
         * DO NOT REMOVE THESE LINES
         */
        System.out.println("======================");
        System.out.println("Enter attributes of Camera 2:");

        System.out.println("Is it WiFi enabled? (true/false)");
        hasWiFi2 = echo.nextBoolean();
        System.out.println("Is it water resistant? (true/false)");
        isWaterResistant2 = echo.nextBoolean();
        System.out.println("Is it GPS enabled? (true/false)");
        hasGPS2 = echo.nextBoolean();
        System.out.println("Is the lens able to zoom? (true/false)");
        hasZoom2 = echo.nextBoolean();
        System.out.println("What is the condition? (New/Refurbished/Used)");
        echo.nextLine();
        condition2 = echo.nextLine();
        System.out.println("Enter price from $0.00 to $1000.00");
        price2 = echo.nextDouble();
        price2 = Math.round(price2 * 100.0) / 100.0;
        System.out.println("Enter user rating from 0 to 5");
        userRating2 = echo.nextInt();

        /**
         * Part 2 -- Computing Camera Values
         */

        cameraValue1 = 0;

        if (hasWiFi1)
            cameraValue1++;

        if (isWaterResistant1)
            cameraValue1++;

        if (isWaterResistant1)
            cameraValue1++;

        if (hasGPS1)
            cameraValue1++;

        if (hasZoom1)
            cameraValue1++;

        if (condition1.equals("New"))
            cameraValue1 += 2;

        else if (condition1.equals("Refurbished"))
            cameraValue1++;

        // CAMERA 2 VALUES

        cameraValue2 = 0;

        if (hasWiFi2)
            cameraValue2++;

        if (isWaterResistant2)
            cameraValue2++;

        if (isWaterResistant2)
            cameraValue2++;

        if (hasGPS2)
            cameraValue2++;

        if (hasZoom2)
            cameraValue2++;

        if (condition2.equals("New"))
            cameraValue2 += 2;

        else if (condition2.equals("Refurbished"))
            cameraValue2++;

        /**
         * Part 3 -- Camera Comparison
         */

        if ((cameraValue1 == cameraValue2) && (userRating1 == userRating2) && (Math.abs(price1 - price2) < epsilon)) {

            result = "Camera 1 and Camera 2 are equal.";

        } else if ((userRating1 == userRating2) && (Math.abs(price1 - price2) < epsilon)) {

            if (cameraValue1 > cameraValue2)
                result = "Camera 1 is better than Camera 2!";

            else
                result = "Camera 2 is better than Camera 1!";

        } else if ((cameraValue1 == cameraValue2) && (Math.abs(price1 - price2) < epsilon)) {

            if (userRating1 > userRating2)
                result = "Camera 1 is better than Camera 2!";

            else
                result = "Camera 2 is better than Camera 1!";

        } else if ((cameraValue1 == cameraValue2) && (userRating1 == userRating2)) {

            if (price1 < price2)
                result = "Camera 1 is better than Camera 2!";

            else
                result = "Camera 2 is better than Camera 1!";

        } else {

            if ((price1 / cameraValue1) < (price2 / cameraValue2))
                result = "Camera 1 is better than Camera 2!";

            else if ((price1 / cameraValue1) > (price2 / cameraValue2))
                result = "Camera 2 is better than Camera 1!";

            else
                result = "Camera 1 and Camera 2 are equal.";
        }

        /**
         * Part 4 -- Comparison Results
         *
         * DO NOT REMOVE THESE LINES
         */

        System.out.println("======================");
        System.out.println("Result of Comparison:");
        System.out.println(result);
    }
}