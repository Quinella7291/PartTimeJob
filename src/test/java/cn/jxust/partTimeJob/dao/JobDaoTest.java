package cn.jxust.partTimeJob.dao;

import cn.jxust.partTimeJob.pojo.Job;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;


public class JobDaoTest extends BaseTest {
    @Autowired
    JobDao jobDao;

    @Test
    public void TestGetJob(){
        Job job = jobDao.getJob(1);
        System.out.println(job);
    }

    @Test
    public void addJob(){
        Job job = new Job();
        job.setAddress("江西理工大学");
        job.setDetail("详细信息");
        job.setEmail("2231231@qq.com");
        job.setJobName("搬砖测试");
        job.setName("山水");
        job.setPostTime(new Date().toLocaleString());
        job.setJobType("type1");
        job.setPhone("15607003550");
        jobDao.addJob(job);
        jobDao.addJob(job);
        jobDao.addJob(job);
        jobDao.addJob(job);
    }
    @Test
    public void getPagesBriefJob(){
        List<Job> jobs = jobDao.getPagesBriefJob(2, 6);
        for(Job job:jobs) System.out.println(job);
    }

    @Test
    public void getAllBriefJobByType(){
        List<Job> jobs = jobDao.getAllBriefJobByType("type1");
        for(Job job:jobs) System.out.println(job);
    }

    @Test
    public void getAllBriefJob(){
        List<Job> jobs = jobDao.getAllBriefJob();
        for(Job job:jobs) System.out.println(job);
    }

    @Test
    public void getAllJob(){
        List<Job> jobs = jobDao.getAllJob();
        for(Job job:jobs) System.out.println(job);
    }

    @Test
    public void getAllJobByType(){
        List<Job> jobs = jobDao.getAllJobByType("type1");
        for(Job job:jobs) System.out.println(job);
    }

    @Test
    public void deleteJob(){
        int i = jobDao.deleteJob(1);
        System.out.println(i);
    }
}
