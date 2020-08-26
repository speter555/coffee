/*-
 * #%L
 * Coffee
 * %%
 * Copyright (C) 2020 i-Cell Mobilsoft Zrt.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package hu.icellmobilsoft.coffee.cdi.logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.Model;

/**
 * Loggolasra szolgalo container
 *
 * @author ischeffer
 * @since 1.0.0
 */
@Model
public class LogContainer {

    private List<LogContainer.Log> logs = new ArrayList<LogContainer.Log>();
    private Map<String, Object> customParam = new HashMap<String, Object>();

    /**
     * Log trace log with message
     *
     * @param msg
     *            log message
     */
    public void trace(String msg) {
        logs.add(new Log(LogLevel.TRACE, msg));
    }

    /**
     * Log trace log with format and one argument
     *
     * @param format
     *            format of error message
     * @param arg
     *            one or more arguments
     */
    public void trace(String format, Object arg) {
        String message = format(format, arg);
        logs.add(new Log(LogLevel.TRACE, message));
    }

    /**
     * Log trace log with format and more argument
     *
     * @param format
     *            format of error message
     * @param arguments
     *            one or more arguments
     */
    public void trace(String format, Object... arguments) {
        String message = format(format, arguments);
        logs.add(new Log(LogLevel.TRACE, message));
    }

    /**
     * Log trace log with message and Throwable
     *
     * @param msg
     *            message
     * @param t
     *            throwable error
     */
    public void trace(String msg, Throwable t) {
        String message = getFullStackTrace(t);
        logs.add(new Log(LogLevel.TRACE, message));
    }

    /**
     * Log trace log with format and two argument
     *
     * @param format
     *            format of error message
     * @param arg1
     *            first argument
     * @param arg2
     *            second argument
     */
    public void trace(String format, Object arg1, Object arg2) {
        String message = format(format, arg1, arg2);
        logs.add(new Log(LogLevel.TRACE, message));
    }

    /**
     * Log debug log with message
     *
     * @param msg
     *            log message
     */
    public void debug(String msg) {
        logs.add(new Log(LogLevel.DEBUG, msg));
    }

    /**
     * Log debug log with format and one argument
     *
     * @param format
     *            format of error message
     * @param arg
     *            one or more arguments
     */
    public void debug(String format, Object arg) {
        String message = format(format, arg);
        logs.add(new Log(LogLevel.DEBUG, message));
    }

    /**
     * Log debug log with format and more argument
     *
     * @param format
     *            format of error message
     * @param arguments
     *            one or more arguments
     */
    public void debug(String format, Object... arguments) {
        String message = format(format, arguments);
        logs.add(new Log(LogLevel.DEBUG, message));
    }

    /**
     * Log debug log with message and Throwable
     *
     * @param msg
     *            message
     * @param t
     *            throwable error
     */
    public void debug(String msg, Throwable t) {
        String message = getFullStackTrace(t);
        logs.add(new Log(LogLevel.DEBUG, message));
    }

    /**
     * Log debug log with format and two argument
     *
     * @param format
     *            format of error message
     * @param arg1
     *            first argument
     * @param arg2
     *            second argument
     */
    public void debug(String format, Object arg1, Object arg2) {
        String message = format(format, arg1, arg2);
        logs.add(new Log(LogLevel.DEBUG, message));
    }

    /**
     * Log info log with message
     *
     * @param msg
     *            log message
     */
    public void info(String msg) {
        logs.add(new Log(LogLevel.INFO, msg));
    }

    /**
     * Log info log with format and one argument
     *
     * @param format
     *            format of error message
     * @param arg
     *            one or more arguments
     */
    public void info(String format, Object arg) {
        String message = format(format, arg);
        logs.add(new Log(LogLevel.INFO, message));
    }

    /**
     * Log info log with format and more argument
     *
     * @param format
     *            format of error message
     * @param arguments
     *            one or more arguments
     */
    public void info(String format, Object... arguments) {
        String message = format(format, arguments);
        logs.add(new Log(LogLevel.INFO, message));
    }

    /**
     * Log info log with message and Throwable
     *
     * @param msg
     *            message
     * @param t
     *            throwable error
     */
    public void info(String msg, Throwable t) {
        String message = getFullStackTrace(t);
        logs.add(new Log(LogLevel.INFO, message));
    }

    /**
     * Log info log with format and two argument
     *
     * @param format
     *            format of error message
     * @param arg1
     *            first argument
     * @param arg2
     *            second argument
     */
    public void info(String format, Object arg1, Object arg2) {
        String message = format(format, arg1, arg2);
        logs.add(new Log(LogLevel.INFO, message));
    }

    /**
     * Log warn log with message
     *
     * @param msg
     *            log message
     */
    public void warn(String msg) {
        logs.add(new Log(LogLevel.WARN, msg));
    }

    /**
     * Log warn log with format and one argument
     *
     * @param format
     *            format of error message
     * @param arg
     *            one or more arguments
     */
    public void warn(String format, Object arg) {
        String message = format(format, arg);
        logs.add(new Log(LogLevel.WARN, message));
    }

    /**
     * Log warn log with format and more argument
     *
     * @param format
     *            format of error message
     * @param arguments
     *            one or more arguments
     */
    public void warn(String format, Object... arguments) {
        String message = format(format, arguments);
        logs.add(new Log(LogLevel.WARN, message));
    }

    /**
     * Log warn log with message and Throwable
     *
     * @param msg
     *            message
     * @param t
     *            throwable error
     */
    public void warn(String msg, Throwable t) {
        String message = getFullStackTrace(t);
        logs.add(new Log(LogLevel.WARN, message));
    }

    /**
     * Log warn log with format and two argument
     *
     * @param format
     *            format of error message
     * @param arg1
     *            first argument
     * @param arg2
     *            second argument
     */
    public void warn(String format, Object arg1, Object arg2) {
        String message = format(format, arg1, arg2);
        logs.add(new Log(LogLevel.WARN, message));
    }

    /**
     * Log error log with message
     * 
     * @param msg
     *            log message
     */
    public void error(String msg) {
        logs.add(new Log(LogLevel.ERROR, msg));
    }

    /**
     * Log error log with format and one argument
     * 
     * @param format
     *            format of error message
     * @param arg
     *            one or more arguments
     */
    public void error(String format, Object arg) {
        String message = format(format, arg);
        logs.add(new Log(LogLevel.ERROR, message));
    }

    /**
     * Log error log with format and more arguments
     * 
     * @param format
     *            format of error message
     * @param arguments
     *            one or more arguments
     */
    public void error(String format, Object... arguments) {
        String message = format(format, arguments);
        logs.add(new Log(LogLevel.ERROR, message));
    }

    /**
     * Log error log with message and Throwable
     * 
     * @param msg
     *            message
     * @param t
     *            throwable error
     */
    public void error(String msg, Throwable t) {
        String message = getFullStackTrace(t);
        logs.add(new Log(LogLevel.ERROR, message));
    }

    /**
     * Log error log with format and two argument
     * 
     * @param format
     *            format of error message
     * @param arg1
     *            first argument
     * @param arg2
     *            second argument
     */
    public void error(String format, Object arg1, Object arg2) {
        String message = format(format, arg1, arg2);
        logs.add(new Log(LogLevel.ERROR, message));
    }

    /**
     * <p>
     * getValue.
     * </p>
     * 
     * @param key
     *            searched key
     * @return value for key
     */
    public Object getValue(String key) {
        return customParam.get(key);
    }

    /**
     * <p>
     * setValue.
     * </p>
     * 
     * @param key
     *            the key from key-value pair.
     * @param value
     *            the value from key-value pair.
     */
    public void setValue(String key, Object value) {
        String msg = (customParam.containsKey(key) ? "Replaced" : "Added") + " key: [" + key + "], value: [" + value + "]";
        logs.add(new Log(LogLevel.CUSTOM, msg));
        customParam.put(key, value);
    }

    /**
     * <p>
     * removeValue.
     * </p>
     * 
     * @param key
     *            what remove from customParam map
     */
    public void removeValue(String key) {
        logs.add(new Log(LogLevel.CUSTOM, "Remove key: [" + key + "]"));
        customParam.remove(key);
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        StringBuffer msg = new StringBuffer();
        for (Log log : logs) {
            if (msg.length() > 0) {
                msg.append("\n");
            }
            msg.append(log.toString());
        }
        return msg.toString();
    }

    private String format(String format, Object... arguments) {
        return MessageFormat.format(format, arguments);
    }

    private class Log {
        private LogLevel level;
        private String message;

        private Log(LogLevel level, String message) {
            this.level = level;
            this.message = message;
        }

        @Override
        public String toString() {
            return level + ":" + message;
        }
    }

    /**
     * <p>
     * getHighestLogLevel.
     * </p>
     *
     * @return hightest log level in logs
     */
    public LogLevel getHighestLogLevel() {
        LogLevel highestLogLevel = LogLevel.CUSTOM;
        for (Log log : logs) {
            if (log.level.ordinal() > highestLogLevel.ordinal()) {
                highestLogLevel = log.level;
            }
        }
        return highestLogLevel;
    }

    /**
     * <p>
     * getFullStackTrace.
     * </p>
     * 
     * @param t
     *            {@link Throwable} what convert to String.
     * @return converted parameter into String
     */
    public static String getFullStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

    /**
     * Log levels definition in enum
     */
    public enum LogLevel {
        CUSTOM, TRACE, DEBUG, INFO, WARN, ERROR;
    }
}
