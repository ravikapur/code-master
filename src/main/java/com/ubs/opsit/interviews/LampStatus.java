package com.ubs.opsit.interviews;

public enum LampStatus {

    Y("Y"), R("R"), O("O");

    private String status;

    private LampStatus(String status) {
	this.status = status;
    }

    @Override
    public String toString() {
	return status;
    }
}
