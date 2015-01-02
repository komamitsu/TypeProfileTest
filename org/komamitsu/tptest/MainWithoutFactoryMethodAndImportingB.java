package org.komamitsu.tptest;
import org.komamitsu.tptest.child.Child;
import org.komamitsu.tptest.child.ChildImplA;
import org.komamitsu.tptest.child.ChildImplB;

public class MainWithoutFactoryMethodAndImportingB {
    public static void main(String argv[]) {
        Child c = new ChildImplA();
        for (int i = 0; i < 10000000; i++) {
            c.exec();
        }
        System.out.println(c.getCount());
    }
}
