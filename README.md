<img align="right" src="https://github.com/ada-school/module-template/blob/main/ada.png">


## Spring Boot Data with MongoDB

**Learning Objectives**

- Explain what MongoDB is.
- Explain the difference between SQL and NoSQL.
- Create a MongoDB Cluster on Atlas.
- Connect your Spring Boot project with a MongoDB Cluster.


## Detail Orientation 🤹🏽

Read the following document [Attention to details)[https://www.csu.edu/humanresources/empdev/documents/AttentiontoDetail.pdf]  


**Main Topics**
 * NoSQL.
 * MongoDB.
 * Cluster.

## Codelab 🧪

🗣️ "I hear and I forget I see and I remember I do and I understand." Confucius

### Part 1: Connecting my MongoDB Cluster with Srping Boot

1. Create a new project using the [Spring Initializr](https://start.spring.io/)
  * Use either *Java* or *Kotlin* as programming language.
  * Use Gradle as project option(if your computer is slow then use  Maven)
  * Add Spring Web dependency before generating the project.
2. Create a new repository on Github and commit the files generated in 1.
3. Create a new package called *dto* and inside define your *UserDto* object with at least the following fields:
    * name.
    * email.
    * lastName.
    * createdAt.
4. Create a new package called *data* and inside define your *User* data object with at least the following fields:
    * id.
    * name.
    * email.
    * lastName.
    * createdAt.
5. Create a new package called *service* an inside create the following interface:

**Java:**
 ```java
     public interface UserService
     {
         User create( User user );

         User findById( String id );
         
         List<User> all();

         void deleteById( String id );

         User update( User user, String userId );
     }
  ```
  **Kotlin:**
  ```kotlin
      interface UserService {

         fun create( user: User): User

         fun findById( String id ): User?
         
         fun  all(): List<User>

         fun deleteById( String id )

         fun update( User user, String userId ): User

      }
  ```

