public class Link{

     private String bookName;
     private int copies;
     public Link next;
     
     public Link(String bookName, int copies){
         this.bookName = bookName;
         this.copies = copies;
     }
     
     public void display(){
         System.out.println(this.bookName + " : "+this.copies);
     }
     
     public String toString(){
         return this.bookName;
     }
}
