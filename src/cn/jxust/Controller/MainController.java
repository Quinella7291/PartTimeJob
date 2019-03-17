package cn.jxust.Controller;

import cn.jxust.Service.MainService;
import cn.jxust.pojo.Job;
import cn.jxust.pojo.Message;
import cn.jxust.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MainController {

    @Resource
    private MainService service;

    @RequestMapping("/index")
    public Message index(String type, Integer count) {
        List<Job> jobs = service.getAll(null, 10);
        return new Message(0, jobs);
    }

    @RequestMapping("/detail/{id}")
    public Message detail(@PathVariable Integer id) {
        Job job = service.getDetail(1);
        return new Message(0, job);
    }

    @RequestMapping("/add")
    public Message add(Job job) {
        if (service.add(job)) {
            return new Message(0, "添加信息成功");
        } else {
            return new Message(500, "添加信息失败");
        }
    }

    @RequestMapping("/delete/{id}")
    public Message delete(@PathVariable Integer id) {
        if (service.delete(id)) {
            return new Message(0, "删除信息成功");
        } else {
            return new Message(500, "删除信息失败");
        }
    }

    @RequestMapping("/sendEmail")
    public Message sendEmail(User user) {
        service.sendEmail(user);
        return new Message(0, null);
    }
}
