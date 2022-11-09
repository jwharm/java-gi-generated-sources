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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ShortcutManager" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutManager", a ClassCastException will be thrown.
     */
    public static ShortcutManager castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutManager"))) {
            return new ShortcutManagerImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutManager");
        }
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
