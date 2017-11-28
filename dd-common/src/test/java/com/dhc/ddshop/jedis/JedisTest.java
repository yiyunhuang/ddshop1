package com.dhc.ddshop.jedis;

/**
 * User: DHC
 * Date: 2017/11/20
 * Time: 10:05
 * Version:V1.0
 */
//public class JedisTest {
//
//    @Test
//    public void testJedis01(){
//        Jedis jedis = new Jedis("10.31.161.26", 6379);
//        jedis.set("name", "ddm");
//        System.out.println(jedis.get("name"));
//        jedis.close();
//    }
//
//
//    @Test
//    public void testJedis03(){
//        //创建存放节点的集合
//        Set<HostAndPort> clusterSet = new HashSet<HostAndPort>();
//        clusterSet.add(new HostAndPort("10.31.161.26", 9001));
//        clusterSet.add(new HostAndPort("10.31.161.26", 9002));
//        clusterSet.add(new HostAndPort("10.31.161.26", 9003));
//        clusterSet.add(new HostAndPort("10.31.161.26", 9004));
//        clusterSet.add(new HostAndPort("10.31.161.26", 9005));
//        clusterSet.add(new HostAndPort("10.31.161.26", 9006));
//        //创建jedis集群对象进行使用
//        JedisCluster jedisCluster = new JedisCluster(clusterSet);
//        jedisCluster.set("name", "uuuuu");
//        jedisCluster.hset("content_list", "123456", "{'name':'dhc'}");
//        System.out.println(jedisCluster.get("name"));
//        jedisCluster.close();
//    }
//
//
//}
