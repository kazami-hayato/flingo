package generate;

import generate.CourseSaleTable;
import generate.CourseSaleTableExample;
import generate.CourseSaleTableKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseSaleTableDao {
    long countByExample(CourseSaleTableExample example);

    int deleteByExample(CourseSaleTableExample example);

    int deleteByPrimaryKey(CourseSaleTableKey key);

    int insert(CourseSaleTable record);

    int insertSelective(CourseSaleTable record);

    List<CourseSaleTable> selectByExample(CourseSaleTableExample example);

    CourseSaleTable selectByPrimaryKey(CourseSaleTableKey key);

    int updateByExampleSelective(@Param("record") CourseSaleTable record, @Param("example") CourseSaleTableExample example);

    int updateByExample(@Param("record") CourseSaleTable record, @Param("example") CourseSaleTableExample example);

    int updateByPrimaryKeySelective(CourseSaleTable record);

    int updateByPrimaryKey(CourseSaleTable record);
}