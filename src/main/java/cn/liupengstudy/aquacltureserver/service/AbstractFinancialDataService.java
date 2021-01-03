package cn.liupengstudy.aquacltureserver.service;

import cn.liupengstudy.aquacltureserver.entity.AbstractFinancialData;
import java.util.List;

/**
 * 抽象财务数据(AbstractFinancialData)表服务接口
 *
 * @author liupeng
 * @since 2021-01-03 23:56:17
 */
public interface AbstractFinancialDataService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AbstractFinancialData queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AbstractFinancialData> queryAllByLimit(int offset, int limit);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<AbstractFinancialData> queryAll();
    
    /**
     * 新增数据
     *
     * @param abstractFinancialData 实例对象
     * @return 实例对象
     */
    AbstractFinancialData insert(AbstractFinancialData abstractFinancialData);

    /**
     * 修改数据
     *
     * @param abstractFinancialData 实例对象
     * @return 实例对象
     */
    AbstractFinancialData update(AbstractFinancialData abstractFinancialData);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}