clone:
```
快速方式：
docker run --name nacos-standalone -e MODE=standalone -p 8848:8848 -d nacos/nacos-server:latest



git clone https://github.com/nacos-group/nacos-docker.git
cd nacos-docker

docker-compose -f example/standalone-mysql.yaml up
```