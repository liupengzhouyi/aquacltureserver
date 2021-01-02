package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.Staff;
import cn.liupengstudy.aquacltureserver.service.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 员工表(Staff)表控制层
 *
 * @author liupeng
 * @since 2021-01-02 15:24:32
 */
@Api(tags = {"员工管理"})
@RestController
@RequestMapping("staff")
public class StaffController {
    /**
     * 服务对象
     */
    @Resource
    private StaffService staffService;

    /**
     * 通过主键查询单条数据
     *
     * @param 
     * @return 单条数据
     */
    @ApiOperation("员工查询")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff selectOne(@RequestBody Staff staff) {
        return this.staffService.queryById(staff.getId());
    }
    
    /**
     * 添加单条数据
     *
     * @param staff 
     * @return 单条数据
     */
    @ApiOperation("添加员工")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff addOne(@RequestBody Staff staff) {
        return this.staffService.insert(staff);
    }
    
    
    /**
     * 重置单条数据
     *
     * @param staff 
     * @return 单条数据
     */
    @ApiOperation("更新员工")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff updateOne(@RequestBody Staff staff) {
        return this.staffService.update(staff);
    }
    
    

}