package cn.jxust.service.serviceImpl;

import cn.jxust.service.MainService;
import cn.jxust.pojo.Job;
import cn.jxust.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!  本类为测试类,需要重新根据业务进行实现!  !!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */

@Service
public class ServiceImpl implements MainService {
    @Override
    public List<Job> getAll(String type, int count) {
        List<Job> jobs = new ArrayList<>();
        Job j1 = new Job();
        Job j2 = new Job();
        j1.setJobName("信息学院打杂");
        j1.setDepartment("信息学院");
        j1.setTeacher("胡老师");
        j1.setEmail("1234567890@qq.com");
        j1.setBrief("能够吃苦耐劳,有经验者优先");
        j1.setId(1);
        j1.setPhone("13488888888");
        j2.setJobName("信息学院码农");
        j2.setDepartment("信息工程学院");
        j2.setTeacher("胡老师");
        j2.setEmail("112233445566@qq.com");
        j2.setBrief("有框架使用者优先");
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
        j1.setDepartment("信息学院");
        j1.setTeacher("胡老师");
        j1.setEmail("1234567890@qq.com");
        j1.setBrief("能够吃苦耐劳,有经验者优先");
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
    public boolean delete(int id) {
        System.out.println("删除兼职信息!!");
        return true;
    }

    @Override
    public void sendEmail(Student user) {
        System.out.println("我发送邮件啦!!!");
    }
}
