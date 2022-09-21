package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

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
 * <h1>A simple example:</h1>
 * <p>
 * ![](gedit-shortcuts.png)
 * <p>
 * This example has as single section. As you can see, the shortcut groups
 * are arranged in columns, and spread across several pages if there are too
 * many to find on a single page.
 * <p>
 * The .ui file for this example can be found <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-gedit.ui">here</a>.
 * <p>
 * <h1>An example with multiple views:</h1>
 * <p>
 * ![](clocks-shortcuts.png)
 * <p>
 * This example shows a {@code GtkShortcutsWindow} that has been configured to show only
 * the shortcuts relevant to the "stopwatch" view.
 * <p>
 * The .ui file for this example can be found <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-clocks.ui">here</a>.
 * <p>
 * <h1>An example with multiple sections:</h1>
 * <p>
 * ![](builder-shortcuts.png)
 * <p>
 * This example shows a {@code GtkShortcutsWindow} with two sections, "Editor Shortcuts"
 * and "Terminal Shortcuts".
 * <p>
 * The .ui file for this example can be found <a href="https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-builder.ui">here</a>.
 */
public class ShortcutsWindow extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public ShortcutsWindow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutsWindow */
    public static ShortcutsWindow castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsWindow(gobject.getReference());
    }
    
    @FunctionalInterface
    public interface CloseHandler {
        void signalReceived(ShortcutsWindow source);
    }
    
    /**
     * Emitted when the user uses a keybinding to close the window.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is the Escape key.
     */
    public SignalHandle onClose(CloseHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalShortcutsWindowClose", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("close").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SearchHandler {
        void signalReceived(ShortcutsWindow source);
    }
    
    /**
     * Emitted when the user uses a keybinding to start a search.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is Control-F.
     */
    public SignalHandle onSearch(SearchHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalShortcutsWindowSearch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("search").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
