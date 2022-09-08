package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkEntryBuffer` hold the text displayed in a `GtkText` widget.
 * 
 * A single `GtkEntryBuffer` object can be shared by multiple widgets
 * which will then share the same text content, but not the cursor
 * position, visibility attributes, icon etc.
 * 
 * `GtkEntryBuffer` may be derived from. Such a derived class might allow
 * text to be stored in an alternate location, such as non-pageable memory,
 * useful in the case of important passwords. Or a derived class could
 * integrate with an application’s concept of undo/redo.
 */
public class EntryBuffer extends org.gtk.gobject.Object {

    public EntryBuffer(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EntryBuffer */
    public static EntryBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new EntryBuffer(gobject.getReference());
    }
    
    /**
     * Create a new `GtkEntryBuffer` object.
     * 
     * Optionally, specify initial text to set in the buffer.
     */
    public EntryBuffer(java.lang.String initialChars, int nInitialChars) {
        super(References.get(gtk_h.gtk_entry_buffer_new(Interop.allocateNativeString(initialChars).handle(), nInitialChars), true));
    }
    
    /**
     * Deletes a sequence of characters from the buffer.
     * 
     * @n_chars characters are deleted starting at @position.
     * If @n_chars is negative, then all characters until the
     * end of the text are deleted.
     * 
     * If @position or @n_chars are out of bounds, then they
     * are coerced to sane values.
     * 
     * Note that the positions are specified in characters,
     * not bytes.
     */
    public int deleteText(int position, int nChars) {
        var RESULT = gtk_h.gtk_entry_buffer_delete_text(handle(), position, nChars);
        return RESULT;
    }
    
    /**
     * Used when subclassing `GtkEntryBuffer`.
     */
    public void emitDeletedText(int position, int nChars) {
        gtk_h.gtk_entry_buffer_emit_deleted_text(handle(), position, nChars);
    }
    
    /**
     * Used when subclassing `GtkEntryBuffer`.
     */
    public void emitInsertedText(int position, java.lang.String chars, int nChars) {
        gtk_h.gtk_entry_buffer_emit_inserted_text(handle(), position, Interop.allocateNativeString(chars).handle(), nChars);
    }
    
    /**
     * Retrieves the length in bytes of the buffer.
     * 
     * See [method@Gtk.EntryBuffer.get_length].
     */
    public long getBytes() {
        var RESULT = gtk_h.gtk_entry_buffer_get_bytes(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the length in characters of the buffer.
     */
    public int getLength() {
        var RESULT = gtk_h.gtk_entry_buffer_get_length(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in @buffer.
     */
    public int getMaxLength() {
        var RESULT = gtk_h.gtk_entry_buffer_get_max_length(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the contents of the buffer.
     * 
     * The memory pointer returned by this call will not change
     * unless this object emits a signal, or is finalized.
     */
    public java.lang.String getText() {
        var RESULT = gtk_h.gtk_entry_buffer_get_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts @n_chars characters of @chars into the contents of the
     * buffer, at position @position.
     * 
     * If @n_chars is negative, then characters from chars will be inserted
     * until a null-terminator is found. If @position or @n_chars are out of
     * bounds, or the maximum buffer text length is exceeded, then they are
     * coerced to sane values.
     * 
     * Note that the position and length are in characters, not in bytes.
     */
    public int insertText(int position, java.lang.String chars, int nChars) {
        var RESULT = gtk_h.gtk_entry_buffer_insert_text(handle(), position, Interop.allocateNativeString(chars).handle(), nChars);
        return RESULT;
    }
    
    /**
     * Sets the maximum allowed length of the contents of the buffer.
     * 
     * If the current contents are longer than the given length, then
     * they will be truncated to fit.
     */
    public void setMaxLength(int maxLength) {
        gtk_h.gtk_entry_buffer_set_max_length(handle(), maxLength);
    }
    
    /**
     * Sets the text in the buffer.
     * 
     * This is roughly equivalent to calling
     * [method@Gtk.EntryBuffer.delete_text] and
     * [method@Gtk.EntryBuffer.insert_text].
     * 
     * Note that @n_chars is in characters, not in bytes.
     */
    public void setText(java.lang.String chars, int nChars) {
        gtk_h.gtk_entry_buffer_set_text(handle(), Interop.allocateNativeString(chars).handle(), nChars);
    }
    
    @FunctionalInterface
    public interface DeletedTextHandler {
        void signalReceived(EntryBuffer source, int position, int nChars);
    }
    
    /**
     * The text is altered in the default handler for this signal.
     * 
     * If you want access to the text after the text has been modified,
     * use %G_CONNECT_AFTER.
     */
    public void onDeletedText(DeletedTextHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryBufferDeletedText", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("deleted-text").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertedTextHandler {
        void signalReceived(EntryBuffer source, int position, java.lang.String chars, int nChars);
    }
    
    /**
     * This signal is emitted after text is inserted into the buffer.
     */
    public void onInsertedText(InsertedTextHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEntryBufferInsertedText", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("inserted-text").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
