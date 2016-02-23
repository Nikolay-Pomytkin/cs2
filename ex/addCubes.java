public class Cubes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("What is the number from 1 to n that you want to find the sum of all cubes for?");
        int x = in.nextInt();
        int sumCubes = addCubes(x);
        System.out.println(sumCubes);
    }
    public static int addCubes(int n){
        int sigCubes = 0;
        for(int i = 1; i <= n; i++){
            int cubed = (int)Math.pow(i, 3);
            sigCubes += cubed;
        }
        return sigCubes;
    }
    
}
