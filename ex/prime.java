public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Type in an integer");
        int x = console.nextInt();
        String a = "Your number is a prime number";
        for(int i = 2; i < x; i++){
            if(x%i == 0){
                a = "Your number is not a prime number";
                break;
            }
        }
        System.out.println(a);
    }
    
}
