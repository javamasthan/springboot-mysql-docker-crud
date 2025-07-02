Git Commands to place this repo in the GitHub 
=================================
cd path/to/your/project
git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/yourusername/your-repo.git
git branch -M main
git push -u origin main

Docker commands to integrate Docker in this repo

For Docker follow the below steps 
==================================
install docker from https://www.docker.com/products/docker-desktop/ -> click on Download Docker Desktop -> choose Download for Windows for AMD64 
wsl --update on windows cmd
create Dockerfile in the in root project
create docker-compose.yml file in the root project

mvn commands 
===================================
mvn clean package

docker commands
===================================

docker-compose down -v

docker-compose up --build


