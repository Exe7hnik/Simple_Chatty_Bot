package bot;

import java.util.Scanner;

class Questions {
    int value;
    String question;
    boolean isRightAnswer;

    Questions (int value, String question, boolean isRightAnswer) {
        this.value = value;
        this.question = question;
        this.isRightAnswer = isRightAnswer;
    }

    public boolean getRightAnswer () {
        return this.isRightAnswer;
    }

}

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        Questions ob1 = new Questions(1,"To repeat a statement multiple times.", false);
        Questions ob2 = new Questions(2,"To decompose a program into several small subroutines.", true);
        Questions ob3 = new Questions(3,"To determine the execution time of a program.", false);
        Questions ob4 = new Questions(4,"To interrupt the execution of a program.", false);


        Questions arr[] = new Questions[4];
        arr[0] = ob1;
        arr[1] = ob2;
        arr[2] = ob3;
        arr[3] = ob4;

        boolean find = false;

        while (find != true) {
            int userAnswer = scanner.nextInt();
            if (arr[userAnswer].getRightAnswer() == true ) {
                System.out.println("Congratulations, have a nice day!");
                find = true;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
