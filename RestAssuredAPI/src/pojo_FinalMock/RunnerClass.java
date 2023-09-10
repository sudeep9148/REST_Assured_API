package pojo_FinalMock;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo1.Data;

public class RunnerClass 
{
public static void main(String[] args) 
{
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification r=RestAssured.given();
	Response res = r.request(Method.GET,"/api/users?page=2");
	List_user l= res.as(List_user.class);
	List<Data> d = l.getData();
	for(Data data:d)
	{
		int id = data.getId();
		System.out.println(id);
	}
}
}
