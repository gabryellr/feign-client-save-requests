package com.gabryellr.feignclientsaverequests.model.requests;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SUCCESS_TABLE")
public class SuccessEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "REQUEST_BODY")
    private String requestBody;

    @Column(name = "RESPONSE_BODY")
    private String responseBody;

    @Column(name = "STATUS_CODE")
    private Integer statusCode;

    @Column(name = "REQUEST_TIME")
    private LocalDateTime requestTime;

    public SuccessEntity(String requestBody, String responseBody, Integer statusCode, LocalDateTime requestTime) {
        this.requestBody = requestBody;
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.requestTime = requestTime;
    }

    public SuccessEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }
}
