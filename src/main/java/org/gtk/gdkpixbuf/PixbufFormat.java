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
public class PixbufFormat extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufFormat";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("signature"),
        Interop.valueLayout.ADDRESS.withName("domain"),
        Interop.valueLayout.ADDRESS.withName("description"),
        Interop.valueLayout.ADDRESS.withName("mime_types"),
        Interop.valueLayout.ADDRESS.withName("extensions"),
        Interop.valueLayout.C_INT.withName("flags"),
        Interop.valueLayout.C_INT.withName("disabled"),
        Interop.valueLayout.ADDRESS.withName("license")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufFormat}
     * @return A new, uninitialized @{link PixbufFormat}
     */
    public static PixbufFormat allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufFormat newInstance = new PixbufFormat(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code signature}
     * @return The value of the field {@code signature}
     */
    public org.gtk.gdkpixbuf.PixbufModulePattern signature$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signature"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gdkpixbuf.PixbufModulePattern(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code signature}
     * @param signature The new value of the field {@code signature}
     */
    public void signature$set(org.gtk.gdkpixbuf.PixbufModulePattern signature) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("signature"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), signature.handle());
    }
    
    /**
     * Get the value of the field {@code domain}
     * @return The value of the field {@code domain}
     */
    public java.lang.String domain$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("domain"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code domain}
     * @param domain The new value of the field {@code domain}
     */
    public void domain$set(java.lang.String domain) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("domain"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(domain));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void description$set(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(description));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code disabled}
     * @return The value of the field {@code disabled}
     */
    public boolean disabled$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("disabled"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code disabled}
     * @param disabled The new value of the field {@code disabled}
     */
    public void disabled$set(boolean disabled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("disabled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), disabled ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code license}
     * @return The value of the field {@code license}
     */
    public java.lang.String license$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("license"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code license}
     * @param license The new value of the field {@code license}
     */
    public void license$set(java.lang.String license) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("license"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(license));
    }
    
    /**
     * Create a PixbufFormat proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufFormat(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Creates a copy of {@code format}.
     * @return the newly allocated copy of a {@code GdkPixbufFormat}. Use
     *   gdk_pixbuf_format_free() to free the resources when done
     */
    public @NotNull org.gtk.gdkpixbuf.PixbufFormat copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.PixbufFormat(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees the resources allocated when copying a {@code GdkPixbufFormat}
     * using gdk_pixbuf_format_copy()
     */
    public void free() {
        try {
            DowncallHandles.gdk_pixbuf_format_free.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_extensions.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_license.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the mime types supported by the format.
     * @return an array of mime types
     */
    public @NotNull PointerString getMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_mime_types.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_disabled.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_save_option_supported.invokeExact(
                    handle(),
                    Interop.allocateNativeString(optionKey));
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
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_scalable.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_writable.invokeExact(
                    handle());
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
            DowncallHandles.gdk_pixbuf_format_set_disabled.invokeExact(
                    handle(),
                    disabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_format_copy = Interop.downcallHandle(
            "gdk_pixbuf_format_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_free = Interop.downcallHandle(
            "gdk_pixbuf_format_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_description = Interop.downcallHandle(
            "gdk_pixbuf_format_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_extensions = Interop.downcallHandle(
            "gdk_pixbuf_format_get_extensions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_license = Interop.downcallHandle(
            "gdk_pixbuf_format_get_license",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_mime_types = Interop.downcallHandle(
            "gdk_pixbuf_format_get_mime_types",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_get_name = Interop.downcallHandle(
            "gdk_pixbuf_format_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_disabled = Interop.downcallHandle(
            "gdk_pixbuf_format_is_disabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_save_option_supported = Interop.downcallHandle(
            "gdk_pixbuf_format_is_save_option_supported",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_scalable = Interop.downcallHandle(
            "gdk_pixbuf_format_is_scalable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_is_writable = Interop.downcallHandle(
            "gdk_pixbuf_format_is_writable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_format_set_disabled = Interop.downcallHandle(
            "gdk_pixbuf_format_set_disabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PixbufFormat struct;
        
         /**
         * A {@link PixbufFormat.Build} object constructs a {@link PixbufFormat} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PixbufFormat.allocate();
        }
        
         /**
         * Finish building the {@link PixbufFormat} struct.
         * @return A new instance of {@code PixbufFormat} with the fields 
         *         that were set in the Build object.
         */
        public PixbufFormat construct() {
            return struct;
        }
        
        /**
         * the name of the image format
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        /**
         * the signature of the module
         * @param signature The value for the {@code signature} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignature(org.gtk.gdkpixbuf.PixbufModulePattern signature) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signature"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signature == null ? MemoryAddress.NULL : signature.handle()));
            return this;
        }
        
        /**
         * the message domain for the {@code description}
         * @param domain The value for the {@code domain} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDomain(java.lang.String domain) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("domain"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (domain == null ? MemoryAddress.NULL : Interop.allocateNativeString(domain)));
            return this;
        }
        
        /**
         * a description of the image format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
            return this;
        }
        
        /**
         * the MIME types for the image format
         * @param mimeTypes The value for the {@code mimeTypes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMimeTypes(java.lang.String[] mimeTypes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mime_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mimeTypes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(mimeTypes, false)));
            return this;
        }
        
        /**
         * typical filename extensions for the
         *   image format
         * @param extensions The value for the {@code extensions} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExtensions(java.lang.String[] extensions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extensions"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extensions == null ? MemoryAddress.NULL : Interop.allocateNativeArray(extensions, false)));
            return this;
        }
        
        /**
         * a combination of {@code GdkPixbufFormatFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(int flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * a boolean determining whether the loader is disabled`
         * @param disabled The value for the {@code disabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisabled(boolean disabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("disabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), disabled ? 1 : 0);
            return this;
        }
        
        /**
         * a string containing license information, typically set to
         *   shorthands like "GPL", "LGPL", etc.
         * @param license The value for the {@code license} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLicense(java.lang.String license) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("license"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (license == null ? MemoryAddress.NULL : Interop.allocateNativeString(license)));
            return this;
        }
    }
}
