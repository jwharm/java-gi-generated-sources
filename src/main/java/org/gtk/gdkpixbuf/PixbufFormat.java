package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkPixbufFormat} contains information about the image format accepted
 * by a module.
 * <p>
 * Only modules should access the fields directly, applications should
 * use the {@code gdk_pixbuf_format_*} family of functions.
 */
public class PixbufFormat extends io.github.jwharm.javagi.ResourceBase {

    public PixbufFormat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gdk_pixbuf_format_copy = Interop.downcallHandle(
        "gdk_pixbuf_format_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a copy of {@code format}.
     */
    public PixbufFormat copy() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_format_copy.invokeExact(handle());
            return new PixbufFormat(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_free = Interop.downcallHandle(
        "gdk_pixbuf_format_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated when copying a {@code GdkPixbufFormat}
     * using gdk_pixbuf_format_copy()
     */
    public void free() {
        try {
            gdk_pixbuf_format_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_get_description = Interop.downcallHandle(
        "gdk_pixbuf_format_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a description of the format.
     */
    public java.lang.String getDescription() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_format_get_description.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_get_extensions = Interop.downcallHandle(
        "gdk_pixbuf_format_get_extensions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the filename extensions typically used for files in the
     * given format.
     */
    public PointerString getExtensions() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_format_get_extensions.invokeExact(handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_get_license = Interop.downcallHandle(
        "gdk_pixbuf_format_get_license",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns information about the license of the image loader for the format.
     * <p>
     * The returned string should be a shorthand for a well known license, e.g.
     * "LGPL", "GPL", "QPL", "GPL/QPL", or "other" to indicate some other license.
     */
    public java.lang.String getLicense() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_format_get_license.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_get_mime_types = Interop.downcallHandle(
        "gdk_pixbuf_format_get_mime_types",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the mime types supported by the format.
     */
    public PointerString getMimeTypes() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_format_get_mime_types.invokeExact(handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_get_name = Interop.downcallHandle(
        "gdk_pixbuf_format_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the format.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_format_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_is_disabled = Interop.downcallHandle(
        "gdk_pixbuf_format_is_disabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this image format is disabled.
     * <p>
     * See gdk_pixbuf_format_set_disabled().
     */
    public boolean isDisabled() {
        try {
            var RESULT = (int) gdk_pixbuf_format_is_disabled.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_is_save_option_supported = Interop.downcallHandle(
        "gdk_pixbuf_format_is_save_option_supported",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code TRUE} if the save option specified by {@code option_key} is supported when
     * saving a pixbuf using the module implementing {@code format}.
     * <p>
     * See gdk_pixbuf_save() for more information about option keys.
     */
    public boolean isSaveOptionSupported(java.lang.String optionKey) {
        try {
            var RESULT = (int) gdk_pixbuf_format_is_save_option_supported.invokeExact(handle(), Interop.allocateNativeString(optionKey).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_is_scalable = Interop.downcallHandle(
        "gdk_pixbuf_format_is_scalable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this image format is scalable.
     * <p>
     * If a file is in a scalable format, it is preferable to load it at
     * the desired size, rather than loading it at the default size and
     * scaling the resulting pixbuf to the desired size.
     */
    public boolean isScalable() {
        try {
            var RESULT = (int) gdk_pixbuf_format_is_scalable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_is_writable = Interop.downcallHandle(
        "gdk_pixbuf_format_is_writable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether pixbufs can be saved in the given format.
     */
    public boolean isWritable() {
        try {
            var RESULT = (int) gdk_pixbuf_format_is_writable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_format_set_disabled = Interop.downcallHandle(
        "gdk_pixbuf_format_set_disabled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Disables or enables an image format.
     * <p>
     * If a format is disabled, GdkPixbuf won't use the image loader for
     * this format to load images.
     * <p>
     * Applications can use this to avoid using image loaders with an
     * inappropriate license, see gdk_pixbuf_format_get_license().
     */
    public void setDisabled(boolean disabled) {
        try {
            gdk_pixbuf_format_set_disabled.invokeExact(handle(), disabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
