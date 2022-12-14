package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Signature for function used in g_dbus_connection_add_filter().
 * <p>
 * A filter function is passed a {@link DBusMessage} and expected to return
 * a {@link DBusMessage} too. Passive filter functions that don't modify the
 * message can simply return the {@code message} object:
 * <pre>{@code 
 * static GDBusMessage *
 * passive_filter (GDBusConnection *connection
 *                 GDBusMessage    *message,
 *                 gboolean         incoming,
 *                 gpointer         user_data)
 * {
 *   // inspect @message
 *   return message;
 * }
 * }</pre>
 * Filter functions that wants to drop a message can simply return {@code null}:
 * <pre>{@code 
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
 * }</pre>
 * Finally, a filter function may modify a message by copying it:
 * <pre>{@code 
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
 * }</pre>
 * If the returned {@link DBusMessage} is different from {@code message} and cannot
 * be sent on {@code connection} (it could use features, such as file
 * descriptors, not compatible with {@code connection}), then a warning is
 * logged to standard error. Applications can
 * check this ahead of time using g_dbus_message_to_blob() passing a
 * {@link DBusCapabilityFlags} value obtained from {@code connection}.
 * @version 2.26
 */
/**
 * Functional interface declaration of the {@code DBusMessageFilterFunction} callback.
 */
@FunctionalInterface
public interface DBusMessageFilterFunction {

    /**
     * Signature for function used in g_dbus_connection_add_filter().
     * <p>
     * A filter function is passed a {@link DBusMessage} and expected to return
     * a {@link DBusMessage} too. Passive filter functions that don't modify the
     * message can simply return the {@code message} object:
     * <pre>{@code 
     * static GDBusMessage *
     * passive_filter (GDBusConnection *connection
     *                 GDBusMessage    *message,
     *                 gboolean         incoming,
     *                 gpointer         user_data)
     * {
     *   // inspect @message
     *   return message;
     * }
     * }</pre>
     * Filter functions that wants to drop a message can simply return {@code null}:
     * <pre>{@code 
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
     * }</pre>
     * Finally, a filter function may modify a message by copying it:
     * <pre>{@code 
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
     * }</pre>
     * If the returned {@link DBusMessage} is different from {@code message} and cannot
     * be sent on {@code connection} (it could use features, such as file
     * descriptors, not compatible with {@code connection}), then a warning is
     * logged to standard error. Applications can
     * check this ahead of time using g_dbus_message_to_blob() passing a
     * {@link DBusCapabilityFlags} value obtained from {@code connection}.
     * @version 2.26
     */
    @Nullable org.gtk.gio.DBusMessage run(org.gtk.gio.DBusConnection connection, org.gtk.gio.DBusMessage message, boolean incoming);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress connection, MemoryAddress message, int incoming, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.DBusConnection) Interop.register(connection, org.gtk.gio.DBusConnection.fromAddress).marshal(connection, null), (org.gtk.gio.DBusMessage) Interop.register(message, org.gtk.gio.DBusMessage.fromAddress).marshal(message, null), Marshal.integerToBoolean.marshal(incoming, null).booleanValue());
        RESULT.yieldOwnership();
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DBusMessageFilterFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
