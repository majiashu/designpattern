package cn.majs.singletonpattern;

/**
 * @program designpattern
 * @description: 单例懒加载模式  线程不安全
 *
 * @author: mac
 * @create: 2020/08/24 15:57
 */
public class SingletonLazy {

    private SingletonLazy(){};

    private static SingletonLazy instance = null;

    public static SingletonLazy getInstance(){
        if(instance == null ){
            instance = new SingletonLazy();
        }
        return  instance;
    }

}
