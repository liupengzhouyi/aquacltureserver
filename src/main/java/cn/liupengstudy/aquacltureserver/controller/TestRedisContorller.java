package cn.liupengstudy.aquacltureserver.controller;

import cn.liupengstudy.aquacltureserver.entity.Staff;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

/**
 * @文件名 cn.liupengstudy.aquacltureserver.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2021/1/5 - 6:26 下午
 * @修改人和其它信息
 */
@Api(tags = {"Redis管理"})
@RestController
@RequestMapping("TestRedis")
public class TestRedisContorller {

    @Autowired
    private RedisTemplate redisTemplate;

    @ApiOperation("TestRedisSet")
    @RequestMapping(path = "TestRedisSet", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String employeeResignationSet (@RequestBody Staff staff) {
        redisTemplate.opsForValue().set("aaa", staff.getPhoneNumber());
        return staff.getIdCardNumber();
    }

    @ApiOperation("TestRedisGet")
    @RequestMapping(path = "TestRedisGet", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Staff employeeResignationGet () {
        System.out.println(redisTemplate.opsForValue().get("aaa"));
        String value = (String) redisTemplate.opsForValue().get("aaa");
        Staff staff = new Staff();
        staff.setName(value);
        return staff;
    }


}
