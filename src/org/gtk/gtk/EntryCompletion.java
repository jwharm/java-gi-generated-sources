package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkEntryCompletion` is an auxiliary object to provide completion functionality
 * for `GtkEntry`.
 * 
 * It implements the [iface@Gtk.CellLayout] interface, to allow the user
 * to add extra cells to the `GtkTreeView` with completion matches.
 * 
 * “Completion functionality” means that when the user modifies the text
 * in the entry, `GtkEntryCompletion` checks which rows in the model match
 * the current content of the entry, and displays a list of matches.
 * By default, the matching is done by comparing the entry text
 * case-insensitively against the text column of the model (see
 * [method@Gtk.EntryCompletion.set_text_column]), but this can be overridden
 * with a custom match function (see [method@Gtk.EntryCompletion.set_match_func]).
 * 
 * When the user selects a completion, the content of the entry is
 * updated. By default, the content of the entry is replaced by the
 * text column of the model, but this can be overridden by connecting
 * to the [signal@Gtk.EntryCompletion::match-selected] signal and updating the
 * entry in the signal handler. Note that you should return %TRUE from
 * the signal handler to suppress the default behaviour.
 * 
 * To add completion functionality to an entry, use
 * [method@Gtk.Entry.set_completion].
 * 
 * `GtkEntryCompletion` uses a [class@Gtk.TreeModelFilter] model to
 * represent the subset of the entire model that is currently matching.
 * While the `GtkEntryCompletion` signals
 * [signal@Gtk.EntryCompletion::match-selected] and
 * [signal@Gtk.EntryCompletion::cursor-on-match] take the original model
 * and an iter pointing to that model as arguments, other callbacks and
 * signals (such as `GtkCellLayoutDataFunc` or
 * [signal@Gtk.CellArea::apply-attributes)]
 * will generally take the filter model as argument. As long as you are
 * only calling [method@Gtk.TreeModel.get], this will make no difference to
 * you. If for some reason, you need the original model, use
 * [method@Gtk.TreeModelFilter.get_model]. Don’t forget to use
 * [method@Gtk.TreeModelFilter.convert_iter_to_child_iter] to obtain a
 * matching iter.
 */
public class EntryCompletion extends org.gtk.gobject.Object implements Buildable, CellLayout {

    public EntryCompletion(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to EntryCompletion */
    public static EntryCompletion castFrom(org.gtk.gobject.Object gobject) {
        return new EntryCompletion(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkEntryCompletion` object.
     */
    public EntryCompletion() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_new(), true));
    }
    
    /**
     * Creates a new `GtkEntryCompletion` object using the
     * specified @area.
     * 
     * The `GtkCellArea` is used to layout cells in the underlying
     * `GtkTreeViewColumn` for the drop-down menu.
     */
    public EntryCompletion(CellArea area) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_new_with_area(area.HANDLE()), true));
    }
    
    /**
     * Requests a completion operation, or in other words a refiltering of the
     * current list with completions, using the current key.
     * 
     * The completion list view will be updated accordingly.
     */
    public void complete() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_complete(HANDLE());
    }
    
    /**
     * Computes the common prefix that is shared by all rows in @completion
     * that start with @key.
     * 
     * If no row matches @key, %NULL will be returned.
     * Note that a text column must have been set for this function to work,
     * see [method@Gtk.EntryCompletion.set_text_column] for details.
     */
    public java.lang.String computePrefix(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_compute_prefix(HANDLE(), Interop.getAllocator().allocateUtf8String(key));
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the original text entered by the user that triggered
     * the completion or %NULL if there’s no completion ongoing.
     */
    public java.lang.String getCompletionPrefix() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_completion_prefix(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the entry @completion has been attached to.
     */
    public Widget getEntry() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_entry(HANDLE());
        return new Widget(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the common prefix of the possible completions should
     * be automatically inserted in the entry.
     */
    public boolean getInlineCompletion() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_inline_completion(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if inline-selection mode is turned on.
     */
    public boolean getInlineSelection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_inline_selection(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the minimum key length as set for @completion.
     */
    public int getMinimumKeyLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_minimum_key_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the model the `GtkEntryCompletion` is using as data source.
     * 
     * Returns %NULL if the model is unset.
     */
    public TreeModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_model(HANDLE());
        return new TreeModel.TreeModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether the completions should be presented in a popup window.
     */
    public boolean getPopupCompletion() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_popup_completion(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the completion popup window will be resized to the
     * width of the entry.
     */
    public boolean getPopupSetWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_popup_set_width(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the completion popup window will appear even if there is
     * only a single match.
     */
    public boolean getPopupSingleMatch() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_popup_single_match(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the column in the model of @completion to get strings from.
     */
    public int getTextColumn() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_get_text_column(HANDLE());
        return RESULT;
    }
    
    /**
     * Requests a prefix insertion.
     */
    public void insertPrefix() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_insert_prefix(HANDLE());
    }
    
    /**
     * Sets whether the common prefix of the possible completions should
     * be automatically inserted in the entry.
     */
    public void setInlineCompletion(boolean inlineCompletion) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_inline_completion(HANDLE(), inlineCompletion ? 1 : 0);
    }
    
    /**
     * Sets whether it is possible to cycle through the possible completions
     * inside the entry.
     */
    public void setInlineSelection(boolean inlineSelection) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_inline_selection(HANDLE(), inlineSelection ? 1 : 0);
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_minimum_key_length(HANDLE(), length);
    }
    
    /**
     * Sets the model for a `GtkEntryCompletion`.
     * 
     * If @completion already has a model set, it will remove it
     * before setting the new model. If model is %NULL, then it
     * will unset the model.
     */
    public void setModel(TreeModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_model(HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets whether the completions should be presented in a popup window.
     */
    public void setPopupCompletion(boolean popupCompletion) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_popup_completion(HANDLE(), popupCompletion ? 1 : 0);
    }
    
    /**
     * Sets whether the completion popup window will be resized to be the same
     * width as the entry.
     */
    public void setPopupSetWidth(boolean popupSetWidth) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_popup_set_width(HANDLE(), popupSetWidth ? 1 : 0);
    }
    
    /**
     * Sets whether the completion popup window will appear even if there is
     * only a single match.
     * 
     * You may want to set this to %FALSE if you
     * are using [property@Gtk.EntryCompletion:inline-completion].
     */
    public void setPopupSingleMatch(boolean popupSingleMatch) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_popup_single_match(HANDLE(), popupSingleMatch ? 1 : 0);
    }
    
    /**
     * Convenience function for setting up the most used case of this code: a
     * completion list with just strings.
     * 
     * This function will set up @completion
     * to have a list displaying all (and just) strings in the completion list,
     * and to get those strings from @column in the model of @completion.
     * 
     * This functions creates and adds a `GtkCellRendererText` for the selected
     * column. If you need to set the text column, but don't want the cell
     * renderer, use g_object_set() to set the
     * [property@Gtk.EntryCompletion:text-column] property directly.
     */
    public void setTextColumn(int column) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_entry_completion_set_text_column(HANDLE(), column);
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
     * [method@Gtk.EntryCompletion.set_model].
     */
    public void onCursorOnMatch(CursorOnMatchHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionCursorOnMatch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("cursor-on-match"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * The default behaviour is to make the entry display the
     * whole prefix and select the newly inserted part.
     * 
     * Applications may connect to this signal in order to insert only a
     * smaller part of the @prefix into the entry - e.g. the entry used in
     * the `GtkFileChooser` inserts only the part of the prefix up to the
     * next '/'.
     */
    public void onInsertPrefix(InsertPrefixHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionInsertPrefix", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("insert-prefix"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * [method@Gtk.EntryCompletion.set_model].
     */
    public void onMatchSelected(MatchSelectedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionMatchSelected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("match-selected"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * 
     * In other words when `GtkEntryCompletion` is out of suggestions.
     */
    public void onNoMatches(NoMatchesHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryCompletionNoMatches", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("no-matches"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
