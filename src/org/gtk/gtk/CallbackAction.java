package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutAction} that invokes a callback.
 */
public class CallbackAction extends ShortcutAction {

    public CallbackAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CallbackAction */
    public static CallbackAction castFrom(org.gtk.gobject.Object gobject) {
        return new CallbackAction(gobject.getReference());
    }
    
    private static Reference constructNew(ShortcutFunc callback) {
        try {
            Reference RESULT = References.get(gtk_h.gtk_callback_action_new(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbShortcutFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Create a custom action that calls the given {@code callback} when
     * activated.
     */
    public CallbackAction(ShortcutFunc callback) {
        super(constructNew(callback));
    }
    
}
