package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure containing function pointers to OpenGL functions.
 * <p>
 * Each field is named exactly the same as the OpenGL function without the
 * {@code gl} prefix.
 */
public class GLFuncs extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLFuncs";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLFuncs}
     * @return A new, uninitialized @{link GLFuncs}
     */
    public static GLFuncs allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLFuncs newInstance = new GLFuncs(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GLFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLFuncs(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLFuncs> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLFuncs(input);
}
