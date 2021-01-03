package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.AbstractFinancialData;
import cn.liupengstudy.aquacltureserver.service.AbstractFinancialDataService;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
 * 抽象财务数据(AbstractFinancialData)表控制层
 *
 * @author liupeng
 * @since 2021-01-03 23:56:18
 */
@Api(tags = {"抽象财务数据管理"})
@RestController
@RequestMapping("abstractFinancialData")
public class AbstractFinancialDataController {
    /**
     * 服务对象
     */
    @Resource
    private AbstractFinancialDataService abstractFinancialDataService;
    
    /**
     * 添加单条数据
     *
     * @param abstractFinancialData 
     * @return 单条数据
     */
    @ApiOperation("添加抽象财务数据")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public AbstractFinancialData addOne(@RequestBody AbstractFinancialData abstractFinancialData) {
        return this.abstractFinancialDataService.insert(abstractFinancialData);
    }
    
    /**
     * 删除单条数据
     *
     * @param abstractFinancialData 
     * @return 单条数据
     */
    @ApiOperation("通过ID删除抽象财务数据")
    @RequestMapping(path = "deleteOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Boolean deleteOne(@RequestBody AbstractFinancialData abstractFinancialData) {
        return this.abstractFinancialDataService.deleteById(abstractFinancialData.getId());
    }
    
    /**
     * 重置单条数据
     *
     * @param abstractFinancialData 
     * @return 单条数据
     */
    @ApiOperation("更新抽象财务数据")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public AbstractFinancialData updateOne(@RequestBody AbstractFinancialData abstractFinancialData) {
        return this.abstractFinancialDataService.update(abstractFinancialData);
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param abstractFinancialData
     * @return 单条数据
     */
    @ApiOperation("通过ID查询抽象财务数据")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public AbstractFinancialData selectOne(@RequestBody AbstractFinancialData abstractFinancialData) {
        return this.abstractFinancialDataService.queryById(abstractFinancialData.getId());
    }
    
    /**
     * 查询所有数据
     *
     * @return List<AbstractFinancialData>
     */
    @ApiOperation("查询全部抽象财务数据")
    @RequestMapping(path = "queryAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<AbstractFinancialData> queryAll() {
        return this.abstractFinancialDataService.queryAll();
    }
    
    
    
    
    
    

}