package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkContentFormatsBuilder} is an auxiliary struct used to create
 * new {@code GdkContentFormats}, and should not be kept around.
 */
public class ContentFormatsBuilder extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentFormatsBuilder";
    
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
     * Allocate a new {@link ContentFormatsBuilder}
     * @return A new, uninitialized @{link ContentFormatsBuilder}
     */
    public static ContentFormatsBuilder allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ContentFormatsBuilder newInstance = new ContentFormatsBuilder(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ContentFormatsBuilder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ContentFormatsBuilder(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ContentFormatsBuilder> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ContentFormatsBuilder(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_builder_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code GdkContentFormatsBuilder} object.
     * <p>
     * The resulting builder would create an empty {@code GdkContentFormats}.
     * Use addition functions to add types to it.
     */
    public ContentFormatsBuilder() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Appends all formats from {@code formats} to {@code builder}, skipping those that
     * already exist.
     * @param formats the formats to add
     */
    public void addFormats(org.gtk.gdk.ContentFormats formats) {
        try {
            DowncallHandles.gdk_content_formats_builder_add_formats.invokeExact(
                    handle(),
                    formats.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends {@code type} to {@code builder} if it has not already been added.
     * @param type a {@code GType}
     */
    public void addGtype(org.gtk.glib.Type type) {
        try {
            DowncallHandles.gdk_content_formats_builder_add_gtype.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends {@code mime_type} to {@code builder} if it has not already been added.
     * @param mimeType a mime type
     */
    public void addMimeType(java.lang.String mimeType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gdk_content_formats_builder_add_mime_type.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(mimeType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Creates a new {@code GdkContentFormats} from the current state of the
     * given {@code builder}, and frees the {@code builder} instance.
     * @return the newly created {@code GdkContentFormats}
     *   with all the formats added to {@code builder}
     */
    public org.gtk.gdk.ContentFormats freeToFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_builder_free_to_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Acquires a reference on the given {@code builder}.
     * <p>
     * This function is intended primarily for bindings.
     * {@code GdkContentFormatsBuilder} objects should not be kept around.
     * @return the given {@code GdkContentFormatsBuilder}
     *   with its reference count increased
     */
    public org.gtk.gdk.ContentFormatsBuilder ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_builder_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormatsBuilder.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Creates a new {@code GdkContentFormats} from the given {@code builder}.
     * <p>
     * The given {@code GdkContentFormatsBuilder} is reset once this function returns;
     * you cannot call this function multiple times on the same {@code builder} instance.
     * <p>
     * This function is intended primarily for bindings. C code should use
     * {@link ContentFormatsBuilder#freeToFormats}.
     * @return the newly created {@code GdkContentFormats}
     *   with all the formats added to {@code builder}
     */
    public org.gtk.gdk.ContentFormats toFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_builder_to_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Releases a reference on the given {@code builder}.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_content_formats_builder_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_content_formats_builder_new = Interop.downcallHandle(
                "gdk_content_formats_builder_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_content_formats_builder_add_formats = Interop.downcallHandle(
                "gdk_content_formats_builder_add_formats",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_content_formats_builder_add_gtype = Interop.downcallHandle(
                "gdk_content_formats_builder_add_gtype",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gdk_content_formats_builder_add_mime_type = Interop.downcallHandle(
                "gdk_content_formats_builder_add_mime_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_content_formats_builder_free_to_formats = Interop.downcallHandle(
                "gdk_content_formats_builder_free_to_formats",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_content_formats_builder_ref = Interop.downcallHandle(
                "gdk_content_formats_builder_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_content_formats_builder_to_formats = Interop.downcallHandle(
                "gdk_content_formats_builder_to_formats",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_content_formats_builder_unref = Interop.downcallHandle(
                "gdk_content_formats_builder_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
