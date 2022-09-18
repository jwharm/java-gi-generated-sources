package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkEntryCompletion</code> is an auxiliary object to provide completion functionality
 * for <code>GtkEntry</code>.
 * <p>
 * It implements the {@link [iface@Gtk.CellLayout] (ref=iface)} interface, to allow the user
 * to add extra cells to the <code>GtkTreeView</code> with completion matches.
 * <p>
 * &<code>#8220</code> Completion functionality&<code>#8221</code>  means that when the user modifies the text
 * in the entry, <code>GtkEntryCompletion</code> checks which rows in the model match
 * the current content of the entry, and displays a list of matches.
 * By default, the matching is done by comparing the entry text
 * case-insensitively against the text column of the model (see
 * {@link org.gtk.gtk.EntryCompletion<code>#setTextColumn</code> ), but this can be overridden
 * with a custom match function (see {@link org.gtk.gtk.EntryCompletion<code>#setMatchFunc</code> ).
 * <p>
 * When the user selects a completion, the content of the entry is
 * updated. By default, the content of the entry is replaced by the
 * text column of the model, but this can be overridden by connecting
 * to the {@link [signal@Gtk.EntryCompletion::match-selected] (ref=signal)} signal and updating the
 * entry in the signal handler. Note that you should return <code>true</code> from
 * the signal handler to suppress the default behaviour.
 * <p>
 * To add completion functionality to an entry, use
 * {@link org.gtk.gtk.Entry<code>#setCompletion</code> .
 * <p><code>GtkEntryCompletion</code> uses a {@link org.gtk.gtk.TreeModelFilter} model to
 * represent the subset of the entire model that is currently matching.
 * While the <code>GtkEntryCompletion</code> signals
 * {@link [signal@Gtk.EntryCompletion::match-selected] (ref=signal)} and
 * {@link [signal@Gtk.EntryCompletion::cursor-on-match] (ref=signal)} take the original model
 * and an iter pointing to that model as arguments, other callbacks and
 * signals (such as <code>GtkCellLayoutDataFunc</code> or
 * {@link [signal@Gtk.CellArea::apply-attributes)] (ref=signal)}
 * will generally take the filter model as argument. As long as you are
 * only calling {@link org.gtk.gtk.TreeModel<code>#get</code> , this will make no difference to
 * you. If for some reason, you need the original model, use
 * {@link org.gtk.gtk.TreeModelFilter<code>#getModel</code> . Don&<code>#8217</code> t forget to use
 * {@link org.gtk.gtk.TreeModelFilter<code>#convertIterToChildIter</code>  to obtain a
 * matching iter.
 */
public class EntryCompletion extends org.gtk.gobject.Object implements Buildable, CellLayout {

    public EntryCompletion(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EntryCompletion */
    public static EntryCompletion castFrom(org.gtk.gobject.Object gobject) {
        return new EntryCompletion(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_entry_completion_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkEntryCompletion</code> object.
     */
    public EntryCompletion() {
        super(constructNew());
    }
    
    private static Reference constructNewWithArea(CellArea area) {
        Reference RESULT = References.get(gtk_h.gtk_entry_completion_new_with_area(area.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkEntryCompletion</code> object using the
     * specified @area.
     * <p>
     * The <code>GtkCellArea</code> is used to layout cells in the underlying<code>GtkTreeViewColumn</code> for the drop-down menu.
     */
    public static EntryCompletion newWithArea(CellArea area) {
        return new EntryCompletion(constructNewWithArea(area));
    }
    
    /**
     * Requests a completion operation, or in other words a refiltering of the
     * current list with completions, using the current key.
     * 
     * The completion list view will be updated accordingly.
     */
    public void complete() {
        gtk_h.gtk_entry_completion_complete(handle());
    }
    
    /**
     * Computes the common prefix that is shared by all rows in @completion
     * that start with @key.
     * 
     * If no row matches @key, <code>null</code> will be returned.
     * Note that a text column must have been set for this function to work,
     * see {@link org.gtk.gtk.EntryCompletion<code>#setTextColumn</code>  for details.
     */
    public java.lang.String computePrefix(java.lang.String key) {
        var RESULT = gtk_h.gtk_entry_completion_compute_prefix(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the original text entered by the user that triggered
     * the completion or <code>null</code> if there&<code>#8217</code> s no completion ongoing.
     */
    public java.lang.String getCompletionPrefix() {
        var RESULT = gtk_h.gtk_entry_completion_get_completion_prefix(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the entry @completion has been attached to.
     */
    public Widget getEntry() {
        var RESULT = gtk_h.gtk_entry_completion_get_entry(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the common prefix of the possible completions should
     * be automatically inserted in the entry.
     */
    public boolean getInlineCompletion() {
        var RESULT = gtk_h.gtk_entry_completion_get_inline_completion(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if inline-selection mode is turned on.
     */
    public boolean getInlineSelection() {
        var RESULT = gtk_h.gtk_entry_completion_get_inline_selection(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the minimum key length as set for @completion.
     */
    public int getMinimumKeyLength() {
        var RESULT = gtk_h.gtk_entry_completion_get_minimum_key_length(handle());
        return RESULT;
    }
    
    /**
     * Returns the model the <code>GtkEntryCompletion</code> is using as data source.
     * 
     * Returns <code>null</code> if the model is unset.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_entry_completion_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the completions should be presented in a popup window.
     */
    public boolean getPopupCompletion() {
        var RESULT = gtk_h.gtk_entry_completion_get_popup_completion(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the completion popup window will be resized to the
     * width of the entry.
     */
    public boolean getPopupSetWidth() {
        var RESULT = gtk_h.gtk_entry_completion_get_popup_set_width(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the completion popup window will appear even if there is
     * only a single match.
     */
    public boolean getPopupSingleMatch() {
        var RESULT = gtk_h.gtk_entry_completion_get_popup_single_match(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the column in the model of @completion to get strings from.
     */
    public int getTextColumn() {
        var RESULT = gtk_h.gtk_entry_completion_get_text_column(handle());
        return RESULT;
    }
    
    /**
     * Requests a prefix insertion.
     */
    public void insertPrefix() {
        gtk_h.gtk_entry_completion_insert_prefix(handle());
    }
    
    /**
     * Sets whether the common prefix of the possible completions should
     * be automatically inserted in the entry.
     */
    public void setInlineCompletion(boolean inlineCompletion) {
        gtk_h.gtk_entry_completion_set_inline_completion(handle(), inlineCompletion ? 1 : 0);
    }
    
    /**
     * Sets whether it is possible to cycle through the possible completions
     * inside the entry.
     */
    public void setInlineSelection(boolean inlineSelection) {
        gtk_h.gtk_entry_completion_set_inline_selection(handle(), inlineSelection ? 1 : 0);
    }
    
    /**
     * Sets the match function for @completion to be @func.
     * 
     * The match function is used to determine if a row should or
     * should not be in the completion list.
     */
    public void setMatchFunc(EntryCompletionMatchFunc func) {
        try {
            gtk_h.gtk_entry_completion_set_match_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbEntryCompletionMatchFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Requires the length of the search key for @completion to be at least
     * @length.
     * 
     * This is useful for long lists, where completing using a small
     * key takes a lot of time and will come up with meaningless results anyway
     * (ie, a too large dataset).
     */
    public void setMinimumKeyLength(int length) {
        gtk_h.gtk_entry_completion_set_minimum_key_length(handle(), length);
    }
    
    /**
     * Sets the model for a <code>GtkEntryCompletion</code>.
     * 
     * If @completion already has a model set, it will remove it
     * before setting the new model. If model is <code>null</code>  then it
     * will unset the model.
     */
    public void setModel(TreeModel model) {
        gtk_h.gtk_entry_completion_set_model(handle(), model.handle());
    }
    
    /**
     * Sets whether the completions should be presented in a popup window.
     */
    public void setPopupCompletion(boolean popupCompletion) {
        gtk_h.gtk_entry_completion_set_popup_completion(handle(), popupCompletion ? 1 : 0);
    }
    
    /**
     * Sets whether the completion popup window will be resized to be the same
     * width as the entry.
     */
    public void setPopupSetWidth(boolean popupSetWidth) {
        gtk_h.gtk_entry_completion_set_popup_set_width(handle(), popupSetWidth ? 1 : 0);
    }
    
    /**
     * Sets whether the completion popup window will appear even if there is
     * only a single match.
     * 
     * You may want to set this to <code>false</code> if you
     * are using {@link [property@Gtk.EntryCompletion:inline-completion] (ref=property)}.
     */
    public void setPopupSingleMatch(boolean popupSingleMatch) {
        gtk_h.gtk_entry_completion_set_popup_single_match(handle(), popupSingleMatch ? 1 : 0);
    }
    
    /**
     * Convenience function for setting up the most used case of this code: a
     * completion list with just strings.
     * <p>
     * This function will set up @completion
     * to have a list displaying all (and just) strings in the completion list,
     * and to get those strings from @column in the model of @completion.
     * <p>
     * This functions creates and adds a <code>GtkCellRendererText</code> for the selected
     * column. If you need to set the text column, but don&<code>#39</code> t want the cell
     * renderer, use g_object_set() to set the
     * {@link [property@Gtk.EntryCompletion:text-column] (ref=property)} property directly.
     */
    public void setTextColumn(int column) {
        gtk_h.gtk_entry_completion_set_text_column(handle(), column);
    }
    
    @FunctionalInterface
    public interface CursorOnMatchHandler {
        boolean signalReceived(EntryCompletion source, TreeModel model, TreeIter iter);
    }
    
    /**
     * Emitted when a match from the cursor is on a match of the list.
     * 
     * The default behaviour is to replace the contents
     * of the entry with the contents of the text column in the row
     * pointed to by @iter.
     * 
     * Note that @model is the model that was passed to
     * {@link org.gtk.gtk.EntryCompletion<code>#setModel</code> .
     */
    public SignalHandle onCursorOnMatch(CursorOnMatchHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionCursorOnMatch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cursor-on-match").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertPrefixHandler {
        boolean signalReceived(EntryCompletion source, java.lang.String prefix);
    }
    
    /**
     * Emitted when the inline autocompletion is triggered.
     * <p>
     * The default behaviour is to make the entry display the
     * whole prefix and select the newly inserted part.
     * <p>
     * Applications may connect to this signal in order to insert only a
     * smaller part of the @prefix into the entry - e.g. the entry used in
     * the <code>GtkFileChooser</code> inserts only the part of the prefix up to the
     * next &<code>#39</code> /&<code>#39</code> .
     */
    public SignalHandle onInsertPrefix(InsertPrefixHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionInsertPrefix", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-prefix").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MatchSelectedHandler {
        boolean signalReceived(EntryCompletion source, TreeModel model, TreeIter iter);
    }
    
    /**
     * Emitted when a match from the list is selected.
     * 
     * The default behaviour is to replace the contents of the
     * entry with the contents of the text column in the row
     * pointed to by @iter.
     * 
     * Note that @model is the model that was passed to
     * {@link org.gtk.gtk.EntryCompletion<code>#setModel</code> .
     */
    public SignalHandle onMatchSelected(MatchSelectedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionMatchSelected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("match-selected").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface NoMatchesHandler {
        void signalReceived(EntryCompletion source);
    }
    
    /**
     * Emitted when the filter model has zero
     * number of rows in completion_complete method.
     * <p>
     * In other words when <code>GtkEntryCompletion</code> is out of suggestions.
     */
    public SignalHandle onNoMatches(NoMatchesHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionNoMatches", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("no-matches").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
