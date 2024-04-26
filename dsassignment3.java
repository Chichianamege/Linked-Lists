// Name: Chidera Anamege
// Class: CS 3305/ W01
// Term: Spring 2024
// Instructor: Carla McManus
// Assignment: 3 – Part 1 Iterator

import java.util.LinkedList;

public class dsassignment3 {
    public static void main(String[] args) {
        // I created a linked list with the given numbers from the assignment
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        // this will print out the linked list
        System.out.println("List " + linkedList);

        // test for the printRange method
        printRange(linkedList, 2, 5);
        printRange(linkedList, 2, 78);
        printRange(linkedList, 2, 1);
        printRange(linkedList, 8, 5);

        // test the removeRepetitions method
        removeRepetitions(linkedList);

        // print the linked list after removing repetitions
        System.out.println("List: " + linkedList);
    }

    public static void printRange(LinkedList<Integer> list, int x, int y) {
        // print the list along with parameters x and y
        System.out.println("List " + list + "\t\t// x = " + x + "\ty = " + y);

        boolean isPrinted= false;

        // this will be a iteration through the list
        for (int num : list) {
            // check if the current number is equal to x
            if (num == x) { isPrinted= true;
            }

            // this will print the number if conditions are met
            if (isPrinted&& num != y) { System.out.print(num + "\t");
            }

            // check if the current number is equal to y
            if (isPrinted&& num == y) { isPrinted= false; break;
            }
        }

        System.out.println();  // move to the next line after printing
    }

    // removeRepetitions method
    public static void removeRepetitions(LinkedList<Integer> list) {
        // print a message before removing duplicates
        System.out.println("\nAfter eliminating duplicates: ");

        // iterate through the list
        for (int i = 0; i < list.size(); i++) { int x= list.get(i);

            // iterate through the list again
            for (int j = i + 1; j < list.size(); j++) { int y= list.get(j);

                // check if two numbers are equal
                if (x== y) { list.remove(j);j--;
                }
            }
        }
    }
}
