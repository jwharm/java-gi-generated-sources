package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link SimpleAction} is the obvious simple implementation of the {@link Action}
 * interface. This is the easiest way to create an action for purposes of
 * adding it to a {@link SimpleActionGroup}.
 * <p>
 * See also {@code GtkAction}.
 */
public class SimpleAction extends org.gtk.gobject.Object implements Action {

    public SimpleAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SimpleAction */
    public static SimpleAction castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleAction(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String name, org.gtk.glib.VariantType parameterType) {
        Reference RESULT = References.get(gtk_h.g_simple_action_new(Interop.allocateNativeString(name).handle(), parameterType.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new action.
     * <p>
     * The created action is stateless. See g_simple_action_new_stateful() to create
     * an action that has state.
     */
    public SimpleAction(java.lang.String name, org.gtk.glib.VariantType parameterType) {
        super(constructNew(name, parameterType));
    }
    
    private static Reference constructNewStateful(java.lang.String name, org.gtk.glib.VariantType parameterType, org.gtk.glib.Variant state) {
        Reference RESULT = References.get(gtk_h.g_simple_action_new_stateful(Interop.allocateNativeString(name).handle(), parameterType.handle(), state.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new stateful action.
     * <p>
     * All future state values must have the same {@link org.gtk.glib.VariantType} as the initial
     * {@code state}.
     * <p>
     * If the {@code state} {@link org.gtk.glib.Variant} is floating, it is consumed.
     */
    public static SimpleAction newStateful(java.lang.String name, org.gtk.glib.VariantType parameterType, org.gtk.glib.Variant state) {
        return new SimpleAction(constructNewStateful(name, parameterType, state));
    }
    
    /**
     * Sets the action as enabled or not.
     * <p>
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     * <p>
     * This should only be called by the implementor of the action.  Users
     * of the action should not attempt to modify its enabled flag.
     */
    public void setEnabled(boolean enabled) {
        gtk_h.g_simple_action_set_enabled(handle(), enabled ? 1 : 0);
    }
    
    /**
     * Sets the state of the action.
     * <p>
     * This directly updates the 'state' property to the given value.
     * <p>
     * This should only be called by the implementor of the action.  Users
     * of the action should not attempt to directly modify the 'state'
     * property.  Instead, they should call g_action_change_state() to
     * request the change.
     * <p>
     * If the {@code value} GVariant is floating, it is consumed.
     */
    public void setState(org.gtk.glib.Variant value) {
        gtk_h.g_simple_action_set_state(handle(), value.handle());
    }
    
    /**
     * Sets the state hint for the action.
     * <p>
     * See g_action_get_state_hint() for more information about
     * action state hints.
     */
    public void setStateHint(org.gtk.glib.Variant stateHint) {
        gtk_h.g_simple_action_set_state_hint(handle(), stateHint.handle());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(SimpleAction source, org.gtk.glib.Variant parameter);
    }
    
    /**
     * Indicates that the action was just activated.
     * <p>
     * {@code parameter} will always be of the expected type, i.e. the parameter type
     * specified when the action was created. If an incorrect type is given when
     * activating the action, this signal is not emitted.
     * <p>
     * Since GLib 2.40, if no handler is connected to this signal then the
     * default behaviour for boolean-stated actions with a {@code null} parameter
     * type is to toggle them via the {@link SimpleAction}::change-state signal.
     * For stateful actions where the state type is equal to the parameter
     * type, the default is to forward them directly to
     * {@link SimpleAction}::change-state.  This should allow almost all users
     * of {@link SimpleAction} to connect only one handler or the other.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSimpleActionActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangeStateHandler {
        void signalReceived(SimpleAction source, org.gtk.glib.Variant value);
    }
    
    /**
     * Indicates that the action just received a request to change its
     * state.
     * <p>
     * {@code value} will always be of the correct state type, i.e. the type of the
     * initial state passed to g_simple_action_new_stateful(). If an incorrect
     * type is given when requesting to change the state, this signal is not
     * emitted.
     * <p>
     * If no handler is connected to this signal then the default
     * behaviour is to call g_simple_action_set_state() to set the state
     * to the requested value. If you connect a signal handler then no
     * default action is taken. If the state should change then you must
     * call g_simple_action_set_state() from the handler.
     * <p>
     * An example of a 'change-state' handler:
     * <pre>{@code <!-- language="C" -->
     * static void
     * change_volume_state (GSimpleAction *action,
     *                      GVariant      *value,
     *                      gpointer       user_data)
     * {
     *   gint requested;
     * 
     *   requested = g_variant_get_int32 (value);
     * 
     *   // Volume only goes from 0 to 10
     *   if (0 <= requested && requested <= 10)
     *     g_simple_action_set_state (action, value);
     * }
     * }</pre>
     * <p>
     * The handler need not set the state to the requested value.
     * It could set it to any value at all, or take some other action.
     */
    public SignalHandle onChangeState(ChangeStateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSimpleActionChangeState", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("change-state").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
