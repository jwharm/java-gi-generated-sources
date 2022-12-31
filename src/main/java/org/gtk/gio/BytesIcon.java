package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link BytesIcon} specifies an image held in memory in a common format (usually
 * png) to be used as icon.
 * @version 2.38
 */
public class BytesIcon extends org.gtk.gobject.GObject implements org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBytesIcon";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BytesIcon proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BytesIcon(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BytesIcon> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BytesIcon(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.glib.Bytes bytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bytes_icon_new.invokeExact(
                    bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new icon for a bytes.
     * <p>
     * This cannot fail, but loading and interpreting the bytes may fail later on
     * (for example, if g_loadable_icon_load() is called) if the image is invalid.
     * @param bytes a {@link org.gtk.glib.Bytes}.
     */
    public BytesIcon(org.gtk.glib.Bytes bytes) {
        super(constructNew(bytes), Ownership.FULL);
    }
    
    /**
     * Gets the {@link org.gtk.glib.Bytes} associated with the given {@code icon}.
     * @return a {@link org.gtk.glib.Bytes}.
     */
    public org.gtk.glib.Bytes getBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bytes_icon_get_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_bytes_icon_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BytesIcon.Builder} object constructs a {@link BytesIcon} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BytesIcon.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link BytesIcon} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BytesIcon}.
         * @return A new instance of {@code BytesIcon} with the properties 
         *         that were set in the Builder object.
         */
        public BytesIcon build() {
            return (BytesIcon) org.gtk.gobject.GObject.newWithProperties(
                BytesIcon.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The bytes containing the icon.
         * @param bytes The value for the {@code bytes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBytes(org.gtk.glib.Bytes bytes) {
            names.add("bytes");
            values.add(org.gtk.gobject.Value.create(bytes));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_bytes_icon_new = Interop.downcallHandle(
            "g_bytes_icon_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_bytes_icon_get_bytes = Interop.downcallHandle(
            "g_bytes_icon_get_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_bytes_icon_get_type = Interop.downcallHandle(
            "g_bytes_icon_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
