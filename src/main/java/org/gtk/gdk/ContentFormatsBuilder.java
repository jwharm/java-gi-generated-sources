package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkContentFormatsBuilder} is an auxiliary struct used to create
 * new {@code GdkContentFormats}, and should not be kept around.
 */
public class ContentFormatsBuilder extends io.github.jwharm.javagi.ResourceBase {

    public ContentFormatsBuilder(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gdk_content_formats_builder_new = Interop.downcallHandle(
        "gdk_content_formats_builder_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_content_formats_builder_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gdk_content_formats_builder_add_formats = Interop.downcallHandle(
        "gdk_content_formats_builder_add_formats",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends all formats from {@code formats} to {@code builder}, skipping those that
     * already exist.
     */
    public void addFormats(ContentFormats formats) {
        try {
            gdk_content_formats_builder_add_formats.invokeExact(handle(), formats.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_builder_add_gtype = Interop.downcallHandle(
        "gdk_content_formats_builder_add_gtype",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Appends {@code type} to {@code builder} if it has not already been added.
     */
    public void addGtype(org.gtk.gobject.Type type) {
        try {
            gdk_content_formats_builder_add_gtype.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_builder_add_mime_type = Interop.downcallHandle(
        "gdk_content_formats_builder_add_mime_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code mime_type} to {@code builder} if it has not already been added.
     */
    public void addMimeType(java.lang.String mimeType) {
        try {
            gdk_content_formats_builder_add_mime_type.invokeExact(handle(), Interop.allocateNativeString(mimeType).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_builder_free_to_formats = Interop.downcallHandle(
        "gdk_content_formats_builder_free_to_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code GdkContentFormats} from the current state of the
     * given {@code builder}, and frees the {@code builder} instance.
     */
    public ContentFormats freeToFormats() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_builder_free_to_formats.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_builder_ref = Interop.downcallHandle(
        "gdk_content_formats_builder_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on the given {@code builder}.
     * <p>
     * This function is intended primarily for bindings.
     * {@code GdkContentFormatsBuilder} objects should not be kept around.
     */
    public ContentFormatsBuilder ref() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_builder_ref.invokeExact(handle());
            return new ContentFormatsBuilder(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_builder_to_formats = Interop.downcallHandle(
        "gdk_content_formats_builder_to_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code GdkContentFormats} from the given {@code builder}.
     * <p>
     * The given {@code GdkContentFormatsBuilder} is reset once this function returns;
     * you cannot call this function multiple times on the same {@code builder} instance.
     * <p>
     * This function is intended primarily for bindings. C code should use
     * {@link ContentFormatsBuilder#freeToFormats}.
     */
    public ContentFormats toFormats() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_builder_to_formats.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_builder_unref = Interop.downcallHandle(
        "gdk_content_formats_builder_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on the given {@code builder}.
     */
    public void unref() {
        try {
            gdk_content_formats_builder_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
