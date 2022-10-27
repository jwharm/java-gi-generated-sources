package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkContentFormatsBuilder} is an auxiliary struct used to create
 * new {@code GdkContentFormats}, and should not be kept around.
 */
public class ContentFormatsBuilder extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ContentFormatsBuilder(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_content_formats_builder_new.invokeExact(), true);
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
    }
    
    /**
     * Appends all formats from {@code formats} to {@code builder}, skipping those that
     * already exist.
     * @param formats the formats to add
     */
    public void addFormats(@NotNull org.gtk.gdk.ContentFormats formats) {
        java.util.Objects.requireNonNull(formats, "Parameter 'formats' must not be null");
        try {
            DowncallHandles.gdk_content_formats_builder_add_formats.invokeExact(handle(), formats.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends {@code type} to {@code builder} if it has not already been added.
     * @param type a {@code GType}
     */
    public void addGtype(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.gdk_content_formats_builder_add_gtype.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends {@code mime_type} to {@code builder} if it has not already been added.
     * @param mimeType a mime type
     */
    public void addMimeType(@NotNull java.lang.String mimeType) {
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        try {
            DowncallHandles.gdk_content_formats_builder_add_mime_type.invokeExact(handle(), Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GdkContentFormats} from the current state of the
     * given {@code builder}, and frees the {@code builder} instance.
     * @return the newly created {@code GdkContentFormats}
     *   with all the formats added to {@code builder}
     */
    public @NotNull org.gtk.gdk.ContentFormats freeToFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_builder_free_to_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    /**
     * Acquires a reference on the given {@code builder}.
     * <p>
     * This function is intended primarily for bindings.
     * {@code GdkContentFormatsBuilder} objects should not be kept around.
     * @return the given {@code GdkContentFormatsBuilder}
     *   with its reference count increased
     */
    public @NotNull org.gtk.gdk.ContentFormatsBuilder ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_builder_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormatsBuilder(Refcounted.get(RESULT, false));
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
    public @NotNull org.gtk.gdk.ContentFormats toFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_builder_to_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
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
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_builder_add_formats = Interop.downcallHandle(
            "gdk_content_formats_builder_add_formats",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_builder_add_gtype = Interop.downcallHandle(
            "gdk_content_formats_builder_add_gtype",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gdk_content_formats_builder_add_mime_type = Interop.downcallHandle(
            "gdk_content_formats_builder_add_mime_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_builder_free_to_formats = Interop.downcallHandle(
            "gdk_content_formats_builder_free_to_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_builder_ref = Interop.downcallHandle(
            "gdk_content_formats_builder_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_builder_to_formats = Interop.downcallHandle(
            "gdk_content_formats_builder_to_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_builder_unref = Interop.downcallHandle(
            "gdk_content_formats_builder_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
