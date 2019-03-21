package cn.jxust.partTimeJob.dao;

import cn.jxust.partTimeJob.pojo.Job;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解别给我去掉了
@Repository
public interface JobDao {

    /**
     * 根据id获取详细的job
     * @param id id
     * @return job
     */
    @Select("SELECT * FROM job WHERE id=#{id} AND isShow=1")
    Job getJob(int id);

    /**
     * 添加职位，不必含有id
     * @return 返回受影响的行数，默认返回1
     */
    @Insert("INSERT INTO job " +
            "(jobName,detail,address,postTime,jobType,name,phone,email,isShow) " +
            "VALUES (#{jobName},#{detail},#{address},#{postTime},#{jobType},#{name},#{phone},#{email},#{isShow})")
    @Options(useGeneratedKeys = true)
    int addJob(Job job);

    /**
     * 分页方法，没有返回空的list，页数大于实际返回最后一页，页数为负返回第一页
     * @param rowIndex 页码，比如第一页为1
     * @param length 一页有多少行
     * @return 简要信息集合
     */
    List<Job> getPagesBriefJob(@Param("pageNum") int rowIndex,@Param("pageSize") int length);

    /**
     * 根据类型返回简要信息
     * @param type 类型，如果类型为空返回所有类型
     * @return type类型的简要信息
     */
    List<Job> getAllBriefJobByType(@Param("type") String type);

    /**
     * 根据类型获取详细信息，如果类型为空返回所有类型，此方法可删
     */
    List<Job> getAllJobByType(@Param("type") String type);

    /**
     * 获取所有类型的简要信息，可删
     */
    @Select("SELECT id,jobName,address,postTime,jobType,name,phone,email,isShow FROM job WHERE isShow=1")
    List<Job> getAllBriefJob();

    /**
     * 获取所有类型的详细信息，可删
     */
    @Select("SELECT * FROM job WHERE isShow=1")
    List<Job> getAllJob();
}
