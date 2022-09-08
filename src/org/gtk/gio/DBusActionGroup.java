package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDBusActionGroup is an implementation of the #GActionGroup
 * interface that can be used as a proxy for an action group
 * that is exported over D-Bus with g_dbus_connection_export_action_group().
 */
public class DBusActionGroup extends org.gtk.gobject.Object implements ActionGroup, RemoteActionGroup {

    public DBusActionGroup(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusActionGroup */
    public static DBusActionGroup castFrom(org.gtk.gobject.Object gobject) {
        return new DBusActionGroup(gobject.getReference());
    }
    
}
