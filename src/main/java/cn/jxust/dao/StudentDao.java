package cn.jxust.dao;

import cn.jxust.pojo.Student;

/**
 * 负责student表的CRUD
 * 一下方法的boolean参数，一般都是返回true。
 * 如果数据库出错，会直接抛出异常，一般没有返回false的机会
 * service可以选择性的判断boolean返回值
 */
public interface StudentDao {
    /**
     * 添加学生
     *
     * @param student 学生，不必包含id
     * @return 成功返回true，失败返回false
     */
    boolean addtStudent(Student student);

    /**
     * 根据id获取学生
     *
     * @param id 微信id
     * @return 学生资料，如果不存在可以返回null
     */
    Student getStudent(int id);

    /**
     * 修改学生id
     *
     * @param newStudent 新的学生信息
     */
    boolean alterStudent(Student newStudent);

}
