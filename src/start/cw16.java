package start;

public class cw16 {
    public static void main(String[] args) {

        double signal [] = {0.33, 33.2, 98.334, 3.55, 999.5, 0.33};

        System.out.println("signal[0] = " + signal[0]);
        System.out.println("signal[1] = " + signal[1]);
        System.out.println("signal[2] = " + signal[2]);
        System.out.println("signal[3] = " + signal[3]);
        System.out.println("signal[4] = " + signal[4]);
        System.out.println("signal[5] = " + signal[5]);
        signal[4]=0;
        for (int i = 0; i< signal.length; i++) {
            System.out.println("signal["+i+"] =  "+ signal[i]);
        }

        System.out.println("Długość sygnału " + signal.length);

       // String names[]= new String[150];
        for (double s : signal){
            System.out.println(s);
            }
        }

    }

