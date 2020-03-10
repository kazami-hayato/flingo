package generate;

public interface MainCourseTableDao {
    int deleteByPrimaryKey(MainCourseTableKey key);

    int insert(MainCourseTable record);

    int insertSelective(MainCourseTable record);

    MainCourseTable selectByPrimaryKey(MainCourseTableKey key);

    int updateByPrimaryKeySelective(MainCourseTable record);

    int updateByPrimaryKey(MainCourseTable record);
}