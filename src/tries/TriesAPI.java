package tries;

/**
 * Created by kanunso on 2/2/17.
 */
public class TriesAPI {

    public static void main(String args[]) {

        TriesImpl triesImpl = new TriesImpl();
        triesImpl.search("car");
        triesImpl.insert("car");

        boolean f = triesImpl.search("car");
        System.out.println(f);
        triesImpl.insert("card");
        triesImpl.insert("hello");

        boolean g = triesImpl.search("card");
        System.out.println(g);

    }

}
