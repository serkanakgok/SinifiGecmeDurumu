import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int tur, mat, fiz, kim, muz;

        Scanner data = new Scanner(System.in);

        System.out.print("Türkçe notunuz :");
        tur = data.nextInt();
        boolean a = 0 <= tur && tur <= 100;

        System.out.print("Matematik notunuz :");
        mat = data.nextInt();
        boolean b = 0 <= mat && mat <= 100;

        System.out.print("Fizik notunuz :");
        fiz = data.nextInt();
        boolean c = 0 <= fiz && fiz <= 100;

        System.out.print("Kimya notunuz :");
        kim = data.nextInt();
        boolean d = 0 <= kim && kim <= 100;

        System.out.print("Müzik notunuz :");
        muz = data.nextInt();
        boolean e = 0 <= muz && muz <= 100;

        if (a && b && c && d && e) {
            double average = (tur + mat + fiz + kim + muz) / 5;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (a && b && c && d) {
            double average = (tur + mat + fiz + kim) / 4;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (a && b && c) {
            double average = (tur + mat + fiz) / 3;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (a && b) {
            double average = (tur + mat) / 2;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (a) {
            int average = tur;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (b && c && d && e) {
            double average = (mat + fiz + kim + muz) / 4;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (b && c && d) {
            double average = (mat + fiz + kim) / 3;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (b && c) {
            double average = (mat + fiz) / 2;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (b) {
            int average = mat;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (c && d && e) {
            double average = (fiz + kim + muz) / 3;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (c && d) {
            double average = (fiz + kim) / 2;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (c) {
            int average = fiz;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (d && e) {
            double average = (kim + muz) / 2;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (d) {
            int average = kim;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else if (e) {
            int average = muz;
            System.out.println((average < 55) ? "Malesef sınıfta kaldınız." : "Tebrikler geçtiniz, ortalamanız :" + average);
        } else {
            System.out.println("Geçerli bir sayı giriniz.");
        }
    }
}
