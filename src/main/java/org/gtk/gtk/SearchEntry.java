package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>CSS Nodes</h2>
 * <p>
 * <pre>{@code 
 * entry.search
 * ╰── text
 * }</pre>
 * <p>
 * {@code GtkSearchEntry} has a single CSS node with name entry that carries
 * a {@code .search} style class, and the text node is a child of that.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code GtkSearchEntry} uses the {@link AccessibleRole#SEARCH_BOX} role.
 */
public class SearchEntry extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public SearchEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SearchEntry */
    public static SearchEntry castFrom(org.gtk.gobject.Object gobject) {
        return new SearchEntry(gobject.refcounted());
    }
    
    static final MethodHandle gtk_search_entry_new = Interop.downcallHandle(
        "gtk_search_entry_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_search_entry_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkSearchEntry}.
     */
    public SearchEntry() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_search_entry_get_key_capture_widget = Interop.downcallHandle(
        "gtk_search_entry_get_key_capture_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget that {@code entry} is capturing key events from.
     */
    public Widget getKeyCaptureWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_search_entry_get_key_capture_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_search_entry_set_key_capture_widget = Interop.downcallHandle(
        "gtk_search_entry_set_key_capture_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setKeyCaptureWidget(Widget widget) {
        try {
            gtk_search_entry_set_key_capture_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NextMatchHandler {
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
     */
    public SignalHandle onNextMatch(NextMatchHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("next-match").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryNextMatch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreviousMatchHandler {
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
     */
    public SignalHandle onPreviousMatch(PreviousMatchHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("previous-match").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryPreviousMatch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SearchChangedHandler {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted with a short delay of 150 milliseconds after the
     * last change to the entry text.
     */
    public SignalHandle onSearchChanged(SearchChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("search-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntrySearchChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SearchStartedHandler {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user initiated a search on the entry.
     */
    public SignalHandle onSearchStarted(SearchStartedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("search-started").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntrySearchStarted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StopSearchHandler {
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
     */
    public SignalHandle onStopSearch(StopSearchHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("stop-search").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SearchEntry.Callbacks.class, "signalSearchEntryStopSearch",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSearchEntryActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SearchEntry.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SearchEntry(Refcounted.get(source)));
        }
        
        public static void signalSearchEntryNextMatch(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SearchEntry.NextMatchHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SearchEntry(Refcounted.get(source)));
        }
        
        public static void signalSearchEntryPreviousMatch(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SearchEntry.PreviousMatchHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SearchEntry(Refcounted.get(source)));
        }
        
        public static void signalSearchEntrySearchChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SearchEntry.SearchChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SearchEntry(Refcounted.get(source)));
        }
        
        public static void signalSearchEntrySearchStarted(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SearchEntry.SearchStartedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SearchEntry(Refcounted.get(source)));
        }
        
        public static void signalSearchEntryStopSearch(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SearchEntry.StopSearchHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SearchEntry(Refcounted.get(source)));
        }
        
    }
}
