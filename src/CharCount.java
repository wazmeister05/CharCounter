public class CharCount {

    public static void main(String[] args){
        int[] charCounts = new int[256];

        String hello = "Hello";

        for (int i = 0; i < hello.length(); i++){
            charCounts[hello.charAt(i)]++;
        }

        for (int i = 0; i < charCounts.length; i++){
            System.out.println((char)i + ": " + charCounts[i]);
        }
    }

}
