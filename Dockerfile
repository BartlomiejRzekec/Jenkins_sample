# Pull base image 
From tomcat:8-jre8 

COPY ./Jenkins-app-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
