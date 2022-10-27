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
    
    class ShortcutManagerImpl extends org.gtk.gobject.Object implements ShortcutManager {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ShortcutManagerImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
