package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFileChooserWidget</code> is a widget for choosing files.
 * <p>
 * It exposes the {@link [iface@Gtk.FileChooser] (ref=iface)} interface, and you should
 * use the methods of this interface to interact with the
 * widget.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><code>GtkFileChooserWidget</code> has a single CSS node with name filechooser.
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
     * Creates a new <code>GtkFileChooserWidget</code>.
     * <p>
     * This is a file chooser widget that can be embedded in custom
     * windows, and it is the same widget that is used by<code>GtkFileChooserDialog</code>.
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
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser show the user&<code>#39</code> s Desktop
     * folder in the file list.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> D&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onDesktopFolder(DesktopFolderHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetDesktopFolder", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("desktop-folder").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DownFolderHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser go to a child of the
     * current folder in the file hierarchy. The subfolder that will
     * be used is displayed in the path bar widget of the file chooser.
     * For example, if the path bar is showing &<code>#34</code> /foo/bar/baz&<code>#34</code> , with bar
     * currently displayed, then this will cause the file chooser to
     * switch to the &<code>#34</code> baz&<code>#34</code>  subfolder.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> Down&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onDownFolder(DownFolderHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetDownFolder", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("down-folder").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface HomeFolderHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser show the user&<code>#39</code> s home
     * folder in the file list.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> Home&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onHomeFolder(HomeFolderHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetHomeFolder", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("home-folder").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * <p>
     * This is used to make the file chooser show a &<code>#34</code> Location&<code>#34</code>  prompt which
     * the user can use to manually type the name of the file he wishes to select.
     * <p>
     * The default bindings for this signal are &<code>#60</code> kbd&<code>#62</code> Control&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> L&<code>#60</code> /kbd&<code>#62</code> 
     * with a @path string of &<code>#34</code> &<code>#34</code>  (the empty string). It is also bound to
     * &<code>#60</code> kbd&<code>#62</code> /&<code>#60</code> /kbd&<code>#62</code>  with a @path string of &<code>#34</code> <code>/</code>&<code>#34</code>  (a slash):  this lets you
     * type <code>/</code> and immediately type a path name. On Unix systems, this is
     * bound to &<code>#60</code> kbd&<code>#62</code> ~&<code>#60</code> /kbd&<code>#62</code>  (tilde) with a @path string of &<code>#34</code> ~&<code>#34</code>  itself for
     * access to home directories.
     */
    public SignalHandle onLocationPopup(LocationPopupHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetLocationPopup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("location-popup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * <p>
     * This is used to make the file chooser show a &<code>#34</code> Location&<code>#34</code>  prompt
     * when the user pastes into a <code>GtkFileChooserWidget</code>.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Control&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> V&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onLocationPopupOnPaste(LocationPopupOnPasteHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetLocationPopupOnPaste", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("location-popup-on-paste").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LocationTogglePopupHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to toggle the visibility of a &<code>#34</code> Location&<code>#34</code>  prompt
     * which the user can use to manually type the name of the file
     * he wishes to select.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Control&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> L&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onLocationTogglePopup(LocationTogglePopupHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetLocationTogglePopup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("location-toggle-popup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PlacesShortcutHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to move the focus to the places sidebar.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> P&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onPlacesShortcut(PlacesShortcutHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetPlacesShortcut", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("places-shortcut").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface QuickBookmarkHandler {
        void signalReceived(FileChooserWidget source, int bookmarkIndex);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser switch to the bookmark
     * specified in the @bookmark_index parameter. For example, if
     * you have three bookmarks, you can pass 0, 1, 2 to this signal
     * to switch to each of them, respectively.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> 1&<code>#60</code> /kbd&<code>#62</code> ,
     * &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> 2&<code>#60</code> /kbd&<code>#62</code> , etc. until &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> 0&<code>#60</code> /kbd&<code>#62</code> .
     * Note that in the default binding, that &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> 1&<code>#60</code> /kbd&<code>#62</code>  is
     * actually defined to switch to the bookmark at index 0, and so on
     * successively.
     */
    public SignalHandle onQuickBookmark(QuickBookmarkHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetQuickBookmark", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("quick-bookmark").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RecentShortcutHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser show the Recent location.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> R&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onRecentShortcut(RecentShortcutHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetRecentShortcut", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("recent-shortcut").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SearchShortcutHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser show the search entry.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> S&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onSearchShortcut(SearchShortcutHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetSearchShortcut", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("search-shortcut").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ShowHiddenHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser display hidden files.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Control&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> H&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onShowHidden(ShowHiddenHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetShowHidden", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("show-hidden").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UpFolderHandler {
        void signalReceived(FileChooserWidget source);
    }
    
    /**
     * Emitted when the user asks for it.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This is used to make the file chooser go to the parent
     * of the current folder in the file hierarchy.
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Alt&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> Up&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onUpFolder(UpFolderHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalFileChooserWidgetUpFolder", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("up-folder").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
