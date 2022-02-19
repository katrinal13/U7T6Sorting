import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSortTest
{
  public static void main(String[] args)
  {  
    System.out.println("------- TESTING SELECTION SORT -------");
    ArrayList<String> allWords = new ArrayList<String>();
    
    // load words from words.txt into array list; see helper method below
    loadWordsInto(allWords);
    System.out.println("This list contains " + allWords.size() + " common words");
    
    System.out.println("Unsorted:");
    System.out.println(allWords);
    
    // sort the list with selection sort
    Sort.selectionSortWordList(allWords);
    
    System.out.println("Sorted:");
    System.out.println(allWords);
    
    System.out.println("\n------- TESTING INSERTION SORT -------");
    ArrayList<String> allWords2 = new ArrayList<String>();
    
    // load words from words.txt into array list; see helper method below
    loadWordsInto(allWords2);
    System.out.println("This list contains " + allWords2.size() + " common words");
    
    System.out.println("Unsorted:");
    System.out.println(allWords2);
    
    // sort the list with insertion sort
    Sort.insertionSortWordList(allWords2);
    
    System.out.println("Sorted:");
    System.out.println(allWords2);

    System.out.println("------- TESTING DESCENDING SELECTION SORT (WORDS LIST) -------");
    ArrayList<String> allWords3 = new ArrayList<String>();
    allWords3.add("apple");
    allWords3.add("pineapple");
    allWords3.add("cherry");
    allWords3.add("zebra");
    allWords3.add("chore");
    allWords3.add("goat");

    System.out.println("This list contains " + allWords3.size() + " common words");

    System.out.println("Unsorted:");
    System.out.println(allWords3);

    // sort the list with selection sort
    Sort.selectionSortWordListDescending(allWords3);

    System.out.println("Sorted:");
    System.out.println(allWords3);

    System.out.println("------- TESTING DESCENDING INSERTION SORT (WORDS LIST) -------");
    ArrayList<String> allWords4 = new ArrayList<String>();
    allWords4.add("apple");
    allWords4.add("pineapple");
    allWords4.add("cherry");
    allWords4.add("zebra");
    allWords4.add("chore");
    allWords4.add("goat");

    System.out.println("This list contains " + allWords4.size() + " common words");

    System.out.println("Unsorted:");
    System.out.println(allWords4);

    // sort the list with selection sort
    Sort.insertionSortWordListDescending(allWords4);

    System.out.println("Sorted:");
    System.out.println(allWords4);
  }
  
  // helper method to load words from words.txt
  public static void loadWordsInto(ArrayList<String> wordList)
  {
    try
    {
      Scanner input = new Scanner(new File("src/words.txt"));
      while (input.hasNext())
      {
        String word = input.next();
        wordList.add(word);
      }
    }
    catch (FileNotFoundException ex)
    {
      ex.printStackTrace();
    }
  }
}