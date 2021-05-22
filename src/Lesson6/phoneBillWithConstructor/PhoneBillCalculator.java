package Lesson6.phoneBillWithConstructor;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill(100, 10,500 ,20,5,0  );
        System.out.println("you have to pay :" + phoneBill.getPhoneBill());
    }
}
