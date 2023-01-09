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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ParseContext newInstance = new ParseContext(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ParseContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParseContext(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParseContext> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParseContext(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Copies the {@code context}.
     * @return A copied {@link ParseContext}
     */
    public @Nullable org.gstreamer.gst.ParseContext copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_parse_context_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.ParseContext.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees a parse context previously allocated with gst_parse_context_new().
     */
    public void free() {
        try {
            DowncallHandles.gst_parse_context_free.invokeExact(handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_parse_context_get_missing_elements.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
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
