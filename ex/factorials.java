public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to find the factorial of");
        int x = in.nextInt();
        int total = 0;
        for(int i = 1; i <= x; i++){
            total+= i;
        }
        System.out.println(total);
    }
    
}
