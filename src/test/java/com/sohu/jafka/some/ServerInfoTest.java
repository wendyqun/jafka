package com.sohu.jafka.some;

import com.sohu.jafka.mx.ServerInfo;
import org.junit.Test;

/**
 * @Author Hale Li 2016/9/2
 * @Version 1.0.0
 */
public class ServerInfoTest {

    @Test
    public void testAuth() {
        String version = ServerInfo.class.getPackage().getSpecificationVersion();
        System.out.println(version);
    }
}
