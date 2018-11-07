node {
    stage('pull project') {
        git 'https://github.com/cameronDz/simple-json.git'
    }
    stage('install and build project') {
        sh 'mvn clean install exec:java -Dexec:mainClass'
    }
    stage('archive artifact') {
        archiveArtifacts artifacts: 'target/list.js'
    }
}
