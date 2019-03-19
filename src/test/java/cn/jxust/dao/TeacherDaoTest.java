package cn.jxust.dao;


import cn.jxust.pojo.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TeacherDaoTest extends BaseTest {

    @Autowired
    private TeacherDao teacherDao;

    @Test
    public void testAddTeacher(){
        Teacher teacher = new Teacher();
        teacher.setEmail("1212");
        teacher.setName("我");
        teacher.setPassword("qweqe");
        teacher.setPhone("123123");

        boolean b = teacherDao.addTeacher(teacher);
        Assert.assertTrue(b);
    }
}
