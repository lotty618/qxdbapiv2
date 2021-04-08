package com.quanxi.qxdbapiv2.qxmodel.entity.newlayer;

import com.quanxi.qxdbapiv2.qxcommon.util.DateTimeUtil;

import java.util.List;

public class QxPatientWithInhosAndClinic extends QxTPatient {
    /** 性别代码（本人生理性别的代码），为QX_T_PATIENT表中GENDER_CODE的别名 */
    private String sex;

    /** 系统当前时间 */
    private String nowtime = DateTimeUtil.getCurrSysTime();

    /** 住院信息 */
    private List<QxTPatientInhos> patientInhosList;

    /** 门诊信息 */
    private List<QxTOutpatientRegister> outPatientList;

    public String getSex() {
        return getGenderCode();
    }

    public void setSex(String sex) {
        this.sex = sex;
        setGenderCode(sex);
    }

    public String getNowtime() {
        return nowtime;
    }

    public List<QxTPatientInhos> getPatientInhosList() {
        return patientInhosList;
    }

    public void setPatientInhosList(List<QxTPatientInhos> patientInhosList) {
        this.patientInhosList = patientInhosList;
    }

    public List<QxTOutpatientRegister> getOutPatientList() {
        return outPatientList;
    }

    public void setOutPatientList(List<QxTOutpatientRegister> outPatientList) {
        this.outPatientList = outPatientList;
    }
}
