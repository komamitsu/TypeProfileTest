package org.komamitsu.tptest.child;

public class ChildImplA implements Child {
    private int count = 0;

    @Override
    public void exec() {
        count++;
    }

    @Override
    public long getCount() {
        return count;
    }
}

