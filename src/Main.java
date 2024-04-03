//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int account = 500;
        int payment = 1200;
        int bonus = (payment / 100);


        if (payment >= 1000) {
            int total = (account + payment + bonus);
            System.out.println("На вашем счету: " + total + " руб.");
            System.out.println("Начислено бонусов: " + bonus + " руб.");
        } else {
            int total = (account + payment);
            System.out.println("На вашем счету: " + total + " руб.");
        }


        //System.out.println("На вашем счету: " + total + " руб.");
    }
    //if (payment >=1000) {
    //int total = (total + bonus);
}

        //if (payment >= 1000) {






