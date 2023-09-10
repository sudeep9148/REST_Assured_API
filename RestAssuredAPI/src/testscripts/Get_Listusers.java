package testscripts;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Get_Listusers 
{
	public static void main(String[] args) 
	{

		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification r = RestAssured.given();
		 Response res = r.request(Method.GET,"/api/users?page=2");
		System.out.println(res.asString());
	}

}
