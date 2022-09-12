package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkShortcutManager` interface is used to implement
 * shortcut scopes.
 * 
 * This is important for [iface@Gtk.Native] widgets that have their
 * own surface, since the event controllers that are used to implement
 * managed and global scopes are limited to the same native.
 * 
 * Examples for widgets implementing `GtkShortcutManager` are
 * [class@Gtk.Window] and [class@Gtk.Popover].
 * 
 * Every widget that implements `GtkShortcutManager` will be used as a
 * %GTK_SHORTCUT_SCOPE_MANAGED.
 */
public interface ShortcutManager extends io.github.jwharm.javagi.NativeAddress {

    class ShortcutManagerImpl extends org.gtk.gobject.Object implements ShortcutManager {
        public ShortcutManagerImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
