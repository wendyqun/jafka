package com.sohu.jafka.consumer;

import com.sohu.jafka.api.FetchRequest;
import com.sohu.jafka.message.MessageAndOffset;
import com.sohu.jafka.utils.Utils;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author Hale Li 2016/8/28
 * @Version 1.0.0
 */
public class MyConsumerTest {
    @Test
    public void consumer() throws IOException {
        //SimpleConsumer consumer = new SimpleConsumer("192.168.157.128", 9092);
        SimpleConsumer consumer = new SimpleConsumer("127.0.0.1", 9092);
        long offset = 34;
        while (true) {
            FetchRequest request = new FetchRequest("demo", 0, offset);
            for (MessageAndOffset msg : consumer.fetch(request)) {
                System.out.println(Utils.toString(msg.message.payload(), "UTF-8"));
                offset = msg.offset;
            }
        }
    }
}
