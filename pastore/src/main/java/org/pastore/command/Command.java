package org.pastore.command;

import org.pastore.command.option.OptionType;

import java.util.Map;

public class Command {

    private CommandType commandType;

    private String plainCommand;

    private String property;

    private Map<OptionType, String> options;

    public Command(CommandType commandType,
                   String plainCommand,
                   String property,
                   Map<OptionType, String> options) {
        this.commandType = commandType;
        this.plainCommand = plainCommand;
        this.property = property;
        this.options = options;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandType commandType) {
        this.commandType = commandType;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Map<OptionType, String> getOptions() {
        return options;
    }

    public void setOptions(Map<OptionType, String> options) {
        this.options = options;
    }

    public String getPlainCommand() {
        return plainCommand;
    }

    public void setPlainCommand(String plainCommand) {
        this.plainCommand = plainCommand;
    }
}
