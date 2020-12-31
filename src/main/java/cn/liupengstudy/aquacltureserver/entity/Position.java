package cn.liupengstudy.aquacltureserver.entity;

import java.io.Serializable;

/**
 * 职位表(Position)实体类
 *
 * @author makejava
 * @since 2021-01-01 02:12:27
 */
public class Position implements Serializable {
    private static final long serialVersionUID = 858487967088354407L;
    /**
    * 自增ID
    */
    private Integer positionid;
    /**
    * 职位名称
    */
    private String position;
    /**
    * 职位描述
    */
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