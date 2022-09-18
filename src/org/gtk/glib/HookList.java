package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link org.gtk.glib.HookList} struct represents a list of hook functions.
 */
public class HookList extends io.github.jwharm.javagi.ResourceBase {

    public HookList(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Removes all the {@link org.gtk.glib.Hook} elements from a {@link org.gtk.glib.HookList}
     */
    public void clear() {
        gtk_h.g_hook_list_clear(handle());
    }
    
    /**
     * Initializes a {@link org.gtk.glib.HookList} 
     * This must be called before the {@link org.gtk.glib.HookList} is used.
     */
    public void init(int hookSize) {
        gtk_h.g_hook_list_init(handle(), hookSize);
    }
    
    /**
     * Calls all of the {@link org.gtk.glib.Hook} functions in a {@link org.gtk.glib.HookList}
     */
    public void invoke(boolean mayRecurse) {
        gtk_h.g_hook_list_invoke(handle(), mayRecurse ? 1 : 0);
    }
    
    /**
     * Calls all of the {@link org.gtk.glib.Hook} functions in a {@link org.gtk.glib.HookList} 
     * Any function which returns <code>false</code> is removed from the {@link org.gtk.glib.HookList}
     */
    public void invokeCheck(boolean mayRecurse) {
        gtk_h.g_hook_list_invoke_check(handle(), mayRecurse ? 1 : 0);
    }
    
    /**
     * Calls a function on each valid {@link org.gtk.glib.Hook}
     */
    public void marshal(boolean mayRecurse, HookMarshaller marshaller) {
        try {
            gtk_h.g_hook_list_marshal(handle(), mayRecurse ? 1 : 0, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHookMarshaller",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(marshaller.hashCode(), marshaller)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls a function on each valid {@link org.gtk.glib.Hook} and destroys it if the
     * function returns <code>false</code>
     */
    public void marshalCheck(boolean mayRecurse, HookCheckMarshaller marshaller) {
        try {
            gtk_h.g_hook_list_marshal_check(handle(), mayRecurse ? 1 : 0, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHookCheckMarshaller",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(marshaller.hashCode(), marshaller)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
