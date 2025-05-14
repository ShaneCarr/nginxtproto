# This is a sample project to demonstrate how to use Nginx dropwizard
- Rate limiting
- routing
- docker
- 

## layout
nginxtest/
├── graph-gw/
│   └── nginx/
│       ├── nginx.conf
│       └── logs/
└── svc-next/
└── svc-next-service/
└── src/main/resources/config.yml
## Running the project
Make sure svc-next and graph-gw are built and runnable:

## before you start
You can also just run this from intellj with the run configuration defined in the project.
cd svc-next/svc-next-service
mvn clean install
java -jar target/svc-next-service-1.0-SNAPSHOT.jar server src/main/resources/config.yml

cd ../../../graph-gw/graph-gw-service
mvn clean install
java -jar target/graph-gw-service-1.0-SNAPSHOT.jar server src/main/resources/config.yml

## run nginx
cp /opt/homebrew/etc/nginx/mime.types /Users/shane/repo/nginxtest/graph-gw/nginx/
nginx -c /Users/shane/repo/nginxtest/graph-gw/nginx/nginx.conf
nginx -s reload  # Reload config after edits
nginx -s stop    # Shut down NGINX