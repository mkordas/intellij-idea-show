package com.michalkordas.intellij.show.first;

interface ImplementMe {
    int thisOne();
}

class YesSir implements ImplementMe {
    @Override
    public int thisOne() {
        return new OhDear().thisOne();
    }
}

class OhDear implements ImplementMe {
    @Override
    public int thisOne() {
        new OneMore();
        return new YesSir().thisOne();
    }
}

class OneMore {
    private ImplementMe here = new ImplementMe() {
        @Override
        public int thisOne() {
            return here.thisOne();
        }
    };
}