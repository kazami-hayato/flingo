package com.uvt.flingo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * course_repo_table
 * @author 
 */
@Data
public class StuHistoryTable implements Serializable {
    /**
     * 课程号
     */
    private String course_id;

    /**
     * 课程名
     */
    private String course_name;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 更新时间
     */
    private Date update_time;

    /**
     * 教材名
     */
    private String material_name;

    /**
     * 精讲时间
     */
    private Integer course_duration;

    /**
     * 精讲课程数
     */
    private Integer course_sum;

    /**
     * 问题总数
     */
    private Integer question_sum;

    /**
     * 教材封面url
     */
    private String material_cover;

    /**
     * 课程简介
     */
    private String course_brief;

    /**
     * 对主校是否可见
     */
    private Integer is_for_main;

    /**
     * 目录树
     */
    private String catalogtree;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StuHistoryTable other = (StuHistoryTable) that;
        return (this.getCourse_id() == null ? other.getCourse_id() == null : this.getCourse_id().equals(other.getCourse_id()))
            && (this.getCourse_name() == null ? other.getCourse_name() == null : this.getCourse_name().equals(other.getCourse_name()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getMaterial_name() == null ? other.getMaterial_name() == null : this.getMaterial_name().equals(other.getMaterial_name()))
            && (this.getCourse_duration() == null ? other.getCourse_duration() == null : this.getCourse_duration().equals(other.getCourse_duration()))
            && (this.getCourse_sum() == null ? other.getCourse_sum() == null : this.getCourse_sum().equals(other.getCourse_sum()))
            && (this.getQuestion_sum() == null ? other.getQuestion_sum() == null : this.getQuestion_sum().equals(other.getQuestion_sum()))
            && (this.getMaterial_cover() == null ? other.getMaterial_cover() == null : this.getMaterial_cover().equals(other.getMaterial_cover()))
            && (this.getCourse_brief() == null ? other.getCourse_brief() == null : this.getCourse_brief().equals(other.getCourse_brief()))
            && (this.getIs_for_main() == null ? other.getIs_for_main() == null : this.getIs_for_main().equals(other.getIs_for_main()))
            && (this.getCatalogtree() == null ? other.getCatalogtree() == null : this.getCatalogtree().equals(other.getCatalogtree()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourse_id() == null) ? 0 : getCourse_id().hashCode());
        result = prime * result + ((getCourse_name() == null) ? 0 : getCourse_name().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getMaterial_name() == null) ? 0 : getMaterial_name().hashCode());
        result = prime * result + ((getCourse_duration() == null) ? 0 : getCourse_duration().hashCode());
        result = prime * result + ((getCourse_sum() == null) ? 0 : getCourse_sum().hashCode());
        result = prime * result + ((getQuestion_sum() == null) ? 0 : getQuestion_sum().hashCode());
        result = prime * result + ((getMaterial_cover() == null) ? 0 : getMaterial_cover().hashCode());
        result = prime * result + ((getCourse_brief() == null) ? 0 : getCourse_brief().hashCode());
        result = prime * result + ((getIs_for_main() == null) ? 0 : getIs_for_main().hashCode());
        result = prime * result + ((getCatalogtree() == null) ? 0 : getCatalogtree().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", course_id=").append(course_id);
        sb.append(", course_name=").append(course_name);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", material_name=").append(material_name);
        sb.append(", course_duration=").append(course_duration);
        sb.append(", course_sum=").append(course_sum);
        sb.append(", question_sum=").append(question_sum);
        sb.append(", material_cover=").append(material_cover);
        sb.append(", course_brief=").append(course_brief);
        sb.append(", is_for_main=").append(is_for_main);
        sb.append(", catalogtree=").append(catalogtree);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}