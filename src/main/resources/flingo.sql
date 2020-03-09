create table user_table
(
    user_id       int         not null auto_increment comment '用户id',
    username      varchar(32) not null unique comment '登录名',
    real_name     varchar(32) comment '真实姓名',
    password      varchar(32) not null comment '用户密码',
    user_type     int         not null comment '用户类别',
    authority_id  int comment '所属机构id',
    wechat_num    varchar(64) comment '微信号',
    phone         varchar(15) comment '手机号',
    register_date date comment '注册日期',
    avatar        text comment '头像',
    ip            varchar(30) comment 'ip',
    prev_time     varchar(30) comment '时间字段',
    is_forbidden  int default 0 comment '是否被禁用',
    primary key (user_id)
) comment '管理员表';

# 学生表
create table stu_table
(
    student_id    int NOT NULL AUTO_INCREMENT comment '学生id',
    exam_id       varchar(30) comment '考号',
    username      varchar(64) comment '用户名（考号）',
    real_name     varchar(15) comment '名字',
    password      varchar(30) comment '密码',
    id_card       varchar(30) comment '身份证',
    authority_id  int comment '所属机构id',
    phone         varchar(15) comment '手机号',
    qq_num        varchar(30) comment 'qq号',
    wechat_num    varchar(64) comment '微信号',
    avatar        text comment '头像',
    register_date date comment '注册日期',
    major         varchar(30) comment '专业',
    iscollege     int default 0 comment '层次（本科0专科1)',
    is_first      int default 0 comment '是否初次登陆',
    recent_login  varchar(64) comment '最近学习时间',
    primary key (student_id)
) comment '学生表';

# 学校表
create table school_table
(
    school_id   int NOT NULL AUTO_INCREMENT comment '学校id',
    main_school varchar(30) comment '主校名',
    sub_school  varchar(30) comment '分校名',
    logo        text comment '学校logo',
    title       varchar(30) comment '网站名',
    sub_domain  text comment '子域名',
    h5_domain   text comment 'h5域名',
    hotline     text comment '咨询热线',
    qq          text comment '咨询qq',
    email       text comment '咨询邮箱',
    icp         text comment '备案号',
    web_brief   text comment '网站简介',
    address     text comment '联系地址',
    school_no   varchar(30) comment '学校代码（主考机构代码或助学机构代码）',
    primary key (school_id),
    unique key (main_school, sub_school)
);


#学生历史考期表
create table stu_history_table
(
    student_id    int NOT NULL AUTO_INCREMENT comment '学生id',
    exam_id       varchar(30) comment '考号',
    username      varchar(64) comment '用户名（考号）',
    real_name     varchar(15) comment '名字',
    password      varchar(30) comment '密码',
    id_card       varchar(30) comment '身份证',
    authority_id  int comment '所属机构id',
    phone         varchar(15) comment '手机号',
    qq_num        varchar(30) comment 'qq号',
    wechat_num    varchar(64) comment '微信号',
    avatar        text comment '头像',
    register_date date comment '注册日期',
    tag           varchar(30) comment '考期',
    major         varchar(30) comment '专业',
    iscollege     int default 0 comment '层次（本科0专科1)',
    is_first      int default 0 comment '是否初次登陆',
    recent_login  varchar(64) comment '最近学习时间',
    primary key (student_id, tag)
) comment '学生历史表';

#学生选课表
create table stu_course_table
(
    exam_id       varchar(30) comment '考号',
    course_id     varchar(30) comment '课程号',
    over_date     date comment '过期时间',
    watch_time    int comment '观看时间',
    catalog_state text comment '进度',
    study_catch   text comment '观看视频抓拍json',
    phase_catch   text comment '阶段测验抓拍json',
    primary key (exam_id, course_id)
) comment '当前考期学生课程表';

# 课程仓库表
create table course_repo_table
(
    course_id       varchar(30)    default '000000' comment '课程号',
    course_name     varchar(30) comment '课程名',
    create_time     timestamp NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
    update_time     timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    material_name   varchar(30) comment '教材名',
    course_duration int comment '精讲时间',
    course_sum      int comment '精讲课程数',
    question_sum    int comment '问题总数',
    material_cover  text comment '教材封面url',
    course_brief    text comment '课程简介',
    is_for_main     int comment '对主校是否可见',
    catalogtree     text comment '目录树',
    primary key (course_id)
) comment '仓库课程';

#主校课程表
create table main_course_table
(
    course_id    varchar(30)    default '000000' comment '课程号',
    authority_id int comment '所属机构id',
    create_time  timestamp NULL DEFAULT CURRENT_TIMESTAMP comment '创建时间',
    norm_price   int comment '精讲价格',
    cross_price  int comment '串讲价格',
    is_for_sub   int comment '是否对分校可见',
    primary key (course_id, authority_id)
) comment '学校课程表';
#课程销量统计
create table course_sale_table
(
    course_id    varchar(30) comment '课程号',
    authority_id int comment '所属机构id',
    sales        int comment '选课数',
    tag          varchar(30) comment '考期',
    primary key (course_id, authority_id)
) comment '课程销量统计表';

#消息通知表
create table notice_table
(
    notice_id      int not null auto_increment comment '通知号',
    notice_type    varchar(30) comment '通知类型',
    notice_title   varchar(30) comment '通知标题',
    notice_content text comment '通知内容',
    pub_date       varchar(30) comment '发布日期',
    notice_author  varchar(20) comment '发布人姓名',
    authority_id   int comment '所属机构id',
    primary key (notice_id)
) comment '通知表';
#IP表
create table ip_table
(
    ip_id        int         not null auto_increment comment 'ip号',
    ip           varchar(30) not null unique comment 'ip内容',
    add_date     varchar(30) comment '增加日期',
    operator     varchar(30) comment '操作者',
    authority_id int comment '所属机构id',
    is_allowed   int comment '是否开启访问',
    primary key (ip_id)
) comment 'ip表设计';

#考期表
create table tag_table
(
    tag_id         int         not null auto_increment comment '标签id',
    tag_name       varchar(30) not null comment '考期',
    active         int default 0 comment '为1代表是当前生效考期',
    tag_createtime varchar(60) comment '考期创建时间',
    tag_overtime   varchar(60) comment '考期结束时间',
    primary key (tag_id)
) comment '考期表';

#试卷表
create table exam_table
(
    examination_id int auto_increment key comment '试卷id',
    match_course_id      varchar(30) comment '匹配课程id',
    exam_type      int comment '考试类型',
    exam_title     text comment '考卷标题',
    exam_content   text comment '考卷内容',
    tag_id         int comment '考期id,不启用',
    exam_time      int comment '考试时长',
    createtime     timestamp not NULL default CURRENT_TIMESTAMP,
    primary key (match_course_id, exam_time)
);
#学生试卷表
create table stu_exam_table
(
    exam_id    varchar(30) comment '准考证号',
    match_course_id  varchar(30) comment '考试id',
    exam_type  int comment '考试类型',
    exam_state text comment '考试考卷情况',
    createtime timestamp not NULL default CURRENT_TIMESTAMP,
    primary key (exam_id, match_course_id, exam_type)
);
create function score(test1 int, test2 int, test3 int, test4 int, main_test int)
    returns int
begin
    declare ans int default 0;
    set ans = ((test1 + test2 + test3 + test4) * 3 + main_test * 7) / 10;
    return ans;
end;
#获取有效考期
create function getActiveTag()
    returns varchar(30)
begin
    declare activeTag varchar(30) default ' ';
    select tag_name into activeTag from tag_table where active=1;
    return activeTag;
end;
