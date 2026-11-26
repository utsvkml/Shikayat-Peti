package com.utsav.kamal.Shikayat_Pati.enums;

public enum ComplainStatus {
    LODGED ("Lodged"),
    IN_PROGRESS("In Progress"),
    RESOLVED ("Resolved");

    String label;

    ComplainStatus(String label){
        this.label = label;
    }
}
