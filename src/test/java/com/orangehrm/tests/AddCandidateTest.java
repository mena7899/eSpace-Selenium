package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.orangehrm.base.APIsBaseTest;
import com.orangehrm.services.CandidateService;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


public class AddCandidateTest extends APIsBaseTest {

    public AddCandidateTest() throws IOException {
		super();
	}

	CandidateService candidateService = new CandidateService();

    @Test
    public void addCandidate() {
 

        var response = candidateService.addCandidate(AuthCookies);

        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
        assertEquals(response.statusCode(), 200);
    }
}