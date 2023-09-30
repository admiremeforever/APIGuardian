Steps to test the application 
Requirements (JDK 17 & and any Suitable IDS and POSTMAN)
 
Step 1-> Run the application (it should run on 8080), and open Postman.

Private registeration API 
Hit the following API: http://localhost:8080/api/v1/auth/signup. Remember to include the required request body. Afterwards, examine the response: a successful registration message along with the user token will be returned.

Step 2 ->
Hit the Sign-In API URL: http://localhost:8080/api/v1/auth/signin, ensuring that the request body contains an invalid password. Subsequently, examine the response: the authentication process will fail, and the HTTP status code will be 403.

Step 3 -> 

Hit the Sign-In API UR again, this time including a valid password in the request body. Proceed to examine the response: the authentication process will be successful, and the user token will be returned.

Step 4 -> 
Hit this http://localhost:8080/api/v1/resource without including the required authorization. As this API is protected, the resource cannot be accessed without a token. Verify the response for further details.

Step 5 ->

Copy the user token generated during the sign-up process and include it as an authorization header (Bearer Token type). Send another request to the Resource API URL and examine the response: we should now have successful access to the desired resource. 


Step 6 ->
Public API 
Hit this http://localhost:8080/public/api/test without including the required authorization. As this API is public , we will get the output as "This is public API.."

