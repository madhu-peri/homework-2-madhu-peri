/**
 * Starter code for homework 2 Problem 2 - CIS 2348
 * Name: Madhumitha Periyasamy
 * PS: 1595200
 */

import java.util.Scanner;

public class DrawPattern {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth = 0;
        int i = 0;

        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();

        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        while (arrowHeadWidth<= arrowBaseWidth) {
        System.out.println("Enter arrow head width:");
            arrowHeadWidth = scnr.nextInt();
        }

        String star = "";
        for (int x = 1; x <= arrowBaseWidth; x++)
        {
            star += "*";
        }

        for (i = 1; i <= arrowBaseHeight; ++i)
        {
            System.out.println(star);
        }

        int tempHeadWidth = arrowHeadWidth;

        for (int y = 1; y <= arrowHeadWidth; y++)
        {
            for(int z = tempHeadWidth; z > 0; z--)
            {
                System.out.print("*");
            }
            tempHeadWidth -= 1;
            System.out.println();
        }
    }
}
