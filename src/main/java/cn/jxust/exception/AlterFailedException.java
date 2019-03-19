package cn.jxust.exception;

/**
 * 所有异常定义到这个包下
 * 这个异常，如果用框架，框架会转成运行时异常，service对出现异常进行回滚
 * 就不用手动抛出了
 * 数据库修改异常
 */
public class AlterFailedException extends Exception {
}
