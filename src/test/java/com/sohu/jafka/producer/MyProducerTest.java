package com.sohu.jafka.producer;

import com.sohu.jafka.producer.serializer.StringEncoder;
import org.junit.Test;

import java.util.Properties;

/**
 * @Author Hale Li 2016/8/28
 * @Version 1.0.0
 */
public class MyProducerTest {
    @Test
    public void sendMsg() throws Exception{
        //
        Properties props = new Properties();
        //props.put("broker.list", "0:192.168.157.128:9092");
        props.put("broker.list","0:127.0.0.1:9092:3");
        props.put("serializer.class", StringEncoder.class.getName());
        //
        ProducerConfig config = new ProducerConfig(props);
        final Producer<String, String> producer = new Producer<String, String>(config);
        try {
            long start = System.currentTimeMillis();
            //
            StringProducerData data = new StringProducerData("lgq");
            for(int  i=0;i<12;i++){
                data.add("0123456789");
            }
            producer.send(data);
            producer.close();
            long cost = System.currentTimeMillis() - start;
            System.out.println("send 100000 message cost: "+cost+" ms");
        } finally {
            //producer.close();
        }
    }
}
