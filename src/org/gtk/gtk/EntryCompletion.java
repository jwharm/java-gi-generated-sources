package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkEntryCompletion} is an auxiliary object to provide completion functionality
 * for {@code GtkEntry}.
 * <p>
 * It implements the {@code Gtk.CellLayout} interface, to allow the user
 * to add extra cells to the {@code GtkTreeView} with completion matches.
 * <p>
 * “Completion functionality” means that when the user modifies the text
 * in the entry, {@code GtkEntryCompletion} checks which rows in the model match
 * the current content of the entry, and displays a list of matches.
 * By default, the matching is done by comparing the entry text
 * case-insensitively against the text column of the model (see
 * {@link EntryCompletion#setTextColumn}), but this can be overridden
 * with a custom match function (see {@link EntryCompletion#setMatchFunc}).
 * <p>
 * When the user selects a completion, the content of the entry is
 * updated. By default, the content of the entry is replaced by the
 * text column of the model, but this can be overridden by connecting
 * to the {@code Gtk.EntryCompletion::match-selected} signal and updating the
 * entry in the signal handler. Note that you should return {@code true} from
 * the signal handler to suppress the default behaviour.
 * <p>
 * To add completion functionality to an entry, use
 * {@link Entry#setCompletion}.
 * <p>
 * {@code GtkEntryCompletion} uses a {@link TreeModelFilter} model to
 * represent the subset of the entire model that is currently matching.
 * While the {@code GtkEntryCompletion} signals
 * {@code Gtk.EntryCompletion::match-selected} and
 * {@code Gtk.EntryCompletion::cursor-on-match} take the original model
 * and an iter pointing to that model as arguments, other callbacks and
 * signals (such as {@code GtkCellLayoutDataFunc} or
 * {@code Gtk.CellArea::apply-attributes)}
 * will generally take the filter model as argument. As long as you are
 * only calling {@link TreeModel#get}, this will make no difference to
 * you. If for some reason, you need the original model, use
 * {@link TreeModelFilter#getModel}. Don’t forget to use
 * {@link TreeModelFilter#convertIterToChildIter} to obtain a
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
     * Creates a new {@code GtkEntryCompletion} object.
     */
    public EntryCompletion() {
        super(constructNew());
    }
    
    private static Reference constructNewWithArea(CellArea area) {
        Reference RESULT = References.get(gtk_h.gtk_entry_completion_new_with_area(area.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEntryCompletion} object using the
     * specified {@code area}.
     * <p>
     * The {@code GtkCellArea} is used to layout cells in the underlying
     * {@code GtkTreeViewColumn} for the drop-down menu.
     */
    public static EntryCompletion newWithArea(CellArea area) {
        return new EntryCompletion(constructNewWithArea(area));
    }
    
    /**
     * Requests a completion operation, or in other words a refiltering of the
     * current list with completions, using the current key.
     * <p>
     * The completion list view will be updated accordingly.
     */
    public void complete() {
        gtk_h.gtk_entry_completion_complete(handle());
    }
    
    /**
     * Computes the common prefix that is shared by all rows in {@code completion}
     * that start with {@code key}.
     * <p>
     * If no row matches {@code key}, {@code null} will be returned.
     * Note that a text column must have been set for this function to work,
     * see {@link EntryCompletion#setTextColumn} for details.
     */
    public java.lang.String computePrefix(java.lang.String key) {
        var RESULT = gtk_h.gtk_entry_completion_compute_prefix(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the original text entered by the user that triggered
     * the completion or {@code null} if there’s no completion ongoing.
     */
    public java.lang.String getCompletionPrefix() {
        var RESULT = gtk_h.gtk_entry_completion_get_completion_prefix(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the entry {@code completion} has been attached to.
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
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if inline-selection mode is turned on.
     */
    public boolean getInlineSelection() {
        var RESULT = gtk_h.gtk_entry_completion_get_inline_selection(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the minimum key length as set for {@code completion}.
     */
    public int getMinimumKeyLength() {
        var RESULT = gtk_h.gtk_entry_completion_get_minimum_key_length(handle());
        return RESULT;
    }
    
    /**
     * Returns the model the {@code GtkEntryCompletion} is using as data source.
     * <p>
     * Returns {@code null} if the model is unset.
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
        return RESULT != 0;
    }
    
    /**
     * Returns whether the completion popup window will be resized to the
     * width of the entry.
     */
    public boolean getPopupSetWidth() {
        var RESULT = gtk_h.gtk_entry_completion_get_popup_set_width(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the completion popup window will appear even if there is
     * only a single match.
     */
    public boolean getPopupSingleMatch() {
        var RESULT = gtk_h.gtk_entry_completion_get_popup_single_match(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the column in the model of {@code completion} to get strings from.
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
     * Sets the match function for {@code completion} to be {@code func}.
     * <p>
     * The match function is used to determine if a row should or
     * should not be in the completion list.
     */
    public void setMatchFunc(EntryCompletionMatchFunc func) {
        try {
            gtk_h.gtk_entry_completion_set_match_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbEntryCompletionMatchFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Requires the length of the search key for {@code completion} to be at least
     * {@code length}.
     * <p>
     * This is useful for long lists, where completing using a small
     * key takes a lot of time and will come up with meaningless results anyway
     * (ie, a too large dataset).
     */
    public void setMinimumKeyLength(int length) {
        gtk_h.gtk_entry_completion_set_minimum_key_length(handle(), length);
    }
    
    /**
     * Sets the model for a {@code GtkEntryCompletion}.
     * <p>
     * If {@code completion} already has a model set, it will remove it
     * before setting the new model. If model is {@code null}, then it
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
     * <p>
     * You may want to set this to {@code false} if you
     * are using {@code Gtk.EntryCompletion:inline-completion}.
     */
    public void setPopupSingleMatch(boolean popupSingleMatch) {
        gtk_h.gtk_entry_completion_set_popup_single_match(handle(), popupSingleMatch ? 1 : 0);
    }
    
    /**
     * Convenience function for setting up the most used case of this code: a
     * completion list with just strings.
     * <p>
     * This function will set up {@code completion}
     * to have a list displaying all (and just) strings in the completion list,
     * and to get those strings from {@code column} in the model of {@code completion}.
     * <p>
     * This functions creates and adds a {@code GtkCellRendererText} for the selected
     * column. If you need to set the text column, but don't want the cell
     * renderer, use g_object_set() to set the
     * {@code Gtk.EntryCompletion:text-column} property directly.
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
     * <p>
     * The default behaviour is to replace the contents
     * of the entry with the contents of the text column in the row
     * pointed to by {@code iter}.
     * <p>
     * Note that {@code model} is the model that was passed to
     * {@link EntryCompletion#setModel}.
     */
    public SignalHandle onCursorOnMatch(CursorOnMatchHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("cursor-on-match").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.class, "__signalEntryCompletionCursorOnMatch",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalEntryCompletionCursorOnMatch(MemoryAddress source, MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (EntryCompletion.CursorOnMatchHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(References.get(source)), new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
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
     * smaller part of the {@code prefix} into the entry - e.g. the entry used in
     * the {@code GtkFileChooser} inserts only the part of the prefix up to the
     * next '/'.
     */
    public SignalHandle onInsertPrefix(InsertPrefixHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("insert-prefix").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.class, "__signalEntryCompletionInsertPrefix",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalEntryCompletionInsertPrefix(MemoryAddress source, MemoryAddress prefix, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (EntryCompletion.InsertPrefixHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(References.get(source)), prefix.getUtf8String(0));
    }
    
    @FunctionalInterface
    public interface MatchSelectedHandler {
        boolean signalReceived(EntryCompletion source, TreeModel model, TreeIter iter);
    }
    
    /**
     * Emitted when a match from the list is selected.
     * <p>
     * The default behaviour is to replace the contents of the
     * entry with the contents of the text column in the row
     * pointed to by {@code iter}.
     * <p>
     * Note that {@code model} is the model that was passed to
     * {@link EntryCompletion#setModel}.
     */
    public SignalHandle onMatchSelected(MatchSelectedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("match-selected").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.class, "__signalEntryCompletionMatchSelected",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalEntryCompletionMatchSelected(MemoryAddress source, MemoryAddress model, MemoryAddress iter, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (EntryCompletion.MatchSelectedHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new EntryCompletion(References.get(source)), new TreeModel.TreeModelImpl(References.get(model, false)), new TreeIter(References.get(iter, false)));
    }
    
    @FunctionalInterface
    public interface NoMatchesHandler {
        void signalReceived(EntryCompletion source);
    }
    
    /**
     * Emitted when the filter model has zero
     * number of rows in completion_complete method.
     * <p>
     * In other words when {@code GtkEntryCompletion} is out of suggestions.
     */
    public SignalHandle onNoMatches(NoMatchesHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("no-matches").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.class, "__signalEntryCompletionNoMatches",
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
    
    public static void __signalEntryCompletionNoMatches(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (EntryCompletion.NoMatchesHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EntryCompletion(References.get(source)));
    }
    
}
