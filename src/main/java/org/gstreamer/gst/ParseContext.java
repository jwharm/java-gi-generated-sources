package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque structure.
 */
public class ParseContext extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstParseContext";
    
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
     * Allocate a new {@link ParseContext}
     * @return A new, uninitialized @{link ParseContext}
     */
    public static ParseContext allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParseContext newInstance = new ParseContext(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ParseContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParseContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_context_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a parse context for use with gst_parse_launch_full() or
     * gst_parse_launchv_full().
     * <p>
     * Free-function: gst_parse_context_free
     */
    public ParseContext() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Copies the {@code context}.
     * @return A copied {@link ParseContext}
     */
    public @Nullable org.gstreamer.gst.ParseContext copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_context_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ParseContext(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees a parse context previously allocated with gst_parse_context_new().
     */
    public void free() {
        try {
            DowncallHandles.gst_parse_context_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Retrieve missing elements from a previous run of gst_parse_launch_full()
     * or gst_parse_launchv_full(). Will only return results if an error code
     * of {@link ParseError#NO_SUCH_ELEMENT} was returned.
     * @return a
     *     {@code null}-terminated array of element factory name strings of missing
     *     elements. Free with g_strfreev() when no longer needed.
     */
    public @Nullable PointerString getMissingElements() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_context_get_missing_elements.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_parse_context_new = Interop.downcallHandle(
            "gst_parse_context_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_parse_context_copy = Interop.downcallHandle(
            "gst_parse_context_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_parse_context_free = Interop.downcallHandle(
            "gst_parse_context_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_parse_context_get_missing_elements = Interop.downcallHandle(
            "gst_parse_context_get_missing_elements",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
