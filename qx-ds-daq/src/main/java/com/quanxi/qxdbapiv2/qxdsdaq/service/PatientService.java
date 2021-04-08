package com.quanxi.qxdbapiv2.qxdsdaq.service;


public interface PatientService {
    boolean importPatientData();
    boolean importSinglePatientData();
    boolean batchImportPatientData();
    boolean batchImportPatientDataEx();
}
