package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The collection of tags in a {@code GtkTextBuffer}
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * <h1>GtkTextTagTables as GtkBuildable</h1>
 * <p>
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
public class TextTagTable extends org.gtk.gobject.Object implements Buildable {

    public TextTagTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TextTagTable */
    public static TextTagTable castFrom(org.gtk.gobject.Object gobject) {
        return new TextTagTable(gobject.refcounted());
    }
    
    static final MethodHandle gtk_text_tag_table_new = Interop.downcallHandle(
        "gtk_text_tag_table_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_tag_table_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTextTagTable}.
     * <p>
     * The table contains no tags by default.
     */
    public TextTagTable() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_text_tag_table_add = Interop.downcallHandle(
        "gtk_text_tag_table_add",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add a tag to the table.
     * <p>
     * The tag is assigned the highest priority in the table.
     * <p>
     * {@code tag} must not be in a tag table already, and may not have
     * the same name as an already-added tag.
     */
    public boolean add(TextTag tag) {
        try {
            var RESULT = (int) gtk_text_tag_table_add.invokeExact(handle(), tag.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_tag_table_foreach = Interop.downcallHandle(
        "gtk_text_tag_table_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} on each tag in {@code table}, with user data {@code data}.
     * <p>
     * Note that the table may not be modified while iterating
     * over it (you can’t add/remove tags).
     */
    public void foreach(TextTagTableForeach func) {
        try {
            gtk_text_tag_table_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTextTagTableForeach",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_tag_table_get_size = Interop.downcallHandle(
        "gtk_text_tag_table_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the size of the table (number of tags)
     */
    public int getSize() {
        try {
            var RESULT = (int) gtk_text_tag_table_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_tag_table_lookup = Interop.downcallHandle(
        "gtk_text_tag_table_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Look up a named tag.
     */
    public TextTag lookup(java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) gtk_text_tag_table_lookup.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return new TextTag(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_tag_table_remove = Interop.downcallHandle(
        "gtk_text_tag_table_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Remove a tag from the table.
     * <p>
     * If a {@code GtkTextBuffer} has {@code table} as its tag table, the tag is
     * removed from the buffer. The table’s reference to the tag is
     * removed, so the tag will end up destroyed if you don’t have
     * a reference to it.
     */
    public void remove(TextTag tag) {
        try {
            gtk_text_tag_table_remove.invokeExact(handle(), tag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TagAddedHandler {
        void signalReceived(TextTagTable source, TextTag tag);
    }
    
    /**
     * Emitted every time a new tag is added in the {@code GtkTextTagTable}.
     */
    public SignalHandle onTagAdded(TagAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tag-added").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.Callbacks.class, "signalTextTagTableTagAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TagChangedHandler {
        void signalReceived(TextTagTable source, TextTag tag, boolean sizeChanged);
    }
    
    /**
     * Emitted every time a tag in the {@code GtkTextTagTable} changes.
     */
    public SignalHandle onTagChanged(TagChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tag-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.Callbacks.class, "signalTextTagTableTagChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TagRemovedHandler {
        void signalReceived(TextTagTable source, TextTag tag);
    }
    
    /**
     * Emitted every time a tag is removed from the {@code GtkTextTagTable}.
     * <p>
     * The {@code tag} is still valid by the time the signal is emitted, but
     * it is not associated with a tag table any more.
     */
    public SignalHandle onTagRemoved(TagRemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("tag-removed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.Callbacks.class, "signalTextTagTableTagRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalTextTagTableTagAdded(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextTagTable.TagAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextTagTable(Refcounted.get(source)), new TextTag(Refcounted.get(tag, false)));
        }
        
        public static void signalTextTagTableTagChanged(MemoryAddress source, MemoryAddress tag, int sizeChanged, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextTagTable.TagChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextTagTable(Refcounted.get(source)), new TextTag(Refcounted.get(tag, false)), sizeChanged != 0);
        }
        
        public static void signalTextTagTableTagRemoved(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextTagTable.TagRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextTagTable(Refcounted.get(source)), new TextTag(Refcounted.get(tag, false)));
        }
        
    }
}
