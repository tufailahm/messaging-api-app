node {
	    // reference to maven
	    // ** NOTE: This 'maven-3.5.2' Maven tool must be configured in the Jenkins Global Configuration.
	    def mvnHome = tool 'OFSSMaven'


	    // holds reference to docker image
	  //  def dockerImage
	    // ip address of the docker private repository(nexus)

	//    def dockerImageTag = "8867205331/dockerhub{env.BUILD_NUMBER}"

	    stage('Clone Repo') { // for display purposes
	      // Get some code from a GitHub repository
git branch: 'main', url: 'https://github.com/tufailahm/messaging-api-app.git'
	      // Get the Maven tool.
	      mvnHome = tool 'OFSSMaven'
	    }

	    stage('Build Project') {
	      // build project via maven
	      bat "mvn -Dmaven.test.failure.ignore=true clean package"
	    }

	    stage('Build Docker Image') {
	      // build docker image
	    }


	}

