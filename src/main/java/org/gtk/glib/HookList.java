package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link HookList} struct represents a list of hook functions.
 */
public class HookList extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GHookList";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("seq_id"),
        ValueLayout.JAVA_INT.withName("hook_size"),
        ValueLayout.JAVA_INT.withName("is_setup"),
        Interop.valueLayout.ADDRESS.withName("hooks"),
        Interop.valueLayout.ADDRESS.withName("dummy3"),
        Interop.valueLayout.ADDRESS.withName("finalize_hook"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.sequenceLayout(2, ValueLayout.ADDRESS).withName("dummy")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static HookList allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        HookList newInstance = new HookList(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code seq_id}
     * @return The value of the field {@code seq_id}
     */
    public long seq_id$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seq_id}
     * @param seq_id The new value of the field {@code seq_id}
     */
    public void seq_id$set(long seq_id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seq_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seq_id);
    }
    
    /**
     * Get the value of the field {@code hook_size}
     * @return The value of the field {@code hook_size}
     */
    public int hook_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code hook_size}
     * @param hook_size The new value of the field {@code hook_size}
     */
    public void hook_size$set(int hook_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hook_size);
    }
    
    /**
     * Get the value of the field {@code is_setup}
     * @return The value of the field {@code is_setup}
     */
    public int is_setup$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_setup}
     * @param is_setup The new value of the field {@code is_setup}
     */
    public void is_setup$set(int is_setup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_setup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_setup);
    }
    
    /**
     * Get the value of the field {@code hooks}
     * @return The value of the field {@code hooks}
     */
    public org.gtk.glib.Hook hooks$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code hooks}
     * @param hooks The new value of the field {@code hooks}
     */
    public void hooks$set(org.gtk.glib.Hook hooks) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hooks"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hooks.handle());
    }
    
    /**
     * Get the value of the field {@code dummy3}
     * @return The value of the field {@code dummy3}
     */
    public java.lang.foreign.MemoryAddress dummy3$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code dummy3}
     * @param dummy3 The new value of the field {@code dummy3}
     */
    public void dummy3$set(java.lang.foreign.MemoryAddress dummy3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy3);
    }
    
    /**
     * Get the value of the field {@code finalize_hook}
     * @return The value of the field {@code finalize_hook}
     */
    public org.gtk.glib.HookFinalizeFunc finalize_hook$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finalize_hook"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a HookList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public HookList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Removes all the {@link Hook} elements from a {@link HookList}.
     */
    public void clear() {
        try {
            DowncallHandles.g_hook_list_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link HookList}.
     * This must be called before the {@link HookList} is used.
     * @param hookSize the size of each element in the {@link HookList},
     *     typically {@code sizeof (GHook)}.
     */
    public void init(int hookSize) {
        try {
            DowncallHandles.g_hook_list_init.invokeExact(
                    handle(),
                    hookSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls all of the {@link Hook} functions in a {@link HookList}.
     * @param mayRecurse {@code true} if functions which are already running
     *     (e.g. in another thread) can be called. If set to {@code false},
     *     these are skipped
     */
    public void invoke(boolean mayRecurse) {
        try {
            DowncallHandles.g_hook_list_invoke.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls all of the {@link Hook} functions in a {@link HookList}.
     * Any function which returns {@code false} is removed from the {@link HookList}.
     * @param mayRecurse {@code true} if functions which are already running
     *     (e.g. in another thread) can be called. If set to {@code false},
     *     these are skipped
     */
    public void invokeCheck(boolean mayRecurse) {
        try {
            DowncallHandles.g_hook_list_invoke_check.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function on each valid {@link Hook}.
     * @param mayRecurse {@code true} if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to {@code false},
     *     these are skipped
     * @param marshaller the function to call for each {@link Hook}
     */
    public void marshal(boolean mayRecurse, @NotNull org.gtk.glib.HookMarshaller marshaller) {
        java.util.Objects.requireNonNull(marshaller, "Parameter 'marshaller' must not be null");
        try {
            DowncallHandles.g_hook_list_marshal.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbHookMarshaller",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(marshaller)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function on each valid {@link Hook} and destroys it if the
     * function returns {@code false}.
     * @param mayRecurse {@code true} if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to {@code false},
     *     these are skipped
     * @param marshaller the function to call for each {@link Hook}
     */
    public void marshalCheck(boolean mayRecurse, @NotNull org.gtk.glib.HookCheckMarshaller marshaller) {
        java.util.Objects.requireNonNull(marshaller, "Parameter 'marshaller' must not be null");
        try {
            DowncallHandles.g_hook_list_marshal_check.invokeExact(
                    handle(),
                    mayRecurse ? 1 : 0,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbHookCheckMarshaller",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(marshaller)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_hook_list_clear = Interop.downcallHandle(
            "g_hook_list_clear",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_list_init = Interop.downcallHandle(
            "g_hook_list_init",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_hook_list_invoke = Interop.downcallHandle(
            "g_hook_list_invoke",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_hook_list_invoke_check = Interop.downcallHandle(
            "g_hook_list_invoke_check",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_hook_list_marshal = Interop.downcallHandle(
            "g_hook_list_marshal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_list_marshal_check = Interop.downcallHandle(
            "g_hook_list_marshal_check",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
