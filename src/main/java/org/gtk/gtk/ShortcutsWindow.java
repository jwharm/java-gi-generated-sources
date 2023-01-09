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
 * {@link GtkBuilder}, by populating a {@code GtkShortcutsWindow} with one or
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
     */
    protected ShortcutsWindow(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutsWindow> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutsWindow(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_shortcuts_window_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Close} callback.
     */
    @FunctionalInterface
    public interface Close {
    
        /**
         * Emitted when the user uses a keybinding to close the window.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is the Escape key.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceShortcutsWindow) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Close.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("close", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Search} callback.
     */
    @FunctionalInterface
    public interface Search {
    
        /**
         * Emitted when the user uses a keybinding to start a search.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is Control-F.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceShortcutsWindow) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Search.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("search", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ShortcutsWindow.Builder} object constructs a {@link ShortcutsWindow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ShortcutsWindow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Window.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ShortcutsWindow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutsWindow}.
         * @return A new instance of {@code ShortcutsWindow} with the properties 
         *         that were set in the Builder object.
         */
        public ShortcutsWindow build() {
            return (ShortcutsWindow) org.gtk.gobject.GObject.newWithProperties(
                ShortcutsWindow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setSectionName(java.lang.String sectionName) {
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
        public Builder setViewName(java.lang.String viewName) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_shortcuts_window_get_type != null;
    }
}
