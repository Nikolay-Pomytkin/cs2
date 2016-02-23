public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Up to which number of the fibonacci sequence do you want to seem (greater than 0)?");
        int max = console.nextInt();
        int a = 1;
        int b = 0;
        int c;
        String out = "1, ";
        for(int i = 1; i < max; i++){
            c = a+b;
            b = a;
            a = c;
            if((i+1) != max){
                out += c + ", ";
            }
            else{
                out += c;
            }
        }
        if(max == 1){
            System.out.println("1");
        }
        else if(max > 1){
            System.out.println(out);
    
        }
        else{
            throw new IllegalArgumentException("That is not a valid number");
        }
    }
}
