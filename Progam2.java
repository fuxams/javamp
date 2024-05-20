package java lab programs;

public class progam2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int speed[] = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("\n Enter speed of racers "+(i+1)+":");
            speed[i] = sc.nextInt();
        }
    }
}
