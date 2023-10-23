# grasscutter

A server software reimplementation for a certain anime game.

## docker

```yaml
# docker-compose
services:
  mongo:
    image: mongo
    restart: always
    ports:
      - "27017:27017"
    volumes:
      - ./db:/data/db
    environment:
      MONGO_INITDB_ROOT_USERNAME: root
      MONGO_INITDB_ROOT_PASSWORD: 123456
  serve:
    depends_on:
      - mongo
    image: ghcr.io/ciocoa/grasscutter
    restart: always
    ports:
      - "443:443"
      - "22102:22102/udp"
    volumes:
      - ./plugins:/plugins
    environment:
      GC_TZ: Asia/Shanghai
      GC_LANGUAGE: zh_CN
      GC_ACCESS_ADDRESS: 127.0.0.1
      GC_BIND_PORT: 443
      GC_AUTO_CREATE: true
      GC_ENABLE_CONSOLE: "false"
      GC_MONGODB_URL: mongodb://root:123456@mongo:27017
```
