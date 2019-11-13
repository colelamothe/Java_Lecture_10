public class Main {

    /*
    Inheritance
     */
    public static void main(String[] args){
        Dictionary webster = new Dictionary(1500,52000);

        // Dictionary is a child of books, this means that it carries many
        // of the same methods and properties as books.

        // books defines a getPages method, because dictionary is a book you can call it
        //
        System.out.println("Number of pages: " + webster.getPages());

        System.out.println("Number of definitions: " + webster.getDefinitions());
        System.out.println("Definitions per page: " + webster.computeRatio());


        // this uses the dictionary version of the set pages method
        webster.setPages(125);
    }
}
