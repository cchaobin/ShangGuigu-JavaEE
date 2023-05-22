package com.atguigu01.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 *
 *
 *
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:10
 * @Version 1.0
 */
//① 创建一个实现Runnable接口的类
class EvenNumberPrint implements Runnable{
//    private double money = 1000;
    //② 实现接口中的run() -->将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {

        for(int i = 1;i <= 100;i += 2){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}

class OddNumberPrint implements Runnable {

    @Override
    public void run() {

        for(int i = 0;i <= 100;i += 2) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class EvenNumberTest {
    public static void main(String[] args) {
        //③ 创建当前实现类的对象
//        EvenNumberPrint p1 = new EvenNumberPrint();
//        OddNumberPrint p2 = new OddNumberPrint();
//        //④ 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
//        Thread t1 = new Thread(p1);
//        Thread t2 = new Thread(p2);
//        Thread t3 = new Thread(p2);
        //⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
        new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0;i <= 100;i += 2) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 1;i <= 100;i += 2) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }

            }
        }).start();
//        t2.start();
//        t3.start();


        //main()方法对应的主线程执行的操作：
//        for(int i = 1;i <= 100;i++){
//            System.out.println(Thread.currentThread().getName() + ":" + i);
//        }

        /*
        * 拓展：再创建一个线程，用于遍历100以内的偶数
        *
        * */
//        Thread t2 = new Thread(p);
//        t2.start();
    }
}
