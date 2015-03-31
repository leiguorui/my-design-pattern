package cn.injava.pd.singleton;

/**
 * 非线程安全的懒汉式
 *
 * User: Administrator
 * Date: 15-3-31
 * Time: 上午10:39
 */
public class LazyPresident {
    private static LazyPresident thePresident;

    private LazyPresident() {}

    public static LazyPresident getPresident() {
        if (thePresident == null) {
            thePresident = new LazyPresident();
        }
        return thePresident;
    }
}
