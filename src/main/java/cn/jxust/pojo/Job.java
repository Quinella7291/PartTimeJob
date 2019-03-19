package cn.jxust.pojo;

/**
 * 兼职信息实体类
 */
public class Job {

    private int id;

    private String jobName; //职称名字

    private String department; //发布部门

    private String pressTime; //发布时间

    private String detail; //职位描述

    private String brief; //职位简要描述

    private String teacher; //联系老师名字

    private String phone; //联系老师电话

    private String email; //联系老师邮箱

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPressTime() {
        return pressTime;
    }

    public void setPressTime(String pressTime) {
        this.pressTime = pressTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobName='" + jobName + '\'' +
                ", department='" + department + '\'' +
                ", pressTime='" + pressTime + '\'' +
                ", detail='" + detail + '\'' +
                ", brief='" + brief + '\'' +
                ", teacher='" + teacher + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
