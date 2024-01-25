# AutohausChile Database Configuration

Make sure to configure your database settings in the `application.properties` file. Here's an example configuration for MySQL:

```properties
# Database Configuration

# Specify the JDBC driver class
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

# Define the database connection URL
spring.datasource.url=jdbc:mysql://localhost:3306/autohauschile

# Set the database username
spring.datasource.username=root

# Provide the database password
spring.datasource.password=

# Enable SQL logging for debugging purposes
spring.jpa.show-sql=true

# Configure Hibernate to automatically update the database schema
spring.jpa.hibernate.ddl-auto=update

# Set the Hibernate dialect for MySQL
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
