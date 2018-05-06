mvn clean -DskipTests=true package
sudo docker build ./ --force-rm --tag=abrademoimg
sudo docker-compose -f full_docker.yml up
