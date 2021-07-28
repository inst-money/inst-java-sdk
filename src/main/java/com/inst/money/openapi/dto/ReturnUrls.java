package com.inst.money.openapi.dto;

public class ReturnUrls {
    private String success_url;

    private String status_url;

    private String fail_url;

    public String getSuccess_url() {
        return success_url;
    }
    public void setSuccess_url(String success_url) {
        this.success_url = success_url;
    }

    public String getStatus_url() {
        return status_url;
    }
    public void setStatus_url(String status_url) {
        this.status_url = status_url;
    }

    public String getFail_url() {
        return fail_url;
    }
    public void setFail_url(String fail_url) {
        this.fail_url = fail_url;
    }
}
