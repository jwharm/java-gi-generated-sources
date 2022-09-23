package org.gtk.gio;

/**
 * Function signature for a function used to determine the {@link org.gtk.glib.Type} to
 * use for an interface proxy (if {@code interface_name} is not {@code null}) or
 * object proxy (if {@code interface_name} is {@code null}).
 * <p>
 * This function is called in the
 * [thread-default main loop][g-main-context-push-thread-default]
 * that {@code manager} was constructed in.
 */
@FunctionalInterface
public interface DBusProxyTypeFunc {
        org.gtk.gobject.Type onDBusProxyTypeFunc(DBusObjectManagerClient manager, java.lang.String objectPath, java.lang.String interfaceName);
}
