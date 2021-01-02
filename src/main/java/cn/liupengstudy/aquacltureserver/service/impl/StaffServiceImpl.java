package cn.liupengstudy.aquacltureserver.service.impl;

import cn.liupengstudy.aquacltureserver.entity.Staff;
import cn.liupengstudy.aquacltureserver.dao.StaffDao;
import cn.liupengstudy.aquacltureserver.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工表(Staff)表服务实现类
 *
 * @author liupeng
 * @since 2021-01-02 15:46:02
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffDao staffDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Staff queryById(Integer id) {
        return this.staffDao.queryById(id);
    }
    
    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<Staff> queryAll() {
        return this.staffDao.queryAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Staff> queryAllByLimit(int offset, int limit) {
        return this.staffDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    @Override
    public Staff insert(Staff staff) {
        this.staffDao.insert(staff);
        return staff;
    }

    /**
     * 修改数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    @Override
    public Staff update(Staff staff) {
        this.staffDao.update(staff);
        return this.queryById(staff.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.staffDao.deleteById(id) > 0;
    }
}