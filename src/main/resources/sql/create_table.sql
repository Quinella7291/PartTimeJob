# version 1.0
# 推荐使用datagrip
# 如果逗号变红，请更改方言为mysql
CREATE DATABASE IF NOT EXISTS meng;
USE meng;

CREATE TABLE IF NOT EXISTS student(
  # 这个字段由于学生会用微信登陆，所以这里直接用微信的uuid
  id INT PRIMARY KEY ,
  name VARCHAR(10),
  classes VARCHAR(20),
  phone VARCHAR(11),
  email VARCHAR(30)
);


# 后台管理，用来给老师登录的。 老师通过后台网站添加兼职信息
CREATE TABLE IF NOT EXISTS teacher(
  # 这个字段待定，如果老师也用微信登陆。那么这里也应该用微信的id
  # 如果老师用网页，那么这个字段就自动生成，先假定老师用网页
  id INT PRIMARY KEY AUTO_INCREMENT,
  teacher_name VARCHAR(10),
  teacher_phone VARCHAR(11),
  password VARCHAR(20),
  email VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS job(
  id INT PRIMARY KEY AUTO_INCREMENT,
  teacher_id INT,
  jobName VARCHAR(30),
  department VARCHAR(20),
  postTime DATETIME,
  brief VARCHAR(50),
  detail TEXT,
  FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);
