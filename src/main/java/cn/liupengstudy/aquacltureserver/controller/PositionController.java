package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.Position;
import cn.liupengstudy.aquacltureserver.service.PositionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 职位表(Position)表控制层
 *
 * @author makejava
 * @since 2021-01-01 02:12:31
 */
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
    @RequestMapping("selectOne")
    public Position selectOne(Integer id) {
        return this.positionService.queryById(1);
    }

}