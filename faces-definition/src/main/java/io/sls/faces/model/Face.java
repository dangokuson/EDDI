package io.sls.faces.model;

import io.sls.memory.model.Deployment;

/**
 * @author ginccc
 */
public class Face {
    private Deployment.Environment environment;
    private String botId;

    public Deployment.Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Deployment.Environment environment) {
        this.environment = environment;
    }

    public String getBotId() {
        return botId;
    }

    public void setBotId(String botId) {
        this.botId = botId;
    }
}

