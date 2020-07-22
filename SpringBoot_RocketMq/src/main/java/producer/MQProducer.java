package producer;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

/**
 * @ClassName MQProducer
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/22 16:32
 * @Version V1.0
 **/
public class MQProducer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("rmq-group");
        producer.setNamesrvAddr("192.168.1.102:9876");
        producer.setInstanceName("producer");
        producer.start();
        int i=0;
        try {
            while (true) {
                Thread.sleep(1000); //每秒发送一次
                Message msg = new Message("itmayiedu-topic", // topic 主题名称
                        "TagA", // tag 临时值
                        ("itmayiedu-" + (i++)).getBytes()// body 内容
                );
                SendResult sendResult = producer.send(msg);
                System.out.println(sendResult.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.shutdown();
    }
}
