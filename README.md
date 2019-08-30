# springboot2-jpa-crud-rest
CRUD Rest APIs using Spring boot 2, JPA, Hibernate 5 and MySQL

http://www.javaguides.net/2018/09/spring-boot-2-hibernate-5-mysql-crud-rest-api-tutorial.html

## Install and connect MySQL using Docker
docker pull mysql/mysql-server
docker run --name=mysql1 -d -p 3306:3306 mysql/mysql-server
docker logs mysql1

### Once initialization is finished, the command's output is going to contain the random password generated for the root user; check the password with, for example, this command:

docker logs mysql1 2>&1 | grep GENERATED

docker exec -it mysql1 mysql -uroot -p

### When asked, enter the generated root password
### Use password as password.

ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';
CREATE DATABASE users_database;
CREATE USER 'root'@'%' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

### A different user from root:
create user 'springuser'@'%' identified by 'ThePassword';
grant all on users_database.* to 'springuser'@'%';
