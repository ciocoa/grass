FROM alpine:latest
ENV \
  GC_TZ=America/New_York \
  GC_LANGUAGE=en_US \
  GC_ACCESS_ADDRESS=127.0.0.1 \
  GC_BIND_PORT=443 \
  GC_AUTO_CREATE=true \
  GC_ENABLE_CONSOLE=false \
  GC_MONGODB_URL=127.0.0.1:27017
COPY * /tmp/
RUN sh /tmp/docker-run.sh
EXPOSE 443 22102/udp
VOLUME [ "/plugins" ]
ENTRYPOINT [ "/docker-entrypoint.sh" ]
