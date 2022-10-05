package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutAction} that invokes a callback.
 */
public class CallbackAction extends ShortcutAction {

    public CallbackAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CallbackAction */
    public static CallbackAction castFrom(org.gtk.gobject.Object gobject) {
        return new CallbackAction(gobject.refcounted());
    }
    
    static final MethodHandle gtk_callback_action_new = Interop.downcallHandle(
        "gtk_callback_action_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(ShortcutFunc callback) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_callback_action_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbShortcutFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
