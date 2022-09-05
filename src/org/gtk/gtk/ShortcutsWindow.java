package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutsWindow` shows information about the keyboard shortcuts
 * and gestures of an application.
 * 
 * The shortcuts can be grouped, and you can have multiple sections in this
 * window, corresponding to the major modes of your application.
 * 
 * Additionally, the shortcuts can be filtered by the current view, to avoid
 * showing information that is not relevant in the current application context.
 * 
 * The recommended way to construct a `GtkShortcutsWindow` is with
 * [class@Gtk.Builder], by populating a `GtkShortcutsWindow` with one or
 * more `GtkShortcutsSection` objects, which contain `GtkShortcutsGroups`
 * that in turn contain objects of class `GtkShortcutsShortcut`.
 * 
 * # A simple example:
 * 
 * ![](gedit-shortcuts.png)
 * 
 * This example has as single section. As you can see, the shortcut groups
 * are arranged in columns, and spread across several pages if there are too
 * many to find on a single page.
 * 
 * The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-gedit.ui).
 * 
 * # An example with multiple views:
 * 
 * ![](clocks-shortcuts.png)
 * 
 * This example shows a `GtkShortcutsWindow` that has been configured to show only
 * the shortcuts relevant to the "stopwatch" view.
 * 
 * The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-clocks.ui).
 * 
 * # An example with multiple sections:
 * 
 * ![](builder-shortcuts.png)
 * 
 * This example shows a `GtkShortcutsWindow` with two sections, "Editor Shortcuts"
 * and "Terminal Shortcuts".
 * 
 * The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-builder.ui).
 */
public class ShortcutsWindow extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public ShortcutsWindow(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ShortcutsWindow */
    public static ShortcutsWindow castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsWindow(gobject.getProxy());
    }
    
    @FunctionalInterface
    public interface CloseHandler {
        void signalReceived(ShortcutsWindow source);
    }
    
    /**
     * Emitted when the user uses a keybinding to close the window.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is the Escape key.
     */
    public void onClose(CloseHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalShortcutsWindowClose", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("close").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is Control-F.
     */
    public void onSearch(SearchHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalShortcutsWindowSearch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("search").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
