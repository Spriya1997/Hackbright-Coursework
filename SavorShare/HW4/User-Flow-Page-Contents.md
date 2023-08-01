 # Savor Share - User Flow Page Details

## Landing Page :
* Data : Login Details - registered email id, password
* Action :
  1.  Login - Existing users can login to the Savor Share app using their email id and password.
  2.  Sign up - New User hits the Signup button for registration.
  3.  Forgot password - If registered users forget their password they hit the forgot password.
* Result : 
  1. Login page validates the user's email id and password. Valid credentials of the user can login successfully to the homepage. Invalid credentials redirects to the login page again displaying the error.
  2. Selecting the Signup button goes to the signup page for registering new user details.
  3. User enters registered email address and selecting forgot password go to forgot password page for resetting the password. 

 ## Sign Up Page :
* Data : Name, Username(unique), email Id, password, confirm password are the details collected by the user for creating an account.
* Action : After hitting the submit button signup page validates user details with the database.
* Result : 
  1. If user provided input is valid, it will create a new account for the user to login, redirects to landing page.
  2. If user provided input is invalid, it will prompt to correct the user details and signup again.

 ## Forgot Password Page :
* Data : Forgot password page displays user to generate OTP to confirm the email address. 
* Action : Validates the OTP. 
*  Result : 
  1. If the user provided valid OTP, it will prompt users to update a new password,validate and stores the new password in the database. Successful updation of the password redirects the page to the landing page.
  2. If the user provided invalid OTP, it will prompt users to hit the request OTP button again to generate the new OTP again.

 ## Home Page :
* Data : display community recipe feed of posts including images, likes, ratings, save and comments.
* Link to other experiences :  User profile, create new recipe, search, collections, notification and logout. 
* Action : 
  1. User profile redirects to profile details page. 
  2. Create new recipe redirects to the new cooking recipe page. 
  3. Search used to filter recipes to show our favorite recipe in the community recipes. 
  4. Collections redirects to the collection page to view our saved recipes. 
  5. Notifications show messages related to likes, ratings and comments. 
  6. Logout redirects to the landing page of the Savor share application.
* Result : From the homepage we can go to the profile page, add a new recipe page, collections, notifications and logout from the app.

 ## User Profile Page :
* Data : Displays user details - profile photo, first name, last name, country, city.
* Link to other experiences : Update user details, view tagged recipes, view posted recipes.
* Result :  
  1. Users can view their profile in this profile page. 
  2. Users can modify their profile details by hitting the update user button. It redirects to update profile.
  3. Users can view the tagged recipes by hitting the tagged recipe button. It redirects to the tagged recipes page.
  4. Users can view their cooking recipes by hitting the view recipe button. It redirects to the view recipes page.
  5. Users can edit and delete their recipes in the recipe view page.

## Update user profile page:
* Data : Displays user details - profile photo, first name, last name, country, city and submit.
* Action :  Validates the user details 
* Result : Update the user details 

## View tagged recipes page :
* Data : Displays tagged cooking recipes.
* Result : View the tagged recipes.

## View users posted recipes page :
* Data : Displays posted (public & private) cooking recipes.
* Link to other experience : update recipe, delete recipes.
* Action :
  1. Users can update their cooking recipes by hitting update. It redirects to the update posted recipes page.
  2. Users can delete their cooking recipes by hitting delete.
* Result : View all posted cooking recipes.
  
## Update posted recipe :
* Data : Displays name, ingredients, instructions, serving size, cooking time, difficulty level, cuisines, dietary preferences, Meal type(breakfast, lunch, main course, appetizer, dessert, drink), additional notes (cooking pro tips), reference( public or private), add tag(healthy, less than 10 mins, low calories), cooking images or videos to their recipe, FAQ, recipe photo.
* Action :  Users can modify their posted cooking recipe details and validate the recipe details.
* Result : 
  1. Updates the recipe details.
  2. Users can view their public recipes in the community and all posted recipes in the view page.

## Create new recipe:
* Data :  Displays name, ingredients, instructions, serving size, cooking time, difficulty level, cuisines, dietary preferences, Meal type(breakfast, lunch, main course, appetizer, dessert, drink), additional notes (cooking pro tips), reference( public or private), add tag(healthy, less than 10 mins, low calories), cooking images or videos to their recipe, FAQ, recipe photo.
* Action : Fill the details of the new cooking recipe.
* Result : Users can either post the recipe public (community can be viewed) or private (only users can view the recipe). 

## Search:
* Data : Displays an input box for entering the keyword.
* Action :  Enter the keyword to search the recipes in the community recipes.
* Result : Search for the keyword and show the search result of the cooking recipe. 

## Collection Page :
* Data :  Displays users saved recipes in an organized way (categories like Vegan, Non- vegetarian, Zero calories, Healthy,..)
* Action : Selecting recipe displays the full details of the cooking recipe. 
* Result : Users can view cooking recipes in the collection and they can give likes, ratings, comments and users can unsave the recipe as well. 

 ## Notification Page :
* Data : Displays message and time.
* Action :
  1. When users get a new message, notification tab will be highlighted and shows count of number of new messages in application.
  2. If a user's phone number is registered, they will receive milestone notifications via text message, such as "Congratulations for getting 100 likes" and "successfully uploaded your first recipe."    
* Result : unread messages will be highlighted and followed by read messages will be displayed in the notification.

