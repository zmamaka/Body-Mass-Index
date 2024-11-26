import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float height, mass;
        double index;

        System.out.print("Boyunuzu metre cinsinden giriniz => ");
        height = input.nextFloat();

        System.out.print("Kilonuzu kilogram cinsinden giriniz => ");
        mass = input.nextFloat();

        index = mass / (height * height);

        System.out.println("Vücut kitle indeksiniz => " + index);

    }
}
