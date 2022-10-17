package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkEntryBuffer} hold the text displayed in a {@code GtkText} widget.
 * <p>
 * A single {@code GtkEntryBuffer} object can be shared by multiple widgets
 * which will then share the same text content, but not the cursor
 * position, visibility attributes, icon etc.
 * <p>
 * {@code GtkEntryBuffer} may be derived from. Such a derived class might allow
 * text to be stored in an alternate location, such as non-pageable memory,
 * useful in the case of important passwords. Or a derived class could
 * integrate with an application’s concept of undo/redo.
 */
public class EntryBuffer extends org.gtk.gobject.Object {

    public EntryBuffer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EntryBuffer */
    public static EntryBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new EntryBuffer(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_entry_buffer_new = Interop.downcallHandle(
        "gtk_entry_buffer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String initialChars, @NotNull int nInitialChars) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_entry_buffer_new.invokeExact(Interop.allocateNativeString(initialChars), nInitialChars), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@code GtkEntryBuffer} object.
     * <p>
     * Optionally, specify initial text to set in the buffer.
     */
    public EntryBuffer(@Nullable java.lang.String initialChars, @NotNull int nInitialChars) {
        super(constructNew(initialChars, nInitialChars));
    }
    
    private static final MethodHandle gtk_entry_buffer_delete_text = Interop.downcallHandle(
        "gtk_entry_buffer_delete_text",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deletes a sequence of characters from the buffer.
     * <p>
     * {@code n_chars} characters are deleted starting at {@code position}.
     * If {@code n_chars} is negative, then all characters until the
     * end of the text are deleted.
     * <p>
     * If {@code position} or {@code n_chars} are out of bounds, then they
     * are coerced to sane values.
     * <p>
     * Note that the positions are specified in characters,
     * not bytes.
     */
    public int deleteText(@NotNull int position, @NotNull int nChars) {
        int RESULT;
        try {
            RESULT = (int) gtk_entry_buffer_delete_text.invokeExact(handle(), position, nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_entry_buffer_emit_deleted_text = Interop.downcallHandle(
        "gtk_entry_buffer_emit_deleted_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Used when subclassing {@code GtkEntryBuffer}.
     */
    public @NotNull void emitDeletedText(@NotNull int position, @NotNull int nChars) {
        try {
            gtk_entry_buffer_emit_deleted_text.invokeExact(handle(), position, nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_entry_buffer_emit_inserted_text = Interop.downcallHandle(
        "gtk_entry_buffer_emit_inserted_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Used when subclassing {@code GtkEntryBuffer}.
     */
    public @NotNull void emitInsertedText(@NotNull int position, @NotNull java.lang.String chars, @NotNull int nChars) {
        try {
            gtk_entry_buffer_emit_inserted_text.invokeExact(handle(), position, Interop.allocateNativeString(chars), nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_entry_buffer_get_bytes = Interop.downcallHandle(
        "gtk_entry_buffer_get_bytes",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the length in bytes of the buffer.
     * <p>
     * See {@link EntryBuffer#getLength}.
     */
    public long getBytes() {
        long RESULT;
        try {
            RESULT = (long) gtk_entry_buffer_get_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_entry_buffer_get_length = Interop.downcallHandle(
        "gtk_entry_buffer_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the length in characters of the buffer.
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) gtk_entry_buffer_get_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_entry_buffer_get_max_length = Interop.downcallHandle(
        "gtk_entry_buffer_get_max_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the maximum allowed length of the text in {@code buffer}.
     */
    public int getMaxLength() {
        int RESULT;
        try {
            RESULT = (int) gtk_entry_buffer_get_max_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_entry_buffer_get_text = Interop.downcallHandle(
        "gtk_entry_buffer_get_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the contents of the buffer.
     * <p>
     * The memory pointer returned by this call will not change
     * unless this object emits a signal, or is finalized.
     */
    public @NotNull java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_entry_buffer_get_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_entry_buffer_insert_text = Interop.downcallHandle(
        "gtk_entry_buffer_insert_text",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts {@code n_chars} characters of {@code chars} into the contents of the
     * buffer, at position {@code position}.
     * <p>
     * If {@code n_chars} is negative, then characters from chars will be inserted
     * until a null-terminator is found. If {@code position} or {@code n_chars} are out of
     * bounds, or the maximum buffer text length is exceeded, then they are
     * coerced to sane values.
     * <p>
     * Note that the position and length are in characters, not in bytes.
     */
    public int insertText(@NotNull int position, @NotNull java.lang.String chars, @NotNull int nChars) {
        int RESULT;
        try {
            RESULT = (int) gtk_entry_buffer_insert_text.invokeExact(handle(), position, Interop.allocateNativeString(chars), nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_entry_buffer_set_max_length = Interop.downcallHandle(
        "gtk_entry_buffer_set_max_length",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum allowed length of the contents of the buffer.
     * <p>
     * If the current contents are longer than the given length, then
     * they will be truncated to fit.
     */
    public @NotNull void setMaxLength(@NotNull int maxLength) {
        try {
            gtk_entry_buffer_set_max_length.invokeExact(handle(), maxLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_entry_buffer_set_text = Interop.downcallHandle(
        "gtk_entry_buffer_set_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the text in the buffer.
     * <p>
     * This is roughly equivalent to calling
     * {@link EntryBuffer#deleteText} and
     * {@link EntryBuffer#insertText}.
     * <p>
     * Note that {@code n_chars} is in characters, not in bytes.
     */
    public @NotNull void setText(@NotNull java.lang.String chars, @NotNull int nChars) {
        try {
            gtk_entry_buffer_set_text.invokeExact(handle(), Interop.allocateNativeString(chars), nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeletedTextHandler {
        void signalReceived(EntryBuffer source, @NotNull int position, @NotNull int nChars);
    }
    
    /**
     * The text is altered in the default handler for this signal.
     * <p>
     * If you want access to the text after the text has been modified,
     * use {@link org.gtk.gobject.ConnectFlags#AFTER}.
     */
    public SignalHandle onDeletedText(DeletedTextHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("deleted-text"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryBuffer.Callbacks.class, "signalEntryBufferDeletedText",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertedTextHandler {
        void signalReceived(EntryBuffer source, @NotNull int position, @NotNull java.lang.String chars, @NotNull int nChars);
    }
    
    /**
     * This signal is emitted after text is inserted into the buffer.
     */
    public SignalHandle onInsertedText(InsertedTextHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("inserted-text"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryBuffer.Callbacks.class, "signalEntryBufferInsertedText",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEntryBufferDeletedText(MemoryAddress source, int position, int nChars, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EntryBuffer.DeletedTextHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EntryBuffer(Refcounted.get(source)), position, nChars);
        }
        
        public static void signalEntryBufferInsertedText(MemoryAddress source, int position, MemoryAddress chars, int nChars, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EntryBuffer.InsertedTextHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EntryBuffer(Refcounted.get(source)), position, chars.getUtf8String(0), nChars);
        }
        
    }
}
