# Simple Json project #
Project used to create a simple Json array in a /target directory. Usage is originally for running POC tests on Jenkins, working with Charts.js

## Run ##
Basic run commands

```
mvn clean install exec:java -Dexec.mainClass
```

Running above command will run the application, producing a 'list.js' file in the /target directory.

## Jenkin Configs ##
The pipeline Jenkinsfile is located in src/main/resources directory. In Jenkin's pull the pipeline from this location.

### Displaying report ###
To configure Jenkin's to allow for external .css and .js files to pulled in from .html pages in reports, a DirectoryBrowserSupport.CSP property has to be set. You can use this isn the Jenkins/Manage Jenkins/Scrip Console page in Jenkins. Once on the page, copy/paste the below command in the text field, and press 'Run'.
```
System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "default-src 'self' [https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css] [https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js] ")
```