import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author mObama = new Author("Michelle", "michelleObama@gmail.com", 'M');
        Author bObama = new Author("Barrack Obama", "bObama@gmail.com", 'M');
        Author jBiden = new Author("Joe Biden", "jBiden@gmail.com", 'M');

        Author[] authors = new Author[3];
        authors[0] = mObama;
        authors[1] = bObama;
        authors[2] = jBiden;

        Book becoming = new Book("4RCH173CH13", "Becoming", authors, 3360.5, 500);

        System.out.println(becoming);
        System.out.println("____________");
        becoming.setPrice(4500);
        becoming.setQty(50);

        System.out.println(becoming);

        System.out.println("price is: " + becoming.getPrice());
        System.out.println("qty is: " + becoming.getQty());
        System.out.println("Author is: " + Arrays.toString(becoming.getAuthor()));  // Author's toString()
        System.out.println("Authors are : " + becoming.getAuthorsName());

       System.out.println("Authors' emails are: " + becoming.getAuthorsEmail());


    }
}
