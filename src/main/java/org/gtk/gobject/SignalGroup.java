package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link SignalGroup} manages to simplify the process of connecting
 * many signals to a {@link Object} as a group. As such there is no API
 * to disconnect a signal from the group.
 * <p>
 * In particular, this allows you to:
 * <p>
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
 */
public class SignalGroup extends Object {

    public SignalGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SignalGroup */
    public static SignalGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SignalGroup(gobject.refcounted());
    }
    
    static final MethodHandle g_signal_group_new = Interop.downcallHandle(
        "g_signal_group_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(org.gtk.gobject.Type targetType) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_signal_group_new.invokeExact(targetType.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link SignalGroup} for target instances of {@code target_type}.
     */
    public SignalGroup(org.gtk.gobject.Type targetType) {
        super(constructNew(targetType));
    }
    
    static final MethodHandle g_signal_group_block = Interop.downcallHandle(
        "g_signal_group_block",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Blocks all signal handlers managed by {@code self} so they will not
     * be called during any signal emissions. Must be unblocked exactly
     * the same number of times it has been blocked to become active again.
     * <p>
     * This blocked state will be kept across changes of the target instance.
     */
    public void block() {
        try {
            g_signal_group_block.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_group_connect = Interop.downcallHandle(
        "g_signal_group_connect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     */
    public void connect(java.lang.String detailedSignal, Callback cHandler) {
        try {
            g_signal_group_connect.invokeExact(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_group_connect_after = Interop.downcallHandle(
        "g_signal_group_connect_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * The {@code c_handler} will be called after the default handler of the signal.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     */
    public void connectAfter(java.lang.String detailedSignal, Callback cHandler) {
        try {
            g_signal_group_connect_after.invokeExact(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_group_connect_data = Interop.downcallHandle(
        "g_signal_group_connect_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     */
    public void connectData(java.lang.String detailedSignal, Callback cHandler, ClosureNotify notify, ConnectFlags flags) {
        try {
            g_signal_group_connect_data.invokeExact(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_group_connect_swapped = Interop.downcallHandle(
        "g_signal_group_connect_swapped",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Connects {@code c_handler} to the signal {@code detailed_signal}
     * on the target instance of {@code self}.
     * <p>
     * The instance on which the signal is emitted and {@code data}
     * will be swapped when calling {@code c_handler}.
     * <p>
     * You cannot connect a signal handler after {@link SignalGroup}:target has been set.
     */
    public void connectSwapped(java.lang.String detailedSignal, Callback cHandler) {
        try {
            g_signal_group_connect_swapped.invokeExact(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_group_dup_target = Interop.downcallHandle(
        "g_signal_group_dup_target",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the target instance used when connecting signals.
     */
    public Object dupTarget() {
        try {
            var RESULT = (MemoryAddress) g_signal_group_dup_target.invokeExact(handle());
            return new Object(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_group_set_target = Interop.downcallHandle(
        "g_signal_group_set_target",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the target instance used when connecting signals. Any signal
     * that has been registered with g_signal_group_connect_object() or
     * similar functions will be connected to this object.
     * <p>
     * If the target instance was previously set, signals will be
     * disconnected from that object prior to connecting to {@code target}.
     */
    public void setTarget(Object target) {
        try {
            g_signal_group_set_target.invokeExact(handle(), target.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_group_unblock = Interop.downcallHandle(
        "g_signal_group_unblock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unblocks all signal handlers managed by {@code self} so they will be
     * called again during any signal emissions unless it is blocked
     * again. Must be unblocked exactly the same number of times it
     * has been blocked to become active again.
     */
    public void unblock() {
        try {
            g_signal_group_unblock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface BindHandler {
        void signalReceived(SignalGroup source, Object instance);
    }
    
    /**
     * This signal is emitted when {@link SignalGroup}:target is set to a new value
     * other than {@code null}. It is similar to {@link Object}::notify on {@code target} except it
     * will not emit when {@link SignalGroup}:target is {@code null} and also allows for
     * receiving the {@link Object} without a data-race.
     */
    public SignalHandle onBind(BindHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("bind").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalGroup.Callbacks.class, "signalSignalGroupBind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnbindHandler {
        void signalReceived(SignalGroup source);
    }
    
    /**
     * This signal is emitted when the target instance of {@code self} is set to a
     * new {@link Object}.
     * <p>
     * This signal will only be emitted if the previous target of {@code self} is
     * non-{@code null}.
     */
    public SignalHandle onUnbind(UnbindHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unbind").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SignalGroup.Callbacks.class, "signalSignalGroupUnbind",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSignalGroupBind(MemoryAddress source, MemoryAddress instance, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SignalGroup.BindHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SignalGroup(Refcounted.get(source)), new Object(Refcounted.get(instance, false)));
        }
        
        public static void signalSignalGroupUnbind(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SignalGroup.UnbindHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SignalGroup(Refcounted.get(source)));
        }
        
    }
}
