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
     * Cast object to ShortcutManager if its GType is a (or inherits from) "GtkShortcutManager".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutManager} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutManager", a ClassCastException will be thrown.
     */
    public static ShortcutManager castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ShortcutManager.getType())) {
            return new ShortcutManagerImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutManager");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    
    class ShortcutManagerImpl extends org.gtk.gobject.Object implements ShortcutManager {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ShortcutManagerImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
