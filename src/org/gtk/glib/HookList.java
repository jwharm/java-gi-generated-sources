package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GHookList struct represents a list of hook functions.
 */
public class HookList extends io.github.jwharm.javagi.interop.ResourceBase {

    public HookList(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Removes all the #GHook elements from a #GHookList.
     */
    public void clear() {
        gtk_h.g_hook_list_clear(handle());
    }
    
    /**
     * Initializes a #GHookList.
     * This must be called before the #GHookList is used.
     */
    public void init(int hookSize) {
        gtk_h.g_hook_list_init(handle(), hookSize);
    }
    
    /**
     * Calls all of the #GHook functions in a #GHookList.
     */
    public void invoke(boolean mayRecurse) {
        gtk_h.g_hook_list_invoke(handle(), mayRecurse ? 1 : 0);
    }
    
    /**
     * Calls all of the #GHook functions in a #GHookList.
     * Any function which returns %FALSE is removed from the #GHookList.
     */
    public void invokeCheck(boolean mayRecurse) {
        gtk_h.g_hook_list_invoke_check(handle(), mayRecurse ? 1 : 0);
    }
    
    /**
     * Calls a function on each valid #GHook.
     */
    public void marshal(HookList hookList, boolean mayRecurse, HookMarshaller marshaller) {
        try {
            int hash = marshaller.hashCode();
            Interop.signalRegistry.put(hash, marshaller);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHookMarshaller", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_hook_list_marshal(handle(), mayRecurse ? 1 : 0, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls a function on each valid #GHook and destroys it if the
     * function returns %FALSE.
     */
    public void marshalCheck(HookList hookList, boolean mayRecurse, HookCheckMarshaller marshaller) {
        try {
            int hash = marshaller.hashCode();
            Interop.signalRegistry.put(hash, marshaller);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHookCheckMarshaller", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_hook_list_marshal_check(handle(), mayRecurse ? 1 : 0, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
