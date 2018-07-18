import com.mybatis.mapper.DeptMapper;
import com.mybatis.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class DeptTest {
    private static SqlSessionFactory sqlSessionFactory=null;

    @BeforeClass
    public static void setUpClass() {
        try {
            String resource = "sqlMapConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetDept() {
        SqlSession session=sqlSessionFactory.openSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.getDept(1);
        System.out.println(dept.toString());
    }
}
