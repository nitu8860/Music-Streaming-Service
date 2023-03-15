# Music-Streaming-Service
## Frameworks and Language Used:

-Java

-Spring Boot

-Spring Data JPA

-MySQL

-Swagger UI


## Data Flow:

### Controller

UserController: Handles requests related to user authentication and CRUD operations for users.

SongController: Handles CRUD operations for songs. Only users with admin role can perform CRUD operations.

PlaylistController: Handles CRUD operations for playlists. Only users with user role can perform CRUD operations.

### Services

UserService: Implements business logic related to user authentication and CRUD operations for users.

SongService: Implements business logic related to CRUD operations for songs.

PlaylistService: Implements business logic related to CRUD operations for playlists.


### Repository

UserRepository: Defines methods to access user data from the database.

SongRepository: Defines methods to access song data from the database.

PlaylistRepository: Defines methods to access playlist data from the database.


## Database Design-

User: Contains user details such as username, password, and user role.

Song: Contains song details such as title, artist, and album.

Playlist: Contains playlist details such as name, user, and songs.

### Data Structure Used in My Project-

Array: Used to store the list of songs in a playlist.


## Project Summary-
This project is a music streaming service that allows users to create playlists and add songs to them. Users can also perform CRUD operations on their own account and songs they have added. Admin users have additional privileges to perform CRUD operations on all songs. The project is built using Java and Spring Boot, with a MySQL database to store data. 
The Swagger UI is used to provide an interactive API documentation. 

The project is deployed on EC2 instance and can be accessed through the following link: http://18.118.37.126:8080/swagger-ui/index.html
