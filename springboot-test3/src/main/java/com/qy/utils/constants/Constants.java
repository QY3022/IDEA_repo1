package com.qy.utils.constants;

/**
 * @author QY3022
 * @date 1/14
 */
public class Constants {
    /*----AOP保存方法用---*/
    /**
     * 显示
     */
    public static final Long SHOW = 1L;
    /**
     * 不显示
     */
    public static final Long DISSHOW = 0L;

    /**
     * 异常错误
     */
    public static int EXCEPTION_ERROR = 500;
    public static int REQUEST_ERROR = 500;
    public static String REQUEST_ERROR_MSG = "传入参数错误：";

    /**
     * Oracle数据库类型
     */
    public static final Integer DATABASE_TYPE_ORACLE = 0;

    /**
     * MySQL数据库类型（新、旧版本）
     */
    public static final Integer DATABASE_TYPE_MYSQL_NEW = 1;
    public static final Integer DATABASE_TYPE_MYSQL_OLD = 2;

    /**
     * postgresSQL
     */
    public static final Integer DATABASE_TYPE_POSTGRES = 3;

    /**
     * 普通hive
     */
    public static final Integer DATABASE_TYPE_HIVE = 4;

    /**
     * sqlServer
     */
    public static final Integer DATABASE_TYPE_SQL_SERVER = 5;

    /**
     * 华为FusionInsight版本hive
     */
    public static final Integer DATABASE_TYPE_HIVE_HUAWEI = 6;

    /**
     * txt文件
     */
    public static final Integer DATABASE_TYPE_TXT = 7;

    public static final String DATABASE_TYPE_NAME_ORACLE = "Oracle";

    public static final String DATABASE_TYPE_NAME_MYSQL_NEW = "MySQL";

    public static final String DATABASE_TYPE_NAME_MYSQL_OLD = "MySQL";

    public static final String DATABASE_TYPE_NAME_POSTGRES = "PostgreSQL";

    public static final String DATABASE_TYPE_NAME_HIVE = "Hive";

    public static final String DATABASE_TYPE_NAME_SQL_SERVER = "SQLServer";

    public static final String DATABASE_TYPE_NAME_HIVE_HUAWEI = "HiveHuaWei";

    /*----认证类型----*/
    /**
     * 用户密码
     */
    public static final String SECURITY_USERPWD = "USER-PWD";
    /**
     * 普通KERBEROS
     */
    public static final String SECURITY_KERBEROS = "KERBEROS";
    /**
     * 华为KERBEROS
     */
    public static final String SECURITY_KERBEROS_HUAWEI = "KERBEROS-HW";

    /*----任务状态(字典:dts.job.status)----*/
    /**
     * 可用，待启动
     */
    public static final Integer JOB_STATUS_AVALIABLE = 1;

    /**
     * 队列中待执行
     */
    public static final Integer JOB_STATUS_WAITING = 2;

    /**
     * 执行中
     */
    public static final Integer JOB_STATUS_RUNNING = 3;

    /**
     * 任务执行成功
     */
    public static final Integer JOB_STATUS_SUCCESS = 4;

    /**
     * 任务执行失败
     */
    public static final Integer JOB_STATUS_FAILED = 5;

    /**
     * 暂停中
     */
    public static final Integer JOB_STATUS_SUSPEND = 6;

    /*----任务(执行)状态(字典:dts.job.launch.status)----*/
    /**
     * 已停止
     */
    public static final Integer JOB_LAUNCH_STATUS_STOP = 0;

    /**
     * 执行中
     */
    public static final Integer JOB_LAUNCH_STATUS_RUNNING = 1;

    /*--------------同步任务类型----------------*/
    /**
     * 全量
     */
    public static final Integer JOB_SYNC_TYPE_ALL = 0;
    /**
     * 增量
     */
    public static final Integer JOB_SYNC_TYPE_INCREASE = 1;

    /*--------------writer数据插入类型----------------*/
    /**
     * insert
     */
    public static final String WRITE_MODEL_INSERT = "insert";

    /**
     * replace
     */
    public static final String WRITE_MODEL_REPLACE = "replace";

    /**
     * update
     */
    public static final String WRITE_MODEL_UPDATE = "update";

    /*----数据库用途----*/
    public static final Integer DATA_BASE_USE_SOURCE = 1;
    public static final Integer DATA_BASE_USE_TARGET = 2;

    public static final String DATA_BASE_USE_NAME_SOURCE = "数据源";
    public static final String DATA_BASE_USE_NAME_TARGET = "目标库";

    /*----数据库连通状态----*/
    public static final Integer DATABASE_LINK_STATUS_YES = 1;
    public static final Integer DATABASE_LINK_STATUS_NO = 2;

    /*--------------任务发布状态----------------*/
    /**
     * 未发布
     */
    public static final Integer JOB_PUBLISH_STATUS_NO = 1;
    /**
     * 已发布
     */
    public static final Integer JOB_PUBLISH_STATUS_YES = 2;

    /*任务实例类型*/
    public static final Integer JOB_INSTANCE_TYPE_CRON = 1;//周期
    public static final Integer JOB_INSTANCE_TYPE_MANUAL = 2;//手动
    public static final Integer JOB_INSTANCE_TYPE_DATAFIX = 3;//补数
    public static final Integer JOB_INSTANCE_TYPE_TEST = 4;//测试
    public static final Integer JOB_INSTANCE_TYPE_RETRY = 5;//自动重试
    public static final Integer JOB_INSTANCE_TYPE_PARENT = 6;//父子
    public static final Integer JOB_INSTANCE_TYPE_API = 7;//API调用

    /*任务实例状态*/
    public static final Integer JOB_INSTANCE_STATUS_WATI = 1;//等待中
    public static final Integer JOB_INSTANCE_STATUS_RUNNING = 2;//运行中
    public static final Integer JOB_INSTANCE_STATUS_SUCCESS = 3;//运行成功
    public static final Integer JOB_INSTANCE_STATUS_FAIL = 4;//运行失败

    /**
     * 资源目录保存 更新操作定义
     **/
    public static enum DtsActEnum {
        SAVE, UPDATE;
    }

    /*任务调度类型*/
    public static final Integer JOB_SCHEDULE_TYPE_CRON = 1;//周期调度
    public static final Integer JOB_SCHEDULE_TYPE_MANUAL = 2;//手动调度

    /*任务通知提醒类型*/
    public static final String JOB_NOTICE_TYPE_SUCCESS = "1";//成功提醒
    public static final String JOB_NOTICE_TYPE_FAIL = "2";//失败提醒

    /*任务通知提醒方式*/
    public static final String JOB_NOTICE_WAY_EMAIL = "1";//邮件
    public static final String JOB_NOTICE_WAY_DTS_MESSAGE = "2";//站内信
    public static final String JOB_NOTICE_WAY_MESSAGE = "3";//短信

    /*任务清理规则*/
    public static final Integer JOB_CLEANRULE_TYPE_RETAIN = 1;//写入前保留已有数据
    public static final Integer JOB_CLEANRULE_TYPE_CLEAN = 2;//写入前删除已有数据

    /*站内信状态*/
    public static final Integer DTS_MESSAGE_STATUS_NOT_READ = 0;//未读
    public static final Integer DTS_MESSAGE_STATUS_READ = 1;//已读

    /*--------------用户角色类型----------------*/
    /**
     * 数据汇聚平台管理员
     */
    public static final String ROLE_DTS_MANAGER = "dts-manager";

}
