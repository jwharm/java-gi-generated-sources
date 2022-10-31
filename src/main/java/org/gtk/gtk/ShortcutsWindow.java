package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutsWindow} shows information about the keyboard shortcuts
 * and gestures of an application.
 * <p>
 * The shortcuts can be grouped, and you can have multiple sections in this
 * window, corresponding to the major modes of your application.
 * <p>
 * Additionally, the shortcuts can be filtered by the current view, to avoid
 * showing information that is not relevant in the current application context.
 * <p>
 * The recommended way to construct a {@code GtkShortcutsWindow} is with
 * {@link Builder}, by populating a {@code GtkShortcutsWindow} with one or
 * more {@code GtkShortcutsSection} objects, which contain {@code GtkShortcutsGroups}
 * that in turn contain objects of class {@code GtkShortcutsShortcut}.
 * <p>
 * <strong>A simple example:</strong><br/>
 * <img src="./doc-files/gedit-shortcuts.png" alt="">
 * <p>
 * This example has as single section. As you can see, the shortcut groups
 * are arranged in columns, and spread across several pages if there are too
 * many to find on a single page.
 * <p>
 * The .ui file for this example can be found <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-gedit.ui">here</a>.
 * <p>
 * <strong>An example with multiple views:</strong><br/>
 * <img src="./doc-files/clocks-shortcuts.png" alt="">
 * <p>
 * This example shows a {@code GtkShortcutsWindow} that has been configured to show only
 * the shortcuts relevant to the "stopwatch" view.
 * <p>
 * The .ui file for this example can be found <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-clocks.ui">here</a>.
 * <p>
 * <strong>An example with multiple sections:</strong><br/>
 * <img src="./doc-files/builder-shortcuts.png" alt="">
 * <p>
 * This example shows a {@code GtkShortcutsWindow} with two sections, "Editor Shortcuts"
 * and "Terminal Shortcuts".
 * <p>
 * The .ui file for this example can be found <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-builder.ui">here</a>.
 */
public class ShortcutsWindow extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutsWindow";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ShortcutsWindow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ShortcutsWindow if its GType is a (or inherits from) "GtkShortcutsWindow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ShortcutsWindow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutsWindow", a ClassCastException will be thrown.
     */
    public static ShortcutsWindow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutsWindow"))) {
            return new ShortcutsWindow(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutsWindow");
        }
    }
    
    @FunctionalInterface
    public interface Close {
        void signalReceived(ShortcutsWindow source);
    }
    
    /**
     * Emitted when the user uses a keybinding to close the window.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is the Escape key.
     */
    public Signal<ShortcutsWindow.Close> onClose(ShortcutsWindow.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ShortcutsWindow.Callbacks.class, "signalShortcutsWindowClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ShortcutsWindow.Close>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Search {
        void signalReceived(ShortcutsWindow source);
    }
    
    /**
     * Emitted when the user uses a keybinding to start a search.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is Control-F.
     */
    public Signal<ShortcutsWindow.Search> onSearch(ShortcutsWindow.Search handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("search"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ShortcutsWindow.Callbacks.class, "signalShortcutsWindowSearch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ShortcutsWindow.Search>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class Callbacks {
        
        public static void signalShortcutsWindowClose(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ShortcutsWindow.Close) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ShortcutsWindow(Refcounted.get(source)));
        }
        
        public static void signalShortcutsWindowSearch(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ShortcutsWindow.Search) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ShortcutsWindow(Refcounted.get(source)));
        }
    }
}
