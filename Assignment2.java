public class App {
    public static void main(String[] args) throws Exception {

        // FOR LOOP
        for (int firstNameCount = 5; firstNameCount != 0; firstNameCount--) {
            if (firstNameCount == 4) {
                break;
            }

            System.out.println("Leanna");
        }

        // DO WHILE
        int surNameCount = 5;

        do {
            System.out.println("Pillarda");
            surNameCount--;
        } while (surNameCount != 0);

        // WHILE LOOP
        int nickNameCount = 5;
        while (nickNameCount != 0){
            
            nickNameCount--;
            if (nickNameCount == 3) {
                continue;
            }
            System.out.println("F");
           
        }
    }
}
