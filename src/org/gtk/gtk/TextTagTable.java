package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The collection of tags in a `GtkTextBuffer`
 * 
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * 
 * # GtkTextTagTables as GtkBuildable
 * 
 * The `GtkTextTagTable` implementation of the `GtkBuildable` interface
 * supports adding tags by specifying “tag” as the “type” attribute
 * of a <child> element.
 * 
 * An example of a UI definition fragment specifying tags:
 * ```xml
 * <object class="GtkTextTagTable">
 *  <child type="tag">
 *    <object class="GtkTextTag"/>
 *  </child>
 * </object>
 * ```
 */
public class TextTagTable extends org.gtk.gobject.Object implements Buildable {

    public TextTagTable(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextTagTable */
    public static TextTagTable castFrom(org.gtk.gobject.Object gobject) {
        return new TextTagTable(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkTextTagTable`.
     * 
     * The table contains no tags by default.
     */
    public TextTagTable() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_table_new(), true));
    }
    
    /**
     * Add a tag to the table.
     * 
     * The tag is assigned the highest priority in the table.
     * 
     * @tag must not be in a tag table already, and may not have
     * the same name as an already-added tag.
     */
    public boolean add(TextTag tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_table_add(HANDLE(), tag.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the size of the table (number of tags)
     */
    public int getSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_table_get_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Look up a named tag.
     */
    public TextTag lookup(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_table_lookup(HANDLE(), Interop.allocateNativeString(name).HANDLE());
        return new TextTag(References.get(RESULT, false));
    }
    
    /**
     * Remove a tag from the table.
     * 
     * If a `GtkTextBuffer` has @table as its tag table, the tag is
     * removed from the buffer. The table’s reference to the tag is
     * removed, so the tag will end up destroyed if you don’t have
     * a reference to it.
     */
    public void remove(TextTag tag) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_tag_table_remove(HANDLE(), tag.HANDLE());
    }
    
    @FunctionalInterface
    public interface TagAddedHandler {
        void signalReceived(TextTagTable source, TextTag tag);
    }
    
    /**
     * Emitted every time a new tag is added in the `GtkTextTagTable`.
     */
    public void onTagAdded(TagAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextTagTableTagAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("tag-added").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface TagChangedHandler {
        void signalReceived(TextTagTable source, TextTag tag, boolean sizeChanged);
    }
    
    /**
     * Emitted every time a tag in the `GtkTextTagTable` changes.
     */
    public void onTagChanged(TagChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextTagTableTagChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("tag-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface TagRemovedHandler {
        void signalReceived(TextTagTable source, TextTag tag);
    }
    
    /**
     * Emitted every time a tag is removed from the `GtkTextTagTable`.
     * 
     * The @tag is still valid by the time the signal is emitted, but
     * it is not associated with a tag table any more.
     */
    public void onTagRemoved(TagRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextTagTableTagRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("tag-removed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
