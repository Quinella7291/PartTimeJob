package cn.jxust.dao;


import cn.jxust.pojo.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class JobDaoTest extends BaseTest {
    @Autowired
    private TeacherDao dao;

    @Test
    public void testAddTeacher(){
        Teacher teacher = new Teacher();
        teacher.setEmail("1212");
        teacher.setName("我");
        teacher.setPassword("qweqe");
        teacher.setPhone("123123");

        boolean b = dao.addTeacher(teacher);
        Assert.assertTrue(b);
    }
}
