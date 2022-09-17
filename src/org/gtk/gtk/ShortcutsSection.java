package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkShortcutsSection</code> collects all the keyboard shortcuts and gestures
 * for a major application mode.
 * 
 * If your application needs multiple sections, you should give each
 * section a unique {@link [property@Gtk.ShortcutsSection:section-name] (ref=property)} and
 * a {@link [property@Gtk.ShortcutsSection:title] (ref=property)} that can be shown in the
 * section selector of the {@link org.gtk.gtk.ShortcutsWindow}.
 * 
 * The {@link [property@Gtk.ShortcutsSection:max-height] (ref=property)} property can be used
 * to influence how the groups in the section are distributed over pages
 * and columns.
 * 
 * This widget is only meant to be used with {@link org.gtk.gtk.ShortcutsWindow}.
 */
public class ShortcutsSection extends Box implements Accessible, Buildable, ConstraintTarget, Orientable {

    public ShortcutsSection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutsSection */
    public static ShortcutsSection castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsSection(gobject.getReference());
    }
    
    @FunctionalInterface
    public interface ChangeCurrentPageHandler {
        boolean signalReceived(ShortcutsSection source, int object);
    }
    
    public SignalHandle onChangeCurrentPage(ChangeCurrentPageHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalShortcutsSectionChangeCurrentPage", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("change-current-page").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
