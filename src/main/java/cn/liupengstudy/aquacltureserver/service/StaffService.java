package cn.liupengstudy.aquacltureserver.service;

import cn.liupengstudy.aquacltureserver.entity.Staff;
import java.util.List;

/**
 * 员工表(Staff)表服务接口
 *
 * @author liupeng
 * @since 2021-01-02 16:18:03
 */
public interface StaffService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Staff queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staff> queryAllByLimit(int offset, int limit);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<Staff> queryAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Staff> queryByName(Staff staff);

    List<Staff> queryByIDCard(Staff staff);

    List<Staff> queryByPhoneNumber(Staff staff);
    /**
     * 新增数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    Staff insert(Staff staff);

    /**
     * 修改数据
     *
     * @param staff 实例对象
     * @return 实例对象
     */
    Staff update(Staff staff);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}