pipeline {
	agent any
	
	stages {
		stage ('compile') {
			steps {
				withMaven(maven : 'maven') {
					sh 'mvn clean compile'
				}
			}
		}
		
		stage ('test') {
			steps {
				sh 'echo "testing.. done.."'
			}
		}
		
		stage ('deploy') {
			steps {
				withMaven(maven : 'maven') {
					sh 'mvn deploy'
				}
			}
		}
	}
}