package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Context} is a container object used to store contexts like a device
 * context, a display server connection and similar concepts that should
 * be shared between multiple elements.
 * <p>
 * Applications can set a context on a complete pipeline by using
 * gst_element_set_context(), which will then be propagated to all
 * child elements. Elements can handle these in {@link ElementClass}::set_context
 * and merge them with the context information they already have.
 * <p>
 * When an element needs a context it will do the following actions in this
 * order until one step succeeds:
 * <p>
 * 1. Check if the element already has a context
 * 2. Query downstream with {@link QueryType#CONTEXT} for the context
 * 3. Query upstream with {@link QueryType#CONTEXT} for the context
 * 4. Post a {@link MessageType#NEED_CONTEXT} message on the bus with the required
 *    context types and afterwards check if a usable context was set now
 * 5. Create a context by itself and post a {@link MessageType#HAVE_CONTEXT} message
 *    on the bus.
 * <p>
 * Bins will catch {@link MessageType#NEED_CONTEXT} messages and will set any previously
 * known context on the element that asks for it if possible. Otherwise the
 * application should provide one if it can.
 * <p>
 * {@link Context} can be persistent.
 * A persistent {@link Context} is kept in elements when they reach
 * {@link State#NULL}, non-persistent ones will be removed.
 * Also, a non-persistent context won't override a previous persistent
 * context set to an element.
 * @version 1.2
 */
public class Context extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstContext";
    
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
     * Allocate a new {@link Context}
     * @return A new, uninitialized @{link Context}
     */
    public static Context allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Context newInstance = new Context(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Context proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Context(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull java.lang.String contextType, boolean persistent) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_context_new.invokeExact(
                    Interop.allocateNativeString(contextType),
                    persistent ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new context.
     * @param contextType Context type
     * @param persistent Persistent context
     */
    public Context(@NotNull java.lang.String contextType, boolean persistent) {
        super(constructNew(contextType, persistent), Ownership.FULL);
    }
    
    /**
     * Gets the type of {@code context}.
     * @return The type of the context.
     */
    public @NotNull java.lang.String getContextType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_context_get_context_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Accesses the structure of the context.
     * @return The structure of the context. The structure is
     * still owned by the context, which means that you should not modify it,
     * free it and that the pointer becomes invalid when you free the context.
     */
    public @NotNull org.gstreamer.gst.Structure getStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_context_get_structure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if {@code context} has {@code context_type}.
     * @param contextType Context type to check.
     * @return {@code true} if {@code context} has {@code context_type}.
     */
    public boolean hasContextType(@NotNull java.lang.String contextType) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_context_has_context_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(contextType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code context} is persistent.
     * @return {@code true} if the context is persistent.
     */
    public boolean isPersistent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_context_is_persistent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a writable version of the structure.
     * @return The structure of the context. The structure is still
     * owned by the context, which means that you should not free it and
     * that the pointer becomes invalid when you free the context.
     * This function checks if {@code context} is writable.
     */
    public @NotNull org.gstreamer.gst.Structure writableStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_context_writable_structure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_context_new = Interop.downcallHandle(
            "gst_context_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_context_get_context_type = Interop.downcallHandle(
            "gst_context_get_context_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_get_structure = Interop.downcallHandle(
            "gst_context_get_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_has_context_type = Interop.downcallHandle(
            "gst_context_has_context_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_is_persistent = Interop.downcallHandle(
            "gst_context_is_persistent",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_writable_structure = Interop.downcallHandle(
            "gst_context_writable_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
