package org.gtk.gio;

/**
 * Signature for function used in g_dbus_connection_add_filter().
 * <p>
 * A filter function is passed a {@link DBusMessage} and expected to return
 * a {@link DBusMessage} too. Passive filter functions that don't modify the
 * message can simply return the {@code message} object:
 * |[
 * static GDBusMessage *
 * passive_filter (GDBusConnection *connection
 *                 GDBusMessage    *message,
 *                 gboolean         incoming,
 *                 gpointer         user_data)
 * {
 *   // inspect {@code message}
 *   return message;
 * }
 * ]|
 * Filter functions that wants to drop a message can simply return <code>null</code>:
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
 * <p>
 *   error = NULL;
 *   copy = g_dbus_message_copy (message, &error);
 *   // handle {@code error} being set
 *   g_object_unref (message);
 * <p>
 *   // modify {@code copy}
 * <p>
 *   return copy;
 * }
 * ]|
 * If the returned {@link DBusMessage} is different from {@code message} and cannot
 * be sent on {@code connection} (it could use features, such as file
 * descriptors, not compatible with {@code connection}), then a warning is
 * logged to standard error. Applications can
 * check this ahead of time using g_dbus_message_to_blob() passing a
 * {@link DBusCapabilityFlags} value obtained from {@code connection}.
 */
@FunctionalInterface
public interface DBusMessageFilterFunction {
        DBusMessage onDBusMessageFilterFunction(DBusConnection connection, DBusMessage message, boolean incoming);
}
