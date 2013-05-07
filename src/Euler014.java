public class Euler014{
        public static void main(String[] args){
                int mostSteps = 0;
                int numberMostSteps = 0;

                for(int i = 1; i <1000000; i++){
                        int currentsteps = 0;
                        long number = i;
                        while (number!=1){
                                if(number%2==0){
                                        number /= 2;
                                } else {
                                        number = 3*number+1;
                                }
                                currentsteps++;
                        }
                        if (currentsteps > mostSteps){
                                mostSteps = currentsteps;
                                numberMostSteps = i;
                        }
                }

                System.out.println("NUM "+numberMostSteps+":STEPS "+mostSteps);
        }
}