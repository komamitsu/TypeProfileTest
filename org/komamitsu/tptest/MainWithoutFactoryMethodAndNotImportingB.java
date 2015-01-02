package org.komamitsu.tptest;
import org.komamitsu.tptest.child.Child;
import org.komamitsu.tptest.child.ChildImplA;

public class MainWithoutFactoryMethodAndNotImportingB {
    public static void main(String argv[]) {
        Child c = new ChildImplA();
        for (int i = 0; i < 10000000; i++) {
            c.exec();
        }
        System.out.println(c.getCount());
    }
}
