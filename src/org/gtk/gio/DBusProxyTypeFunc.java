package org.gtk.gio;

@FunctionalInterface
public interface DBusProxyTypeFunc {

    /**
     * Function signature for a function used to determine the #GType to
     * use for an interface proxy (if @interface_name is not %NULL) or
     * object proxy (if @interface_name is %NULL).
     * 
     * This function is called in the
     * [thread-default main loop][g-main-context-push-thread-default]
     * that @manager was constructed in.
     */
    public org.gtk.gobject.Type onDBusProxyTypeFunc(DBusObjectManagerClient manager, java.lang.String objectPath, java.lang.String interfaceName, jdk.incubator.foreign.MemoryAddress userData);
}