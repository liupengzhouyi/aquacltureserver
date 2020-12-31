package cn.liupengstudy.aquacltureserver.service.impl;

import cn.liupengstudy.aquacltureserver.entity.Position;
import cn.liupengstudy.aquacltureserver.dao.PositionDao;
import cn.liupengstudy.aquacltureserver.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 职位表(Position)表服务实现类
 *
 * @author makejava
 * @since 2021-01-01 02:12:30
 */
@Service("positionService")
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionDao positionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param positionid 主键
     * @return 实例对象
     */
    @Override
    public Position queryById(Integer positionid) {
        return this.positionDao.queryById(positionid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Position> queryAllByLimit(int offset, int limit) {
        return this.positionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param position 实例对象
     * @return 实例对象
     */
    @Override
    public Position insert(Position position) {
        this.positionDao.insert(position);
        return position;
    }

    /**
     * 修改数据
     *
     * @param position 实例对象
     * @return 实例对象
     */
    @Override
    public Position update(Position position) {
        this.positionDao.update(position);
        return this.queryById(position.getPositionid());
    }

    /**
     * 通过主键删除数据
     *
     * @param positionid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer positionid) {
        return this.positionDao.deleteById(positionid) > 0;
    }
}