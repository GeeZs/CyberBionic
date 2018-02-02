package JavaStarter.Loops;

public class App002SumMin {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // First part
        for (int i = a + 1; i < b; i++) {
            System.out.print(i + "  ");

        }
        System.out.println(" - First part.");

        //Second part
        for (int i = a + 1; i < b; i++) {
            if ( (i % 2) != 0){
                System.out.print(i + "  ");
            }
            
        }
        System.out.println(" - Second part.");
        
        
    }
}
