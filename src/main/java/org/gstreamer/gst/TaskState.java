package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different states a task can be in
 */
public class TaskState extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstTaskState";
    
    /**
     * the task is started and running
     */
    public static final TaskState STARTED = new TaskState(0);
    
    /**
     * the task is stopped
     */
    public static final TaskState STOPPED = new TaskState(1);
    
    /**
     * the task is paused
     */
    public static final TaskState PAUSED = new TaskState(2);
    
    public TaskState(int value) {
        super(value);
    }
}
