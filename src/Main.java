public class Main {
public static void main(String[] args) {
    System.out.println(missingChar("kitten", 1));
    System.out.println(missingChar("kitten", 0));
    System.out.println(missingChar("kitten", 4));
    System.out.println(missingChar("kitten", 5));

    System.out.print(sumDouble(1, 2));
    System.out.print(sumDouble(3, 2));
    System.out.print(sumDouble(2, 2));

    System.out.println(intMax(1, 2, 3));
    System.out.println(intMax(1, 3, 2));
    System.out.println(intMax(3, 2, 1));

    System.out.println(nearHundred(93));
    System.out.println(nearHundred(90));
    System.out.println(nearHundred(89));

    System.out.println(notString("candy"));
    System.out.println(notString("x"));
    System.out.println(notString("not bad"));

    System.out.println(oddNumber(52));
    System.out.println(oddNumber(53));

}
public static String missingChar(String string, int index) {
    String part1 = string.substring(0, index);
    String part2 = string.substring(index + 1);
    return part1 + part2;
}

public static int sumDouble(int num1, int num2){
  if (num1 == num2) {
      return (num1 + num2) * 2;
  }
  return num1 +num2;
  }
    public static int intMax(int a, int b, int c) {
        int max1 = Math.max(a, b);
        return Math.max(max1, c);

    }
    public static boolean nearHundred(int n) {
        int diffFrom100 = Math.abs(100 - n);
        int diffFrom200 = Math.abs(200 - n);
        return (diffFrom100 <= 10 || diffFrom200 <= 10);
    }

    public static String notString(String string) {
        if (string.startsWith("not")) {
            return string;
        }
        return "not " + string;
    }
    public static boolean oddNumber(int x){
        return x % 2 == 0;
    }
}


