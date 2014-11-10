package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/10/28
 * Time: 9:24
 */
public class MybatisUtil {
    private static SqlSessionFactory factory;
    private MybatisUtil(){}
    static {
        Reader reader = null;
        try{
            reader = Resources.getResourceAsReader("mybatis_config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        factory = new SqlSessionFactoryBuilder().build(reader);
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return factory;
    }
}
