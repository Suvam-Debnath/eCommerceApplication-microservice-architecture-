<h1 align="center">🛒 Microservices-Based eCommerce Application</h1>

<p align="center">
eCommerce platform built using Spring Boot Microservices with Kafka, Eureka, API Gateway, Config Server, Keycloak Authentication, and Zipkin.
</p>

<img width="1553" height="727" alt="ecom" src="https://github.com/user-attachments/assets/bd4a56cf-6259-4136-ad70-5539777fccc6" />

<hr/>

<h2>🚀 Architecture Overview</h2>
<p>
This system follows a fully decoupled microservices architecture, where each service is independently deployable, scalable, and secured using Keycloak.
</p>

<h2>🧩 Microservices & Ports</h2>

<ul>
  <li>👤 <strong>User Service</strong> — <code>PORT : 8082</code></li>
  <li>📦 <strong>Product Service</strong> — <code>PORT : 8083</code></li>
  <li>🧾 <strong>Order Service</strong> — <code>PORT : 8084</code></li>
  <li>🔔 <strong>Notification Service</strong> — Kafka Consumer Based</li>
</ul>

<h2>🔗 Supporting Services</h2>

<ul>
  <li>📘 <strong>Config Server</strong> — <code>PORT : 8888</code></li>
  <li>🛰️ <strong>Eureka Server</strong> — <code>PORT : 8761</code></li>
  <li>🚪 <strong>API Gateway</strong> — Unified entry point + routing</li>
  <li>📡 <strong>Kafka</strong> — Event streaming for async messaging</li>
  <li>🛰️ <strong>Zipkin</strong> — Distributed tracing</li>
  <li>🔐 <strong>Keycloak Authentication Server</strong> — Role-based security & JWT tokens</li>
</ul>

<hr/>

<h2>🔐 Security (Keycloak Integration)</h2>

<ul>
  <li>✔️ Centralized authentication & authorization</li>
  <li>✔️ Access-token-based validation in API Gateway</li>
  <li>✔️ Role-based access (ADMIN / USER)</li>
  <li>✔️ Microservices verify JWT tokens issued by Keycloak</li>
  <li>✔️ Secure communication between services</li>
</ul>

<hr/>

<h2>📁 Key Features</h2>

<ul>
  <li>✔️ Service registry & discovery with Eureka</li>
  <li>✔️ Centralized configuration with Config Server</li>
  <li>✔️ Distributed tracing using Zipkin</li>
  <li>✔️ Kafka-based notification system</li>
  <li>✔️ Load-balanced routing using API Gateway</li>
  <li>✔️ Secured endpoints using Keycloak</li>
  <li>✔️ API rate limiting</li>
  <li>✔️ Prometheus + Grafana monitoring</li>
</ul>

<hr/>


<hr/>

<h2>▶️ Running the Project</h2>

<ol>
  <li>🔐 Start <strong>Keycloak Server</strong></li>
  <li>📘 Start <strong>Config Server</strong> (port 8888)</li>
  <li>🛰️ Start <strong>Eureka Server</strong> (port 8761)</li>
  <li>🚪 Start <strong>API Gateway</strong></li>
  <li>⚙️ Start <strong>User, Product, Order</strong> services</li>
  <li>📡 Start <strong>Kafka & Zookeeper</strong></li>
  <li>🔔 Start <strong>Notification Service</strong></li>
  <li>🛰️ Start <strong>Zipkin</strong></li>
</ol>

<hr/>

<h2>📦 Tech Stack</h2>

<ul>
  <li>🌱 Spring Boot</li>
  <li>🛰️ Spring Cloud (Eureka, Config, Gateway)</li>
  <li>🔐 Keycloak (Authentication & Authorization)</li>
  <li>📡 Apache Kafka</li>
  <li>🗃️ MySQL / PostgreSQL / MongoDB</li>
  <li>🐳 Docker (optional)</li>
  <li>🔍 Zipkin</li>
</ul>

<hr/>

