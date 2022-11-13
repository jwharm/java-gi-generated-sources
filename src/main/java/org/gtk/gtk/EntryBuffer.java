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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEntryBuffer";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a EntryBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EntryBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EntryBuffer if its GType is a (or inherits from) "GtkEntryBuffer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EntryBuffer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEntryBuffer", a ClassCastException will be thrown.
     */
    public static EntryBuffer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkEntryBuffer"))) {
            return new EntryBuffer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEntryBuffer");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String initialChars, int nInitialChars) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_buffer_new.invokeExact(
                    (Addressable) (initialChars == null ? MemoryAddress.NULL : Interop.allocateNativeString(initialChars)),
                    nInitialChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code GtkEntryBuffer} object.
     * <p>
     * Optionally, specify initial text to set in the buffer.
     * @param initialChars initial buffer text
     * @param nInitialChars number of characters in {@code initial_chars}, or -1
     */
    public EntryBuffer(@Nullable java.lang.String initialChars, int nInitialChars) {
        super(constructNew(initialChars, nInitialChars), Ownership.FULL);
    }
    
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
     * @param position position at which to delete text
     * @param nChars number of characters to delete
     * @return The number of characters deleted.
     */
    public int deleteText(int position, int nChars) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_buffer_delete_text.invokeExact(
                    handle(),
                    position,
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Used when subclassing {@code GtkEntryBuffer}.
     * @param position position at which text was deleted
     * @param nChars number of characters deleted
     */
    public void emitDeletedText(int position, int nChars) {
        try {
            DowncallHandles.gtk_entry_buffer_emit_deleted_text.invokeExact(
                    handle(),
                    position,
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Used when subclassing {@code GtkEntryBuffer}.
     * @param position position at which text was inserted
     * @param chars text that was inserted
     * @param nChars number of characters inserted
     */
    public void emitInsertedText(int position, @NotNull java.lang.String chars, int nChars) {
        java.util.Objects.requireNonNull(chars, "Parameter 'chars' must not be null");
        try {
            DowncallHandles.gtk_entry_buffer_emit_inserted_text.invokeExact(
                    handle(),
                    position,
                    Interop.allocateNativeString(chars),
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the length in bytes of the buffer.
     * <p>
     * See {@link EntryBuffer#getLength}.
     * @return The byte length of the buffer.
     */
    public long getBytes() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_entry_buffer_get_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the length in characters of the buffer.
     * @return The number of characters in the buffer.
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_buffer_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the maximum allowed length of the text in {@code buffer}.
     * @return the maximum allowed number of characters
     *   in {@code GtkEntryBuffer}, or 0 if there is no maximum.
     */
    public int getMaxLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_buffer_get_max_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the contents of the buffer.
     * <p>
     * The memory pointer returned by this call will not change
     * unless this object emits a signal, or is finalized.
     * @return a pointer to the contents of the widget as a
     *   string. This string points to internally allocated storage
     *   in the buffer and must not be freed, modified or stored.
     */
    public @NotNull java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_entry_buffer_get_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param position the position at which to insert text.
     * @param chars the text to insert into the buffer.
     * @param nChars the length of the text in characters, or -1
     * @return The number of characters actually inserted.
     */
    public int insertText(int position, @NotNull java.lang.String chars, int nChars) {
        java.util.Objects.requireNonNull(chars, "Parameter 'chars' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_entry_buffer_insert_text.invokeExact(
                    handle(),
                    position,
                    Interop.allocateNativeString(chars),
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the maximum allowed length of the contents of the buffer.
     * <p>
     * If the current contents are longer than the given length, then
     * they will be truncated to fit.
     * @param maxLength the maximum length of the entry buffer, or 0 for no maximum.
     *   (other than the maximum length of entries.) The value passed in will
     *   be clamped to the range 0-65536.
     */
    public void setMaxLength(int maxLength) {
        try {
            DowncallHandles.gtk_entry_buffer_set_max_length.invokeExact(
                    handle(),
                    maxLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text in the buffer.
     * <p>
     * This is roughly equivalent to calling
     * {@link EntryBuffer#deleteText} and
     * {@link EntryBuffer#insertText}.
     * <p>
     * Note that {@code n_chars} is in characters, not in bytes.
     * @param chars the new text
     * @param nChars the number of characters in {@code text}, or -1
     */
    public void setText(@NotNull java.lang.String chars, int nChars) {
        java.util.Objects.requireNonNull(chars, "Parameter 'chars' must not be null");
        try {
            DowncallHandles.gtk_entry_buffer_set_text.invokeExact(
                    handle(),
                    Interop.allocateNativeString(chars),
                    nChars);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeletedText {
        void signalReceived(EntryBuffer source, int position, int nChars);
    }
    
    /**
     * The text is altered in the default handler for this signal.
     * <p>
     * If you want access to the text after the text has been modified,
     * use {@link org.gtk.gobject.ConnectFlags#AFTER}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryBuffer.DeletedText> onDeletedText(EntryBuffer.DeletedText handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("deleted-text"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryBuffer.Callbacks.class, "signalEntryBufferDeletedText",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryBuffer.DeletedText>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertedText {
        void signalReceived(EntryBuffer source, int position, @NotNull java.lang.String chars, int nChars);
    }
    
    /**
     * This signal is emitted after text is inserted into the buffer.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryBuffer.InsertedText> onInsertedText(EntryBuffer.InsertedText handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("inserted-text"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryBuffer.Callbacks.class, "signalEntryBufferInsertedText",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryBuffer.InsertedText>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_entry_buffer_new = Interop.downcallHandle(
            "gtk_entry_buffer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_delete_text = Interop.downcallHandle(
            "gtk_entry_buffer_delete_text",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_emit_deleted_text = Interop.downcallHandle(
            "gtk_entry_buffer_emit_deleted_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_emit_inserted_text = Interop.downcallHandle(
            "gtk_entry_buffer_emit_inserted_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_bytes = Interop.downcallHandle(
            "gtk_entry_buffer_get_bytes",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_length = Interop.downcallHandle(
            "gtk_entry_buffer_get_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_max_length = Interop.downcallHandle(
            "gtk_entry_buffer_get_max_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_text = Interop.downcallHandle(
            "gtk_entry_buffer_get_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_insert_text = Interop.downcallHandle(
            "gtk_entry_buffer_insert_text",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_set_max_length = Interop.downcallHandle(
            "gtk_entry_buffer_set_max_length",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_set_text = Interop.downcallHandle(
            "gtk_entry_buffer_set_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalEntryBufferDeletedText(MemoryAddress source, int position, int nChars, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EntryBuffer.DeletedText) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EntryBuffer(source, Ownership.UNKNOWN), position, nChars);
        }
        
        public static void signalEntryBufferInsertedText(MemoryAddress source, int position, MemoryAddress chars, int nChars, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EntryBuffer.InsertedText) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EntryBuffer(source, Ownership.UNKNOWN), position, Interop.getStringFrom(chars), nChars);
        }
    }
}
