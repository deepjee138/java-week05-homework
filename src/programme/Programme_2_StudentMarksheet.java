package programme;
/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop
 */

import java.util.Scanner;

public class Programme_2_StudentMarksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String name;
        int rollNo;
        int mathMarks, scienceMarks, englishMarks;
        int totalMarks;
        double percentage;
        String result = "";
        String grade = "";

        // Input student name and roll number
        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = scanner.nextInt();

        // Input marks for each subject
        mathMarks = getValidMarks("Math");
        scienceMarks = getValidMarks("Science");
        englishMarks = getValidMarks("English");

        // Calculate total and percentage
        totalMarks = mathMarks + scienceMarks + englishMarks;
        percentage = (totalMarks / 3.0);

        // Determine result and grade based on percentage
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";
        }

        // Print the marksheet
        printMarksheet(name, rollNo, mathMarks, scienceMarks, englishMarks, totalMarks, percentage, result, grade);
    }

    // Method to validate marks input and ensure it's between 0 and 100
    private static int getValidMarks(String subject) {
        Scanner scanner = new Scanner(System.in);
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subject + " (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 and 100.");
            }
        }
        return marks;
    }

    // Method to print the formatted marksheet
    private static void printMarksheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, int totalMarks, double percentage, String result, String grade) {
        System.out.println("\n_____________________________________________ ");
        System.out.println("|                                               |");
        System.out.println("|                Mark Sheet                     |");
        System.out.println("|________________________________________________|");
        System.out.println("| Name       : " + name + "                      |");
        System.out.println("| Roll No    : " + rollNo + "                    |");
        System.out.println("|________________________________________________|");
        System.out.println("| Subjects   : Marks                             |");
        System.out.println("|_________________________________________________|");
        System.out.println("| Math      : " + mathMarks + "                  | ");
        System.out.println("| Science   : " + scienceMarks + "               |");
        System.out.println("| English   : " + englishMarks + "                |");
        System.out.println("|__________________________________________________|");
        System.out.println("| Total     : " + totalMarks + "                   |");
        System.out.println("|___________________________________________________|");
        System.out.println("| Percentage : " + String.format("%.1f", percentage) + " |");
        System.out.println("| Result    : " + result + "                         |");
        System.out.println("| Grade     : " + grade + "                          |");
        System.out.println("|____________________________________________________|");
    }
}



