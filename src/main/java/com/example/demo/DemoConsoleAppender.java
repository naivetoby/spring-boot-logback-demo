package com.example.demo;

import ch.qos.logback.core.ConsoleAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoConsoleAppender<E> extends ConsoleAppender<E> {

    private final static Logger logger = LoggerFactory.getLogger(DemoConsoleAppender.class);

    @Override
    public void start() {
        super.start();
        logger.debug("DemoConsoleAppender Start");
    }

}
