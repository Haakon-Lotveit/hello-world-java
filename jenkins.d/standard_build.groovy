//Absolutt enkleste byggejobb...
pipeline {
    stages {
        stage('Build') { 
            steps {
sh 'ls .j
		sh 'javac HelloWorld.java'
            }
        }
    }
}
