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
public class TextTagTable extends org.gtk.gobject.Object implements org.gtk.gtk.Buildable {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextTagTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TextTagTable if its GType is a (or inherits from) "GtkTextTagTable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TextTagTable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTextTagTable", a ClassCastException will be thrown.
     */
    public static TextTagTable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), TextTagTable.getType())) {
            return new TextTagTable(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTextTagTable");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
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
    public boolean add(@NotNull org.gtk.gtk.TextTag tag) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_tag_table_add.invokeExact(
                    handle(),
                    tag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls {@code func} on each tag in {@code table}, with user data {@code data}.
     * <p>
     * Note that the table may not be modified while iterating
     * over it (you can’t add/remove tags).
     * @param func a function to call on each tag
     */
    public void foreach(@NotNull org.gtk.gtk.TextTagTableForeach func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_text_tag_table_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTextTagTableForeach",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
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
            RESULT = (int) DowncallHandles.gtk_text_tag_table_get_size.invokeExact(
                    handle());
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
    public @Nullable org.gtk.gtk.TextTag lookup(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_tag_table_lookup.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextTag(RESULT, Ownership.NONE);
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
    public void remove(@NotNull org.gtk.gtk.TextTag tag) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_text_tag_table_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface TagAdded {
        void signalReceived(TextTagTable source, @NotNull org.gtk.gtk.TextTag tag);
    }
    
    /**
     * Emitted every time a new tag is added in the {@code GtkTextTagTable}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextTagTable.TagAdded> onTagAdded(TextTagTable.TagAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tag-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.Callbacks.class, "signalTextTagTableTagAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextTagTable.TagAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TagChanged {
        void signalReceived(TextTagTable source, @NotNull org.gtk.gtk.TextTag tag, boolean sizeChanged);
    }
    
    /**
     * Emitted every time a tag in the {@code GtkTextTagTable} changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextTagTable.TagChanged> onTagChanged(TextTagTable.TagChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tag-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.Callbacks.class, "signalTextTagTableTagChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextTagTable.TagChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TagRemoved {
        void signalReceived(TextTagTable source, @NotNull org.gtk.gtk.TextTag tag);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tag-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.Callbacks.class, "signalTextTagTableTagRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextTagTable.TagRemoved>(handle(), RESULT);
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
         * A {@link TextTagTable.Build} object constructs a {@link TextTagTable} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TextTagTable} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextTagTable} using {@link TextTagTable#castFrom}.
         * @return A new instance of {@code TextTagTable} with the properties 
         *         that were set in the Build object.
         */
        public TextTagTable construct() {
            return TextTagTable.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TextTagTable.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
    
    private static class Callbacks {
        
        public static void signalTextTagTableTagAdded(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TextTagTable.TagAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextTagTable(source, Ownership.NONE), new org.gtk.gtk.TextTag(tag, Ownership.NONE));
        }
        
        public static void signalTextTagTableTagChanged(MemoryAddress source, MemoryAddress tag, int sizeChanged, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TextTagTable.TagChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextTagTable(source, Ownership.NONE), new org.gtk.gtk.TextTag(tag, Ownership.NONE), sizeChanged != 0);
        }
        
        public static void signalTextTagTableTagRemoved(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TextTagTable.TagRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextTagTable(source, Ownership.NONE), new org.gtk.gtk.TextTag(tag, Ownership.NONE));
        }
    }
}
