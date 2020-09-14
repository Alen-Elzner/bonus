public class Main {
    public static void main(String[] args) {
        int refill = 1100;
        int bonus;
        if (refill > 1000){
            bonus =  refill / 100;
        }else {
            bonus = 0;
        }
        int balance = 100;
        int total;
        total = balance + refill + bonus;
        System.out.println(total);
    }
}
