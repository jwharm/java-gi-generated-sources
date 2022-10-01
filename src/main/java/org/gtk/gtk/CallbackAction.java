package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbShortcutFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)), 
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
