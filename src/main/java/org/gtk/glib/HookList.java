package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link HookList} struct represents a list of hook functions.
 */
public class HookList extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("seq_id"),
        ValueLayout.JAVA_INT.withName("hook_size"),
        ValueLayout.JAVA_INT.withName("is_setup"),
        org.gtk.glib.Hook.getMemoryLayout().withName("hooks"),
        Interop.valueLayout.ADDRESS.withName("dummy3"),
        Interop.valueLayout.ADDRESS.withName("finalize_hook"),
        MemoryLayout.sequenceLayout(2, ValueLayout.ADDRESS).withName("dummy")
    ).withName("GHookList");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public HookList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Removes all the {@link Hook} elements from a {@link HookList}.
     */
    public void clear() {
        try {
            DowncallHandles.g_hook_list_clear.invokeExact(handle());
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
            DowncallHandles.g_hook_list_init.invokeExact(handle(), hookSize);
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
            DowncallHandles.g_hook_list_invoke.invokeExact(handle(), mayRecurse ? 1 : 0);
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
            DowncallHandles.g_hook_list_invoke_check.invokeExact(handle(), mayRecurse ? 1 : 0);
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
            DowncallHandles.g_hook_list_marshal.invokeExact(handle(), mayRecurse ? 1 : 0, 
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
            DowncallHandles.g_hook_list_marshal_check.invokeExact(handle(), mayRecurse ? 1 : 0, 
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
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_list_init = Interop.downcallHandle(
            "g_hook_list_init",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_hook_list_invoke = Interop.downcallHandle(
            "g_hook_list_invoke",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_hook_list_invoke_check = Interop.downcallHandle(
            "g_hook_list_invoke_check",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_hook_list_marshal = Interop.downcallHandle(
            "g_hook_list_marshal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_list_marshal_check = Interop.downcallHandle(
            "g_hook_list_marshal_check",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
