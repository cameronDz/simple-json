# Simple Json project #
Project used to create a simple Json array in a /target directory. Usage is originally for running POC tests on Jenkins, working with Charts.js

## Run ##
Basic run commands

```
mvn clean install
mvn exec:java -Dexec.mainClass
```

Running above commands will run the application, producing a 'list.json' file in the /target directory.
