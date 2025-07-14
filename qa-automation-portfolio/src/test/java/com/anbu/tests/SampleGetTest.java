
package com.anbu.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleGetTest {
    @Test
    public void testGetUser() {
        Response res = RestAssured.get("https://reqres.in/api/users/2");
        Assert.assertEquals(res.getStatusCode(), 200);
        Assert.assertTrue(res.body().asString().contains("Janet"));
    }
}
