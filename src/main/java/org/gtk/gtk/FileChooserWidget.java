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
     * <p>
     * Because FileChooserWidget is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileChooserWidget(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileChooserWidget> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileChooserWidget(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gtk.FileChooserAction action) {
        MemoryAddress RESULT;
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
    public FileChooserWidget(org.gtk.gtk.FileChooserAction action) {
        super(constructNew(action), Ownership.NONE);
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
    
    @FunctionalInterface
    public interface DesktopFolder {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DesktopFolder.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("desktop-folder"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DownFolder {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DownFolder.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("down-folder"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface HomeFolder {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HomeFolder.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("home-folder"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LocationPopup {
        void run(java.lang.String path);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget, MemoryAddress path) {
            run(Marshal.addressToString.marshal(path, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocationPopup.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("location-popup"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LocationPopupOnPaste {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocationPopupOnPaste.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("location-popup-on-paste"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LocationTogglePopup {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LocationTogglePopup.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("location-toggle-popup"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PlacesShortcut {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PlacesShortcut.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("places-shortcut"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface QuickBookmark {
        void run(int bookmarkIndex);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget, int bookmarkIndex) {
            run(bookmarkIndex);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QuickBookmark.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("quick-bookmark"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RecentShortcut {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RecentShortcut.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("recent-shortcut"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SearchShortcut {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SearchShortcut.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("search-shortcut"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ShowHidden {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShowHidden.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("show-hidden"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UpFolder {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFileChooserWidget) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UpFolder.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("up-folder"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
}
