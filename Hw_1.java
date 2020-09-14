class Main {
  public static void main(String[] args) {
    System.out.println("Домашняя работа по java");
    System.out.println("Первое задание: Hello world!"); // 1
    int x = 6;
    System.out.println("Второе задание: x=" + x); // 2
    int a = 6;
    int b = a + 1;
    System.out.println("Третье задание: b=" + b); // 3
    int c = 6;
    int d = ++c;
    System.out.println("Третье задание: d=" + d); // 3
    int f = 3;
    int g = 5;
    f = f + g;
    g = g - f;
    g = -g;
    f = f - g;
    System.out.println("Четвертое задание: f=" + f + " g=" + g);// 4
    int a1 = 3;
    int b1 = 5;
    int tmp;
    tmp = a1;
    a1 = b1;
    b1 = tmp;
    System.out.println("Четвертое задание: a1=" + a1 + " b1=" + b1); // 4

    double v = (Math.pow(7, 2));
    double n = (Math.pow(5, 2));
    System.out.print("Пятое задание: ");
    System.out.println((Math.sqrt(v + n))); // 5
    int x1 = 527568;
    x1 = x1 % 10;
    System.out.println(("Шестое задание: x1=" + x1));// 6
    int x2 = 576239;
    x2 = x2 % 100;
    x2 = x2 / 10;
    System.out.println(("Седьмое задание: x2=" + x2));// 7
    int z = 25;
    System.out.println(("Восьмое задание: z=" + z / 10));// 8
    System.out.print("Девятое задание: ");
    System.out.println((Diff(10, 40, 21)));// 9
    System.out.print("Десятое задание: ");
    System.out.println(sr_arefm(5, 15));// 10
    System.out.print("Одиннадцатое задание: ");
    System.out.println(sr_geom(5, 15));// 11
    System.out.print("Двенадцатое задание: ");
    System.out.println(rasstoianie(5, 10, 2, 4));// 12
  }

  public static String Diff(int value1, int value2, int value3) {
    String result = "";
    int value1_1 = 0;
    value1_1 -= value1 - value2;
    value2 -= value3;
    value3 -= value1;
    result += (value1_1 + " " + value2 + " " + value3);
    return result;
  }

  public static double sr_arefm(double value1, double value2) {
    return ((value1 + value2) / 2);
  }

  public static double sr_geom(double base, double base1) {
    double b4 = 0;
    b4 = base * base1;
    return (Math.sqrt(b4));
  }

  public static double rasstoianie(double x1, double x2, double y1, double y2) {
    double resultX;
    double resultY;
    if (x1 > x2) {
      resultX = x1 - x2;
    } else {
      resultX = x2 - x1;
    }

    if (y1 > y2) {
      resultY = y1 - y2;
    } else {
      resultY = y2 - y1;
    }
    resultX = Math.pow(resultX, 2.0);
    resultY = Math.pow(resultY, 2.0);
    double result;
    result = resultY + resultX;
    result = Math.sqrt(result);
    return result;
}
  }
