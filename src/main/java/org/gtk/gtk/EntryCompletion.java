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
public class EntryCompletion extends org.gtk.gobject.GObject implements org.gtk.gtk.Buildable, org.gtk.gtk.CellLayout {
    
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
     */
    protected EntryCompletion(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EntryCompletion> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EntryCompletion(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithArea(org.gtk.gtk.CellArea area) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_new_with_area.invokeExact(area.handle());
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
    public static EntryCompletion newWithArea(org.gtk.gtk.CellArea area) {
        var RESULT = constructNewWithArea(area);
        var OBJECT = (org.gtk.gtk.EntryCompletion) Interop.register(RESULT, org.gtk.gtk.EntryCompletion.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Requests a completion operation, or in other words a refiltering of the
     * current list with completions, using the current key.
     * <p>
     * The completion list view will be updated accordingly.
     */
    public void complete() {
        try {
            DowncallHandles.gtk_entry_completion_complete.invokeExact(handle());
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
    public @Nullable java.lang.String computePrefix(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_compute_prefix.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Get the original text entered by the user that triggered
     * the completion or {@code null} if there’s no completion ongoing.
     * @return the prefix for the current completion
     */
    public @Nullable java.lang.String getCompletionPrefix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_get_completion_prefix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the entry {@code completion} has been attached to.
     * @return The entry {@code completion} has been attached to
     */
    public org.gtk.gtk.Widget getEntry() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_get_entry.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether the common prefix of the possible completions should
     * be automatically inserted in the entry.
     * @return {@code true} if inline completion is turned on
     */
    public boolean getInlineCompletion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_inline_completion.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if inline-selection mode is turned on.
     * @return {@code true} if inline-selection mode is on
     */
    public boolean getInlineSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_inline_selection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the minimum key length as set for {@code completion}.
     * @return The currently used minimum key length
     */
    public int getMinimumKeyLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_minimum_key_length.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_completion_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeModel) Interop.register(RESULT, org.gtk.gtk.TreeModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns whether the completions should be presented in a popup window.
     * @return {@code true} if popup completion is turned on
     */
    public boolean getPopupCompletion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_popup_completion.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_popup_set_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_popup_single_match.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the column in the model of {@code completion} to get strings from.
     * @return the column containing the strings
     */
    public int getTextColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_completion_get_text_column.invokeExact(handle());
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
            DowncallHandles.gtk_entry_completion_insert_prefix.invokeExact(handle());
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
                    Marshal.booleanToInteger.marshal(inlineCompletion, null).intValue());
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
                    Marshal.booleanToInteger.marshal(inlineSelection, null).intValue());
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
     * @param funcNotify destroy notify for {@code func_data}.
     */
    public void setMatchFunc(org.gtk.gtk.EntryCompletionMatchFunc func, org.gtk.glib.DestroyNotify funcNotify) {
        try {
            DowncallHandles.gtk_entry_completion_set_match_func.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) funcNotify.toCallback());
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
                    Marshal.booleanToInteger.marshal(popupCompletion, null).intValue());
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
                    Marshal.booleanToInteger.marshal(popupSetWidth, null).intValue());
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
                    Marshal.booleanToInteger.marshal(popupSingleMatch, null).intValue());
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_entry_completion_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code CursorOnMatch} callback.
     */
    @FunctionalInterface
    public interface CursorOnMatch {
    
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
        boolean run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceEntryCompletion, MemoryAddress model, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CursorOnMatch.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cursor-on-match", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertPrefix} callback.
     */
    @FunctionalInterface
    public interface InsertPrefix {
    
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
        boolean run(java.lang.String prefix);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceEntryCompletion, MemoryAddress prefix) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(Marshal.addressToString.marshal(prefix, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertPrefix.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("insert-prefix", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MatchSelected} callback.
     */
    @FunctionalInterface
    public interface MatchSelected {
    
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
        boolean run(org.gtk.gtk.TreeModel model, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceEntryCompletion, MemoryAddress model, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModel) Interop.register(model, org.gtk.gtk.TreeModel.fromAddress).marshal(model, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MatchSelected.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("match-selected", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code NoMatches} callback.
     */
    @FunctionalInterface
    public interface NoMatches {
    
        /**
         * Emitted when the filter model has zero
         * number of rows in completion_complete method.
         * <p>
         * In other words when {@code GtkEntryCompletion} is out of suggestions.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEntryCompletion) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NoMatches.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("no-matches", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link EntryCompletion.Builder} object constructs a {@link EntryCompletion} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EntryCompletion.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EntryCompletion} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EntryCompletion}.
         * @return A new instance of {@code EntryCompletion} with the properties 
         *         that were set in the Builder object.
         */
        public EntryCompletion build() {
            return (EntryCompletion) org.gtk.gobject.GObject.newWithProperties(
                EntryCompletion.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setCellArea(org.gtk.gtk.CellArea cellArea) {
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
        public Builder setInlineCompletion(boolean inlineCompletion) {
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
        public Builder setInlineSelection(boolean inlineSelection) {
            names.add("inline-selection");
            values.add(org.gtk.gobject.Value.create(inlineSelection));
            return this;
        }
        
        public Builder setMinimumKeyLength(int minimumKeyLength) {
            names.add("minimum-key-length");
            values.add(org.gtk.gobject.Value.create(minimumKeyLength));
            return this;
        }
        
        public Builder setModel(org.gtk.gtk.TreeModel model) {
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
        public Builder setPopupCompletion(boolean popupCompletion) {
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
        public Builder setPopupSetWidth(boolean popupSetWidth) {
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
        public Builder setPopupSingleMatch(boolean popupSingleMatch) {
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
        public Builder setTextColumn(int textColumn) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_entry_completion_get_type != null;
    }
}
