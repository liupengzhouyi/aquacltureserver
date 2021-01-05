package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.DepreciationMaintenance;
import cn.liupengstudy.aquacltureserver.service.DepreciationMaintenanceService;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
 * 折旧维护数据库(DepreciationMaintenance)表控制层
 *
 * @author liupeng
 * @since 2021-01-05 20:40:20
 */
@Api(tags = {"折旧维护数据管理"})
@RestController
@RequestMapping("depreciationMaintenance")
public class DepreciationMaintenanceController {
    /**
     * 服务对象
     */
    @Resource
    private DepreciationMaintenanceService depreciationMaintenanceService;
    
    /**
     * 添加单条数据
     *
     * @param depreciationMaintenance 
     * @return 单条数据
     */
    @ApiOperation("添加折旧维护数据")
    @RequestMapping(path = "addOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public DepreciationMaintenance addOne(@RequestBody DepreciationMaintenance depreciationMaintenance) {
        return this.depreciationMaintenanceService.insert(depreciationMaintenance);
    }
    
    /**
     * 删除单条数据
     *
     * @param depreciationMaintenance 
     * @return 单条数据
     */
    @ApiOperation("通过ID删除折旧维护数据")
    @RequestMapping(path = "deleteOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Boolean deleteOne(@RequestBody DepreciationMaintenance depreciationMaintenance) {
        return this.depreciationMaintenanceService.deleteById(depreciationMaintenance.getId());
    }
    
    /**
     * 重置单条数据
     *
     * @param depreciationMaintenance 
     * @return 单条数据
     */
    @ApiOperation("更新信息")
    @RequestMapping(path = "updateOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public DepreciationMaintenance updateOne(@RequestBody DepreciationMaintenance depreciationMaintenance) {
        return this.depreciationMaintenanceService.update(depreciationMaintenance);
    }
    
    /**
     * 通过主键查询单条数据
     *
     * @param depreciationMaintenance
     * @return 单条数据
     */
    @ApiOperation("通过ID查询折旧维护数据")
    @RequestMapping(path = "selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public DepreciationMaintenance selectOne(@RequestBody DepreciationMaintenance depreciationMaintenance) {
        return this.depreciationMaintenanceService.queryById(depreciationMaintenance.getId());
    }
    
    /**
     * 查询所有数据
     *
     * @return List<DepreciationMaintenance>
     */
    @ApiOperation("查询全部折旧维护数据")
    @RequestMapping(path = "queryAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<DepreciationMaintenance> queryAll() {
        return this.depreciationMaintenanceService.queryAll();
    }
    
    
    
    
    
    

}