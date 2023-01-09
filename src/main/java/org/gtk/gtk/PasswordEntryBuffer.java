package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkEntryBuffer} that locks the underlying memory to prevent it
 * from being swapped to disk.
 * <p>
 * {@code GtkPasswordEntry} uses a {@code GtkPasswordEntryBuffer}.
 * @version 4.4
 */
public class PasswordEntryBuffer extends org.gtk.gtk.EntryBuffer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPasswordEntryBuffer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PasswordEntryBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PasswordEntryBuffer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PasswordEntryBuffer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PasswordEntryBuffer(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_password_entry_buffer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEntryBuffer} using secure memory allocations.
     */
    public PasswordEntryBuffer() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_password_entry_buffer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PasswordEntryBuffer.Builder} object constructs a {@link PasswordEntryBuffer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PasswordEntryBuffer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EntryBuffer.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PasswordEntryBuffer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PasswordEntryBuffer}.
         * @return A new instance of {@code PasswordEntryBuffer} with the properties 
         *         that were set in the Builder object.
         */
        public PasswordEntryBuffer build() {
            return (PasswordEntryBuffer) org.gtk.gobject.GObject.newWithProperties(
                PasswordEntryBuffer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_password_entry_buffer_new = Interop.downcallHandle(
                "gtk_password_entry_buffer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_password_entry_buffer_get_type = Interop.downcallHandle(
                "gtk_password_entry_buffer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_password_entry_buffer_get_type != null;
    }
}
