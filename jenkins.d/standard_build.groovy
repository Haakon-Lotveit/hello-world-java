//Absolutt enkleste byggejobb...
pipeline {
    stages {
        stage('Build') { 
            steps {
		sh 'javac HelloWorld.java'
            }
        }
    }
}
