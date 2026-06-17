pipeline{
	agent any
	
	tools{
		maven 'Maven'
	}
	
	stages{
		stage('Checkout'){
			steps{
				git branch:'master',url:'https://github.com/sindhud205/guavaapp.git'
			}
		}
		
		stage('Build'){
			steps{
				sh 'mvn clean package'
			}
		}
		
		stage('Test'){
			steps{
				sh 'mvn test'
			}
		}
		
		stage('Run Application'){
			steps{
				sh 'java -jar target/guavaapp-1.0-SNAPSHOT.jar'
			}
		}
		
	}
	
	post{
		success{
			echo "build and deployment successfull!"
		}
		
		failure{
			echo "build failed"
		}
	}
}
