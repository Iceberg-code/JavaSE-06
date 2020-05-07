package cn.itcast.day06.demo05;

public class Zi extends Fu {

    @Override
    public String method(){     //子类的String返回值类型比父类的Object返回值类型范围小,所以可以。
                                // 子类写为Object返回值类型也可以，与父类的返回值类型一样大
        return null;
    }
}
