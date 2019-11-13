public class Books {

    protected int pages = 1500; // similar to private variables but can be accessed by child objects
    // private vars cannot be called by an inherited class
    // public vars can, but violates encapsulation

    // basic constructor for the books class. normally not available to child
    // objects but can be called using the super operator
    public Books(int numPages){
        pages = numPages;
    }

    // a method in a parent object can be called by a child object
    public void setPages (int numPages){
        System.out.println("original");
        pages = numPages;
    }

    public int getPages(){
        return pages;
    }
}
