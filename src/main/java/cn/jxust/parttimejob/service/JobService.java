package cn.jxust.parttimejob.service;

import cn.jxust.parttimejob.pojo.Job;
import cn.jxust.parttimejob.pojo.StudentInfo;

import java.util.List;

public interface JobService {
    /**
     * 获取所有兼职信息,并根据参数获取不同类型或者不同页数的数据
     * 但不获取兼职的详细信息,减轻服务器压力
     *
     * @param type  兼职类型
     * @param page  当前的页数
     * @param count 每页显示条数
     * @return 兼职信息列表
     */
    List<Job> getAll(String type, int page, int count);

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
     * 修改一条兼职信息
     *
     * @param job 兼职信息实体类
     * @return 是否成功
     */
    boolean update(Job job);

    /**
     * 删除一条兼职信息,应该为逻辑删除,即修改isShow字段
     *
     * @param id id号
     * @return 是否成功
     */
    boolean delete(int id);

    /**
     * 给负责人发送邮件
     *
     * @param info 学生填的报名信息
     * @return 是否成功
     */
    boolean sendEmail(StudentInfo info, String email);
}
