public class FortuneCookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random rm = new Random();
        System.out.println("Type in a max number to generate a random number");
        int max = in.nextInt();
        max -= 1;
        int rmNum = rm.nextInt(max);
        int num = rmNum % 3;
        System.out.println("Your fortune:");
        switch(num){
            case 0:
                System.out.println("You will have a long and happy life");
            case 1:
                System.out.println("You will not have a long an happy life");
            case 2:
                System.out.println("Freak d00d");
        }
        System.out.println("Your luck numbers:");
        for(int i = 0; i < 5; i++){
            System.out.println(rm.nextInt(99));rm.nextInt(99);
        }
    }
    
}
