package org.gtk.gio;

/**
 * Signature for function used in g_dbus_connection_add_filter().
 * 
 * A filter function is passed a #GDBusMessage and expected to return
 * a #GDBusMessage too. Passive filter functions that don't modify the
 * message can simply return the @message object:
 * |[
 * static GDBusMessage *
 * passive_filter (GDBusConnection *connection
 *                 GDBusMessage    *message,
 *                 gboolean         incoming,
 *                 gpointer         user_data)
 * {
 *   // inspect @message
 *   return message;
 * }
 * ]|
 * Filter functions that wants to drop a message can simply return %NULL:
 * |[
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
 * ]|
 * Finally, a filter function may modify a message by copying it:
 * |[
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
 *   copy = g_dbus_message_copy (message, &error);
 *   // handle @error being set
 *   g_object_unref (message);
 * 
 *   // modify @copy
 * 
 *   return copy;
 * }
 * ]|
 * If the returned #GDBusMessage is different from @message and cannot
 * be sent on @connection (it could use features, such as file
 * descriptors, not compatible with @connection), then a warning is
 * logged to standard error. Applications can
 * check this ahead of time using g_dbus_message_to_blob() passing a
 * #GDBusCapabilityFlags value obtained from @connection.
 */
@FunctionalInterface
public interface DBusMessageFilterFunction {
        DBusMessage onDBusMessageFilterFunction(DBusConnection connection, DBusMessage message, boolean incoming);
}
