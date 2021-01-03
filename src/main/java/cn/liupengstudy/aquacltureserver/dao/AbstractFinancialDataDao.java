package cn.liupengstudy.aquacltureserver.dao;

import cn.liupengstudy.aquacltureserver.entity.AbstractFinancialData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 抽象财务数据(AbstractFinancialData)表数据库访问层
 *
 * @author liupeng
 * @since 2021-01-03 23:56:16
 */
@Mapper
public interface AbstractFinancialDataDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AbstractFinancialData queryById(Integer id);
    
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AbstractFinancialData> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<AbstractFinancialData> queryAll();

    /**
     * 新增数据
     *
     * @param abstractFinancialData 实例对象
     * @return 影响行数
     */
    int insert(AbstractFinancialData abstractFinancialData);

    /**
     * 修改数据
     *
     * @param abstractFinancialData 实例对象
     * @return 影响行数
     */
    int update(AbstractFinancialData abstractFinancialData);
    
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}