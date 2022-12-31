package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLBaseMemoryTransfer extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseMemoryTransfer";
    
    /**
     * the texture needs downloading
     *                                             to the data pointer
     */
    public static final GLBaseMemoryTransfer DOWNLOAD = new GLBaseMemoryTransfer(1048576);
    
    /**
     * the data pointer needs uploading
     *                                             to the texture
     */
    public static final GLBaseMemoryTransfer UPLOAD = new GLBaseMemoryTransfer(2097152);
    
    public GLBaseMemoryTransfer(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public GLBaseMemoryTransfer or(GLBaseMemoryTransfer... masks) {
        int value = this.getValue();
        for (GLBaseMemoryTransfer arg : masks) {
            value |= arg.getValue();
        }
        return new GLBaseMemoryTransfer(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GLBaseMemoryTransfer combined(GLBaseMemoryTransfer mask, GLBaseMemoryTransfer... masks) {
        int value = mask.getValue();
        for (GLBaseMemoryTransfer arg : masks) {
            value |= arg.getValue();
        }
        return new GLBaseMemoryTransfer(value);
    }
}
