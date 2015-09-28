/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Mark Goktuna.)
 * @version (9/21/2015)
 * 
 * As a side note, I did have around 12 or so commits on my laptop, however it wouldn't let me sync
 * the file when I was finished.  I then transferred the file from my laptop to the PC in the lab
 * and then followed your directions on sakai to get it to work in order to sync and pull.  
 * If you like, I can send you a screen shot showing all my various commits, but I will also ask 
 * you in class about this issue. 
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /*
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = isCourseText;
    }
    
    // This satisfies 2.83
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return author;
    }
    
    /*This satifies 2.85 along with the added pages field at the top. As of now the objects are
     immutable because they cannot be changed unless a new object is created. 
     */
    public int getPages()
    {
        return pages;
    }
    
    //The next two methods satisfy 2.84
    public void printAuthor()
    {
        System.out.println(" " + author);
    }
    
    public void printTitle()
    {
        System.out.println(" " + title);
    }
    
    //This method satisfies 2.86
    //printDetails() was then modified to satisfy 2.88
    public void printDetails()
    {
        System.out.println("***********************");
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        if (refNumber == "")
            System.out.println("Ref #: ZZZ");
        else
           System.out.println("Ref #: " + refNumber);
        System.out.println("# times borrowed: " + borrowed);
        System.out.println("Course text: " + courseText);
        System.out.println("***********************");
    }
    
    //The next two methods satisfy 2.87 along with the added field at the top. 
    //This method was then modified to satisfy 2.89 so that only 3 digits or more are accepted. 
    public void setRefNumber(String ref)
    {
           refNumber = ref;
           if (refNumber.length() < 3)
            {
               System.out.println("Error! Not enough digits!");
               refNumber = "";
            }
           
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    //The next two methods satisfy 2.90 as well as the added field at the top. 
    public void borrow()
    {
        borrowed++;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    //This satisfies 2.91
    public boolean isCourseText()
    {
        if (courseText == true)
           return true;
           else
           return false;
    }

    // Add the methods here ...
}
