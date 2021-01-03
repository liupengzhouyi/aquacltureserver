package cn.liupengstudy.aquacltureserver.service.impl;

import cn.liupengstudy.aquacltureserver.entity.AbstractFinancialData;
import cn.liupengstudy.aquacltureserver.dao.AbstractFinancialDataDao;
import cn.liupengstudy.aquacltureserver.service.AbstractFinancialDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 抽象财务数据(AbstractFinancialData)表服务实现类
 *
 * @author liupeng
 * @since 2021-01-03 23:56:18
 */
@Service("abstractFinancialDataService")
public class AbstractFinancialDataServiceImpl implements AbstractFinancialDataService {
    @Resource
    private AbstractFinancialDataDao abstractFinancialDataDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AbstractFinancialData queryById(Integer id) {
        return this.abstractFinancialDataDao.queryById(id);
    }
    
    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<AbstractFinancialData> queryAll() {
        return this.abstractFinancialDataDao.queryAll();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AbstractFinancialData> queryAllByLimit(int offset, int limit) {
        return this.abstractFinancialDataDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param abstractFinancialData 实例对象
     * @return 实例对象
     */
    @Override
    public AbstractFinancialData insert(AbstractFinancialData abstractFinancialData) {
        this.abstractFinancialDataDao.insert(abstractFinancialData);
        return abstractFinancialData;
    }

    /**
     * 修改数据
     *
     * @param abstractFinancialData 实例对象
     * @return 实例对象
     */
    @Override
    public AbstractFinancialData update(AbstractFinancialData abstractFinancialData) {
        this.abstractFinancialDataDao.update(abstractFinancialData);
        return this.queryById(abstractFinancialData.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.abstractFinancialDataDao.deleteById(id) > 0;
    }
}