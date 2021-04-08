package com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer.impl;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.*;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTOutpatientRegisterDao;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTPatientDao;
import com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer.QxTPatientInhosDao;
import com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer.QxPatientService;
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

        return patientWithInhosAndClinic;
    }

}
