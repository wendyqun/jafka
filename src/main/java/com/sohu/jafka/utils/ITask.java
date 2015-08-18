package com.sohu.jafka.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An exception wrapper of task
 * @author adyliu (imxylz@gmail.com)
 * @since 2015-08-18
 */
@FunctionalInterface
public interface ITask extends Runnable {

    static Logger _logger = LoggerFactory.getLogger(ITask.class);

    default void run() {
        try {
            execute();
        } catch (Exception e) {
            _logger.error(e.getMessage(), e);
        }
    }

    void execute() throws Exception;
}
