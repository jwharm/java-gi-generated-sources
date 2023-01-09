package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SignalGroup} manages to simplify the process of connecting
 * many signals to a {@link GObject} as a group. As such there is no API
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
public class SignalGroup extends org.gtk.gobject.GObject {
    
    static {
        GObjects.javagi$ensureInitialized();
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
     */
    protected SignalGroup(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SignalGroup> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SignalGroup(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type targetType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_group_new.invokeExact(targetType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link SignalGroup} for target instances of {@code target_type}.
     * @param targetType the {@link org.gtk.glib.Type} of the target instance.
     */
    public SignalGroup(org.gtk.glib.Type targetType) {
        super(constructNew(targetType));
        this.takeOwnership();
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
            DowncallHandles.g_signal_group_block.invokeExact(handle());
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
    public void connect(java.lang.String detailedSignal, org.gtk.gobject.Callback cHandler) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_signal_group_connect.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedSignal, SCOPE),
                        (Addressable) cHandler.toCallback(),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void connectAfter(java.lang.String detailedSignal, org.gtk.gobject.Callback cHandler) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_signal_group_connect_after.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedSignal, SCOPE),
                        (Addressable) cHandler.toCallback(),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void connectClosure(java.lang.String detailedSignal, org.gtk.gobject.Closure closure, boolean after) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_signal_group_connect_closure.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedSignal, SCOPE),
                        closure.handle(),
                        Marshal.booleanToInteger.marshal(after, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void connectData(java.lang.String detailedSignal, org.gtk.gobject.Callback cHandler, org.gtk.gobject.ClosureNotify notify, org.gtk.gobject.ConnectFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_signal_group_connect_data.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedSignal, SCOPE),
                        (Addressable) cHandler.toCallback(),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) notify.toCallback(),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     * @param object the {@link GObject} to pass as data to {@code c_handler} calls
     * @param flags {@link ConnectFlags} for the signal connection
     */
    public void connectObject(java.lang.String detailedSignal, org.gtk.gobject.Callback cHandler, java.lang.foreign.MemoryAddress object, org.gtk.gobject.ConnectFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_signal_group_connect_object.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedSignal, SCOPE),
                        (Addressable) cHandler.toCallback(),
                        (Addressable) object,
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
    public void connectSwapped(java.lang.String detailedSignal, org.gtk.gobject.Callback cHandler) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_signal_group_connect_swapped.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(detailedSignal, SCOPE),
                        (Addressable) cHandler.toCallback(),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Gets the target instance used when connecting signals.
     * @return The target instance
     */
    public @Nullable org.gtk.gobject.GObject dupTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_group_dup_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public void setTarget(@Nullable org.gtk.gobject.GObject target) {
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
            DowncallHandles.g_signal_group_unblock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_signal_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Bind} callback.
     */
    @FunctionalInterface
    public interface Bind {
    
        /**
         * This signal is emitted when {@link SignalGroup}:target is set to a new value
         * other than {@code null}. It is similar to {@link GObject}::notify on {@code target} except it
         * will not emit when {@link SignalGroup}:target is {@code null} and also allows for
         * receiving the {@link GObject} without a data-race.
         */
        void run(org.gtk.gobject.GObject instance);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSignalGroup, MemoryAddress instance) {
            run((org.gtk.gobject.GObject) Interop.register(instance, org.gtk.gobject.GObject.fromAddress).marshal(instance, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Bind.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted when {@link SignalGroup}:target is set to a new value
     * other than {@code null}. It is similar to {@link GObject}::notify on {@code target} except it
     * will not emit when {@link SignalGroup}:target is {@code null} and also allows for
     * receiving the {@link GObject} without a data-race.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalGroup.Bind> onBind(SignalGroup.Bind handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("bind", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Unbind} callback.
     */
    @FunctionalInterface
    public interface Unbind {
    
        /**
         * This signal is emitted when the target instance of {@code self} is set to a
         * new {@link GObject}.
         * <p>
         * This signal will only be emitted if the previous target of {@code self} is
         * non-{@code null}.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSignalGroup) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Unbind.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted when the target instance of {@code self} is set to a
     * new {@link GObject}.
     * <p>
     * This signal will only be emitted if the previous target of {@code self} is
     * non-{@code null}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SignalGroup.Unbind> onUnbind(SignalGroup.Unbind handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unbind", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SignalGroup.Builder} object constructs a {@link SignalGroup} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SignalGroup.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SignalGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SignalGroup}.
         * @return A new instance of {@code SignalGroup} with the properties 
         *         that were set in the Builder object.
         */
        public SignalGroup build() {
            return (SignalGroup) org.gtk.gobject.GObject.newWithProperties(
                SignalGroup.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The target instance used when connecting signals.
         * @param target The value for the {@code target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTarget(org.gtk.gobject.GObject target) {
            names.add("target");
            values.add(org.gtk.gobject.Value.create(target));
            return this;
        }
        
        /**
         * The {@link org.gtk.glib.Type} of the target property.
         * @param targetType The value for the {@code target-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTargetType(org.gtk.glib.Type targetType) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_signal_group_get_type != null;
    }
}
