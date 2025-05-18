import java.util.ArrayList;

public class Book {

  private String title;

  private String isbn;

  public Integer publicationYear;

    /**
   * 
   * @element-type Author
   */
  public ArrayList<Author> myAuthor;
    /**
   * 
   * @element-type Loan
   */
  public ArrayList<Loan> myLoan;

  public String getTitle() {
    return title;
  }

  public String getIsbn() {
    return isbn;
  }

  public Integer getPublicationYear() {
    return publicationYear;
  }
  public Integer getPublicationYer() {
    return publicationYear;
  }

}