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
     */
    protected SearchEntry(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SearchEntry> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SearchEntry(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the widget that {@code entry} is capturing key events from.
     * @return The key capture widget.
     */
    public @Nullable org.gtk.gtk.Widget getKeyCaptureWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_search_entry_get_key_capture_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the delay to be used between the last keypress and the
     * {@code Gtk.SearchEntry::search-changed} signal being emitted.
     * @return a delay in milliseconds.
     */
    public int getSearchDelay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_search_entry_get_search_delay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    
    /**
     * Set the delay to be used between the last keypress and the
     * {@code Gtk.SearchEntry::search-changed} signal being emitted.
     * @param delay a delay in milliseconds
     */
    public void setSearchDelay(int delay) {
        try {
            DowncallHandles.gtk_search_entry_set_search_delay.invokeExact(
                    handle(),
                    delay);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_search_entry_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted when the entry is activated.
         * <p>
         * The keybindings for this signal are all forms of the Enter key.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSearchEntry) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the entry is activated.
     * <p>
     * The keybindings for this signal are all forms of the Enter key.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.Activate> onActivate(SearchEntry.Activate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code NextMatch} callback.
     */
    @FunctionalInterface
    public interface NextMatch {
    
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
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSearchEntry) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NextMatch.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("next-match", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreviousMatch} callback.
     */
    @FunctionalInterface
    public interface PreviousMatch {
    
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
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSearchEntry) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreviousMatch.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("previous-match", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SearchChanged} callback.
     */
    @FunctionalInterface
    public interface SearchChanged {
    
        /**
         * Emitted with a delay. The length of the delay can be
         * changed with the {@code Gtk.SearchEntry:search-delay}
         * property.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSearchEntry) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SearchChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted with a delay. The length of the delay can be
     * changed with the {@code Gtk.SearchEntry:search-delay}
     * property.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.SearchChanged> onSearchChanged(SearchEntry.SearchChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("search-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SearchStarted} callback.
     */
    @FunctionalInterface
    public interface SearchStarted {
    
        /**
         * Emitted when the user initiated a search on the entry.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSearchEntry) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SearchStarted.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the user initiated a search on the entry.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SearchEntry.SearchStarted> onSearchStarted(SearchEntry.SearchStarted handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("search-started", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopSearch} callback.
     */
    @FunctionalInterface
    public interface StopSearch {
    
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
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSearchEntry) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopSearch.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("stop-search", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SearchEntry.Builder} object constructs a {@link SearchEntry} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SearchEntry.Builder#build()}. 
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
         * Finish building the {@link SearchEntry} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SearchEntry}.
         * @return A new instance of {@code SearchEntry} with the properties 
         *         that were set in the Builder object.
         */
        public SearchEntry build() {
            return (SearchEntry) org.gtk.gobject.GObject.newWithProperties(
                SearchEntry.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to activate the default widget when Enter is pressed.
         * @param activatesDefault The value for the {@code activates-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivatesDefault(boolean activatesDefault) {
            names.add("activates-default");
            values.add(org.gtk.gobject.Value.create(activatesDefault));
            return this;
        }
        
        /**
         * The text that will be displayed in the {@code GtkSearchEntry}
         * when it is empty and unfocused.
         * @param placeholderText The value for the {@code placeholder-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlaceholderText(java.lang.String placeholderText) {
            names.add("placeholder-text");
            values.add(org.gtk.gobject.Value.create(placeholderText));
            return this;
        }
        
        /**
         * The delay in milliseconds from last keypress to the search
         * changed signal.
         * @param searchDelay The value for the {@code search-delay} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSearchDelay(int searchDelay) {
            names.add("search-delay");
            values.add(org.gtk.gobject.Value.create(searchDelay));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_search_entry_new = Interop.downcallHandle(
                "gtk_search_entry_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_search_entry_get_key_capture_widget = Interop.downcallHandle(
                "gtk_search_entry_get_key_capture_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_search_entry_get_search_delay = Interop.downcallHandle(
                "gtk_search_entry_get_search_delay",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_search_entry_set_key_capture_widget = Interop.downcallHandle(
                "gtk_search_entry_set_key_capture_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_search_entry_set_search_delay = Interop.downcallHandle(
                "gtk_search_entry_set_search_delay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_search_entry_get_type = Interop.downcallHandle(
                "gtk_search_entry_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_search_entry_get_type != null;
    }
}
