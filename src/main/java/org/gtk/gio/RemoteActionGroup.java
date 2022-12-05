package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GRemoteActionGroup interface is implemented by {@link ActionGroup}
 * instances that either transmit action invocations to other processes
 * or receive action invocations in the local process from other
 * processes.
 * <p>
 * The interface has {@code _full} variants of the two
 * methods on {@link ActionGroup} used to activate actions:
 * g_action_group_activate_action() and
 * g_action_group_change_action_state(). These variants allow a
 * "platform data" {@link org.gtk.glib.Variant} to be specified: a dictionary providing
 * context for the action invocation (for example: timestamps, startup
 * notification IDs, etc).
 * <p>
 * {@link DBusActionGroup} implements {@link RemoteActionGroup}.  This provides a
 * mechanism to send platform data for action invocations over D-Bus.
 * <p>
 * Additionally, g_dbus_connection_export_action_group() will check if
 * the exported {@link ActionGroup} implements {@link RemoteActionGroup} and use the
 * {@code _full} variants of the calls if available.  This
 * provides a mechanism by which to receive platform data for action
 * invocations that arrive by way of D-Bus.
 * @version 2.32
 */
public interface RemoteActionGroup extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to RemoteActionGroup if its GType is a (or inherits from) "GRemoteActionGroup".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code RemoteActionGroup} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GRemoteActionGroup", a ClassCastException will be thrown.
     */
    public static RemoteActionGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), RemoteActionGroup.getType())) {
            return new RemoteActionGroupImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GRemoteActionGroup");
        }
    }
    
    /**
     * Activates the remote action.
     * <p>
     * This is the same as g_action_group_activate_action() except that it
     * allows for provision of "platform data" to be sent along with the
     * activation request.  This typically contains details such as the user
     * interaction timestamp or startup notification information.
     * <p>
     * {@code platform_data} must be non-{@code null} and must have the type
     * {@code G_VARIANT_TYPE_VARDICT}.  If it is floating, it will be consumed.
     * @param actionName the name of the action to activate
     * @param parameter the optional parameter to the activation
     * @param platformData the platform data to send
     */
    default void activateActionFull(@NotNull java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter, @NotNull org.gtk.glib.Variant platformData) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNull(platformData, "Parameter 'platformData' must not be null");
        try {
            DowncallHandles.g_remote_action_group_activate_action_full.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    (Addressable) (parameter == null ? MemoryAddress.NULL : parameter.handle()),
                    platformData.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes the state of a remote action.
     * <p>
     * This is the same as g_action_group_change_action_state() except that
     * it allows for provision of "platform data" to be sent along with the
     * state change request.  This typically contains details such as the
     * user interaction timestamp or startup notification information.
     * <p>
     * {@code platform_data} must be non-{@code null} and must have the type
     * {@code G_VARIANT_TYPE_VARDICT}.  If it is floating, it will be consumed.
     * @param actionName the name of the action to change the state of
     * @param value the new requested value for the state
     * @param platformData the platform data to send
     */
    default void changeActionStateFull(@NotNull java.lang.String actionName, @NotNull org.gtk.glib.Variant value, @NotNull org.gtk.glib.Variant platformData) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(platformData, "Parameter 'platformData' must not be null");
        try {
            DowncallHandles.g_remote_action_group_change_action_state_full.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    value.handle(),
                    platformData.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_remote_action_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_activate_action_full = Interop.downcallHandle(
            "g_remote_action_group_activate_action_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_change_action_state_full = Interop.downcallHandle(
            "g_remote_action_group_change_action_state_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_remote_action_group_get_type = Interop.downcallHandle(
            "g_remote_action_group_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class RemoteActionGroupImpl extends org.gtk.gobject.Object implements RemoteActionGroup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public RemoteActionGroupImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
