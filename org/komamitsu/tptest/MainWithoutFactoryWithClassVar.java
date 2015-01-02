package org.komamitsu.tptest;
import org.komamitsu.tptest.child.Child;
import org.komamitsu.tptest.child.ChildImplA;
import org.komamitsu.tptest.child.ChildImplB;

public class MainWithoutFactoryWithClassVar {
    private static Child c = new ChildImplA();
    public static void main(String argv[]) {
        for (int i = 0; i < 10000000; i++) {
            c.exec();
        }
        System.out.println(c.getCount());
    }
}
