package cn.liupengstudy.aquacltureserver.service;

import cn.liupengstudy.aquacltureserver.entity.Finance;
import java.util.List;

/**
 * 财务数据表(Finance)表服务接口
 *
 * @author liupeng
 * @since 2021-01-02 18:03:06
 */
public interface FinanceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Finance queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Finance> queryAllByLimit(int offset, int limit);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<Finance> queryAll();
    
    /**
     * 新增数据
     *
     * @param finance 实例对象
     * @return 实例对象
     */
    Finance insert(Finance finance);

    /**
     * 修改数据
     *
     * @param finance 实例对象
     * @return 实例对象
     */
    Finance update(Finance finance);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}