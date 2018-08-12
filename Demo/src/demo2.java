public class demo2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("这是字符流");
        String str="这是字符串";
        StringBuilder st=new StringBuilder();
        st.append("ssss");
        System.out.println(sb+","+str+","+st);
        /*String是字符串常量，一旦创建就不能更改。在不断赋值的过程中其实也是也是不变的
        JVM对于这几行代码是这样处理的，首先创建一个String对象str，并把“abc”赋值给str，
        然后在第三行中，其实JVM又创建了一个新的对象也名为str，然后再把原来的str的值和“de”
        加起来再赋值给新的str，而原来的str就会被JVM的垃圾回收机制（GC）给回收掉了，所以，
        str实际上并没有被更改，也就是前面说的String对象一旦创建之后就不可更改了。
        所以，Java中对String对象进行的操作实际上是一个不断创建新的对象并且将旧的对象回收的一
        个过程，所以执行速度很慢。而StringBuilder和StringBuffer的对象是变量，
        对变量进行操作就是直接对该对象进行更改，而不进行创建和回收的操作，
        所以速度要比String快很多。
        　在线程安全上，StringBuilder是线程不安全的，而StringBuffer是线程安全的,
        因为StingBuff很多方法可以带有synchronized关键字，所以可以保证线程是安全的。
        所以如果要进行的操作是多线程的，那么就要使用StringBuffer，但是在单线程的情况下，
        还是建议使用速度比较快的StringBuilder。
         String：适用于少量的字符串操作的情况
　　      StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况
　　      StringBuffer：适用多线程下在字符缓冲区进行大量操作的情况
        */
    }
}
