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
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutManagerImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutManagerImpl(input);
    
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
    
    /**
     * The ShortcutManagerImpl type represents a native instance of the ShortcutManager interface.
     */
    class ShortcutManagerImpl extends org.gtk.gobject.GObject implements ShortcutManager {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of ShortcutManager for the provided memory address.
         * @param address the memory address of the instance
         */
        public ShortcutManagerImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_shortcut_manager_get_type != null;
    }
}
