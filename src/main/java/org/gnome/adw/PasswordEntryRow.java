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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PasswordEntryRow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PasswordEntryRow if its GType is a (or inherits from) "AdwPasswordEntryRow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PasswordEntryRow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPasswordEntryRow", a ClassCastException will be thrown.
     */
    public static PasswordEntryRow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwPasswordEntryRow"))) {
            return new PasswordEntryRow(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPasswordEntryRow");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_password_entry_row_new = Interop.downcallHandle(
            "adw_password_entry_row_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
