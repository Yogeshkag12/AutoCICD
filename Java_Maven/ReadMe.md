# CICD Complete Guide
This document is to provide complete guide of configuring CICD from scratch.
## CI
###Prerequisite 
NGRock is for jenkins github integration. As we know that github need jenkins domain where github webhook can be configured and connect .
whenever changes are pushed in git hub, github will notify to jenkins for trigger pipeline.
 
* https://ngrok.com/download

Here detailed steps will be available where user submit changes and its trigger pipeline and provide unit test case, code coverage and BVT test case.
##CD
This document is for how to deploy on various topology
* Deployment on Local system
* Deployment on Docker
* Deployment on Kubernete

##Code coverage
Enable code coverage using sonarqube 

##Quality Gate
Provide details how to configure quality gate to mark build pass/fail based on defined threshold 

##Refrences
* https://gist.github.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc
