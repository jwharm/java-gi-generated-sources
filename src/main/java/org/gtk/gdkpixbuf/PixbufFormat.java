package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkPixbufFormat} contains information about the image format accepted
 * by a module.
 * <p>
 * Only modules should access the fields directly, applications should
 * use the {@code gdk_pixbuf_format_*} family of functions.
 * @version 2.2
 */
public class PixbufFormat extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("name"),
        org.gtk.gdkpixbuf.PixbufModulePattern.getMemoryLayout().withName("signature"),
        Interop.valueLayout.ADDRESS.withName("domain"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.ADDRESS.withName("mime_types"),
        Interop.valueLayout.ADDRESS.withName("extensions"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("disabled"),
        Interop.valueLayout.ADDRESS.withName("license")
    ).withName("GdkPixbufFormat");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PixbufFormat(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Creates a copy of {@code format}.
     * @return the newly allocated copy of a {@code GdkPixbufFormat}. Use
     *   gdk_pixbuf_format_free() to free the resources when done
     */
    public @NotNull org.gtk.gdkpixbuf.PixbufFormat copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.PixbufFormat(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees the resources allocated when copying a {@code GdkPixbufFormat}
     * using gdk_pixbuf_format_copy()
     */
    public void free() {
        try {
            DowncallHandles.gdk_pixbuf_format_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a description of the format.
     * @return a description of the format.
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the filename extensions typically used for files in the
     * given format.
     * @return an array of
     *   filename extensions
     */
    public @NotNull PointerString getExtensions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_extensions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Returns information about the license of the image loader for the format.
     * <p>
     * The returned string should be a shorthand for a well known license, e.g.
     * "LGPL", "GPL", "QPL", "GPL/QPL", or "other" to indicate some other license.
     * @return a string describing the license of the pixbuf format
     */
    public @NotNull java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_license.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the mime types supported by the format.
     * @return an array of mime types
     */
    public @NotNull PointerString getMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_mime_types.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Returns the name of the format.
     * @return the name of the format.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether this image format is disabled.
     * <p>
     * See gdk_pixbuf_format_set_disabled().
     * @return whether this image format is disabled.
     */
    public boolean isDisabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_disabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code TRUE} if the save option specified by {@code option_key} is supported when
     * saving a pixbuf using the module implementing {@code format}.
     * <p>
     * See gdk_pixbuf_save() for more information about option keys.
     * @param optionKey the name of an option
     * @return {@code TRUE} if the specified option is supported
     */
    public boolean isSaveOptionSupported(@NotNull java.lang.String optionKey) {
        java.util.Objects.requireNonNull(optionKey, "Parameter 'optionKey' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_save_option_supported.invokeExact(handle(), Interop.allocateNativeString(optionKey));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether this image format is scalable.
     * <p>
     * If a file is in a scalable format, it is preferable to load it at
     * the desired size, rather than loading it at the default size and
     * scaling the resulting pixbuf to the desired size.
     * @return whether this image format is scalable.
     */
    public boolean isScalable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_scalable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether pixbufs can be saved in the given format.
     * @return whether pixbufs can be saved in the given format.
     */
    public boolean isWritable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_writable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Disables or enables an image format.
     * <p>
     * If a format is disabled, GdkPixbuf won't use the image loader for
     * this format to load images.
     * <p>
     * Applications can use this to avoid using image loaders with an
     * inappropriate license, see gdk_pixbuf_format_get_license().
     * @param disabled {@code TRUE} to disable the format {@code format}
     */
    public void setDisabled(boolean disabled) {
        try {
            DowncallHandles.gdk_pixbuf_format_set_disabled.invokeExact(handle(), disabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_format_copy = Interop.downcallHandle(
            "gdk_pixbuf_format_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_free = Interop.downcallHandle(
            "gdk_pixbuf_format_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_description = Interop.downcallHandle(
            "gdk_pixbuf_format_get_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_extensions = Interop.downcallHandle(
            "gdk_pixbuf_format_get_extensions",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_license = Interop.downcallHandle(
            "gdk_pixbuf_format_get_license",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_mime_types = Interop.downcallHandle(
            "gdk_pixbuf_format_get_mime_types",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_name = Interop.downcallHandle(
            "gdk_pixbuf_format_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_disabled = Interop.downcallHandle(
            "gdk_pixbuf_format_is_disabled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_save_option_supported = Interop.downcallHandle(
            "gdk_pixbuf_format_is_save_option_supported",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_scalable = Interop.downcallHandle(
            "gdk_pixbuf_format_is_scalable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_writable = Interop.downcallHandle(
            "gdk_pixbuf_format_is_writable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_format_set_disabled = Interop.downcallHandle(
            "gdk_pixbuf_format_set_disabled",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
