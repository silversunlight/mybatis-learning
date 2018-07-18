import com.mybatis.mapper.EmpMapper;
        import com.mybatis.pojo.Emp;
        import org.apache.ibatis.io.Resources;
        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;
        import org.apache.ibatis.session.SqlSessionFactoryBuilder;
        import org.junit.BeforeClass;
        import org.junit.Test;

        import java.io.IOException;
        import java.io.Reader;
        import java.util.List;

public class EmpTest {
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
    public void testGetEmpsByDeptno() {
        SqlSession session=sqlSessionFactory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.getEmpsByDeptno(2);
        for (Emp emp : emps) {
            System.out.println(emp.toString());
        }
    }

    @Test
    public void testGetEmpByEmpno() {
        SqlSession session=sqlSessionFactory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpno(1);
        System.out.println(emp.toString());
    }
}
