import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner program = new Scanner(System.in);

        System.out.print("Nama: ");
        String name = program.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String gender = program.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String dobInput = program.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);

        LocalDate now = LocalDate.now();
        Period period = Period.between(dob, now);

        System.out.println("Nama : " + name);
        System.out.print("Jenis Kelamin :");
        if (gender.equalsIgnoreCase("L")) {
            System.out.print("Laki-laki");
        } else if (gender.equalsIgnoreCase("P")) {
            System.out.print("Perempuan");
        }
        System.out.println();
        System.out.println("Umur Anda :" + period.getYears() + " tahun " + period.getMonths() + " bulan");

    }
}