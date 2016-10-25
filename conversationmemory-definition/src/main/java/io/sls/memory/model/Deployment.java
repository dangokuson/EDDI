package io.sls.memory.model;

/**
 * @author ginccc
 */
public class Deployment {
    public enum Environment {
        restricted,
        unrestricted,
        test
    }

    public enum Status {
        READY,
        IN_PROGRESS,
        NOT_FOUND,
        ERROR
    }
}
