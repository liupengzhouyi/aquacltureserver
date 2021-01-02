package cn.liupengstudy.aquacltureserver.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 员工表(Staff)实体类
 *
 * @author liupeng
 * @since 2021-01-02 15:45:59
 */
public class Staff implements Serializable {
    private static final long serialVersionUID = -31848280342653076L;
    /**
    * 自增ID
    */
    private Integer id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 职位
    */
    private Integer positionId;
    /**
    * 联系方式
    */
    private String phoneNumber;
    /**
    * 身份证号码
    */
    private String idCardNumber;
    /**
    * 工资
    */
    private Double wage;
    /**
    * 入职日期
    */
    private Date entryDate;
    /**
    * 离职日期
    */
    private Date separationDate;
    /**
    * 是否离职
    */
    private Integer isSeparation;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(Date separationDate) {
        this.separationDate = separationDate;
    }

    public Integer getIsSeparation() {
        return isSeparation;
    }

    public void setIsSeparation(Integer isSeparation) {
        this.isSeparation = isSeparation;
    }

}