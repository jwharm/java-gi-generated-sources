package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum GLUploadReturn implements io.github.jwharm.javagi.Enumeration {
    /**
     * No further processing required
     */
    DONE(1),
    /**
     * An unspecified error occurred
     */
    ERROR(-1),
    /**
     * The configuration is unsupported.
     */
    UNSUPPORTED(-2),
    /**
     * This element requires a reconfiguration.
     */
    RECONFIGURE(-3),
    /**
     * private return value.
     */
    UNSHARED_GL_CONTEXT(-100);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLUploadReturn";
    
    private final int value;
    GLUploadReturn(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GLUploadReturn of(int value) {
        return switch (value) {
            case 1 -> DONE;
            case -1 -> ERROR;
            case -2 -> UNSUPPORTED;
            case -3 -> RECONFIGURE;
            case -100 -> UNSHARED_GL_CONTEXT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
