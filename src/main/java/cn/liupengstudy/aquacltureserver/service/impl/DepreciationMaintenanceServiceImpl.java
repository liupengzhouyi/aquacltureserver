package cn.liupengstudy.aquacltureserver.service.impl;

import cn.liupengstudy.aquacltureserver.entity.DepreciationMaintenance;
import cn.liupengstudy.aquacltureserver.dao.DepreciationMaintenanceDao;
import cn.liupengstudy.aquacltureserver.service.DepreciationMaintenanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 折旧维护数据库(DepreciationMaintenance)表服务实现类
 *
 * @author liupeng
 * @since 2021-01-05 20:40:19
 */
@Service("depreciationMaintenanceService")
public class DepreciationMaintenanceServiceImpl implements DepreciationMaintenanceService {
    @Resource
    private DepreciationMaintenanceDao depreciationMaintenanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DepreciationMaintenance queryById(Integer id) {
        return this.depreciationMaintenanceDao.queryById(id);
    }
    
    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<DepreciationMaintenance> queryAll() {
        return this.depreciationMaintenanceDao.queryAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<DepreciationMaintenance> queryAllByLimit(int offset, int limit) {
        return this.depreciationMaintenanceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param depreciationMaintenance 实例对象
     * @return 实例对象
     */
    @Override
    public DepreciationMaintenance insert(DepreciationMaintenance depreciationMaintenance) {
        this.depreciationMaintenanceDao.insert(depreciationMaintenance);
        return depreciationMaintenance;
    }

    /**
     * 修改数据
     *
     * @param depreciationMaintenance 实例对象
     * @return 实例对象
     */
    @Override
    public DepreciationMaintenance update(DepreciationMaintenance depreciationMaintenance) {
        this.depreciationMaintenanceDao.update(depreciationMaintenance);
        return this.queryById(depreciationMaintenance.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.depreciationMaintenanceDao.deleteById(id) > 0;
    }
}