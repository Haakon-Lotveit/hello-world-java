//Absolutt enkleste byggejobb...
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
		sh 'cd my-app && mvn install'
            }
        }
    }
}
