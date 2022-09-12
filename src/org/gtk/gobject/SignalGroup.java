package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSignalGroup manages to simplify the process of connecting
 * many signals to a #GObject as a group. As such there is no API
 * to disconnect a signal from the group.
 * 
 * In particular, this allows you to:
 * 
 *  - Change the target instance, which automatically causes disconnection
 *    of the signals from the old instance and connecting to the new instance.
 *  - Block and unblock signals as a group
 *  - Ensuring that blocked state transfers across target instances.
 * 
 * One place you might want to use such a structure is with #GtkTextView and
 * #GtkTextBuffer. Often times, you'll need to connect to many signals on
 * #GtkTextBuffer from a #GtkTextView subclass. This allows you to create a
 * signal group during instance construction, simply bind the
 * #GtkTextView:buffer property to #GSignalGroup:target and connect
 * all the signals you need. When the #GtkTextView:buffer property changes
 * all of the signals will be transitioned correctly.
 */
public class SignalGroup extends Object {

    public SignalGroup(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SignalGroup */
    public static SignalGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SignalGroup(gobject.getReference());
    }
    
    private static Reference constructNew(Type targetType) {
        Reference RESULT = References.get(gtk_h.g_signal_group_new(targetType.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GSignalGroup for target instances of @target_type.
     */
    public SignalGroup(Type targetType) {
        super(constructNew(targetType));
    }
    
    /**
     * Blocks all signal handlers managed by @self so they will not
     * be called during any signal emissions. Must be unblocked exactly
     * the same number of times it has been blocked to become active again.
     * 
     * This blocked state will be kept across changes of the target instance.
     */
    public void block() {
        gtk_h.g_signal_group_block(handle());
    }
    
    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     * 
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     */
    public void connect(java.lang.String detailedSignal, Callback cHandler) {
        try {
            gtk_h.g_signal_group_connect(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     * 
     * The @c_handler will be called after the default handler of the signal.
     * 
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     */
    public void connectAfter(java.lang.String detailedSignal, Callback cHandler) {
        try {
            gtk_h.g_signal_group_connect_after(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     * 
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     */
    public void connectData(java.lang.String detailedSignal, Callback cHandler, ClosureNotify notify, int flags) {
        try {
            gtk_h.g_signal_group_connect_data(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), flags);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Connects @c_handler to the signal @detailed_signal
     * on the target instance of @self.
     * 
     * The instance on which the signal is emitted and @data
     * will be swapped when calling @c_handler.
     * 
     * You cannot connect a signal handler after #GSignalGroup:target has been set.
     */
    public void connectSwapped(java.lang.String detailedSignal, Callback cHandler) {
        try {
            gtk_h.g_signal_group_connect_swapped(handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the target instance used when connecting signals.
     */
    public Object dupTarget() {
        var RESULT = gtk_h.g_signal_group_dup_target(handle());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Sets the target instance used when connecting signals. Any signal
     * that has been registered with g_signal_group_connect_object() or
     * similar functions will be connected to this object.
     * 
     * If the target instance was previously set, signals will be
     * disconnected from that object prior to connecting to @target.
     */
    public void setTarget(Object target) {
        gtk_h.g_signal_group_set_target(handle(), target.handle());
    }
    
    /**
     * Unblocks all signal handlers managed by @self so they will be
     * called again during any signal emissions unless it is blocked
     * again. Must be unblocked exactly the same number of times it
     * has been blocked to become active again.
     */
    public void unblock() {
        gtk_h.g_signal_group_unblock(handle());
    }
    
    @FunctionalInterface
    public interface BindHandler {
        void signalReceived(SignalGroup source, Object instance);
    }
    
    /**
     * This signal is emitted when #GSignalGroup:target is set to a new value
     * other than %NULL. It is similar to #GObject::notify on `target` except it
     * will not emit when #GSignalGroup:target is %NULL and also allows for
     * receiving the #GObject without a data-race.
     */
    public SignalHandle onBind(BindHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalGroupBind", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("bind").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnbindHandler {
        void signalReceived(SignalGroup source);
    }
    
    /**
     * This signal is emitted when the target instance of @self is set to a
     * new #GObject.
     * 
     * This signal will only be emitted if the previous target of @self is
     * non-%NULL.
     */
    public SignalHandle onUnbind(UnbindHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSignalGroupUnbind", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unbind").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
