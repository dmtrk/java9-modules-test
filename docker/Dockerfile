#FROM progrium/busybox
#FROM cato1971/buildpack-deps-32bit:jessie-curl
#FROM ofayau/busybox-libc32
# FROM vimalathithen/alpine-glibc-x86
#FROM busybox:1.28.0-glibc
#FROM frolvlad/alpine-glibc
FROM ubuntu:17.04
# docker build -t busybox-jre8 .

# Set environment
#ENV JAVA_HOME /opt/java
#ENV PATH ${PATH}:${JAVA_HOME}/bin

ADD  jlinkOut/ /opt/app
#COPY docker/docker-entrypoint.sh /docker-entrypoint.sh
COPY docker/tini-static /opt/tini

RUN \
    chown -R 99:99 /opt/app && \
    chmod +x /opt/app/bin/run.sh && chmod +x /opt/tini

# Define default command.
WORKDIR /opt/app
EXPOSE 8080
USER 99
CMD ["/opt/tini", "--", "/opt/app/bin/run.sh"]