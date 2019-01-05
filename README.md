# Simple Json project #
Project used to create a simple Json array in a /target directory. Usage is originally for running POC tests on Jenkins, working with Charts.js

## Run ##
Basic run commands

```
mvn clean install exec:java -Dexec.mainClass
```

Running above command runs the application, which will produce an 'index.html' file in the /target directory. That contains a generated graph of random points using Charts.js framework.

## Jenkin Configs ##
The pipeline Jenkinsfile is located in src/main/resources directory. In Jenkin's pull the pipeline from this location.

### Displaying report ###
To configure Jenkin's to allow for external .css and .js files to pulled in from .html pages in reports, a DirectoryBrowserSupport.CSP property has to be set. You can use this isn the Jenkins/Manage Jenkins/Scrip Console page in Jenkins. Once on the page, copy/paste the below command in the text field, and press 'Run'.
```
System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "sandbox allow-scripts; default-src 'self'; style-src 'self' 'unsafe-inline'; script-src * 'unsafe-inline';")
```
Using the Script Console requires re-entering the property every restart of Jenkins.
