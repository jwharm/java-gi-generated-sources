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
 * One place you might want to use such a structure is with {@link org.gtk.gtk.TextView} and
 * {@link org.gtk.gtk.TextBuffer}. Often times, you'll need to connect to many signals on
 * {@link org.gtk.gtk.TextBuffer} from a {@link org.gtk.gtk.TextView} subclass. This allows you to create a
 * signal group during instance construction, simply bind the
 * {@link org.gtk.gtk.TextView}:buffer property to {@link SignalGroup}:target and connect
 * all the signals you need. When the {@link org.gtk.gtk.TextView}:buffer property changes
 * all of the signals will be transitioned correctly.
 * @version 2.72
 */
public class SignalGroup extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public SignalGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SignalGroup */
    public static SignalGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SignalGroup(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Type targetType) {
        java.util.Objects.requireNonNull(targetType, "Parameter 'targetType' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_signal_group_new.invokeExact(targetType.getValue()), true);
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
        super(constructNew(targetType));
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
    public void connect(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler) {
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(cHandler, "Parameter 'cHandler' must not be null");
        try {
            DowncallHandles.g_signal_group_connect.invokeExact(handle(), Interop.allocateNativeString(detailedSignal), 
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
            DowncallHandles.g_signal_group_connect_after.invokeExact(handle(), Interop.allocateNativeString(detailedSignal), 
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
            DowncallHandles.g_signal_group_connect_data.invokeExact(handle(), Interop.allocateNativeString(detailedSignal), 
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
                        Interop.getScope()), flags.getValue());
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
            DowncallHandles.g_signal_group_connect_swapped.invokeExact(handle(), Interop.allocateNativeString(detailedSignal), 
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
            RESULT = (MemoryAddress) DowncallHandles.g_signal_group_dup_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
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
        java.util.Objects.requireNonNullElse(target, MemoryAddress.NULL);
        try {
            DowncallHandles.g_signal_group_set_target.invokeExact(handle(), target.handle());
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
    
    @FunctionalInterface
    public interface Bind {
        void signalReceived(SignalGroup source, @NotNull org.gtk.gobject.Object instance);
    }
    
    /**
     * This signal is emitted when {@link SignalGroup}:target is set to a new value
     * other than {@code null}. It is similar to {@link Object}::notify on {@code target} except it
     * will not emit when {@link SignalGroup}:target is {@code null} and also allows for
     * receiving the {@link Object} without a data-race.
     */
    public Signal<SignalGroup.Bind> onBind(SignalGroup.Bind handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("bind"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalGroup.Callbacks.class, "signalSignalGroupBind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
     */
    public Signal<SignalGroup.Unbind> onUnbind(SignalGroup.Unbind handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unbind"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalGroup.Callbacks.class, "signalSignalGroupUnbind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SignalGroup.Unbind>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_signal_group_new = Interop.downcallHandle(
            "g_signal_group_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_signal_group_block = Interop.downcallHandle(
            "g_signal_group_block",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_signal_group_connect = Interop.downcallHandle(
            "g_signal_group_connect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_signal_group_connect_after = Interop.downcallHandle(
            "g_signal_group_connect_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_signal_group_connect_data = Interop.downcallHandle(
            "g_signal_group_connect_data",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_signal_group_connect_object = Interop.downcallHandle(
            "g_signal_group_connect_object",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_signal_group_connect_swapped = Interop.downcallHandle(
            "g_signal_group_connect_swapped",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_signal_group_dup_target = Interop.downcallHandle(
            "g_signal_group_dup_target",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_signal_group_set_target = Interop.downcallHandle(
            "g_signal_group_set_target",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_signal_group_unblock = Interop.downcallHandle(
            "g_signal_group_unblock",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSignalGroupBind(MemoryAddress source, MemoryAddress instance, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SignalGroup.Bind) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalGroup(Refcounted.get(source)), new org.gtk.gobject.Object(Refcounted.get(instance, false)));
        }
        
        public static void signalSignalGroupUnbind(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SignalGroup.Unbind) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SignalGroup(Refcounted.get(source)));
        }
    }
}
