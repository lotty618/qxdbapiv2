package com.quanxi.qxdbapiv2.qxdsservice.service;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxPatientWithInhosAndClinic;

public interface QxPatientService {
    public QxPatientWithInhosAndClinic getPatientInfo(String uid);
}
