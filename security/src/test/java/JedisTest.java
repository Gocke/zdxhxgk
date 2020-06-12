import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {

    /**
     * 使用个人腾讯连接池
     */
    @Test
    public void testRedis(){
        //1.设置连接池的配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        //设置池中最大连接数
        config.setMaxTotal(50);
        //设置空闲时池中保有的最大连接数
        config.setMaxIdle(10);
        //2.设置连接池对象
        JedisPool pool = new JedisPool(config,"118.89.113.147",3307,45,"redis@3307");
        //3.从池中获取连接对象
        Jedis jedis = pool.getResource();
        //4.连接归还池中
        jedis.close();

    }
}