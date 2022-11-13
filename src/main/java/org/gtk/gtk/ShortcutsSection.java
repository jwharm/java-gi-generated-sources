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
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsSection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutsSection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutsSection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutsSection if its GType is a (or inherits from) "GtkShortcutsSection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutsSection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutsSection", a ClassCastException will be thrown.
     */
    public static ShortcutsSection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutsSection"))) {
            return new ShortcutsSection(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutsSection");
        }
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
            return HANDLER.signalReceived(new ShortcutsSection(source, Ownership.UNKNOWN), object);
        }
    }
}
