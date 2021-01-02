package cn.liupengstudy.aquacltureserver.dao;

import cn.liupengstudy.aquacltureserver.entity.Finance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 财务数据表(Finance)表数据库访问层
 *
 * @author liupeng
 * @since 2021-01-02 18:03:05
 */
@Mapper
public interface FinanceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Finance queryById(Integer id);
    
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Finance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Finance> queryAll();

    /**
     * 新增数据
     *
     * @param finance 实例对象
     * @return 影响行数
     */
    int insert(Finance finance);

    /**
     * 修改数据
     *
     * @param finance 实例对象
     * @return 影响行数
     */
    int update(Finance finance);
    
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}