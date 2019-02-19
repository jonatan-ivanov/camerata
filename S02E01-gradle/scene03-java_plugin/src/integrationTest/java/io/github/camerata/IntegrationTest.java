package io.github.camerata;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.LoggerFactory;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.verify;
import static org.slf4j.Logger.ROOT_LOGGER_NAME;

@ExtendWith(MockitoExtension.class)
class IntegrationTest {
    @Mock private Appender<ILoggingEvent> appender;

    @Test
    void appShouldGreet() {
        ((Logger) LoggerFactory.getLogger(ROOT_LOGGER_NAME)).addAppender(appender);
        App.main(null);

        verify(appender).doAppend(argThat(event -> event.getFormattedMessage().contains("Hello world! :)")));
    }
}
