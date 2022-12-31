package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkShortcutManager} interface is used to implement
 * shortcut scopes.
 * <p>
 * This is important for {@code Gtk.Native} widgets that have their
 * own surface, since the event controllers that are used to implement
 * managed and global scopes are limited to the same native.
 * <p>
 * Examples for widgets implementing {@code GtkShortcutManager} are
 * {@link Window}.
 * <p>
 * Every widget that implements {@code GtkShortcutManager} will be used as a
 * {@link ShortcutScope#MANAGED}.
 */
public interface ShortcutManager extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutManagerImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutManagerImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcut_manager_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_shortcut_manager_get_type = Interop.downcallHandle(
            "gtk_shortcut_manager_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class ShortcutManagerImpl extends org.gtk.gobject.GObject implements ShortcutManager {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ShortcutManagerImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
