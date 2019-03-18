package cn.jxust.dao;

import cn.jxust.pojo.Job;

import java.util.List;

/**
 * 负责job表的CRUD
 */
public interface JobDao {
    Job getJob(int id);

    /**
     * 添加职位
     * @param job job
     * @return 成功返回true，失败返回false
     */
    boolean addJob(Job job);

    /**
     * 获取职位简要信息，job的某些字段可以为空
     * @param id id
     * @return job，没有返回null
     */
    Job getBriefJob(int id);

    /**
     * 获取beginIndex到endIndex的职位信息，包含beginIndex，endIndex
     * 有可能获取不满。如果一行都没有应该返回空的list
     * 每一个job都应该含有id
     * 这个接口是预留接口，如果前端分页，service就用这个接口实现分页
     * @param beginIndex 开始位置
     * @param length 获取多少行数据
     * @return 一组简要信息
     */
    List<Job> getPagesBriefJob(int beginIndex, int length);

    /**
     * 获取所有job信息
     * @return 所有job
     */
    List<Job> getAllBriefJob();
}
