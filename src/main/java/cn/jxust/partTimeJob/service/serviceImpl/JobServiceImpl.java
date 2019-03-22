package cn.jxust.partTimeJob.service.serviceImpl;

import cn.jxust.partTimeJob.pojo.Job;
import cn.jxust.partTimeJob.pojo.StudentInfo;
import cn.jxust.partTimeJob.service.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!  本类为测试类,需要根据业务重新进行实现!  !!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */

@Service
public class JobServiceImpl implements JobService {
    @Override
    public List<Job> getAll(String type, int page, int count) {
        List<Job> jobs = new ArrayList<>();
        Job j1 = new Job();
        Job j2 = new Job();
        j1.setJobName("信息学院打杂");
        j1.setAddress("信息学院");
        j1.setName("胡老师");
        j1.setEmail("1234567890@qq.com");
        j1.setId(1);
        j1.setPhone("13488888888");
        j2.setJobName("信息学院码农");
        j2.setAddress("信息工程学院");
        j2.setName("胡老师");
        j2.setEmail("112233445566@qq.com");
        j2.setId(2);
        j2.setPhone("13466666666");
        jobs.add(j1);
        jobs.add(j2);
        return jobs;
    }

    @Override
    public Job getDetail(int id) {
        Job j1 = new Job();
        j1.setJobName("信息学院打杂");
        j1.setAddress("信息学院");
        j1.setName("胡老师");
        j1.setEmail("1234567890@qq.com");
        j1.setId(1);
        j1.setPhone("13488888888");
        return j1;
    }

    @Override
    public boolean add(Job job) {
        System.out.println("增加兼职信息!!");
        return true;
    }

    @Override
    public boolean update(Job job) {
        System.out.println("修改兼职信息!!");
        return true;
    }

    @Override
    public boolean delete(int id) {
        System.out.println("删除兼职信息!!");
        return true;
    }

    @Override
    public boolean sendEmail(StudentInfo info, String email) {
        System.out.println("我发送邮件啦!!!");
        return true;
    }
}
