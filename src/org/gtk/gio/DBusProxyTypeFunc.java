package org.gtk.gio;

/**
 * Function signature for a function used to determine the {@link org.gtk.glib.Type} to
 * use for an interface proxy (if @interface_name is not <code>null</code>  or
 * object proxy (if @interface_name is <code>null</code> .
 * 
 * This function is called in the
 * {@link [thread-default main loop]}{@link [g-main-context-push-thread-default]}
 * that @manager was constructed in.
 */
@FunctionalInterface
public interface DBusProxyTypeFunc {
        org.gtk.gobject.Type onDBusProxyTypeFunc(DBusObjectManagerClient manager, java.lang.String objectPath, java.lang.String interfaceName);
}
