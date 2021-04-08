package com.quanxi.qxdbapiv2.qxdsapi.service.impl;

import com.quanxi.qxdbapiv2.qxdsservice.service.QxPatientService;
import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.*;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTOutpatientRegisterDao;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTPatientDao;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTPatientInhosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QxPatientServiceImpl implements QxPatientService {
    @Autowired
    QxTPatientDao patientDao;

    @Autowired
    QxTPatientInhosDao patientInhosDao;

    @Autowired
    QxTOutpatientRegisterDao outpatientRegisterDao;

    @Override
    public QxPatientWithInhosAndClinic getPatientInfo(String uid) {
        QxPatientWithInhosAndClinic patientWithInhosAndClinic = new QxPatientWithInhosAndClinic();

        QxTPatient patient = new QxTPatient();
        patient.setPuid(uid);
        patientWithInhosAndClinic = patientDao.getPatientInfo(patient);
        if (null == patientWithInhosAndClinic) {
            return null;
        }

//        List<QxTPatientInhos> patientInhosList = patientInhosDao.selectPatientInhos(uid);
//        patientWithInhosAndClinic.setPatientInhosList(patientInhosList);
//
//        QxTOutpatientRegister outpatientRegister = new QxTOutpatientRegister();
//        outpatientRegister.setPuid(uid);
//        List<QxTOutpatientRegister> outpatientRegisterList = outpatientRegisterDao.select(outpatientRegister);
//        patientWithInhosAndClinic.setOutPatientList(outpatientRegisterList);

        return patientWithInhosAndClinic;
    }

}
