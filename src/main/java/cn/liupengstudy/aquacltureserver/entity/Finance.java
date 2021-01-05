package cn.liupengstudy.aquacltureserver.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 财务数据表(Finance)实体类
 *
 * @author liupeng
 * @since 2021-01-05 20:47:39
 */
@ApiModel(value = "财务数据表实体类")
public class Finance implements Serializable {
    private static final long serialVersionUID = -11229632672067846L;
    /**
    * 自增ID
    */
    @ApiModelProperty(value = "自增ID")
    private Integer id;
    /**
    * 收入支出
    */
    @ApiModelProperty(value = "收入支出")
    private Integer incomeAndExpenditureType;
    /**
    * 数额
    */
    @ApiModelProperty(value = "数额")
    private Double number;
    /**
    * 缘由
    */
    @ApiModelProperty(value = "缘由")
    private String why;
    /**
    * 备注
    */
    @ApiModelProperty(value = "备注")
    private String note;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIncomeAndExpenditureType() {
        return incomeAndExpenditureType;
    }

    public void setIncomeAndExpenditureType(Integer incomeAndExpenditureType) {
        this.incomeAndExpenditureType = incomeAndExpenditureType;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}