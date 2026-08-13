# Chat Application

A Spring Boot WebSocket-based chat application that allows real-time messaging between users.

## Features

- **Real-time Messaging**: WebSocket support for instant message delivery
- **Message Persistence**: Messages are stored in the database
- **User-friendly Interface**: Simple HTML/JavaScript frontend
- **Security**: Spring Security integration for protected endpoints

## Project Structure

```
src/
├── main/
│   ├── java/com/example/chat/
│   │   ├── ChatApplication.java          # Main Spring Boot application
│   │   ├── config/
│   │   │   ├── SecurityConfig.java       # Spring Security configuration
│   │   │   └── WebSocketConfig.java      # WebSocket configuration
│   │   ├── controller/
│   │   │   └── ChatController.java       # REST endpoints for chat
│   │   ├── model/
│   │   │   └── Message.java              # Message entity
│   │   ├── repository/
│   │   │   └── MessageRepository.java    # Database access layer
│   │   └── service/
│   │       └── MessageService.java       # Business logic
│   └── resources/
│       ├── application.properties         # Application configuration
│       ├── static/
│       │   └── index.html                # Frontend UI
│       └── templates/
└── test/
    └── java/com/example/chat/
        └── ChatApplicationTests.java     # Unit tests
```

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

## Building the Application

```bash
./mvnw clean build
```

## Running the Application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## Configuration

Edit `src/main/resources/application.properties` to configure:
- Server port
- Database connection
- WebSocket settings

## Testing

Run tests with:

```bash
./mvnw test
```

## WebSocket Endpoints

- **Connection**: `/ws` - WebSocket endpoint for real-time chat
- **REST Endpoints**: See ChatController for available REST endpoints

## Database

Messages are persisted using Spring Data JPA. Configure your database connection in `application.properties`.

## License

This project is provided as-is for educational purposes.
