package org.komamitsu.tptest;
import org.komamitsu.tptest.child.Child;
import org.komamitsu.tptest.child.ChildImplA;
import org.komamitsu.tptest.child.ChildImplB;

public class MainWithoutFactoryMethodWithBranch {
    public static void main(String argv[]) {
        Child c = (System.currentTimeMillis() % 2 == 0)? new ChildImplA() : new ChildImplB();
        for (int i = 0; i < 10000000; i++) {
            c.exec();
        }
        System.out.println(c.getCount());
    }
}
