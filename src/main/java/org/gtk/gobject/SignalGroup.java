package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SignalGroup} manages to simplify the process of connecting
 * many signals to a {@link Object} as a group. As such there is no API
 * to disconnect a signal from the group.
 * <p>
 * In particular, this allows you to:
 * <ul>
 * <li>Change the target instance, which automatically causes disconnection
 *    of the signals from the old instance and connecting to the new instance.
 * <li>Block and unblock signals as a group
 * <li>Ensuring that blocked state transfers across target instances.
 * </ul>
 * <p>
 * One place you might want to use such a structure is with {@code GtkTextView} and
 * {@code GtkTextBuffer}. Often times, you'll need to connect to many signals on
 * {@code GtkTextBuffer} from a {@code GtkTextView} subclass. This allows you to create a
 * signal group during instance construction, simply bind the
 * {@code GtkTextView}:buffer property to {@link SignalGroup}:target and connect
 * all the signals you need. When the {@code GtkTextView}:buffer property changes
 * all of the signals will be transitioned correctly.
 * @version 2.72
 */
public class SignalGroup extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSignalGroup";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SignalGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SignalGroup(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SignalGroup if its GType is a (or inherits from) "GSignalGroup".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SignalGroup} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSignalGroup", a ClassCastException will be thrown.
     */
    public static SignalGroup castFrom(org.gtk.gobject.Object gobject) {
            return new SignalGroup(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type targetType) {
        java.util.Objects.requireNonNull(targetType, "Parameter 'targetType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_group_new.invokeExact(
                    targetType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link SignalGroup} for target instances of {@code target_type}.
     * @param targetType the {@link Type} of the target instance.
     */
    public SignalGroup(@NotNull org.gtk.glib.Type targetType) {
        super(constructNew(targetType), Ownership.FULL);
    }
    
    /**
     * Blocks all signal handlers managed by {@code self} so they will not
     * be called during any signal emissions. Must be unblocked exactly
     * the same number of times it has been blocked to become active again.
     * <p>
     * This blocked state will be kept across changes of the target instance.
     */
    public void block() {
        try {
            DowncallHandles.g_signal_group_block.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the {@link Callback} to connect
     */
    public void connect(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler) {
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(cHandler, "Parameter 'cHandler' must not be null");
        try {
            DowncallHandles.g_signal_group_connect.invokeExact(
                    handle(),
                    Interop.allocateNativeString(detailedSignal),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(cHandler)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * The {@code c_handler} will be called after the default handler of the signal.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the {@link Callback} to connect
     */
    public void connectAfter(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler) {
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(cHandler, "Parameter 'cHandler' must not be null");
        try {
            DowncallHandles.g_signal_group_connect_after.invokeExact(
                    handle(),
                    Interop.allocateNativeString(detailedSignal),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(cHandler)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Connects {@code closure} to the signal {@code detailed_signal} on {@link SignalGroup}:target.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     * @param detailedSignal a string of the form {@code signal-name} with optional {@code ::signal-detail}
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the
     *  default handler of the signal.
     */
    public void connectClosure(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Closure closure, boolean after) {
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        try {
            DowncallHandles.g_signal_group_connect_closure.invokeExact(
                    handle(),
                    Interop.allocateNativeString(detailedSignal),
                    closure.handle(),
                    after ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the {@link Callback} to connect
     * @param notify function to be called when disposing of {@code self}
     * @param flags the flags used to create the signal connection
     */
    public void connectData(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler, @NotNull org.gtk.gobject.ClosureNotify notify, @NotNull org.gtk.gobject.ConnectFlags flags) {
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(cHandler, "Parameter 'cHandler' must not be null");
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_signal_group_connect_data.invokeExact(
                    handle(),
                    Interop.allocateNativeString(detailedSignal),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(cHandler)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal} on {@link SignalGroup}:target.
     * <p>
     * Ensures that the {@code object} stays alive during the call to {@code c_handler}
     * by temporarily adding a reference count. When the {@code object} is destroyed
     * the signal handler will automatically be removed.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     * @param detailedSignal a string of the form {@code signal-name} with optional {@code ::signal-detail}
     * @param cHandler the {@link Callback} to connect
     * @param object the {@link Object} to pass as data to {@code c_handler} calls
     * @param flags {@link ConnectFlags} for the signal connection
     */
    public void connectObject(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler, @NotNull java.lang.foreign.MemoryAddress object, @NotNull org.gtk.gobject.ConnectFlags flags) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * The instance on which the signal is emitted and {@code data}
     * will be swapped when calling {@code c_handler}.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     * @param detailedSignal a string of the form "signal-name::detail"
     * @param cHandler the {@link Callback} to connect
     */
    public void connectSwapped(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler) {
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(cHandler, "Parameter 'cHandler' must not be null");
        try {
            DowncallHandles.g_signal_group_connect_swapped.invokeExact(
                    handle(),
                    Interop.allocateNativeString(detailedSignal),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(cHandler)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the target instance used when connecting signals.
     * @return The target instance
     */
    public @Nullable org.gtk.gobject.Object dupTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_group_dup_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the target instance used when connecting signals. Any signal
     * that has been registered with g_signal_group_connect_object() or
     * similar functions will be connected to this object.
     * <p>
     * If the target instance was previously set, signals will be
     * disconnected from that object prior to connecting to {@code target}.
     * @param target The target instance used
     *     when connecting signals.
     */
    public void setTarget(@Nullable org.gtk.gobject.Object target) {
        try {
            DowncallHandles.g_signal_group_set_target.invokeExact(
                    handle(),
                    (Addressable) (target == null ? MemoryAddress.NULL : target.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unblocks all signal handlers managed by {@code self} so they will be
     * called again during any signal emissions unless it is blocked
     * again. Must be unblocked exactly the same number of times it
     * has been blocked to become active again.
     */
    public void unblock() {
        try {
            DowncallHandles.g_signal_group_unblock.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.g_signal_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Bind {
        void signalReceived(SignalGroup source, @NotNull org.gtk.gobject.Object instance);
    }
    
    /**
     * This signal is emitted when {@link SignalGroup}:target is set to a new value
     * other than {@code null}. It is similar to {@link Object}::notify on {@code target} except it
     * will not emit when {@link SignalGroup}:target is {@code null} and also allows for
     * receiving the {@link Object} without a data-race.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalGroup.Bind> onBind(SignalGroup.Bind handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("bind"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalGroup.Callbacks.class, "signalSignalGroupBind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SignalGroup.Bind>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Unbind {
        void signalReceived(SignalGroup source);
    }
    
    /**
     * This signal is emitted when the target instance of {@code self} is set to a
     * new {@link Object}.
     * <p>
     * This signal will only be emitted if the previous target of {@code self} is
     * non-{@code null}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalGroup.Unbind> onUnbind(SignalGroup.Unbind handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unbind"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalGroup.Callbacks.class, "signalSignalGroupUnbind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SignalGroup.Unbind>(handle(), RESULT);
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
         * A {@link SignalGroup.Build} object constructs a {@link SignalGroup} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SignalGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SignalGroup} using {@link SignalGroup#castFrom}.
         * @return A new instance of {@code SignalGroup} with the properties 
         *         that were set in the Build object.
         */
        public SignalGroup construct() {
            return SignalGroup.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SignalGroup.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The target instance used when connecting signals.
         * @param target The value for the {@code target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTarget(org.gtk.gobject.Object target) {
            names.add("target");
            values.add(org.gtk.gobject.Value.create(target));
            return this;
        }
        
        /**
         * The {@link Type} of the target property.
         * @param targetType The value for the {@code target-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTargetType(org.gtk.glib.Type targetType) {
            names.add("target-type");
            values.add(org.gtk.gobject.Value.create(targetType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_signal_group_new = Interop.downcallHandle(
            "g_signal_group_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_signal_group_block = Interop.downcallHandle(
            "g_signal_group_block",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_group_connect = Interop.downcallHandle(
            "g_signal_group_connect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_group_connect_after = Interop.downcallHandle(
            "g_signal_group_connect_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_group_connect_closure = Interop.downcallHandle(
            "g_signal_group_connect_closure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_group_connect_data = Interop.downcallHandle(
            "g_signal_group_connect_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_group_connect_object = Interop.downcallHandle(
            "g_signal_group_connect_object",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_group_connect_swapped = Interop.downcallHandle(
            "g_signal_group_connect_swapped",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_group_dup_target = Interop.downcallHandle(
            "g_signal_group_dup_target",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_group_set_target = Interop.downcallHandle(
            "g_signal_group_set_target",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_group_unblock = Interop.downcallHandle(
            "g_signal_group_unblock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_group_get_type = Interop.downcallHandle(
            "g_signal_group_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalSignalGroupBind(MemoryAddress source, MemoryAddress instance, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (SignalGroup.Bind) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalGroup(source, Ownership.NONE), new org.gtk.gobject.Object(instance, Ownership.NONE));
        }
        
        public static void signalSignalGroupUnbind(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (SignalGroup.Unbind) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalGroup(source, Ownership.NONE));
        }
    }
}
