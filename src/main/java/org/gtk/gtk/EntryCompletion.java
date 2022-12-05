package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class EntryCompletion extends org.gtk.gobject.Object implements org.gtk.gtk.Buildable, org.gtk.gtk.CellLayout {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEntryCompletion";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EntryCompletion proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EntryCompletion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EntryCompletion if its GType is a (or inherits from) "GtkEntryCompletion".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EntryCompletion} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEntryCompletion", a ClassCastException will be thrown.
     */
    public static EntryCompletion castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EntryCompletion.getType())) {
            return new EntryCompletion(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEntryCompletion");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEntryCompletion} object.
     */
    public EntryCompletion() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewWithArea(@NotNull org.gtk.gtk.CellArea area) {
        java.util.Objects.requireNonNull(area, "Parameter 'area' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_new_with_area.invokeExact(
                    area.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkEntryCompletion} object using the
     * specified {@code area}.
     * <p>
     * The {@code GtkCellArea} is used to layout cells in the underlying
     * {@code GtkTreeViewColumn} for the drop-down menu.
     * @param area the {@code GtkCellArea} used to layout cells
     * @return A newly created {@code GtkEntryCompletion} object
     */
    public static EntryCompletion newWithArea(@NotNull org.gtk.gtk.CellArea area) {
        return new EntryCompletion(constructNewWithArea(area), Ownership.FULL);
    }
    
    /**
     * Requests a completion operation, or in other words a refiltering of the
     * current list with completions, using the current key.
     * <p>
     * The completion list view will be updated accordingly.
     */
    public void complete() {
        try {
            DowncallHandles.gtk_entry_completion_complete.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the common prefix that is shared by all rows in {@code completion}
     * that start with {@code key}.
     * <p>
     * If no row matches {@code key}, {@code null} will be returned.
     * Note that a text column must have been set for this function to work,
     * see {@link EntryCompletion#setTextColumn} for details.
     * @param key The text to complete for
     * @return The common prefix all rows
     *   starting with {@code key}
     */
    public @Nullable java.lang.String computePrefix(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_compute_prefix.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the original text entered by the user that triggered
     * the completion or {@code null} if there’s no completion ongoing.
     * @return the prefix for the current completion
     */
    public @Nullable java.lang.String getCompletionPrefix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_get_completion_prefix.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the entry {@code completion} has been attached to.
     * @return The entry {@code completion} has been attached to
     */
    public @NotNull org.gtk.gtk.Widget getEntry() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_get_entry.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the common prefix of the possible completions should
     * be automatically inserted in the entry.
     * @return {@code true} if inline completion is turned on
     */
    public boolean getInlineCompletion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_inline_completion.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if inline-selection mode is turned on.
     * @return {@code true} if inline-selection mode is on
     */
    public boolean getInlineSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_inline_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the minimum key length as set for {@code completion}.
     * @return The currently used minimum key length
     */
    public int getMinimumKeyLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_minimum_key_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the model the {@code GtkEntryCompletion} is using as data source.
     * <p>
     * Returns {@code null} if the model is unset.
     * @return A {@code GtkTreeModel}
     */
    public @Nullable org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeModel.TreeModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the completions should be presented in a popup window.
     * @return {@code true} if popup completion is turned on
     */
    public boolean getPopupCompletion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_popup_completion.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the completion popup window will be resized to the
     * width of the entry.
     * @return {@code true} if the popup window will be resized to the width of
     *   the entry
     */
    public boolean getPopupSetWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_popup_set_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the completion popup window will appear even if there is
     * only a single match.
     * @return {@code true} if the popup window will appear regardless of the
     *    number of matches
     */
    public boolean getPopupSingleMatch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_popup_single_match.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the column in the model of {@code completion} to get strings from.
     * @return the column containing the strings
     */
    public int getTextColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_text_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Requests a prefix insertion.
     */
    public void insertPrefix() {
        try {
            DowncallHandles.gtk_entry_completion_insert_prefix.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the common prefix of the possible completions should
     * be automatically inserted in the entry.
     * @param inlineCompletion {@code true} to do inline completion
     */
    public void setInlineCompletion(boolean inlineCompletion) {
        try {
            DowncallHandles.gtk_entry_completion_set_inline_completion.invokeExact(
                    handle(),
                    inlineCompletion ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether it is possible to cycle through the possible completions
     * inside the entry.
     * @param inlineSelection {@code true} to do inline selection
     */
    public void setInlineSelection(boolean inlineSelection) {
        try {
            DowncallHandles.gtk_entry_completion_set_inline_selection.invokeExact(
                    handle(),
                    inlineSelection ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the match function for {@code completion} to be {@code func}.
     * <p>
     * The match function is used to determine if a row should or
     * should not be in the completion list.
     * @param func the {@code GtkEntryCompletion}MatchFunc to use
     */
    public void setMatchFunc(@NotNull org.gtk.gtk.EntryCompletionMatchFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_entry_completion_set_match_func.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbEntryCompletionMatchFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Requires the length of the search key for {@code completion} to be at least
     * {@code length}.
     * <p>
     * This is useful for long lists, where completing using a small
     * key takes a lot of time and will come up with meaningless results anyway
     * (ie, a too large dataset).
     * @param length the minimum length of the key in order to start completing
     */
    public void setMinimumKeyLength(int length) {
        try {
            DowncallHandles.gtk_entry_completion_set_minimum_key_length.invokeExact(
                    handle(),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model for a {@code GtkEntryCompletion}.
     * <p>
     * If {@code completion} already has a model set, it will remove it
     * before setting the new model. If model is {@code null}, then it
     * will unset the model.
     * @param model the {@code GtkTreeModel}
     */
    public void setModel(@Nullable org.gtk.gtk.TreeModel model) {
        try {
            DowncallHandles.gtk_entry_completion_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the completions should be presented in a popup window.
     * @param popupCompletion {@code true} to do popup completion
     */
    public void setPopupCompletion(boolean popupCompletion) {
        try {
            DowncallHandles.gtk_entry_completion_set_popup_completion.invokeExact(
                    handle(),
                    popupCompletion ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the completion popup window will be resized to be the same
     * width as the entry.
     * @param popupSetWidth {@code true} to make the width of the popup the same as the entry
     */
    public void setPopupSetWidth(boolean popupSetWidth) {
        try {
            DowncallHandles.gtk_entry_completion_set_popup_set_width.invokeExact(
                    handle(),
                    popupSetWidth ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the completion popup window will appear even if there is
     * only a single match.
     * <p>
     * You may want to set this to {@code false} if you
     * are using {@code Gtk.EntryCompletion:inline-completion}.
     * @param popupSingleMatch {@code true} if the popup should appear even for a single match
     */
    public void setPopupSingleMatch(boolean popupSingleMatch) {
        try {
            DowncallHandles.gtk_entry_completion_set_popup_single_match.invokeExact(
                    handle(),
                    popupSingleMatch ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param column the column in the model of {@code completion} to get strings from
     */
    public void setTextColumn(int column) {
        try {
            DowncallHandles.gtk_entry_completion_set_text_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_entry_completion_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface CursorOnMatch {
        boolean signalReceived(EntryCompletion sourceEntryCompletion, @NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreeIter iter);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryCompletion.CursorOnMatch> onCursorOnMatch(EntryCompletion.CursorOnMatch handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cursor-on-match"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.Callbacks.class, "signalEntryCompletionCursorOnMatch",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryCompletion.CursorOnMatch>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertPrefix {
        boolean signalReceived(EntryCompletion sourceEntryCompletion, @NotNull java.lang.String prefix);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryCompletion.InsertPrefix> onInsertPrefix(EntryCompletion.InsertPrefix handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-prefix"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.Callbacks.class, "signalEntryCompletionInsertPrefix",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryCompletion.InsertPrefix>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MatchSelected {
        boolean signalReceived(EntryCompletion sourceEntryCompletion, @NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreeIter iter);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryCompletion.MatchSelected> onMatchSelected(EntryCompletion.MatchSelected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("match-selected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.Callbacks.class, "signalEntryCompletionMatchSelected",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryCompletion.MatchSelected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface NoMatches {
        void signalReceived(EntryCompletion sourceEntryCompletion);
    }
    
    /**
     * Emitted when the filter model has zero
     * number of rows in completion_complete method.
     * <p>
     * In other words when {@code GtkEntryCompletion} is out of suggestions.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryCompletion.NoMatches> onNoMatches(EntryCompletion.NoMatches handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("no-matches"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryCompletion.Callbacks.class, "signalEntryCompletionNoMatches",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryCompletion.NoMatches>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link EntryCompletion.Build} object constructs a {@link EntryCompletion} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EntryCompletion} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EntryCompletion} using {@link EntryCompletion#castFrom}.
         * @return A new instance of {@code EntryCompletion} with the properties 
         *         that were set in the Build object.
         */
        public EntryCompletion construct() {
            return EntryCompletion.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EntryCompletion.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The {@code GtkCellArea} used to layout cell renderers in the treeview column.
         * <p>
         * If no area is specified when creating the entry completion with
         * {@link EntryCompletion#newWithArea}, a horizontally oriented
         * {@link CellAreaBox} will be used.
         * @param cellArea The value for the {@code cell-area} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCellArea(org.gtk.gtk.CellArea cellArea) {
            names.add("cell-area");
            values.add(org.gtk.gobject.Value.create(cellArea));
            return this;
        }
        
        /**
         * Determines whether the common prefix of the possible completions
         * should be inserted automatically in the entry.
         * <p>
         * Note that this requires text-column to be set, even if you are
         * using a custom match function.
         * @param inlineCompletion The value for the {@code inline-completion} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInlineCompletion(boolean inlineCompletion) {
            names.add("inline-completion");
            values.add(org.gtk.gobject.Value.create(inlineCompletion));
            return this;
        }
        
        /**
         * Determines whether the possible completions on the popup
         * will appear in the entry as you navigate through them.
         * @param inlineSelection The value for the {@code inline-selection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInlineSelection(boolean inlineSelection) {
            names.add("inline-selection");
            values.add(org.gtk.gobject.Value.create(inlineSelection));
            return this;
        }
        
        public Build setMinimumKeyLength(int minimumKeyLength) {
            names.add("minimum-key-length");
            values.add(org.gtk.gobject.Value.create(minimumKeyLength));
            return this;
        }
        
        public Build setModel(org.gtk.gtk.TreeModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * Determines whether the possible completions should be
         * shown in a popup window.
         * @param popupCompletion The value for the {@code popup-completion} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPopupCompletion(boolean popupCompletion) {
            names.add("popup-completion");
            values.add(org.gtk.gobject.Value.create(popupCompletion));
            return this;
        }
        
        /**
         * Determines whether the completions popup window will be
         * resized to the width of the entry.
         * @param popupSetWidth The value for the {@code popup-set-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPopupSetWidth(boolean popupSetWidth) {
            names.add("popup-set-width");
            values.add(org.gtk.gobject.Value.create(popupSetWidth));
            return this;
        }
        
        /**
         * Determines whether the completions popup window will shown
         * for a single possible completion.
         * <p>
         * You probably want to set this to {@code false} if you are using
         * {@code Gtk.EntryCompletion:inline-completion}.
         * @param popupSingleMatch The value for the {@code popup-single-match} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPopupSingleMatch(boolean popupSingleMatch) {
            names.add("popup-single-match");
            values.add(org.gtk.gobject.Value.create(popupSingleMatch));
            return this;
        }
        
        /**
         * The column of the model containing the strings.
         * <p>
         * Note that the strings must be UTF-8.
         * @param textColumn The value for the {@code text-column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTextColumn(int textColumn) {
            names.add("text-column");
            values.add(org.gtk.gobject.Value.create(textColumn));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_entry_completion_new = Interop.downcallHandle(
            "gtk_entry_completion_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_new_with_area = Interop.downcallHandle(
            "gtk_entry_completion_new_with_area",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_complete = Interop.downcallHandle(
            "gtk_entry_completion_complete",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_compute_prefix = Interop.downcallHandle(
            "gtk_entry_completion_compute_prefix",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_completion_prefix = Interop.downcallHandle(
            "gtk_entry_completion_get_completion_prefix",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_entry = Interop.downcallHandle(
            "gtk_entry_completion_get_entry",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_inline_completion = Interop.downcallHandle(
            "gtk_entry_completion_get_inline_completion",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_inline_selection = Interop.downcallHandle(
            "gtk_entry_completion_get_inline_selection",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_minimum_key_length = Interop.downcallHandle(
            "gtk_entry_completion_get_minimum_key_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_model = Interop.downcallHandle(
            "gtk_entry_completion_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_popup_completion = Interop.downcallHandle(
            "gtk_entry_completion_get_popup_completion",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_popup_set_width = Interop.downcallHandle(
            "gtk_entry_completion_get_popup_set_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_popup_single_match = Interop.downcallHandle(
            "gtk_entry_completion_get_popup_single_match",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_text_column = Interop.downcallHandle(
            "gtk_entry_completion_get_text_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_insert_prefix = Interop.downcallHandle(
            "gtk_entry_completion_insert_prefix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_inline_completion = Interop.downcallHandle(
            "gtk_entry_completion_set_inline_completion",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_inline_selection = Interop.downcallHandle(
            "gtk_entry_completion_set_inline_selection",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_match_func = Interop.downcallHandle(
            "gtk_entry_completion_set_match_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_minimum_key_length = Interop.downcallHandle(
            "gtk_entry_completion_set_minimum_key_length",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_model = Interop.downcallHandle(
            "gtk_entry_completion_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_popup_completion = Interop.downcallHandle(
            "gtk_entry_completion_set_popup_completion",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_popup_set_width = Interop.downcallHandle(
            "gtk_entry_completion_set_popup_set_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_popup_single_match = Interop.downcallHandle(
            "gtk_entry_completion_set_popup_single_match",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_set_text_column = Interop.downcallHandle(
            "gtk_entry_completion_set_text_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_completion_get_type = Interop.downcallHandle(
            "gtk_entry_completion_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalEntryCompletionCursorOnMatch(MemoryAddress sourceEntryCompletion, MemoryAddress model, MemoryAddress iter, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EntryCompletion.CursorOnMatch) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EntryCompletion(sourceEntryCompletion, Ownership.NONE), new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static boolean signalEntryCompletionInsertPrefix(MemoryAddress sourceEntryCompletion, MemoryAddress prefix, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EntryCompletion.InsertPrefix) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EntryCompletion(sourceEntryCompletion, Ownership.NONE), Interop.getStringFrom(prefix));
        }
        
        public static boolean signalEntryCompletionMatchSelected(MemoryAddress sourceEntryCompletion, MemoryAddress model, MemoryAddress iter, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EntryCompletion.MatchSelected) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EntryCompletion(sourceEntryCompletion, Ownership.NONE), new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE));
        }
        
        public static void signalEntryCompletionNoMatches(MemoryAddress sourceEntryCompletion, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EntryCompletion.NoMatches) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EntryCompletion(sourceEntryCompletion, Ownership.NONE));
        }
    }
}
