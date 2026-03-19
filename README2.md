mvn io.quarkus.platform:quarkus-maven-plugin:3.32.3:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=getting-started \
    -Dextensions='rest'
cd getting-started

./mvnw install
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
curl -w "\n" http://localhost:8080/hello

./mvnw package -Dnative -Dquarkus.native.container-build=true

docker build -f src/main/docker/Dockerfile.native -t quarkus/getting-started .
docker run -i --rm -p 8080:8080 quarkus/getting-started