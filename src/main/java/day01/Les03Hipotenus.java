package day01;

public class Les03Hipotenus {
    /*
      Hipotenüs hesaplayan bir kod yazınız
      Hipotenös formülü: Karekök(a*a + b*b)
   */
    public static void main(String[] args) {
        double a = 8;
        double b = 5;
        double hipotenus = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(hipotenus);
    }
}
