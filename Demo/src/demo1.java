public class demo1 {
    public static void main(String[] args) {
        String str=new String();
        String str1=new String();
        String str2="aaa";
        String str3="bbb";
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str2==str3);

        //equals 比较的是字符串中的字符，==比较的是地址换而言之比较的就是栈
    }
}
