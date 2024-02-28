import java.util.Scanner;

//catatan jika saat kalian ubah ada yang error berarti yang merah itu harus diubah sesuai dengan teks yang kalian ubah sebelumnya

public class punyaIkha { //ubah nama punyaIkha sesuai nama folder kalian
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in); //ubah pilihan sesuai dengan yang kalian mau
        boolean selesai = false; //ini juga ubah variabel selesai nya

        while (!selesai) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int choice = pilihan.nextInt(); //ubah choice sesuai yang kalian mau

            switch (choice) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    String studentNIM = pilihan.next();
                    if (studentNIM.length() >= 15 && studentNIM.length() <= 15) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String Username = pilihan.next();
                    System.out.print("Enter your password (admin): ");
                    String Password = pilihan.next();
                    if (Username.equals("admin") && Password.equals("admin")) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!!");
                    }
                    break;
                case 3:
                    selesai = true;
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("pilihan tidak tersedia");
            }
        }

    }
}