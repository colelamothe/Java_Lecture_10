public class Dictionary extends Books{ // using the extends command makes this a child of books
    // being a child of books means this class has access to the methods and vars
    // of the books class while also having its own methods and such.
    private int definitions = 52500;


    // standard constructor for a dictionary object.
    // a dictionary has pages and definitions
    // since the parent object can define pages we will use that
    public Dictionary(int numPages, int numDef){

        // The super reference calls the default constructor of the parent
        // and passes the parameters as needed for that definition
        // this is mostly equivalent to calling the constructor directly
        super(numPages);
        definitions = numDef;
    }

    // a child object can override the method definition in the parent
    // this is dependant on where it is called from.
    // calling dictionary.setPages() would call this version not the parent
    public void setPages (int numPages){
        System.out.println("Overridden");
        pages = numPages;
    }

    public double computeRatio(){
        return (double)definitions/pages;
    }

    public void setDefinitions(int numDefinitions){
        definitions = numDefinitions;
    }

    public int getDefinitions(){
        return definitions;
    }
}
