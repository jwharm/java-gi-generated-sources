package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The collection of tags in a <code>GtkTextBuffer</code>
 * <p>
 * You may wish to begin by reading the
 * {@link [text widget conceptual overview]}(section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * <h1>GtkTextTagTables as GtkBuildable</h1>
 * <p>
 * The <code>GtkTextTagTable</code> implementation of the <code>GtkBuildable</code> interface
 * supports adding tags by specifying &<code>#8220</code> tag&<code>#8221</code>  as the &<code>#8220</code> type&<code>#8221</code>  attribute
 * of a &<code>#60</code> child&<code>#62</code>  element.
 * <p>
 * An example of a UI definition fragment specifying tags:<pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkTextTagTable&<code>#34</code> &<code>#62</code> 
 *  &<code>#60</code> child type=&<code>#34</code> tag&<code>#34</code> &<code>#62</code> 
 *    &<code>#60</code> object class=&<code>#34</code> GtkTextTag&<code>#34</code> /&<code>#62</code> 
 *  &<code>#60</code> /child&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
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
     * Creates a new <code>GtkTextTagTable</code>.
     * 
     * The table contains no tags by default.
     */
    public TextTagTable() {
        super(constructNew());
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
        var RESULT = gtk_h.gtk_text_tag_table_add(handle(), tag.handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls @func on each tag in @table, with user data @data.
     * 
     * Note that the table may not be modified while iterating
     * over it (you can&<code>#8217</code> t add/remove tags).
     */
    public void foreach(TextTagTableForeach func) {
        try {
            gtk_h.gtk_text_tag_table_foreach(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTextTagTableForeach",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
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
     * If a <code>GtkTextBuffer</code> has @table as its tag table, the tag is
     * removed from the buffer. The table&<code>#8217</code> s reference to the tag is
     * removed, so the tag will end up destroyed if you don&<code>#8217</code> t have
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
     * Emitted every time a new tag is added in the <code>GtkTextTagTable</code>.
     */
    public SignalHandle onTagAdded(TagAddedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextTagTableTagAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("tag-added").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface TagChangedHandler {
        void signalReceived(TextTagTable source, TextTag tag, boolean sizeChanged);
    }
    
    /**
     * Emitted every time a tag in the <code>GtkTextTagTable</code> changes.
     */
    public SignalHandle onTagChanged(TagChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextTagTableTagChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("tag-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface TagRemovedHandler {
        void signalReceived(TextTagTable source, TextTag tag);
    }
    
    /**
     * Emitted every time a tag is removed from the <code>GtkTextTagTable</code>.
     * 
     * The @tag is still valid by the time the signal is emitted, but
     * it is not associated with a tag table any more.
     */
    public SignalHandle onTagRemoved(TagRemovedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextTagTableTagRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("tag-removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
