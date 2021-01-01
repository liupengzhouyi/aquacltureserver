package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.Position;
import cn.liupengstudy.aquacltureserver.service.PositionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 职位表(Position)表控制层
 *
 * @author makejava
 * @since 2021-01-01 02:12:31
 */
@Api(tags = {"职位管理"})
@RestController
@RequestMapping("position")
public class PositionController {
    /**
     * 服务对象
     */
    @Resource
    private PositionService positionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("职位查询")
    @RequestMapping(path = "/selectOne", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Position selectOne(Integer id) {
        return this.positionService.queryById(id);
    }

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @ApiOperation("查询所有职位")
    @RequestMapping(path = "/selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<Position> selectAll() {
        return this.positionService.queryAll();
    }


    /**
     * 添加单条数据
     *
     * @return 单条数据
     */
    @ApiOperation("添加职位")
    @RequestMapping(path = "/addPositionl", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Position addPosition(Position position) {
        return this.positionService.insert(position);
    }

    /**
     * delete 单条数据
     *
     * @return Boolean
     */
    @ApiOperation("删除职位")
    @RequestMapping(path = "/deletePositionl", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Boolean deletePositionByID(Position position) {
        return this.positionService.deleteById(position.getPositionid());
    }




}