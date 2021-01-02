package cn.liupengstudy.aquacltureserver.dao;

import cn.liupengstudy.aquacltureserver.entity.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 员工表(Staff)表数据库访问层
 *
 * @author liupeng
 * @since 2021-01-02 16:29:15
 */
@Mapper
public interface StaffDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Staff queryById(Integer id);
    
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Staff> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Staff> queryAll();

    /**
     * 新增数据
     *
     * @param staff 实例对象
     * @return 影响行数
     */
    int insert(Staff staff);

    /**
     * 修改数据
     *
     * @param staff 实例对象
     * @return 影响行数
     */
    int update(Staff staff);



    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<Staff> queryByName(Staff staff);

    List<Staff> queryByIDCard(Staff staff);

    List<Staff> queryByPhoneNumber(Staff staff);

    List<Staff> queryOnJob(Staff staff);

    List<Staff> queryResignedEmployees(Staff staff);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}