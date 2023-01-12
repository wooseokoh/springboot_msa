# Microservices with Spring Boot and Spring Cloud

- Spring MVC
- Service Discovery
- API Gateway
- Security
- Resilience4J Circuit Breaker
- Distributed Tracing
- Event Driven Architechture using Kafka

## 모놀리식 애플리케이션의 단점
> 거대한 코드베이스로 인해 코드이해가 어렵다.
> 하나의 코드 수정시 많은 테스트가 필요합니다.
> 모듈이 애플리케이션과 밀접하게 결합됩니다.
> 애플리케이션 스케일 증가시 비용이 많이 소모됩니다.

## Microservices 애플리케이션의 장점
> 모듈을 단일 springboot 애플리케이션으로 분리 가능
> 비지니스별로 코드 분리하여 이해 쉬움
> 모든 구성 요소를 테스트할 필요 없이 한 부분의 코드만 수정
> 하나의 구성 요소가 다운되어도 전체 애플리케이션에 영향을 미치지 않는다.
> 구성 요소 확장시 효과적인 비용으로 가능
