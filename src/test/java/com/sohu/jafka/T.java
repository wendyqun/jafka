package com.sohu.jafka;

import org.junit.Test;

/**
 * @Author Hale Li 2016/9/21
 * @Version 1.0.0
 */
public class T {
    @Test
    public void testReadFrom() {
        final byte MAGIC_OFFSET = 11;

        final byte MAGIC_LENGTH = 22;

        final byte ATTRIBUTE_OFFSET=MAGIC_LENGTH + MAGIC_OFFSET;

        System.out.println(Integer.toHexString(ATTRIBUTE_OFFSET & 0xFF));

    }
}
