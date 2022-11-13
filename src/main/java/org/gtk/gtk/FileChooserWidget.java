package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFileChooserWidget} is a widget for choosing files.
 * <p>
 * It exposes the {@code Gtk.FileChooser} interface, and you should
 * use the methods of this interface to interact with the
 * widget.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkFileChooserWidget} has a single CSS node with name filechooser.
 */
public class FileChooserWidget extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.FileChooser {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileChooserWidget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FileChooserWidget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FileChooserWidget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FileChooserWidget if its GType is a (or inherits from) "GtkFileChooserWidget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FileChooserWidget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFileChooserWidget", a ClassCastException will be thrown.
     */
    public static FileChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFileChooserWidget"))) {
            return new FileChooserWidget(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFileChooserWidget");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.FileChooserAction action) {
        java.util.Objects.requireNonNull(action, "Parameter 'action' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_widget_new.invokeExact(
                    action.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFileChooserWidget}.
     * <p>
     * This is a file chooser widget that can be embedded in custom
     * windows, and it is the same widget that is used by
     * {@code GtkFileChooserDialog}.
     * @param action Open or save mode for the widget
     */
    public FileChooserWidget(@NotNull org.gtk.gtk.FileChooserAction action) {
        super(constructNew(action), Ownership.NONE);
    }
    
    @FunctionalInterface
    public interface DesktopFolder {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show the user's Desktop
     * folder in the file list.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;D&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.DesktopFolder> onDesktopFolder(FileChooserWidget.DesktopFolder handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("desktop-folder"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetDesktopFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.DesktopFolder>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DownFolder {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser go to a child of the
     * current folder in the file hierarchy. The subfolder that will
     * be used is displayed in the path bar widget of the file chooser.
     * For example, if the path bar is showing "/foo/bar/baz", with bar
     * currently displayed, then this will cause the file chooser to
     * switch to the "baz" subfolder.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Down&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.DownFolder> onDownFolder(FileChooserWidget.DownFolder handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("down-folder"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetDownFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.DownFolder>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface HomeFolder {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show the user's home
     * folder in the file list.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Home&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.HomeFolder> onHomeFolder(FileChooserWidget.HomeFolder handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("home-folder"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetHomeFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.HomeFolder>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LocationPopup {
        void signalReceived(FileChooserWidget source, @NotNull java.lang.String path);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show a "Location" prompt which
     * the user can use to manually type the name of the file he wishes to select.
     * <p>
     * The default bindings for this signal are &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;L&lt;/kbd&gt;
     * with a {@code path} string of "" (the empty string). It is also bound to
     * &lt;kbd&gt;/&lt;/kbd&gt; with a {@code path} string of "{@code /}" (a slash):  this lets you
     * type {@code /} and immediately type a path name. On Unix systems, this is
     * bound to &lt;kbd&gt;~&lt;/kbd&gt; (tilde) with a {@code path} string of "~" itself for
     * access to home directories.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.LocationPopup> onLocationPopup(FileChooserWidget.LocationPopup handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("location-popup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetLocationPopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.LocationPopup>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LocationPopupOnPaste {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show a "Location" prompt
     * when the user pastes into a {@code GtkFileChooserWidget}.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;V&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.LocationPopupOnPaste> onLocationPopupOnPaste(FileChooserWidget.LocationPopupOnPaste handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("location-popup-on-paste"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetLocationPopupOnPaste",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.LocationPopupOnPaste>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LocationTogglePopup {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to toggle the visibility of a "Location" prompt
     * which the user can use to manually type the name of the file
     * he wishes to select.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;L&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.LocationTogglePopup> onLocationTogglePopup(FileChooserWidget.LocationTogglePopup handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("location-toggle-popup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetLocationTogglePopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.LocationTogglePopup>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PlacesShortcut {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to move the focus to the places sidebar.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;P&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.PlacesShortcut> onPlacesShortcut(FileChooserWidget.PlacesShortcut handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("places-shortcut"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetPlacesShortcut",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.PlacesShortcut>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface QuickBookmark {
        void signalReceived(FileChooserWidget source, int bookmarkIndex);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser switch to the bookmark
     * specified in the {@code bookmark_index} parameter. For example, if
     * you have three bookmarks, you can pass 0, 1, 2 to this signal
     * to switch to each of them, respectively.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;1&lt;/kbd&gt;,
     * &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;2&lt;/kbd&gt;, etc. until &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;0&lt;/kbd&gt;.
     * Note that in the default binding, that &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;1&lt;/kbd&gt; is
     * actually defined to switch to the bookmark at index 0, and so on
     * successively.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.QuickBookmark> onQuickBookmark(FileChooserWidget.QuickBookmark handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("quick-bookmark"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetQuickBookmark",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.QuickBookmark>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RecentShortcut {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show the Recent location.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;R&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.RecentShortcut> onRecentShortcut(FileChooserWidget.RecentShortcut handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("recent-shortcut"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetRecentShortcut",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.RecentShortcut>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SearchShortcut {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show the search entry.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;S&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.SearchShortcut> onSearchShortcut(FileChooserWidget.SearchShortcut handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("search-shortcut"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetSearchShortcut",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.SearchShortcut>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ShowHidden {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser display hidden files.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;H&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.ShowHidden> onShowHidden(FileChooserWidget.ShowHidden handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("show-hidden"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetShowHidden",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.ShowHidden>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UpFolder {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser go to the parent
     * of the current folder in the file hierarchy.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Up&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FileChooserWidget.UpFolder> onUpFolder(FileChooserWidget.UpFolder handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("up-folder"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetUpFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FileChooserWidget.UpFolder>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_chooser_widget_new = Interop.downcallHandle(
            "gtk_file_chooser_widget_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalFileChooserWidgetDesktopFolder(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.DesktopFolder) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetDownFolder(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.DownFolder) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetHomeFolder(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.HomeFolder) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetLocationPopup(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.LocationPopup) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN), Interop.getStringFrom(path));
        }
        
        public static void signalFileChooserWidgetLocationPopupOnPaste(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.LocationPopupOnPaste) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetLocationTogglePopup(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.LocationTogglePopup) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetPlacesShortcut(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.PlacesShortcut) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetQuickBookmark(MemoryAddress source, int bookmarkIndex, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.QuickBookmark) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN), bookmarkIndex);
        }
        
        public static void signalFileChooserWidgetRecentShortcut(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.RecentShortcut) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetSearchShortcut(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.SearchShortcut) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetShowHidden(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.ShowHidden) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
        
        public static void signalFileChooserWidgetUpFolder(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FileChooserWidget.UpFolder) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FileChooserWidget(source, Ownership.UNKNOWN));
        }
    }
}
