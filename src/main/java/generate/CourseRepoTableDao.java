package generate;

import generate.CourseRepoTable;

public interface CourseRepoTableDao {
    int deleteByPrimaryKey(String courseId);

    int insert(CourseRepoTable record);

    int insertSelective(CourseRepoTable record);

    CourseRepoTable selectByPrimaryKey(String courseId);

    int updateByPrimaryKeySelective(CourseRepoTable record);

    int updateByPrimaryKey(CourseRepoTable record);
}