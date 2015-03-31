package cn.injava.pd.singleton;

/**
 * 1. 生活中的单例：每个国家都一个总统，当需要总统的时候就会调用总统，
 *    而不是创建新总统，getPresident()方法可以保证只有一个总统
 *
 * 2. Java标准库中的单例：java.lang.Runtime#getRuntime()，返回当前程序的 runtime object
 *
 * 3. 这个是饿汉式，非线程安全的
 *
 * 4. thePresident 被声明为 final ，所以它总是指向同一个对象
 *
 * User: Administrator
 * Date: 15-3-31
 * Time: 上午10:33
 */
public class EagerPresident {
    private static final EagerPresident thePresident = new EagerPresident();

    private EagerPresident() {}

    public static EagerPresident getPresident() {
        return thePresident;
    }
}
