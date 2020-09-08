package cn.majs.singletonpattern;

/**
 * @program designpattern
 * @description:
 *  单例 双检锁
 * @author: mac
 * @create: 2020/08/24 16:04
 */
public class SingletonDoubleLock {
    private volatile static SingletonDoubleLock instance;

    private SingletonDoubleLock(){}
    public static SingletonDoubleLock getInstance(){
        if(instance == null){
            synchronized (SingletonDoubleLock.class){
                if(instance == null){
                    instance = new SingletonDoubleLock();
                }

            }
        }
        return instance;
    }

}
