package base_java.cycles;

public class WhileCycle {
    public static void main(String[] args) throws InterruptedException {
        int x =1;
        while (x<3000){
            x++;
            if (x%2==0){
                continue;
            }
            if(x>50){
                break;
            }
            System.out.println("Hello!"+ x);
            //Thread.sleep(5000);
        }

        for (int i=0; i<=10; i++){
            System.out.println(i);
        }
    }
}
