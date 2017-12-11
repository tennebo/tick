// Log config for logback

appender('console', ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss} %highlight(%-5level) %cyan([%-9thread]) %logger{20} - %msg%n"
        immediateFlush = false
    }
    // In newer versions, this goes here:
    // immediateFlush = false
}

// Set logging levels
logger("com.friggsoft", INFO)
logger("org.springframework", WARN)

// Setup a console logger
root(INFO, ['console'])
