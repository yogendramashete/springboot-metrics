# Springboot Metrics (Kotlin)

### Summary
Project to test springboot metrics with prometheus and grafana using docker images of both

### How to run using docker
* docker-compose

### How to run without docker
* ./gradlew bootRun
* ./prometheus/prometheus-run.sh
* ./grafana/grafana-run.sh


### Dependencies
* Springboot Actuator
* Springboot Web
* Springboot Devtools
* Micrometer Prometheus

### Other tools
* Grafana docker
* Prometheus docker

### References
* https://stackabuse.com/monitoring-spring-boot-apps-with-micrometer-prometheus-and-grafana
* https://dzone.com/articles/monitoring-spring-boot-applications-with-prometheu