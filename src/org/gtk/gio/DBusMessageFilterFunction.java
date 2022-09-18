package org.gtk.gio;

/**
 * Signature for function used in g_dbus_connection_add_filter().
 * 
 * A filter function is passed a {@link org.gtk.gio.DBusMessage} and expected to return
 * a {@link org.gtk.gio.DBusMessage} too. Passive filter functions that don&<code>#39</code> t modify the
 * message can simply return the @message object:
 * |{@link [
 * static GDBusMessage *
 * passive_filter (GDBusConnection *connection
 *                 GDBusMessage    *message,
 *                 gboolean         incoming,
 *                 gpointer         user_data)
 * {
 *   // inspect @message
 *   return message;
 * }
 * ] (ref=
 * static GDBusMessage *
 * passive_filter (GDBusConnection *connection
 *                 GDBusMessage    *message,
 *                 gboolean         incoming,
 *                 gpointer         user_data)
 * {
 *   // inspect )}|
 * Filter functions that wants to drop a message can simply return <code>null</code> 
 * |{@link [
 * static GDBusMessage *
 * drop_filter (GDBusConnection *connection
 *              GDBusMessage    *message,
 *              gboolean         incoming,
 *              gpointer         user_data)
 * {
 *   if (should_drop_message)
 *     {
 *       g_object_unref (message);
 *       message = NULL;
 *     }
 *   return message;
 * }
 * ]}|
 * Finally, a filter function may modify a message by copying it:
 * |{@link [
 * static GDBusMessage *
 * modifying_filter (GDBusConnection *connection
 *                   GDBusMessage    *message,
 *                   gboolean         incoming,
 *                   gpointer         user_data)
 * {
 *   GDBusMessage *copy;
 *   GError *error;
 * 
 *   error = NULL;
 *   copy = g_dbus_message_copy (message, &<code>#38</code> error);
 *   // handle @error being set
 *   g_object_unref (message);
 * 
 *   // modify @copy
 * 
 *   return copy;
 * }
 * ] (ref=
 * static GDBusMessage *
 * modifying_filter (GDBusConnection *connection
 *                   GDBusMessage    *message,
 *                   gboolean         incoming,
 *                   gpointer         user_data)
 * {
 *   GDBusMessage *copy;
 *   GError *error;
 * 
 *   error = NULL;
 *   copy = g_dbus_message_copy (message, &<code>#38</code> error);
 *   // handle )}|
 * If the returned {@link org.gtk.gio.DBusMessage} is different from @message and cannot
 * be sent on @connection (it could use features, such as file
 * descriptors, not compatible with @connection), then a warning is
 * logged to standard error. Applications can
 * check this ahead of time using g_dbus_message_to_blob() passing a
 * {@link org.gtk.gio.DBusCapabilityFlags} value obtained from @connection.
 */
@FunctionalInterface
public interface DBusMessageFilterFunction {
        DBusMessage onDBusMessageFilterFunction(DBusConnection connection, DBusMessage message, boolean incoming);
}
