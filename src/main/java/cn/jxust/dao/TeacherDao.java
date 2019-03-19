package cn.jxust.dao;

import cn.jxust.pojo.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * 负责teacher表的CRUD
 */
public interface TeacherDao {

    /**
     * 添加老师
     *
     * @param teacher teacher
     * @return 添加成功返回true
     */
    @Insert("insert into teacher (teacher_name, teacher_phone, password, email) VALUES (#{name},#{phone},#{password},#{email})")
    @Options(useGeneratedKeys = true)
    boolean addTeacher(Teacher teacher);

    /**
     * 根据id获取老师信息
     *
     * @param id id
     * @return 老师的信息
     */
    Teacher getTheacher(long id);

    /**
     * 修改老师信息
     *
     * @param newTeacher 新的老师信息
     * @return 成功返回true，失败返回false
     */
    boolean alterTheacher(Teacher newTeacher);
}
