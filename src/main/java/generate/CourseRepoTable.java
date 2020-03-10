package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * course_repo_table
 * @author 
 */
@Data
public class CourseRepoTable implements Serializable {
    /**
     * 课程号
     */
    private String courseId;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 教材名
     */
    private String materialName;

    /**
     * 精讲时间
     */
    private Integer courseDuration;

    /**
     * 精讲课程数
     */
    private Integer courseSum;

    /**
     * 问题总数
     */
    private Integer questionSum;

    /**
     * 教材封面url
     */
    private String materialCover;

    /**
     * 课程简介
     */
    private String courseBrief;

    /**
     * 对主校是否可见
     */
    private Integer isForMain;

    /**
     * 目录树
     */
    private String catalogtree;

    private static final long serialVersionUID = 1L;
}