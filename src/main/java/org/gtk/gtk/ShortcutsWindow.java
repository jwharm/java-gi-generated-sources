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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutsWindow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutsWindow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutsWindow if its GType is a (or inherits from) "GtkShortcutsWindow".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutsWindow} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutsWindow", a ClassCastException will be thrown.
     */
    public static ShortcutsWindow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ShortcutsWindow.getType())) {
            return new ShortcutsWindow(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutsWindow");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcuts_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ShortcutsWindow.Close> onClose(ShortcutsWindow.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ShortcutsWindow.Callbacks.class, "signalShortcutsWindowClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ShortcutsWindow.Search> onSearch(ShortcutsWindow.Search handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("search"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ShortcutsWindow.Callbacks.class, "signalShortcutsWindowSearch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ShortcutsWindow.Search>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Window.Build {
        
         /**
         * A {@link ShortcutsWindow.Build} object constructs a {@link ShortcutsWindow} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ShortcutsWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutsWindow} using {@link ShortcutsWindow#castFrom}.
         * @return A new instance of {@code ShortcutsWindow} with the properties 
         *         that were set in the Build object.
         */
        public ShortcutsWindow construct() {
            return ShortcutsWindow.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ShortcutsWindow.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The name of the section to show.
         * <p>
         * This should be the section-name of one of the {@code GtkShortcutsSection}
         * objects that are in this shortcuts window.
         * @param sectionName The value for the {@code section-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSectionName(java.lang.String sectionName) {
            names.add("section-name");
            values.add(org.gtk.gobject.Value.create(sectionName));
            return this;
        }
        
        /**
         * The view name by which to filter the contents.
         * <p>
         * This should correspond to the {@code Gtk.ShortcutsGroup:view}
         * property of some of the {@link ShortcutsGroup} objects that
         * are inside this shortcuts window.
         * <p>
         * Set this to {@code null} to show all groups.
         * @param viewName The value for the {@code view-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setViewName(java.lang.String viewName) {
            names.add("view-name");
            values.add(org.gtk.gobject.Value.create(viewName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcuts_window_get_type = Interop.downcallHandle(
            "gtk_shortcuts_window_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalShortcutsWindowClose(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ShortcutsWindow.Close) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ShortcutsWindow(source, Ownership.NONE));
        }
        
        public static void signalShortcutsWindowSearch(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ShortcutsWindow.Search) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ShortcutsWindow(source, Ownership.NONE));
        }
    }
}
