package testscripts;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Get_All
{
	public static void main(String[] args) 
	{

		RestAssured.baseURI="https://reqres.in/";
		 RequestSpecification r = RestAssured.given();
		 Response res = r.request(Method.GET,"/api/users?page=2");
		 res.prettyPrint();
		 Response res1 = r.request(Method.GET,"/api/unknown");
		 res1.prettyPrint();
		Response res2 = r.request(Method.GET,"/api/unknown/2");
		 res2.prettyPrint();
		Response res3 = r.request(Method.GET,"/api/users/2");
		 res3.prettyPrint();
		 Response res4 = r.request(Method.GET,"/api/users/23");
		 res4.prettyPrint();
		Response res5 = r.request(Method.GET,"/api/users?delay=3");
		 res5.prettyPrint();
		Response res6 = r.request(Method.GET,"/api/unknown/23");
		 res6.prettyPrint();
		 System.out.println("The status code of Listusers is: "+ res.getStatusCode());
		 System.out.println("The status code is: "+ res1.getStatusCode());
		 System.out.println("The status code of SingleResource is: "+ res2.getStatusCode());
		 System.out.println("The status code of Singleuser is: "+ res3.getStatusCode());
		 System.out.println("The status code of Singleusernotfound  is: "+ res4.getStatusCode());
		 System.out.println("The status code of DelayedResponse is: "+ res5.getStatusCode());
		System.out.println("The status code of SingleResourcenotfound is: "+ res6.getStatusCode());
	}

}
