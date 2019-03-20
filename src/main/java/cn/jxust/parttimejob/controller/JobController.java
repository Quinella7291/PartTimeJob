package cn.jxust.parttimejob.controller;

import cn.jxust.parttimejob.pojo.Job;
import cn.jxust.parttimejob.pojo.Message;
import cn.jxust.parttimejob.pojo.StudentInfo;
import cn.jxust.parttimejob.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    /**
     * 根据要求获取兼职信息列表,但是不显示兼职详细信息
     *
     * @param type  兼职类型,空为显示全部
     * @param page  当前页数,默认为1
     * @param count 每页显示条数,默认为10
     */
    @RequestMapping("/all")
    public Message all(String type, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer count) {
        List<Job> jobs = jobService.getAll(type, page, count);
        return new Message(0, jobs);
    }

    /**
     * 获取单条兼职信息
     *
     * @param id id号
     */
    @RequestMapping("/detail")
    public Message detail(Integer id) {
        if (id == null) {
            return new Message(500, "缺少参数");
        }
        Job job = jobService.getDetail(id);
        return new Message(0, job);
    }

    /**
     * 增加兼职信息
     *
     * @param job 兼职信息对象
     */
    @RequestMapping("/add")
    public Message add(Job job) {
        if (jobService.add(job)) {
            return new Message(0, "添加信息成功");
        } else {
            return new Message(500, "添加信息失败");
        }
    }

    /**
     * 修改单条兼职信息
     *
     * @param job 兼职信息对象
     */
    @RequestMapping("/update")
    public Message update(Job job) {
        if (job.getId() == 0) {
            return new Message(500, "缺少参数");
        }
        if (jobService.update(job)) {
            return new Message(0, "更新信息成功");
        } else {
            return new Message(500, "更新信息失败");
        }
    }

    /**
     * 删除单条兼职信息
     *
     * @param id id号
     */
    @RequestMapping("/delete")
    public Message delete(Integer id) {
        if (id == null) {
            return new Message(500, "缺少参数");
        }
        if (jobService.delete(1)) {
            return new Message(0, "删除信息成功");
        } else {
            return new Message(500, "删除信息失败");
        }
    }

    /**
     * 发送邮件
     *
     * @param info  用户填写的报名信息
     * @param email 收件人
     */
    @RequestMapping("/sendEmail")
    public Message sendEmail(StudentInfo info, String email) {
        if (jobService.sendEmail(info, email)) {
            return new Message(0, "发送邮件成功");
        } else {
            return new Message(500, "发送邮件失败");
        }
    }
}