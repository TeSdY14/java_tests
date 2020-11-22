package hellowho;

public class HelloWho {

    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(sayHello(args[0]));
        } else if(args.length == 2) {
            System.out.println(sayHello(args[0], args[1]));
        } else {
            System.out.println(sayHello("World"));
        }


        StringManipulation firstStrManip = new StringManipulation();
        firstStrManip.stringManipOne();

    }

    private static String sayHello(String... input) {
        if (input.length == 2) {
            return "Hello " + input[0] + " - " + input[0] + "!";
        }
        return "Hello " + input[0] + "!";
    }

}