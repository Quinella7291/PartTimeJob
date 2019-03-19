package cn.jxust.dao;

import cn.jxust.pojo.Teacher;

/**
 * 负责teacher表的CRUD
 */
public interface TeacherDao {

    /**
     * 添加老师
     *
     * @param teacher teacher
     * @return 添加成功返回true
     * @throws Exception 添加失败抛出合适的异常
     */
    boolean addTeacher(Teacher teacher) throws Exception;

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
     * @throws Exception 修改失败抛出合适的异常
     */
    boolean alterTheacher(Teacher newTeacher) throws Exception;
}
