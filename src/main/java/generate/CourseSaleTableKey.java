package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * course_sale_table
 * @author 
 */
@Data
public class CourseSaleTableKey implements Serializable {
    /**
     * 课程号
     */
    private String course_id;

    /**
     * 所属机构id
     */
    private Integer authority_id;

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
        CourseSaleTableKey other = (CourseSaleTableKey) that;
        return (this.getCourse_id() == null ? other.getCourse_id() == null : this.getCourse_id().equals(other.getCourse_id()))
            && (this.getAuthority_id() == null ? other.getAuthority_id() == null : this.getAuthority_id().equals(other.getAuthority_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCourse_id() == null) ? 0 : getCourse_id().hashCode());
        result = prime * result + ((getAuthority_id() == null) ? 0 : getAuthority_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", course_id=").append(course_id);
        sb.append(", authority_id=").append(authority_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}