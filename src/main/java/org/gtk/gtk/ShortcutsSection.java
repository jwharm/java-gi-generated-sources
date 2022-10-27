package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class ShortcutsSection extends org.gtk.gtk.Box implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ShortcutsSection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutsSection */
    public static ShortcutsSection castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsSection(gobject.refcounted());
    }
    
    @FunctionalInterface
    public interface ChangeCurrentPage {
        boolean signalReceived(ShortcutsSection source, int object);
    }
    
    public Signal<ShortcutsSection.ChangeCurrentPage> onChangeCurrentPage(ShortcutsSection.ChangeCurrentPage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-current-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ShortcutsSection.Callbacks.class, "signalShortcutsSectionChangeCurrentPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ShortcutsSection.ChangeCurrentPage>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class Callbacks {
        
        public static boolean signalShortcutsSectionChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ShortcutsSection.ChangeCurrentPage) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new ShortcutsSection(Refcounted.get(source)), object);
        }
    }
}
