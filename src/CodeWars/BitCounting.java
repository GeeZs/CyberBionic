package CodeWars;

public class BitCounting {
    public static int countBits(int n){
        // Show me the code!
        int count = 0;
        char[] binRepresentation = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < binRepresentation.length; i++) {
            if (binRepresentation[i] == '1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(4));
    }

}
