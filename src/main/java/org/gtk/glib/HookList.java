package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link HookList} struct represents a list of hook functions.
 */
public class HookList extends io.github.jwharm.javagi.ResourceBase {

    public HookList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_hook_list_clear = Interop.downcallHandle(
        "g_hook_list_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all the {@link Hook} elements from a {@link HookList}.
     */
    public void clear() {
        try {
            g_hook_list_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_list_init = Interop.downcallHandle(
        "g_hook_list_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes a {@link HookList}.
     * This must be called before the {@link HookList} is used.
     */
    public void init(int hookSize) {
        try {
            g_hook_list_init.invokeExact(handle(), hookSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_list_invoke = Interop.downcallHandle(
        "g_hook_list_invoke",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Calls all of the {@link Hook} functions in a {@link HookList}.
     */
    public void invoke(boolean mayRecurse) {
        try {
            g_hook_list_invoke.invokeExact(handle(), mayRecurse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_list_invoke_check = Interop.downcallHandle(
        "g_hook_list_invoke_check",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Calls all of the {@link Hook} functions in a {@link HookList}.
     * Any function which returns {@code false} is removed from the {@link HookList}.
     */
    public void invokeCheck(boolean mayRecurse) {
        try {
            g_hook_list_invoke_check.invokeExact(handle(), mayRecurse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_list_marshal = Interop.downcallHandle(
        "g_hook_list_marshal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function on each valid {@link Hook}.
     */
    public void marshal(boolean mayRecurse, HookMarshaller marshaller) {
        try {
            g_hook_list_marshal.invokeExact(handle(), mayRecurse ? 1 : 0, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHookMarshaller",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(marshaller.hashCode(), marshaller)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_list_marshal_check = Interop.downcallHandle(
        "g_hook_list_marshal_check",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function on each valid {@link Hook} and destroys it if the
     * function returns {@code false}.
     */
    public void marshalCheck(boolean mayRecurse, HookCheckMarshaller marshaller) {
        try {
            g_hook_list_marshal_check.invokeExact(handle(), mayRecurse ? 1 : 0, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHookCheckMarshaller",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(marshaller.hashCode(), marshaller)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
