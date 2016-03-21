package com.michalkordas.intellij.show.hidden.place;

import org.junit.Test;

public class NetBeansTest {

    @Test
    public void name() throws Exception {
        new NetBeans();
        NetBeans.findMeIfYouCan();
    }
}