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
     */
    protected FileChooserWidget(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileChooserWidget> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileChooserWidget(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.FileChooserAction action) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_widget_new.invokeExact(action.getValue());
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
    public FileChooserWidget(org.gtk.gtk.FileChooserAction action) {
        super(constructNew(action));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_file_chooser_widget_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code DesktopFolder} callback.
     */
    @FunctionalInterface
    public interface DesktopFolder {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to make the file chooser show the user's Desktop
         * folder in the file list.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;D&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DesktopFolder.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("desktop-folder", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DownFolder} callback.
     */
    @FunctionalInterface
    public interface DownFolder {
    
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
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DownFolder.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("down-folder", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code HomeFolder} callback.
     */
    @FunctionalInterface
    public interface HomeFolder {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to make the file chooser show the user's home
         * folder in the file list.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Home&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HomeFolder.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("home-folder", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code LocationPopup} callback.
     */
    @FunctionalInterface
    public interface LocationPopup {
    
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
         */
        void run(java.lang.String path);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget, MemoryAddress path) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(path, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LocationPopup.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("location-popup", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code LocationPopupOnPaste} callback.
     */
    @FunctionalInterface
    public interface LocationPopupOnPaste {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to make the file chooser show a "Location" prompt
         * when the user pastes into a {@code GtkFileChooserWidget}.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;V&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LocationPopupOnPaste.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("location-popup-on-paste", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code LocationTogglePopup} callback.
     */
    @FunctionalInterface
    public interface LocationTogglePopup {
    
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
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LocationTogglePopup.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("location-toggle-popup", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PlacesShortcut} callback.
     */
    @FunctionalInterface
    public interface PlacesShortcut {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to move the focus to the places sidebar.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;P&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PlacesShortcut.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("places-shortcut", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code QuickBookmark} callback.
     */
    @FunctionalInterface
    public interface QuickBookmark {
    
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
         */
        void run(int bookmarkIndex);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget, int bookmarkIndex) {
            run(bookmarkIndex);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QuickBookmark.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("quick-bookmark", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code RecentShortcut} callback.
     */
    @FunctionalInterface
    public interface RecentShortcut {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to make the file chooser show the Recent location.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;R&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RecentShortcut.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("recent-shortcut", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SearchShortcut} callback.
     */
    @FunctionalInterface
    public interface SearchShortcut {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to make the file chooser show the search entry.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;S&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SearchShortcut.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("search-shortcut", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowHidden} callback.
     */
    @FunctionalInterface
    public interface ShowHidden {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to make the file chooser display hidden files.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Control&lt;/kbd&gt;-&lt;kbd&gt;H&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowHidden.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("show-hidden", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code UpFolder} callback.
     */
    @FunctionalInterface
    public interface UpFolder {
    
        /**
         * Emitted when the user asks for it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This is used to make the file chooser go to the parent
         * of the current folder in the file hierarchy.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Alt&lt;/kbd&gt;-&lt;kbd&gt;Up&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UpFolder.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("up-folder", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link FileChooserWidget.Builder} object constructs a {@link FileChooserWidget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileChooserWidget.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileChooserWidget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileChooserWidget}.
         * @return A new instance of {@code FileChooserWidget} with the properties 
         *         that were set in the Builder object.
         */
        public FileChooserWidget build() {
            return (FileChooserWidget) org.gtk.gobject.GObject.newWithProperties(
                FileChooserWidget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setSearchMode(boolean searchMode) {
            names.add("search-mode");
            values.add(org.gtk.gobject.Value.create(searchMode));
            return this;
        }
        
        public Builder setSubtitle(java.lang.String subtitle) {
            names.add("subtitle");
            values.add(org.gtk.gobject.Value.create(subtitle));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_chooser_widget_new = Interop.downcallHandle(
                "gtk_file_chooser_widget_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_file_chooser_widget_get_type = Interop.downcallHandle(
                "gtk_file_chooser_widget_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_file_chooser_widget_get_type != null;
    }
}
