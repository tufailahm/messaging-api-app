node {
	    def mvnHome = tool 'OFSSMaven'
	    stage('Clone Repo') { // for display purposes
git branch: 'main', url: 'https://github.com/tufailahm/messaging-api-app.git'
	    }
	    stage('Build Project') {
	      bat "mvn clean package"
	    }
	    stage('Build Docker Image') {
	    echo "Building docker image -- to do"
	    }
	}

