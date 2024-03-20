
import java.util.Scanner;

public class MissionariesAndCannibals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lM = 3; // Left side Missionaries number
        int lC = 3; // Left side Cannibals number
        int rM = 0; // Right side Missionaries number
        int rC = 0; // Right side cannibals number
        int userM;  // User input for number of missionaries for right to left side travel
        int userC;  // User input for number of cannibals for right to left travel
        int k = 0;

        System.out.println("\nGame Start\nNow the task is to move all of them to the right side of the river");
        System.out.println("rules:\n1. The boat can carry at most two people\n2. If cannibals number is greater than missionaries, then the cannibals would eat the missionaries\n3. The boat cannot cross the river by itself with no people on board\n");

        try {
            while (true) {
                while (true) {
                    System.out.println("Left side -> right side river travel");
                    System.out.print("Enter number of Missionaries travel => ");
                    userM = scanner.nextInt();
                    System.out.print("Enter number of Cannibals travel => ");
                    userC = scanner.nextInt();

                    if ((userM == 0 && userC == 0) || ((userM + userC) > 2) || (lM - userM) < 0 || (lC - userC) < 0) {
                        System.out.println("Wrong input re-enter : ");
                    } else {
                        break;
                    }
                }
                lM -= userM;
                lC -= userC;
                rM += userM;
                rC += userC;

                System.out.println("\n");
                for (int i = 0; i < lM; i++) {
                    System.out.print("M ");
                }
                for (int i = 0; i < lC; i++) {
                    System.out.print("C ");
                }
                System.out.print("| --> | ");
                for (int i = 0; i < rM; i++) {
                    System.out.print("M ");
                }
                for (int i = 0; i < rC; i++) {
                    System.out.print("C ");
                }
                System.out.println("\n");

                k++;

                if (((lC == 3) && (lM == 1)) || ((lC == 3) && (lM == 2)) || ((lC == 2) && (lM == 1)) || ((rC == 3) && (rM == 1)) || ((rC == 3) && (rM == 2)) || ((rC == 2) && (rM == 1))) {
                    System.out.println("Cannibals eat missionaries:\nYou lost the game");
                    break;
                }

                if (rM == 3 && rC == 3) {
                    System.out.println("You won the game : \n\tCongrats");
                    System.out.println("Total attempt: " + k);
                    break;
                }
                while (true) {
                    System.out.println("Right side -> Left side river travel");
                    System.out.print("Enter number of Missionaries travel => ");
                    userM = scanner.nextInt();
                    System.out.print("Enter number of Cannibals travel => ");
                    userC = scanner.nextInt();

                    if ((userM == 0 && userC == 0) || ((userM + userC) > 2) || (rM - userM) < 0 || (rC - userC) < 0) {
                        System.out.println("Wrong input re-enter : ");
                    } else {
                        break;
                    }
                }
                lM += userM;
                lC += userC;
                rM -= userM;
                rC -= userC;

                k++;

                System.out.println("\n");
                for (int i = 0; i < lM; i++) {
                    System.out.print("M ");
                }
                for (int i = 0; i < lC; i++) {
                    System.out.print("C ");
                }
                System.out.print("| <-- | ");
                for (int i = 0; i < rM; i++) {
                    System.out.print("M ");
                }
                for (int i = 0; i < rC; i++) {
                    System.out.print("C ");
                }
                System.out.println("\n");

                if (((lC == 3) && (lM == 1)) || ((lC == 3) && (lM == 2)) || ((lC == 2) && (lM == 1)) || ((rC == 3) && (rM == 1)) || ((rC == 3) && (rM == 2)) || ((rC == 2) && (rM == 1))) {
                    System.out.println("Cannibals eat missionaries:\nYou lost the game");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("\nInvalid input please retry !!");
        }
    }
}

