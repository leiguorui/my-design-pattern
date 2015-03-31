package cn.injava.pd.singleton;

/**
 * 这是枚举实现的单例
 *
 * As private constructor doesn't protect from instantiation via reflection,
 * Joshua Bloch (Effective Java) proposes a better implementation of Singleton.
 * If you are not familiar with Enum, here is a good example from Oracle.
 *
 * User: Administrator
 * Date: 15-3-31
 * Time: 上午10:48
 */
public enum EnumPresident {
    INSTANCE;

    public static void doSomething(){
        //do something
    }
}
