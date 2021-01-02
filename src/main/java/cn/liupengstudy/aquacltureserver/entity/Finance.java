package cn.liupengstudy.aquacltureserver.entity;

import java.io.Serializable;

/**
 * 财务数据表(Finance)实体类
 *
 * @author liupeng
 * @since 2021-01-02 18:03:04
 */
public class Finance implements Serializable {
    private static final long serialVersionUID = 338925575631422987L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 收入支出
    */
    private Integer incomeAndExpenditureType;
    /**
    * 数额
    */
    private Double number;
    /**
    * 缘由
    */
    private String why;
    /**
    * 备注
    */
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