import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zeland!",
                "I'm going to visit this wonderful country!", 12);
        Comments c1 = new Comments("Have a nice Trip!");
        Comments c2 = new Comments("Wow that's Awesome!");
        p1.addComment(c1);
        p1.addComment(c2);

        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys!", "See you tomorrow!", 5);
        Comments c3 = new Comments("Good Night!");
        Comments c4 = new Comments("May the Force be with you");
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
