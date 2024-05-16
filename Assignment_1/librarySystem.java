
abstract class LibraryResource{
	private String title;
	private String Author;
	LibraryResource(String title, String Author){
		this.title=title;
		this.Author=Author;
	}
 public String gettitle() {
	 return title;
 }
 public void settitle(String title) {
	 this.title=title;
 }
 public String getAuthor() {
	 return Author;
 }
 public void setAuthor(String Author) {
	 this.Author=Author;
 }
 void display() {
 }
}

 class Book extends LibraryResource{
	int pagecount;
	Book(String title,String Author,int pagecount){
	super (title, Author);
		this.pagecount=pagecount;
	}
	 public int getpagecount() {
		 return this.pagecount;
	 }
	 public void setpagecount(int pagecount) {
		 this.pagecount=pagecount;
	 }
	 @Override
	 public void display() {
		 System.out.println("Book title"+ gettitle());
		 System.out.println("Book Author"+ getAuthor());
		 System.out.println("Book title"+ getpagecount());	 
	 }
 }
	 class Magazine extends LibraryResource{
		 int issueDate;
		 Magazine(String title,String Author,int issueDate){
			 super(title,Author);
			 this.issueDate=issueDate;
		 }
		 public int getissueDate() {
			 return this.issueDate;
		 }
		 public void setissueDate(int issueDate) {
			 this.issueDate=issueDate;
		 }
		 @Override
		 void display() {
			 System.out.println("Book title"+ gettitle());
			 System.out.println("Book Author"+ getAuthor());
			 System.out.println("Book title"+ getissueDate());	 
		 }

	 }
	 class Dvd extends LibraryResource{
		 int duration;
		 Dvd(String title,String author,int duration){
			 super(title,author);
			 this.duration=duration;
		 }
		 public int getduration() {
			 return this.duration;
		 }
		 public void setduration(int duration) {
			 this.duration=duration;
		 }
@Override
      void display() {
	 System.out.println("Book title"+ gettitle());
	 System.out.println("Book Author"+ getAuthor());
	 System.out.println("Book title"+ getduration());	 

}

		 
	 }
 

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book book = new Book("Java Programming", "John Doe", 500);
        Magazine magazine = new Magazine("National Geographic", "Various Authors", 2);
        Dvd dvd = new Dvd("Inception", "Christopher Nolan", 148);
        book.display();
        magazine.display();
        dvd.display();
	}

}

