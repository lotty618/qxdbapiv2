package com.quanxi.qxdbapiv2.qxdsdaq.service.newlayer;

import com.quanxi.qxdbapiv2.qxmodel.entity.newlayer.QxPatientWithInhosAndClinic;

public interface QxPatientService {
    QxPatientWithInhosAndClinic getPatientInfo(String uid);
}
