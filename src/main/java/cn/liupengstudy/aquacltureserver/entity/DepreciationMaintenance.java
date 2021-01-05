package cn.liupengstudy.aquacltureserver.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 折旧维护数据库(DepreciationMaintenance)实体类
 *
 * @author liupeng
 * @since 2021-01-05 20:47:08
 */
@ApiModel(value = "折旧维护数据库实体类")
public class DepreciationMaintenance implements Serializable {
    private static final long serialVersionUID = -97771498471305430L;
    /**
    *  自增ID
    */
    @ApiModelProperty(value = " 自增ID")
    private Integer id;
    /**
    * 项目名称
    */
    @ApiModelProperty(value = "项目名称")
    private String projectName;
    /**
    * 维护原因
    */
    @ApiModelProperty(value = "维护原因")
    private String why;
    /**
    * 花费
    */
    @ApiModelProperty(value = "花费")
    private Object spending;
    /**
    * 旧照片
    */
    @ApiModelProperty(value = "旧照片")
    private String ordimg;
    /**
    * 新照片
    */
    @ApiModelProperty(value = "新照片")
    private String newimg;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public Object getSpending() {
        return spending;
    }

    public void setSpending(Object spending) {
        this.spending = spending;
    }

    public String getOrdimg() {
        return ordimg;
    }

    public void setOrdimg(String ordimg) {
        this.ordimg = ordimg;
    }

    public String getNewimg() {
        return newimg;
    }

    public void setNewimg(String newimg) {
        this.newimg = newimg;
    }

}