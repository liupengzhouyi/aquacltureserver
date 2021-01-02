package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.Finance;
import cn.liupengstudy.aquacltureserver.service.FinanceService;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
 * 财务数据表(Finance)表控制层
 *
 * @author liupeng
 * @since 2021-01-02 18:03:07
 */
@Api(tags = {"财务数据管理"})
@RestController
@RequestMapping("finance")
public class FinanceController {
    /**
     * 服务对象
     */
    @Resource
    private FinanceService financeService;
    
    /**
     * 添加单条数据
     *
     * @param finance 
     * @return 单条数据
     */
    @ApiOperation("添加财务数据")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Finance addOne(@RequestBody Finance finance) {
        return this.financeService.insert(finance);
    }
    
    /**
     * 删除单条数据
     *
     * @param finance 
     * @return 单条数据
     */
    @ApiOperation("通过ID删除财务数据信息")
    @RequestMapping(path = "deleteOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Boolean deleteOne(@RequestBody Finance finance) {
        return this.financeService.deleteById(finance.getId());
    }
    
    /**
     * 重置单条数据
     *
     * @param finance 
     * @return 单条数据
     */
    @ApiOperation("更新财务数据信息")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Finance updateOne(@RequestBody Finance finance) {
        return this.financeService.update(finance);
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param finance
     * @return 单条数据
     */
    @ApiOperation("通过ID查询单一财务数据")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Finance selectOne(@RequestBody Finance finance) {
        return this.financeService.queryById(finance.getId());
    }
    
    /**
     * 查询所有数据
     *
     * @return List<Finance>
     */
    @ApiOperation("查询全部财务数据")
    @RequestMapping(path = "queryAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Finance> queryAll() {
        return this.financeService.queryAll();
    }
    
    
    
    
    
    

}