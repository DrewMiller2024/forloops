public class forloops
{
    int c = 1;
    int d = -8;

    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("i is "+i);
        }
        for (int j = 10; j != 0; j = j - 2) {
            System.out.println("j="+j);
        }
        for (int k = 10; k != 0; k = k - 3) {
            System.out.println("k="+k);
        }
    }

    public static void main(String[] args)
    {        
        forloops hw = new forloops();
        hw.run();
    }
}