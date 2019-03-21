package cn.jxust.partTimeJob.pojo;

/**
 * 报名信息实体类
 */
public class StudentInfo {

    private String name; //报名人名字

    private String phone; //报名人电话

    private String classes; //报名人班级

    private String desc; //报名附加信息

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
