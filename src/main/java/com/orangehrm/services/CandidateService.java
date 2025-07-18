package com.orangehrm.services;


import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.Map;


public class CandidateService {
	

	

    public Response addCandidate(Map<String, String>  AuthCookies)  {
    	


        String body = """
        {
        		"firstName": "aaaa@aaa.com",
        		"middleName": null,
        		"lastName": "aaaa@aaa.com",
        		"email": "aaaa@aaa.com",
        		"contactNumber": null,
        		"keywords": null,
        		"comment": null,
        		"dateOfApplication": "2025-07-18",
        		"consentToKeepData": false
        		}
        """;

        return given()
        	.cookies(AuthCookies)
            .header("Content-Type", "application/json")
            .body(body)
        .when()
            .post("/web/index.php/api/v2/recruitment/candidates");
    }
}
