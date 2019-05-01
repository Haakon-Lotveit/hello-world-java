//Absolutt enkleste byggejobb...
pipeline {
    agent { any }
    stages {
        stage('Build') { 
            steps {
		sh 'javac HelloWorld.java'
            }
        }
    }
}
