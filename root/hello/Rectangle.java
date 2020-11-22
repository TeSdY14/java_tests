package hello;

public class Rectangle {

    public int width=4;
    private int borderWidth=1;

    public static void main(String[] args) {
        int mainWidth=28;
    }

    public void printValues() {
        final int newWidth=12;
        Rectangle rectangle = new Rectangle();
        if (true) {
            int pixelSize=5;
        }
        // Les variables qui peuvent être utilisées ici ?
        System.out.println("newWidth : " + newWidth);
        System.out.println("width : " + width);
        System.out.println("rectangle.width : " + rectangle.width);
        System.out.println("borderWidth : " + borderWidth);
        System.out.println("rectangle.borderwidth : INACCESSIBLE => \r\n " +
                "java: cannot find symbol\n" +
                "  symbol:   variable borderwidth\n" +
                "  location: variable rectangle of type hello.Rectangle");
        System.out.println("pixelSize : INACCESSIBLE => \r\n " +
                "java: cannot find symbol\n" +
                "symbol:   variable pixelSize\n" +
                "location: class hello.Rectangle");
    }

}
