# Use an official OpenJDK runtime as base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the Java application JAR file into the container at /usr/src/app
COPY . /usr/src/app

# Compile the Java code
RUN javac EstebanLopez.java

# Run the Java application when the container launches
CMD ["java", "EstebanLopez"]
