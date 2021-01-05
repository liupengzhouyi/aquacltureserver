package cn.liupengstudy.aquacltureserver.service;

import cn.liupengstudy.aquacltureserver.entity.DepreciationMaintenance;
import java.util.List;

/**
 * 折旧维护数据库(DepreciationMaintenance)表服务接口
 *
 * @author liupeng
 * @since 2021-01-05 20:40:18
 */
public interface DepreciationMaintenanceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DepreciationMaintenance queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DepreciationMaintenance> queryAllByLimit(int offset, int limit);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<DepreciationMaintenance> queryAll();
    
    /**
     * 新增数据
     *
     * @param depreciationMaintenance 实例对象
     * @return 实例对象
     */
    DepreciationMaintenance insert(DepreciationMaintenance depreciationMaintenance);

    /**
     * 修改数据
     *
     * @param depreciationMaintenance 实例对象
     * @return 实例对象
     */
    DepreciationMaintenance update(DepreciationMaintenance depreciationMaintenance);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}