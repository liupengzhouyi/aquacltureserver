package cn.liupengstudy.aquacltureserver.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 抽象财务数据(AbstractFinancialData)实体类
 *
 * @author liupeng
 * @since 2021-01-05 20:47:25
 */
@ApiModel(value = "抽象财务数据实体类")
public class AbstractFinancialData implements Serializable {
    private static final long serialVersionUID = -23369623519255968L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 牲畜种类
    */
    @ApiModelProperty(value = "牲畜种类")
    private String livestoSpecies;
    /**
    * 变动数量
    */
    @ApiModelProperty(value = "变动数量")
    private Integer numberOfChanges;
    /**
    * 变动原因
    */
    @ApiModelProperty(value = "变动原因")
    private String why;
    /**
    * 总值
    */
    @ApiModelProperty(value = "总值")
    private Integer number;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLivestoSpecies() {
        return livestoSpecies;
    }

    public void setLivestoSpecies(String livestoSpecies) {
        this.livestoSpecies = livestoSpecies;
    }

    public Integer getNumberOfChanges() {
        return numberOfChanges;
    }

    public void setNumberOfChanges(Integer numberOfChanges) {
        this.numberOfChanges = numberOfChanges;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}