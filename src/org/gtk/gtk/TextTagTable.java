package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public TextTagTable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextTagTable */
    public static TextTagTable castFrom(org.gtk.gobject.Object gobject) {
        return new TextTagTable(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_text_tag_table_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTextTagTable}.
     * <p>
     * The table contains no tags by default.
     */
    public TextTagTable() {
        super(constructNew());
    }
    
    /**
     * Add a tag to the table.
     * <p>
     * The tag is assigned the highest priority in the table.
     * <p>
     * {@code tag} must not be in a tag table already, and may not have
     * the same name as an already-added tag.
     */
    public boolean add(TextTag tag) {
        var RESULT = gtk_h.gtk_text_tag_table_add(handle(), tag.handle());
        return RESULT != 0;
    }
    
    /**
     * Calls {@code func} on each tag in {@code table}, with user data {@code data}.
     * <p>
     * Note that the table may not be modified while iterating
     * over it (you can’t add/remove tags).
     */
    public void foreach(TextTagTableForeach func) {
        try {
            gtk_h.gtk_text_tag_table_foreach(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTextTagTableForeach",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns the size of the table (number of tags)
     */
    public int getSize() {
        var RESULT = gtk_h.gtk_text_tag_table_get_size(handle());
        return RESULT;
    }
    
    /**
     * Look up a named tag.
     */
    public TextTag lookup(java.lang.String name) {
        var RESULT = gtk_h.gtk_text_tag_table_lookup(handle(), Interop.allocateNativeString(name).handle());
        return new TextTag(References.get(RESULT, false));
    }
    
    /**
     * Remove a tag from the table.
     * <p>
     * If a {@code GtkTextBuffer} has {@code table} as its tag table, the tag is
     * removed from the buffer. The table’s reference to the tag is
     * removed, so the tag will end up destroyed if you don’t have
     * a reference to it.
     */
    public void remove(TextTag tag) {
        gtk_h.gtk_text_tag_table_remove(handle(), tag.handle());
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("tag-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.class, "__signalTextTagTableTagAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalTextTagTableTagAdded(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TextTagTable.TagAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(References.get(source)), new TextTag(References.get(tag, false)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("tag-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.class, "__signalTextTagTableTagChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalTextTagTableTagChanged(MemoryAddress source, MemoryAddress tag, int sizeChanged, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TextTagTable.TagChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(References.get(source)), new TextTag(References.get(tag, false)), sizeChanged != 0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("tag-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextTagTable.class, "__signalTextTagTableTagRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalTextTagTableTagRemoved(MemoryAddress source, MemoryAddress tag, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (TextTagTable.TagRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TextTagTable(References.get(source)), new TextTag(References.get(tag, false)));
    }
    
}
