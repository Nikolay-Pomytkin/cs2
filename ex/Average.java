public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EasyReader console = new EasyReader(System.in);
        int n = 0;
        char yn;
        double[] scoreAvg = new double[1];
        do{
            System.out.println("What are the 4 test scores for student #" + (n+1));
            double a = console.doubleInput();
            double b = console.doubleInput();
            double c = console.doubleInput();
            double d = console.doubleInput();
            
            double avg = (a+b+c+d)/4;
            scoreAvg[n] = avg;
            System.out.println("Do you want to add another student's scores?");
            yn = console.charInput();
            if(yn == 'y'){
                n++;
                scoreAvg = Arrays.copyOf(scoreAvg, (n+1));
            }
        }while(yn != 'n');
        double sig = 0;
        for(int i = 0; i < scoreAvg.length; i++){
            System.out.println("The average for student " + (i+1) + " is " + scoreAvg[i]);
            sig += scoreAvg[i];
        }
        double finAvg = sig/scoreAvg.length;
        System.out.println("The overall average is " + finAvg);
    }
    
}
