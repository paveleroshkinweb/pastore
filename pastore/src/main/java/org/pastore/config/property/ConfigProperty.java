package org.pastore.config.property;

public enum ConfigProperty {

    SERVER_TYPE("server-type"),
    MAX_CLIENTS("maxclients"),
    DUMPFILE("dumpfile"),
    LOGFILE("logfile"),
    HISTORYFILE("historyfile"),
    BIND("bind"),
    PORT("port"),
    PASSWORD_PROTECTED("password-protected"),
    TIMEOUT("timeout"),
    TCP_BACKLOG("tcp-backlog"),
    LOG_LEVEL("loglevel"),
    DATABASES("databases"),
    SAVE("save");

    private final String propertyName;

    ConfigProperty(final String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

}