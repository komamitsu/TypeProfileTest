package org.komamitsu.tptest;

public class MainWithFactoryMethodWitioutImport {
    public static void main(String argv[]) {
        org.komamitsu.tptest.child.Child c = createChild();
        for (int i = 0; i < 10000000; i++) {
            c.exec();
        }
        System.out.println(c.getCount());
    }

    private static org.komamitsu.tptest.child.Child createChild() {
        return new org.komamitsu.tptest.child.ChildImplA();
    }
}
