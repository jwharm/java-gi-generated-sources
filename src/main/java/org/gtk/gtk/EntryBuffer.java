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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EntryBuffer.getType())) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_entry_buffer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface DeletedText {
        void signalReceived(EntryBuffer sourceEntryBuffer, int position, int nChars);
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
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
        void signalReceived(EntryBuffer sourceEntryBuffer, int position, @NotNull java.lang.String chars, int nChars);
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryBuffer.InsertedText>(handle(), RESULT);
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
         * A {@link EntryBuffer.Build} object constructs a {@link EntryBuffer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EntryBuffer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EntryBuffer} using {@link EntryBuffer#castFrom}.
         * @return A new instance of {@code EntryBuffer} with the properties 
         *         that were set in the Build object.
         */
        public EntryBuffer construct() {
            return EntryBuffer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EntryBuffer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The length (in characters) of the text in buffer.
         * @param length The value for the {@code length} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLength(int length) {
            names.add("length");
            values.add(org.gtk.gobject.Value.create(length));
            return this;
        }
        
        /**
         * The maximum length (in characters) of the text in the buffer.
         * @param maxLength The value for the {@code max-length} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxLength(int maxLength) {
            names.add("max-length");
            values.add(org.gtk.gobject.Value.create(maxLength));
            return this;
        }
        
        /**
         * The contents of the buffer.
         * @param text The value for the {@code text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_entry_buffer_new = Interop.downcallHandle(
            "gtk_entry_buffer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_delete_text = Interop.downcallHandle(
            "gtk_entry_buffer_delete_text",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_emit_deleted_text = Interop.downcallHandle(
            "gtk_entry_buffer_emit_deleted_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_emit_inserted_text = Interop.downcallHandle(
            "gtk_entry_buffer_emit_inserted_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_bytes = Interop.downcallHandle(
            "gtk_entry_buffer_get_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_length = Interop.downcallHandle(
            "gtk_entry_buffer_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_max_length = Interop.downcallHandle(
            "gtk_entry_buffer_get_max_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_text = Interop.downcallHandle(
            "gtk_entry_buffer_get_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_insert_text = Interop.downcallHandle(
            "gtk_entry_buffer_insert_text",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_set_max_length = Interop.downcallHandle(
            "gtk_entry_buffer_set_max_length",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_set_text = Interop.downcallHandle(
            "gtk_entry_buffer_set_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_entry_buffer_get_type = Interop.downcallHandle(
            "gtk_entry_buffer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalEntryBufferDeletedText(MemoryAddress sourceEntryBuffer, int position, int nChars, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EntryBuffer.DeletedText) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EntryBuffer(sourceEntryBuffer, Ownership.NONE), position, nChars);
        }
        
        public static void signalEntryBufferInsertedText(MemoryAddress sourceEntryBuffer, int position, MemoryAddress chars, int nChars, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EntryBuffer.InsertedText) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EntryBuffer(sourceEntryBuffer, Ownership.NONE), position, Interop.getStringFrom(chars), nChars);
        }
    }
}
