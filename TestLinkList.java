public class TestLinkList{
    
    public static void main(String [] args){
        
        LinkList linkList = new LinkList();
        linkList.insertFirstLink("Sample1", 100);
        linkList.insertFirstLink("Sample2", 100);
        linkList.insertFirstLink("Sample3", 100);
        linkList.display();
        
        linkList.removeFirstLink().display();
    }
}