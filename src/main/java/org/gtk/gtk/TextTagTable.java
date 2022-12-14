package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The collection of tags in a {@code GtkTextBuffer}
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * <strong>GtkTextTagTables as GtkBuildable</strong><br/>
 * The {@code GtkTextTagTable} implementation of the {@code GtkBuildable} interface
 * supports adding tags by specifying “tag” as the “type” attribute
 * of a &lt;child&gt; element.
 * <p>
 * An example of a UI definition fragment specifying tags:
 * <pre>{@code xml
 * <object class="GtkTextTagTable">
 *  <child type="tag">
 *    <object class="GtkTextTag"/>
 *  </child>
 * </object>
 * }</pre>
 */
public class TextTagTable extends org.gtk.gobject.GObject implements org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextTagTable";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TextTagTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextTagTable(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextTagTable> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextTagTable(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_tag_table_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTextTagTable}.
     * <p>
     * The table contains no tags by default.
     */
    public TextTagTable() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Add a tag to the table.
     * <p>
     * The tag is assigned the highest priority in the table.
     * <p>
     * {@code tag} must not be in a tag table already, and may not have
     * the same name as an already-added tag.
     * @param tag a {@code GtkTextTag}
     * @return {@code true} on success.
     */
    public boolean add(org.gtk.gtk.TextTag tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_tag_table_add.invokeExact(
                    handle(),
                    tag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls {@code func} on each tag in {@code table}, with user data {@code data}.
     * <p>
     * Note that the table may not be modified while iterating
     * over it (you can’t add/remove tags).
     * @param func a function to call on each tag
     */
    public void foreach(org.gtk.gtk.TextTagTableForeach func) {
        try {
            DowncallHandles.gtk_text_tag_table_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the size of the table (number of tags)
     * @return number of tags in {@code table}
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_tag_table_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Look up a named tag.
     * @param name name of a tag
     * @return The tag
     */
    public @Nullable org.gtk.gtk.TextTag lookup(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_text_tag_table_lookup.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gtk.TextTag) Interop.register(RESULT, org.gtk.gtk.TextTag.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Remove a tag from the table.
     * <p>
     * If a {@code GtkTextBuffer} has {@code table} as its tag table, the tag is
     * removed from the buffer. The table’s reference to the tag is
     * removed, so the tag will end up destroyed if you don’t have
     * a reference to it.
     * @param tag a {@code GtkTextTag}
     */
    public void remove(org.gtk.gtk.TextTag tag) {
        try {
            DowncallHandles.gtk_text_tag_table_remove.invokeExact(
                    handle(),
                    tag.handle());
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
            RESULT = (long) DowncallHandles.gtk_text_tag_table_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code TagAdded} callback.
     */
    @FunctionalInterface
    public interface TagAdded {
    
        /**
         * Emitted every time a new tag is added in the {@code GtkTextTagTable}.
         */
        void run(org.gtk.gtk.TextTag tag);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextTagTable, MemoryAddress tag) {
            run((org.gtk.gtk.TextTag) Interop.register(tag, org.gtk.gtk.TextTag.fromAddress).marshal(tag, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TagAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted every time a new tag is added in the {@code GtkTextTagTable}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextTagTable.TagAdded> onTagAdded(TextTagTable.TagAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tag-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code TagChanged} callback.
     */
    @FunctionalInterface
    public interface TagChanged {
    
        /**
         * Emitted every time a tag in the {@code GtkTextTagTable} changes.
         */
        void run(org.gtk.gtk.TextTag tag, boolean sizeChanged);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextTagTable, MemoryAddress tag, int sizeChanged) {
            run((org.gtk.gtk.TextTag) Interop.register(tag, org.gtk.gtk.TextTag.fromAddress).marshal(tag, null), Marshal.integerToBoolean.marshal(sizeChanged, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TagChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted every time a tag in the {@code GtkTextTagTable} changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextTagTable.TagChanged> onTagChanged(TextTagTable.TagChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tag-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code TagRemoved} callback.
     */
    @FunctionalInterface
    public interface TagRemoved {
    
        /**
         * Emitted every time a tag is removed from the {@code GtkTextTagTable}.
         * <p>
         * The {@code tag} is still valid by the time the signal is emitted, but
         * it is not associated with a tag table any more.
         */
        void run(org.gtk.gtk.TextTag tag);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextTagTable, MemoryAddress tag) {
            run((org.gtk.gtk.TextTag) Interop.register(tag, org.gtk.gtk.TextTag.fromAddress).marshal(tag, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TagRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted every time a tag is removed from the {@code GtkTextTagTable}.
     * <p>
     * The {@code tag} is still valid by the time the signal is emitted, but
     * it is not associated with a tag table any more.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextTagTable.TagRemoved> onTagRemoved(TextTagTable.TagRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("tag-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TextTagTable.Builder} object constructs a {@link TextTagTable} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TextTagTable.Builder#build()}. 
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
         * Finish building the {@link TextTagTable} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextTagTable}.
         * @return A new instance of {@code TextTagTable} with the properties 
         *         that were set in the Builder object.
         */
        public TextTagTable build() {
            return (TextTagTable) org.gtk.gobject.GObject.newWithProperties(
                TextTagTable.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_tag_table_new = Interop.downcallHandle(
                "gtk_text_tag_table_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_tag_table_add = Interop.downcallHandle(
                "gtk_text_tag_table_add",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_tag_table_foreach = Interop.downcallHandle(
                "gtk_text_tag_table_foreach",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_tag_table_get_size = Interop.downcallHandle(
                "gtk_text_tag_table_get_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_tag_table_lookup = Interop.downcallHandle(
                "gtk_text_tag_table_lookup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_tag_table_remove = Interop.downcallHandle(
                "gtk_text_tag_table_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_tag_table_get_type = Interop.downcallHandle(
                "gtk_text_tag_table_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_text_tag_table_get_type != null;
    }
}
