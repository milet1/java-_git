public class Demo {


    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "1";
        str[1] = "2";
        str[2] = "3";
        str[3] = "4";
        str[4] = "5";
        int b = 0;
        while (b<=2)
            for (String s : str) {
                System.out.println(s);
                if (s == "3") {
                    System.out.println("开始执行continue");
                    continue;

                } else {
                    System.out.println(s + "");
                }

            }
        b+=1;
    }
}
