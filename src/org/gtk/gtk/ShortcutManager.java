package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkShortcutManager</code> interface is used to implement
 * shortcut scopes.
 * <p>
 * This is important for {@link [iface@Gtk.Native] (ref=iface)} widgets that have their
 * own surface, since the event controllers that are used to implement
 * managed and global scopes are limited to the same native.
 * <p>
 * Examples for widgets implementing <code>GtkShortcutManager</code> are
 * {@link org.gtk.gtk.Window} and {@link org.gtk.gtk.Popover}.
 * <p>
 * Every widget that implements <code>GtkShortcutManager</code> will be used as a
 * {@link org.gtk.gtk.ShortcutScope<code>#MANAGED</code>
 */
public interface ShortcutManager extends io.github.jwharm.javagi.NativeAddress {

    class ShortcutManagerImpl extends org.gtk.gobject.Object implements ShortcutManager {
        public ShortcutManagerImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
