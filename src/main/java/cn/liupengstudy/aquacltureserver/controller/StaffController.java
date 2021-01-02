package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.Staff;
import cn.liupengstudy.aquacltureserver.service.StaffService;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 员工表(Staff)表控制层
 *
 * @author liupeng
 * @since 2021-01-02 16:21:08
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
     * 删除单条数据
     *
     * @param staff 
     * @return 单条数据
     */
    @ApiOperation("通过ID删除员工信息")
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
    @ApiOperation("员工更新信息")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff updateOne(@RequestBody Staff staff) {
        return this.staffService.update(staff);
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param staff
     * @return 单条数据
     */
    @ApiOperation("通过ID查询单一员工")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff selectOne(@RequestBody Staff staff) {
        return this.staffService.queryById(staff.getId());
    }
    
    /**
     * 查询所有数据
     *
     * @return List<Staff>
     */
    @ApiOperation("查询全部员工")
    @RequestMapping(path = "queryAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Staff> queryAll() {
        return this.staffService.queryAll();
    }
    
    
    /**
     * 关键字段查询数据
     *
     * @param staff
     * @return List<Staff>
     */
    @ApiOperation("关键字Name查询员工")
    @RequestMapping(path = "queryByName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Staff> queryBySomethingName(@RequestBody Staff staff) {
        return this.staffService.queryByName(staff);
    }

    /**
     * 关键字段查询数据
     *
     * @param staff
     * @return List<Staff>
     */
    @ApiOperation("关键字IDCard查询员工")
    @RequestMapping(path = "queryByIDCard", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Staff> queryBySomethingIDCard(@RequestBody Staff staff) {
        return this.staffService.queryByIDCard(staff);
    }

    /**
     * 关键字段查询数据
     *
     * @param staff
     * @return List<Staff>
     */
    @ApiOperation("关键字PhoneNUmber查询员工")
    @RequestMapping(path = "queryByPhoneNumber", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Staff> queryByPhoneNumber(@RequestBody Staff staff) {
        return this.staffService.queryByPhoneNumber(staff);
    }

    /**
     * 查询在职员工查询离职员工
     *
     * @param staff
     * @return List<Staff>
     */
    @ApiOperation("查询在职员工")
    @RequestMapping(path = "queryOnJob", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Staff> queryOnJob(@RequestBody Staff staff) {
        return this.staffService.queryByPhoneNumber(staff);
    }

    /**
     * 查询离职员工
     *
     * @param staff
     * @return List<Staff>
     */
    @ApiOperation("查询离职员工")
    @RequestMapping(path = "queryResignedEmployees", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Staff> queryResignedEmployees(@RequestBody Staff staff) {
        return this.staffService.queryByPhoneNumber(staff);
    }


    /**
     * 办理员工离职
     *
     * @param staff
     * @return Staff
     */
    @ApiOperation("办理员工离职")
    @RequestMapping(path = "employeeResignation", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff employeeResignation (@RequestBody Staff staff) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        staff.setIsSeparation(1);
        staff.setSeparationDate(date);
        return this.staffService.update(staff);
    }

}