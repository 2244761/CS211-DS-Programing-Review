/*
* Name: Sabog, Jazreil Jaron V.
* Date: August 17, 2024
*
* Notes:
* The one-dimensional array is a static linear data structure.
* The one-dimensional array is an implementation of the List ADT.
* The one-dimensional array may be used to hold values/objects
* that are logically arranged in a linear fashion.
* Populating the array(i.e. Putting elements in the array),
* sorting the elements of the array, searching an element from the
* array based on a key, and displaying the elements of the array
* are some of the operations that may be performed on the list.
*
* Objective:
* Create a simple application that uses the one-dimensional array as a data Structure.
* In order to have an exercise on creating implementations of operations,
* a code/program for the method that implements each operation should be written
* rather than using predefined methods of the array (i.e. Do not use pre-defined methods
* for sorting and displaying elements that are predefined in Java).
*
* Activity:
* Create an executable class that applies a Sort Algorithm and a Search algorithm
* on an array of Strings (i.e. names)
*
* In the code( e.g. in the main method), declare a one-dimensional array of String
* such that the array will be populated out of data that are read from a datafile(i.e. textfile).
*
* The class should have a method that populates an array of String out of data that are read
* from a data file. The formal parameters of the method is an array of String and a String
* that represents a filename.
*
* The class should have a method that implements a sort Algorithm(e.g. Selection Sort Algorithm).
* The method for sorting should have a one-dimensional array of String as formal parameter.
*
* The class should have a method that implements a search algorithm(e.g. Linear Search algorithm).
* The method for searching should have a one-dimensional array of String and a search key of type
* String as formal parameters.
*
* The class should have a method that displays the elements of a one-dimensional array.
*
* Let the program show the elements of the array before the sorting happens
*
* Let the program show the elements of the array after sorting
*
* Let the computer accept a string to be searched from the array then let the computer specify
* whether the string is found in the array or not.
*
* Show that sample output/run of the program through multiple line comments in the source file
* ( i.e. After running the programming, copy and paste the output within a comment section of the source code).
*
*
*
*
* */

package prelim.exercises;

import java.io.*;
import java.util.Scanner;

public class SabogJazreilJaronProgrammingExercise1 {
    private Scanner fileReader;

    private String DATAFILE = "/Users/imac03/Documents/2244761/SabogJazreilJaronProgrammingExercise1/src/prelim/exercises/datalist.txt";

    public static void main(String[] args) {
        SabogJazreilJaronProgrammingExercise1 demo;
        try {
            demo = new SabogJazreilJaronProgrammingExercise1();
            demo.run();
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist.");
        } catch (Exception x) {
            x.printStackTrace();
        }
        System.exit(0);
    }

    public void run() throws FileNotFoundException {
        String[] applicants = new String[150];
        populateArray(applicants);

        showElements(applicants);

    }

    public void showElements(String[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }
    }

    public void sort(String[] anArray) {

    }

    public String[] populateArray(String[] anArray) throws FileNotFoundException {
        fileReader = new Scanner(new File(DATAFILE));
        while (fileReader.hasNextLine()) {
            for (int i = 0; i < anArray.length; i++) {
                anArray[i] = fileReader.nextLine();
            }
        }
        fileReader.close();
        return anArray;
    }
}
