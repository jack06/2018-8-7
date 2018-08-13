public class demo3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始");
        Thread.sleep(6000);//程序暂停。休眠状态
        System.out.println(Thread.currentThread()); //输出当前线程
        Thread thread = new Thread() {   //创建一个新线程
            @Override
            public void run() {
                System.out.println("新线程");
            }
        };
        thread.start(); //新线程开始执行
        System.out.println("继续");
    }
}
