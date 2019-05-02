//Absolutt enkleste byggejobb...
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
		sh 'pushd my-app && mvn install'
            }
        }
    }
}
