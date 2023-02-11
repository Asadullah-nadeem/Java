package lecture;

import java.util.Scanner;

class Book{
    int id;
    String name;
    Scanner sc;
    Page[] pages;
    class Page{
        int[] lines;
        Page(int numlines){
            lines = new int[numlines];
        }
        void setLines(){
            for(int i = 0; i<lines.length; i++){
                System.out.println("Enter the number of Words For Line " + (i+1) );
                lines[i] = sc.nextInt();
            }
        }
        int getLines(){
            return lines.length;
        }
    }//End of Inner Class Definition
    //outer Class Constructor
    Book(int id, String name, int numpages){
        this.id = id;
        this.name = name;
        sc = new Scanner(System.in);
        pages = new Page[numpages];
        for (int i = 0; i<pages.length; i++){
            System.out.println("Enter Number of Lines for page " + (i+1));
            int nlines = sc.nextInt();
            pages[i] = new Page(nlines);
            pages[i].setLines();
        }
    }
    public int getNumofWords(){
        int numofwords = 0;
        for (int i=0; i<pages.length; i++){
            for(int j=0; j<pages[i].getLines(); j++)
                numofwords += pages[i].lines[j];
        }
        return numofwords;
    }//end of outer class
}
public class BookStatistics {
    public static void main(String[] args) {
        Book b = new Book(1, "Oopm Book", 3);
//        pages
        int nowords = b.getNumofWords();
        System.out.println("Total words = " + nowords);
    }
}