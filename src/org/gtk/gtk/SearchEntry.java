package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSearchEntry</code> is an entry widget that has been tailored for use
 * as a search entry.
 * <p>
 * The main API for interacting with a <code>GtkSearchEntry</code> as entry
 * is the <code>GtkEditable</code> interface.
 * <p>
 * !{@link [An example GtkSearchEntry]}(search-entry.png)
 * <p>
 * It will show an inactive symbolic &<code>#8220</code> find&<code>#8221</code>  icon when the search
 * entry is empty, and a symbolic &<code>#8220</code> clear&<code>#8221</code>  icon when there is text.
 * Clicking on the &<code>#8220</code> clear&<code>#8221</code>  icon will empty the search entry.
 * <p>
 * To make filtering appear more reactive, it is a good idea to
 * not react to every change in the entry text immediately, but
 * only after a short delay. To support this, <code>GtkSearchEntry</code>
 * emits the {@link [signal@Gtk.SearchEntry::search-changed] (ref=signal)} signal which
 * can be used instead of the {@link [signal@Gtk.Editable::changed] (ref=signal)} signal.
 * <p>
 * The {@link [signal@Gtk.SearchEntry::previous-match] (ref=signal)},
 * {@link [signal@Gtk.SearchEntry::next-match] (ref=signal)} and
 * {@link [signal@Gtk.SearchEntry::stop-search] (ref=signal)} signals can be used to
 * implement moving between search results and ending the search.
 * <p>
 * Often, <code>GtkSearchEntry</code> will be fed events by means of being
 * placed inside a {@link org.gtk.gtk.SearchBar}. If that is not the case,
 * you can use {@link org.gtk.gtk.SearchEntry<code>#setKeyCaptureWidget</code>  to
 * let it capture key input from another widget.
 * <p><code>GtkSearchEntry</code> provides only minimal API and should be used with
 * the {@link [iface@Gtk.Editable] (ref=iface)} API.
 * <p>
 * <h2>CSS Nodes</h2>
 * <p><pre>
 * entry.search
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  text
 * </pre>
 * <p><code>GtkSearchEntry</code> has a single CSS node with name entry that carries
 * a <code>.search</code> style class, and the text node is a child of that.
 * <p>
 * <h2>Accessibility</h2>
 * <p><code>GtkSearchEntry</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#SEARCH_BOX</code>  role.
 */
public class SearchEntry extends Widget implements Accessible, Buildable, ConstraintTarget, Editable {

    public SearchEntry(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SearchEntry */
    public static SearchEntry castFrom(org.gtk.gobject.Object gobject) {
        return new SearchEntry(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_search_entry_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkSearchEntry</code>.
     */
    public SearchEntry() {
        super(constructNew());
    }
    
    /**
     * Gets the widget that @entry is capturing key events from.
     */
    public Widget getKeyCaptureWidget() {
        var RESULT = gtk_h.gtk_search_entry_get_key_capture_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets @widget as the widget that @entry will capture key
     * events from.
     * <p>
     * Key events are consumed by the search entry to start or
     * continue a search.
     * <p>
     * If the entry is part of a <code>GtkSearchBar</code>, it is preferable
     * to call {@link org.gtk.gtk.SearchBar<code>#setKeyCaptureWidget</code>  instead,
     * which will reveal the entry in addition to triggering the
     * search entry.
     * 
     * Note that despite the name of this function, the events
     * are only &<code>#39</code> captured&<code>#39</code>  in the bubble phase, which means that
     * editable child widgets of @widget will receive text input
     * before it gets captured. If that is not desired, you can
     * capture and forward the events yourself with
     * {@link org.gtk.gtk.EventControllerKey<code>#forward</code> .
     */
    public void setKeyCaptureWidget(Widget widget) {
        gtk_h.gtk_search_entry_set_key_capture_widget(handle(), widget.handle());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the entry is activated.
     * 
     * The keybindings for this signal are all forms of the Enter key.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSearchEntryActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface NextMatchHandler {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user initiates a move to the next match
     * for the current search string.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * Applications should connect to it, to implement moving
     * between matches.
     * 
     * The default bindings for this signal is Ctrl-g.
     */
    public SignalHandle onNextMatch(NextMatchHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSearchEntryNextMatch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("next-match").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreviousMatchHandler {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user initiates a move to the previous match
     * for the current search string.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * Applications should connect to it, to implement moving
     * between matches.
     * 
     * The default bindings for this signal is Ctrl-Shift-g.
     */
    public SignalHandle onPreviousMatch(PreviousMatchHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSearchEntryPreviousMatch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("previous-match").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSearchEntrySearchChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("search-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSearchEntrySearchStarted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("search-started").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface StopSearchHandler {
        void signalReceived(SearchEntry source);
    }
    
    /**
     * Emitted when the user stops a search via keyboard input.
     * 
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * Applications should connect to it, to implement hiding
     * the search entry in this case.
     * 
     * The default bindings for this signal is Escape.
     */
    public SignalHandle onStopSearch(StopSearchHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSearchEntryStopSearch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("stop-search").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
