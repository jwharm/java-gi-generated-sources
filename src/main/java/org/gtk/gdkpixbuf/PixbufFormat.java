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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufFormat}
     * @return A new, uninitialized @{link PixbufFormat}
     */
    public static PixbufFormat allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PixbufFormat newInstance = new PixbufFormat(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code signature}
     * @return The value of the field {@code signature}
     */
    public org.gtk.gdkpixbuf.PixbufModulePattern getSignature() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signature"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.gdkpixbuf.PixbufModulePattern.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code signature}
     * @param signature The new value of the field {@code signature}
     */
    public void setSignature(org.gtk.gdkpixbuf.PixbufModulePattern signature) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signature"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signature == null ? MemoryAddress.NULL : signature.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code domain}
     * @return The value of the field {@code domain}
     */
    public java.lang.String getDomain() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("domain"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code domain}
     * @param domain The new value of the field {@code domain}
     */
    public void setDomain(java.lang.String domain) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("domain"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String getDescription_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void setDescription(java.lang.String description) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code mime_types}
     * @return The value of the field {@code mime_types}
     */
    public PointerString getMimeTypes_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mime_types"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code mime_types}
     * @param mimeTypes The new value of the field {@code mime_types}
     */
    public void setMimeTypes(java.lang.String[] mimeTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mime_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mimeTypes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(mimeTypes, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code extensions}
     * @return The value of the field {@code extensions}
     */
    public PointerString getExtensions_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extensions"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code extensions}
     * @param extensions The new value of the field {@code extensions}
     */
    public void setExtensions(java.lang.String[] extensions) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extensions"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (extensions == null ? MemoryAddress.NULL : Interop.allocateNativeArray(extensions, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(int flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), flags);
        }
    }
    
    /**
     * Get the value of the field {@code disabled}
     * @return The value of the field {@code disabled}
     */
    public boolean getDisabled() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("disabled"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code disabled}
     * @param disabled The new value of the field {@code disabled}
     */
    public void setDisabled_(boolean disabled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("disabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(disabled, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code license}
     * @return The value of the field {@code license}
     */
    public java.lang.String getLicense_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("license"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code license}
     * @param license The new value of the field {@code license}
     */
    public void setLicense(java.lang.String license) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("license"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (license == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(license, SCOPE)));
        }
    }
    
    /**
     * Create a PixbufFormat proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PixbufFormat(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufFormat> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PixbufFormat(input);
    
    /**
     * Creates a copy of {@code format}.
     * @return the newly allocated copy of a {@code GdkPixbufFormat}. Use
     *   gdk_pixbuf_format_free() to free the resources when done
     */
    public org.gtk.gdkpixbuf.PixbufFormat copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gdkpixbuf.PixbufFormat.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the filename extensions typically used for files in the
     * given format.
     * @return an array of
     *   filename extensions
     */
    public PointerString getExtensions() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_extensions.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Returns information about the license of the image loader for the format.
     * <p>
     * The returned string should be a shorthand for a well known license, e.g.
     * "LGPL", "GPL", "QPL", "GPL/QPL", or "other" to indicate some other license.
     * @return a string describing the license of the pixbuf format
     */
    public java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_license.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the mime types supported by the format.
     * @return an array of mime types
     */
    public PointerString getMimeTypes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_mime_types.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Returns the name of the format.
     * @return the name of the format.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_format_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code TRUE} if the save option specified by {@code option_key} is supported when
     * saving a pixbuf using the module implementing {@code format}.
     * <p>
     * See gdk_pixbuf_save() for more information about option keys.
     * @param optionKey the name of an option
     * @return {@code TRUE} if the specified option is supported
     */
    public boolean isSaveOptionSupported(java.lang.String optionKey) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_pixbuf_format_is_save_option_supported.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(optionKey, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
                    Marshal.booleanToInteger.marshal(disabled, null).intValue());
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
     * A {@link PixbufFormat.Builder} object constructs a {@link PixbufFormat} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PixbufFormat.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PixbufFormat struct;
        
        private Builder() {
            struct = PixbufFormat.allocate();
        }
        
        /**
         * Finish building the {@link PixbufFormat} struct.
         * @return A new instance of {@code PixbufFormat} with the fields 
         *         that were set in the Builder object.
         */
        public PixbufFormat build() {
            return struct;
        }
        
        /**
         * the name of the image format
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        /**
         * the signature of the module
         * @param signature The value for the {@code signature} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSignature(org.gtk.gdkpixbuf.PixbufModulePattern signature) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("signature"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signature == null ? MemoryAddress.NULL : signature.handle()));
                return this;
            }
        }
        
        /**
         * the message domain for the {@code description}
         * @param domain The value for the {@code domain} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDomain(java.lang.String domain) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("domain"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (domain == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(domain, SCOPE)));
                return this;
            }
        }
        
        /**
         * a description of the image format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescription(java.lang.String description) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
                return this;
            }
        }
        
        /**
         * the MIME types for the image format
         * @param mimeTypes The value for the {@code mimeTypes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMimeTypes(java.lang.String[] mimeTypes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mime_types"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mimeTypes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(mimeTypes, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * typical filename extensions for the
         *   image format
         * @param extensions The value for the {@code extensions} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExtensions(java.lang.String[] extensions) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("extensions"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (extensions == null ? MemoryAddress.NULL : Interop.allocateNativeArray(extensions, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * a combination of {@code GdkPixbufFormatFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), flags);
                return this;
            }
        }
        
        /**
         * a boolean determining whether the loader is disabled`
         * @param disabled The value for the {@code disabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisabled(boolean disabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("disabled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(disabled, null).intValue());
                return this;
            }
        }
        
        /**
         * a string containing license information, typically set to
         *   shorthands like "GPL", "LGPL", etc.
         * @param license The value for the {@code license} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLicense(java.lang.String license) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("license"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (license == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(license, SCOPE)));
                return this;
            }
        }
    }
}
