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