package cn.liupengstudy.aquacltureserver.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 职位表(Position)实体类
 *
 * @author liupeng
 * @since 2021-01-05 20:47:52
 */
@ApiModel(value = "职位表实体类")
public class Position implements Serializable {
    private static final long serialVersionUID = 238277976136206320L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer positionid;
    /**
    * 职位名称
    */
    @ApiModelProperty(value = "职位名称")
    private String position;
    /**
    * 职位描述
    */
    @ApiModelProperty(value = "职位描述")
    private String descriptionPosition;


    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescriptionPosition() {
        return descriptionPosition;
    }

    public void setDescriptionPosition(String descriptionPosition) {
        this.descriptionPosition = descriptionPosition;
    }

}