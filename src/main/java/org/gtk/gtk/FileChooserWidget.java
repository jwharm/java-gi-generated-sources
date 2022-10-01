package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFileChooserWidget} is a widget for choosing files.
 * <p>
 * It exposes the {@code Gtk.FileChooser} interface, and you should
 * use the methods of this interface to interact with the
 * widget.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkFileChooserWidget} has a single CSS node with name filechooser.
 */
public class FileChooserWidget extends Widget implements Accessible, Buildable, ConstraintTarget, FileChooser {

    public FileChooserWidget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileChooserWidget */
    public static FileChooserWidget castFrom(org.gtk.gobject.Object gobject) {
        return new FileChooserWidget(gobject.getReference());
    }
    
    private static Reference constructNew(FileChooserAction action) {
        Reference RESULT = References.get(gtk_h.gtk_file_chooser_widget_new(action.getValue()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFileChooserWidget}.
     * <p>
     * This is a file chooser widget that can be embedded in custom
     * windows, and it is the same widget that is used by
     * {@code GtkFileChooserDialog}.
     */
    public FileChooserWidget(FileChooserAction action) {
        super(constructNew(action));
    }
    
    @FunctionalInterface
    public interface DesktopFolderHandler {
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
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>D</kbd&gt;.
     */
    public SignalHandle onDesktopFolder(DesktopFolderHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("desktop-folder").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetDesktopFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DownFolderHandler {
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
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>Down</kbd&gt;.
     */
    public SignalHandle onDownFolder(DownFolderHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("down-folder").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetDownFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface HomeFolderHandler {
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
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>Home</kbd&gt;.
     */
    public SignalHandle onHomeFolder(HomeFolderHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("home-folder").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetHomeFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LocationPopupHandler {
        void signalReceived(FileChooserWidget source, java.lang.String path);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show a "Location" prompt which
     * the user can use to manually type the name of the file he wishes to select.
     * <p>
     * The default bindings for this signal are &lt;kbd>Control</kbd>-<kbd>L</kbd&gt;
     * with a {@code path} string of "" (the empty string). It is also bound to
     * &lt;kbd>/</kbd&gt; with a {@code path} string of "{@code /}" (a slash):  this lets you
     * type {@code /} and immediately type a path name. On Unix systems, this is
     * bound to &lt;kbd>~</kbd&gt; (tilde) with a {@code path} string of "~" itself for
     * access to home directories.
     */
    public SignalHandle onLocationPopup(LocationPopupHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("location-popup").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetLocationPopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LocationPopupOnPasteHandler {
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
     * The default binding for this signal is &lt;kbd>Control</kbd>-<kbd>V</kbd&gt;.
     */
    public SignalHandle onLocationPopupOnPaste(LocationPopupOnPasteHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("location-popup-on-paste").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetLocationPopupOnPaste",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LocationTogglePopupHandler {
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
     * The default binding for this signal is &lt;kbd>Control</kbd>-<kbd>L</kbd&gt;.
     */
    public SignalHandle onLocationTogglePopup(LocationTogglePopupHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("location-toggle-popup").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetLocationTogglePopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PlacesShortcutHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to move the focus to the places sidebar.
     * <p>
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>P</kbd&gt;.
     */
    public SignalHandle onPlacesShortcut(PlacesShortcutHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("places-shortcut").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetPlacesShortcut",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface QuickBookmarkHandler {
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
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>1</kbd&gt;,
     * &lt;kbd>Alt</kbd>-<kbd>2</kbd>, etc. until <kbd>Alt</kbd>-<kbd>0</kbd&gt;.
     * Note that in the default binding, that &lt;kbd>Alt</kbd>-<kbd>1</kbd&gt; is
     * actually defined to switch to the bookmark at index 0, and so on
     * successively.
     */
    public SignalHandle onQuickBookmark(QuickBookmarkHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("quick-bookmark").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetQuickBookmark",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RecentShortcutHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show the Recent location.
     * <p>
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>R</kbd&gt;.
     */
    public SignalHandle onRecentShortcut(RecentShortcutHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("recent-shortcut").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetRecentShortcut",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SearchShortcutHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser show the search entry.
     * <p>
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>S</kbd&gt;.
     */
    public SignalHandle onSearchShortcut(SearchShortcutHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("search-shortcut").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetSearchShortcut",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ShowHiddenHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This is used to make the file chooser display hidden files.
     * <p>
     * The default binding for this signal is &lt;kbd>Control</kbd>-<kbd>H</kbd&gt;.
     */
    public SignalHandle onShowHidden(ShowHiddenHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("show-hidden").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetShowHidden",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UpFolderHandler {
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
     * The default binding for this signal is &lt;kbd>Alt</kbd>-<kbd>Up</kbd&gt;.
     */
    public SignalHandle onUpFolder(UpFolderHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("up-folder").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FileChooserWidget.Callbacks.class, "signalFileChooserWidgetUpFolder",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFileChooserWidgetDesktopFolder(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.DesktopFolderHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetDownFolder(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.DownFolderHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetHomeFolder(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.HomeFolderHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetLocationPopup(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.LocationPopupHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)), path.getUtf8String(0));
        }
        
        public static void signalFileChooserWidgetLocationPopupOnPaste(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.LocationPopupOnPasteHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetLocationTogglePopup(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.LocationTogglePopupHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetPlacesShortcut(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.PlacesShortcutHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetQuickBookmark(MemoryAddress source, int bookmarkIndex, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.QuickBookmarkHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)), bookmarkIndex);
        }
        
        public static void signalFileChooserWidgetRecentShortcut(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.RecentShortcutHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetSearchShortcut(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.SearchShortcutHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetShowHidden(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.ShowHiddenHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
        public static void signalFileChooserWidgetUpFolder(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FileChooserWidget.UpFolderHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FileChooserWidget(References.get(source)));
        }
        
    }
}
