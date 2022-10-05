package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutsSection} collects all the keyboard shortcuts and gestures
 * for a major application mode.
 * <p>
 * If your application needs multiple sections, you should give each
 * section a unique {@code Gtk.ShortcutsSection:section-name} and
 * a {@code Gtk.ShortcutsSection:title} that can be shown in the
 * section selector of the {@link ShortcutsWindow}.
 * <p>
 * The {@code Gtk.ShortcutsSection:max-height} property can be used
 * to influence how the groups in the section are distributed over pages
 * and columns.
 * <p>
 * This widget is only meant to be used with {@link ShortcutsWindow}.
 */
public class ShortcutsSection extends Box implements Accessible, Buildable, ConstraintTarget, Orientable {

    public ShortcutsSection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutsSection */
    public static ShortcutsSection castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsSection(gobject.refcounted());
    }
    
    @FunctionalInterface
    public interface ChangeCurrentPageHandler {
        boolean signalReceived(ShortcutsSection source, int object);
    }
    
    public SignalHandle onChangeCurrentPage(ChangeCurrentPageHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-current-page").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ShortcutsSection.Callbacks.class, "signalShortcutsSectionChangeCurrentPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalShortcutsSectionChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ShortcutsSection.ChangeCurrentPageHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new ShortcutsSection(Refcounted.get(source)), object);
        }
        
    }
}