package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link FileIcon} specifies an icon by pointing to an image file
 * to be used as icon.
 */
public class FileIcon extends org.gtk.gobject.GObject implements org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileIcon";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FileIcon proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileIcon(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileIcon> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileIcon(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.File file) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_icon_new.invokeExact(
                    file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new icon for a file.
     * @param file a {@link File}.
     */
    public FileIcon(org.gtk.gio.File file) {
        super(constructNew(file), Ownership.FULL);
    }
    
    /**
     * Gets the {@link File} associated with the given {@code icon}.
     * @return a {@link File}.
     */
    public org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_icon_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_icon_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileIcon.Builder} object constructs a {@link FileIcon} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileIcon.Builder#build()}. 
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
         * Finish building the {@link FileIcon} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileIcon}.
         * @return A new instance of {@code FileIcon} with the properties 
         *         that were set in the Builder object.
         */
        public FileIcon build() {
            return (FileIcon) org.gtk.gobject.GObject.newWithProperties(
                FileIcon.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The file containing the icon.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFile(org.gtk.gio.File file) {
            names.add("file");
            values.add(org.gtk.gobject.Value.create(file));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_icon_new = Interop.downcallHandle(
            "g_file_icon_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_icon_get_file = Interop.downcallHandle(
            "g_file_icon_get_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_icon_get_type = Interop.downcallHandle(
            "g_file_icon_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
