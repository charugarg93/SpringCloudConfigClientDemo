# SpringCloudConfigClientDemo

In the bootstrap.properties file,
spring.application.name=chai,
name has to be the same as the properties file name in SpringCloudConfigServiceDemo Project. 
When this project is loaded, it goes to the location http://localhost:8081 using the following statement

spring.cloud.config.uri=http://localhost:8081 

Now, it will look for properties file named chai.properties. Oce it finds it, it will fetch all the data needed for this project.
