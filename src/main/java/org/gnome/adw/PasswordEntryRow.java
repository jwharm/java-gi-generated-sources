package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link EntryRow} tailored for entering secrets.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="password-entry-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="password-entry-row.png" alt="password-entry-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * It does not show its contents in clear text, does not allow to copy it to the
 * clipboard, and shows a warning when Caps Lock is engaged. If the underlying
 * platform allows it, {@code AdwPasswordEntryRow} will also place the text in a
 * non-pageable memory area, to avoid it being written out to disk by the
 * operating system.
 * <p>
 * It offer a way to reveal the contents in clear text.
 * <p>
 * <strong>CSS Nodes</strong><br/>
 * {@code AdwPasswordEntryRow} has a single CSS node with name {@code row} that carries
 * {@code .entry} and {@code .password} style classes.
 * @version 1.2
 */
public class PasswordEntryRow extends org.gnome.adw.EntryRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPasswordEntryRow";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PasswordEntryRow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PasswordEntryRow(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PasswordEntryRow> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PasswordEntryRow(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_password_entry_row_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPasswordEntryRow}.
     */
    public PasswordEntryRow() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_password_entry_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PasswordEntryRow.Builder} object constructs a {@link PasswordEntryRow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PasswordEntryRow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.EntryRow.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PasswordEntryRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PasswordEntryRow}.
         * @return A new instance of {@code PasswordEntryRow} with the properties 
         *         that were set in the Builder object.
         */
        public PasswordEntryRow build() {
            return (PasswordEntryRow) org.gtk.gobject.GObject.newWithProperties(
                PasswordEntryRow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_password_entry_row_new = Interop.downcallHandle(
                "adw_password_entry_row_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_password_entry_row_get_type = Interop.downcallHandle(
                "adw_password_entry_row_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_password_entry_row_get_type != null;
    }
}
