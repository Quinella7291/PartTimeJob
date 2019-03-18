package cn.jxust.service;

import cn.jxust.pojo.Job;
import cn.jxust.pojo.Student;

import java.util.List;

public interface MainService {
    /**
     * 获取所有兼职信息
     *
     * @param type  兼职类型
     * @param count 显示条数
     * @return 所有兼职信息
     */
    List<Job> getAll(String type, int count);

    /**
     * 获取单条兼职信息详情
     *
     * @param id id号
     * @return 单条兼职信息
     */
    Job getDetail(int id);

    /**
     * 添加兼职信息
     *
     * @param job 兼职信息实体类
     * @return 是否成功
     */
    boolean add(Job job);

    /**
     * 删除一条兼职信息
     *
     * @param id id号
     * @return 是否成功
     */
    boolean delete(int id);

    /**
     * 给老师发送邮件
     *
     * @param user 学生填的信息
     */
    void sendEmail(Student user);
}
