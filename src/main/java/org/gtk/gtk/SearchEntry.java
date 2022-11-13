package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSearchEntry} is an entry widget that has been tailored for use
 * as a search entry.
 * <p>
 * The main API for interacting with a {@code GtkSearchEntry} as entry
 * is the {@code GtkEditable} interface.
 * <p>
 * <img src="./doc-files/search-entry.png" alt="An example GtkSearchEntry">
 * <p>
 * It will show an inactive symbolic “find” icon when the search
 * entry is empty, and a symbolic “clear” icon when there is text.
 * Clicking on the “clear” icon will empty the search entry.
 * <p>
 * To make filtering appear more reactive, it is a good idea to
 * not react to every change in the entry text immediately, but
 * only after a short delay. To support this, {@code GtkSearchEntry}
 * emits the {@code Gtk.SearchEntry::search-changed} signal which
 * can be used instead of the {@code Gtk.Editable::changed} signal.
 * <p>
 * The {@code Gtk.SearchEntry::previous-match},
 * {@code Gtk.SearchEntry::next-match} and
 * {@code Gtk.SearchEntry::stop-search} signals can be used to
 * implement moving between search results and ending the search.
 * <p>
 * Often, {@code GtkSearchEntry} will be fed events by means of being
 * placed inside a {@link SearchBar}. If that is not the case,
 * you can use {@link SearchEntry#setKeyCaptureWidget} to
 * let it capture key input from another widget.
 * <p>
 * {@code GtkSearchEntry} provides only minimal API and should be used with
 * the {@code Gtk.Editable} API.
 * <p>
 * <strong>CSS Nodes</strong><br/>
 * <pre>{@code 
 * entry.search
 * ╰── text
 * }</pre>
 * <p>
 * {@code GtkSearchEntry} has a single CSS node with name entry that carries
 * a {@code .search} style class, and the text node is a child of that.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkSearchEntry} uses the {@link AccessibleRole#SEARCH_BOX} role.
 */
public class SearchEntry extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSearchEntry";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SearchEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SearchEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SearchEntry if its GType is a (or inherits from) "GtkSearchEntry".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SearchEntry} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSearchEntry", a ClassCastException will be thrown.
     */
    public static SearchEntry castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSearchEntry"))) {
            return new SearchEntry(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSearchEntry");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_entry_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkSearchEntry}.
     */
    public SearchEntry() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the widget that {@code entry} is capturing key events from.
     * @return The key capture widget.
     */
    public @Nullable org.gtk.gtk.Widget getKeyCaptureWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_entry_get_key_capture_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets {@code widget} as the widget that {@code entry} will capture key
     * events from.
     * <p>
     * Key events are consumed by the search entry to start or
     * continue a search.
     * <p>
     * If the entry is part of a {@code GtkSearchBar}, it is preferable
     * to call {@link SearchBar#setKeyCaptureWidget} instead,
     * which will reveal the entry in addition to triggering the
     * search entry.
     * <p>
     * Note that despite the name of this function, the events
     * are only 'captured' in the bubble phase, which means that
     * editable child widgets of {@code widget} will receive text input
     * before it gets captured. If that is not desired, you can
     * capture and forward the events yourself with
     * {@link EventControllerKey#forward}.
     * @param widget a {@code GtkWidget}
     */
    public void setKeyCaptureWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_search_entry_set_key_capture_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.Activate> onActivate(SearchEntry.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SearchEntry.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NextMatch {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user initiates a move to the next match
     * for the current search string.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * Applications should connect to it, to implement moving
     * between matches.
     * <p>
     * The default bindings for this signal is Ctrl-g.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.NextMatch> onNextMatch(SearchEntry.NextMatch handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("next-match"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryNextMatch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SearchEntry.NextMatch>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreviousMatch {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user initiates a move to the previous match
     * for the current search string.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * Applications should connect to it, to implement moving
     * between matches.
     * <p>
     * The default bindings for this signal is Ctrl-Shift-g.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.PreviousMatch> onPreviousMatch(SearchEntry.PreviousMatch handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("previous-match"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryPreviousMatch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SearchEntry.PreviousMatch>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SearchChanged {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted with a short delay of 150 milliseconds after the
     * last change to the entry text.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.SearchChanged> onSearchChanged(SearchEntry.SearchChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("search-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntrySearchChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SearchEntry.SearchChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SearchStarted {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user initiated a search on the entry.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.SearchStarted> onSearchStarted(SearchEntry.SearchStarted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("search-started"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntrySearchStarted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SearchEntry.SearchStarted>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StopSearch {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user stops a search via keyboard input.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * Applications should connect to it, to implement hiding
     * the search entry in this case.
     * <p>
     * The default bindings for this signal is Escape.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.StopSearch> onStopSearch(SearchEntry.StopSearch handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("stop-search"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryStopSearch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SearchEntry.StopSearch>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_search_entry_new = Interop.downcallHandle(
            "gtk_search_entry_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_entry_get_key_capture_widget = Interop.downcallHandle(
            "gtk_search_entry_get_key_capture_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_search_entry_set_key_capture_widget = Interop.downcallHandle(
            "gtk_search_entry_set_key_capture_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalSearchEntryActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SearchEntry.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SearchEntry(source, Ownership.UNKNOWN));
        }
        
        public static void signalSearchEntryNextMatch(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SearchEntry.NextMatch) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SearchEntry(source, Ownership.UNKNOWN));
        }
        
        public static void signalSearchEntryPreviousMatch(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SearchEntry.PreviousMatch) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SearchEntry(source, Ownership.UNKNOWN));
        }
        
        public static void signalSearchEntrySearchChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SearchEntry.SearchChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SearchEntry(source, Ownership.UNKNOWN));
        }
        
        public static void signalSearchEntrySearchStarted(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SearchEntry.SearchStarted) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SearchEntry(source, Ownership.UNKNOWN));
        }
        
        public static void signalSearchEntryStopSearch(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SearchEntry.StopSearch) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SearchEntry(source, Ownership.UNKNOWN));
        }
    }
}
