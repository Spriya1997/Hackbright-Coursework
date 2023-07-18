 # Savor Share - Data research
 ## Sign Up Details
* User data : name, email Id, password.
* System data : User id, registered_date and time 

## Login Details
* User data : email Id, password.

## User Profile Entity
* User data : Profile photo, First Name, Last Name, Country, City.
* System data : User id(foreign key), update timestamp.  

## Cooking recipe detail
- User data : name, ingredients, instructions, serving size, cooking time, difficulty level, cuisines, dietary preferences, Meal type(breakfast, lunch, main course, appetizer, dessert, drink), additional notes (cooking pro tips), reference( public or private), add tag(healty, less than 10 mins, low calories), cooking images or videos to their recipe, FAQ.
- System data   : recipe id, user id(foreign key to user entity) create timestamp, update timestamp.

## Like Entity - recipe like and unlike
- System data : like id, recipe id (foreign Key to recipe entity), user id (foreign Key to recipe entity),like timestamp.

## Ratings Entity
- User data : rating value (1 to 5)
- System data : rating id, recipe id (foreign Key to recipe entity), user id (foreign Key to recipe entity), create timestamp, update timestamp.

## Comments Entity
- User data : comment text
- System data : comments id, recipe id (foreign Key to recipe entity), user id (foreign Key to recipe entity), create timestamp, update timestamp.

## Notification Entity
- System data : notification id, user id (foreign Key to recipe entity), message, timestamp.

The above user data and system data provide a basic structure for storing and managing informations related to user registration, recipe management, community interactions and notifications in a cooking recipe sharing application
