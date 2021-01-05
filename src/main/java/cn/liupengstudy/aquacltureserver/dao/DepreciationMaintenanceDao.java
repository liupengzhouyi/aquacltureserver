package cn.liupengstudy.aquacltureserver.dao;

import cn.liupengstudy.aquacltureserver.entity.DepreciationMaintenance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 折旧维护数据库(DepreciationMaintenance)表数据库访问层
 *
 * @author liupeng
 * @since 2021-01-05 20:40:18
 */
@Mapper
public interface DepreciationMaintenanceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DepreciationMaintenance queryById(Integer id);
    
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DepreciationMaintenance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<DepreciationMaintenance> queryAll();

    /**
     * 新增数据
     *
     * @param depreciationMaintenance 实例对象
     * @return 影响行数
     */
    int insert(DepreciationMaintenance depreciationMaintenance);

    /**
     * 修改数据
     *
     * @param depreciationMaintenance 实例对象
     * @return 影响行数
     */
    int update(DepreciationMaintenance depreciationMaintenance);
    
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}