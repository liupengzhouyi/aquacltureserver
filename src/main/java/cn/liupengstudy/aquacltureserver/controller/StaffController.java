package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.Staff;
import cn.liupengstudy.aquacltureserver.service.StaffService;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工表(Staff)表控制层
 *
 * @author liupeng
 * @since 2021-01-02 15:57:26
 */
@Api(tags = {"管理"})
@RestController
@RequestMapping("staff")
public class StaffController {
    /**
     * 服务对象
     */
    @Resource
    private StaffService staffService;
    
    /**
     * 添加单条数据
     *
     * @param staff 
     * @return 单条数据
     */
    @ApiOperation("添加")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff addOne(@RequestBody Staff staff) {
        return this.staffService.insert(staff);
    }
    
    /**
     * 删除单条数据
     *
     * @param staff 
     * @return 单条数据
     */
    @ApiOperation("通过ID删除信息")
    @RequestMapping(path = "deleteOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Boolean deleteOne(@RequestBody Staff staff) {
        return this.staffService.deleteById(staff.getId());
    }
    
    /**
     * 重置单条数据
     *
     * @param staff 
     * @return 单条数据
     */
    @ApiOperation("更新信息")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff updateOne(@RequestBody Staff staff) {
        return this.staffService.update(staff);
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param 
     * @return 单条数据
     */
    @ApiOperation("通过ID查询单一")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff selectOne(@RequestBody Staff staff) {
        return this.staffService.queryById(staff.getId());
    }
    
    /**
     * 查询所有数据
     *
     * @return List<Staff>
     */
    @ApiOperation("查询全部")
    @RequestMapping(path = "queryAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Staff> queryAll() {
        return this.staffService.queryAll();
    }
    
    
    
    

}