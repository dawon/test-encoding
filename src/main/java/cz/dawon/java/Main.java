package cz.dawon.java;

public class Main {
    public static void main(String[] args) {
        String testAccented = "ÒòÑñ";
        String output = "";
        for (byte b : testAccented.getBytes()) {
            output += Integer.toHexString(b & 0xFF) + ", ";
        }
        System.out.println(output); // c3, 92, c3, b2, c3, 91, c3, b1,
        System.out.println("\u0416");
        System.out.println(testAccented);
    }
}
