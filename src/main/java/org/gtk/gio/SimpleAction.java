package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link SimpleAction} is the obvious simple implementation of the {@link Action}
 * interface. This is the easiest way to create an action for purposes of
 * adding it to a {@link SimpleActionGroup}.
 * <p>
 * See also {@code GtkAction}.
 */
public class SimpleAction extends org.gtk.gobject.Object implements org.gtk.gio.Action {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleAction";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SimpleAction proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SimpleAction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SimpleAction if its GType is a (or inherits from) "GSimpleAction".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SimpleAction} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSimpleAction", a ClassCastException will be thrown.
     */
    public static SimpleAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), SimpleAction.getType())) {
            return new SimpleAction(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSimpleAction");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @Nullable org.gtk.glib.VariantType parameterType) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_action_new.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (parameterType == null ? MemoryAddress.NULL : parameterType.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new action.
     * <p>
     * The created action is stateless. See g_simple_action_new_stateful() to create
     * an action that has state.
     * @param name the name of the action
     * @param parameterType the type of parameter that will be passed to
     *   handlers for the {@link SimpleAction}::activate signal, or {@code null} for no parameter
     */
    public SimpleAction(@NotNull java.lang.String name, @Nullable org.gtk.glib.VariantType parameterType) {
        super(constructNew(name, parameterType), Ownership.FULL);
    }
    
    private static Addressable constructNewStateful(@NotNull java.lang.String name, @Nullable org.gtk.glib.VariantType parameterType, @NotNull org.gtk.glib.Variant state) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_action_new_stateful.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (parameterType == null ? MemoryAddress.NULL : parameterType.handle()),
                    state.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new stateful action.
     * <p>
     * All future state values must have the same {@link org.gtk.glib.VariantType} as the initial
     * {@code state}.
     * <p>
     * If the {@code state} {@link org.gtk.glib.Variant} is floating, it is consumed.
     * @param name the name of the action
     * @param parameterType the type of the parameter that will be passed to
     *   handlers for the {@link SimpleAction}::activate signal, or {@code null} for no parameter
     * @param state the initial state of the action
     * @return a new {@link SimpleAction}
     */
    public static SimpleAction newStateful(@NotNull java.lang.String name, @Nullable org.gtk.glib.VariantType parameterType, @NotNull org.gtk.glib.Variant state) {
        return new SimpleAction(constructNewStateful(name, parameterType, state), Ownership.FULL);
    }
    
    /**
     * Sets the action as enabled or not.
     * <p>
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     * <p>
     * This should only be called by the implementor of the action.  Users
     * of the action should not attempt to modify its enabled flag.
     * @param enabled whether the action is enabled
     */
    public void setEnabled(boolean enabled) {
        try {
            DowncallHandles.g_simple_action_set_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param value the new {@link org.gtk.glib.Variant} for the state
     */
    public void setState(@NotNull org.gtk.glib.Variant value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_simple_action_set_state.invokeExact(
                    handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the state hint for the action.
     * <p>
     * See g_action_get_state_hint() for more information about
     * action state hints.
     * @param stateHint a {@link org.gtk.glib.Variant} representing the state hint
     */
    public void setStateHint(@Nullable org.gtk.glib.Variant stateHint) {
        try {
            DowncallHandles.g_simple_action_set_state_hint.invokeExact(
                    handle(),
                    (Addressable) (stateHint == null ? MemoryAddress.NULL : stateHint.handle()));
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
            RESULT = (long) DowncallHandles.g_simple_action_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(SimpleAction sourceSimpleAction, @Nullable org.gtk.glib.Variant parameter);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SimpleAction.Activate> onActivate(SimpleAction.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SimpleAction.Callbacks.class, "signalSimpleActionActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SimpleAction.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangeState {
        void signalReceived(SimpleAction sourceSimpleAction, @Nullable org.gtk.glib.Variant value);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SimpleAction.ChangeState> onChangeState(SimpleAction.ChangeState handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-state"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SimpleAction.Callbacks.class, "signalSimpleActionChangeState",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SimpleAction.ChangeState>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link SimpleAction.Build} object constructs a {@link SimpleAction} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SimpleAction} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimpleAction} using {@link SimpleAction#castFrom}.
         * @return A new instance of {@code SimpleAction} with the properties 
         *         that were set in the Build object.
         */
        public SimpleAction construct() {
            return SimpleAction.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SimpleAction.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If {@code action} is currently enabled.
         * <p>
         * If the action is disabled then calls to g_action_activate() and
         * g_action_change_state() have no effect.
         * @param enabled The value for the {@code enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnabled(boolean enabled) {
            names.add("enabled");
            values.add(org.gtk.gobject.Value.create(enabled));
            return this;
        }
        
        /**
         * The name of the action. This is mostly meaningful for identifying
         * the action once it has been added to a {@link SimpleActionGroup}.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The type of the parameter that must be given when activating the
         * action.
         * @param parameterType The value for the {@code parameter-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParameterType(org.gtk.glib.VariantType parameterType) {
            names.add("parameter-type");
            values.add(org.gtk.gobject.Value.create(parameterType));
            return this;
        }
        
        /**
         * The state of the action, or {@code null} if the action is stateless.
         * @param state The value for the {@code state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setState(org.gtk.glib.Variant state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
        
        /**
         * The {@link org.gtk.glib.VariantType} of the state that the action has, or {@code null} if the
         * action is stateless.
         * @param stateType The value for the {@code state-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStateType(org.gtk.glib.VariantType stateType) {
            names.add("state-type");
            values.add(org.gtk.gobject.Value.create(stateType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_action_new = Interop.downcallHandle(
            "g_simple_action_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_action_new_stateful = Interop.downcallHandle(
            "g_simple_action_new_stateful",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_action_set_enabled = Interop.downcallHandle(
            "g_simple_action_set_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_simple_action_set_state = Interop.downcallHandle(
            "g_simple_action_set_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_action_set_state_hint = Interop.downcallHandle(
            "g_simple_action_set_state_hint",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_action_get_type = Interop.downcallHandle(
            "g_simple_action_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalSimpleActionActivate(MemoryAddress sourceSimpleAction, MemoryAddress parameter, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (SimpleAction.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SimpleAction(sourceSimpleAction, Ownership.NONE), new org.gtk.glib.Variant(parameter, Ownership.NONE));
        }
        
        public static void signalSimpleActionChangeState(MemoryAddress sourceSimpleAction, MemoryAddress value, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (SimpleAction.ChangeState) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SimpleAction(sourceSimpleAction, Ownership.NONE), new org.gtk.glib.Variant(value, Ownership.NONE));
        }
    }
}
