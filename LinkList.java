public class LinkList{
    
    private Link firstLink;
    
    public LinkList(){
        this.firstLink = null;
    }
    
    public void insertFirstLink(String bookName, int copies){
        Link newLink = new Link(bookName, copies);
        newLink.next = firstLink;
        firstLink = newLink;
    }
    
    public boolean isEmpty(){
        if(null == firstLink){
            return true;
        }else {
            return false;
        }
    }
    public void display(){
        Link theLink = firstLink;
        while(theLink != null){
            theLink.display();
            theLink = theLink.next;
        }
    }
    public Link removeFirstLink(){
        if(isEmpty()){
            return null;
        }
        Link referenceLink = firstLink;
        firstLink = firstLink.next;
        return referenceLink;
        
    }
}