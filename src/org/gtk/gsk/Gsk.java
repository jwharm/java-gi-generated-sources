package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class Gsk {
    
    public static org.gtk.glib.Quark serializationErrorQuark() {
        var RESULT = gtk_h.gsk_serialization_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Parses the given @string into a transform and puts it in
     * @out_transform.
     * 
     * Strings printed via [method@Gsk.Transform.to_string]
     * can be read in again successfully using this function.
     * 
     * If @string does not describe a valid transform, %FALSE is
     * returned and %NULL is put in @out_transform.
     */
    public static boolean transformParse(java.lang.String string, Transform[] outTransform) {
        var RESULT = gtk_h.gsk_transform_parse(Interop.allocateNativeString(string).handle(), Interop.allocateNativeArray(outTransform).handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`, and acquires
     * a reference to it.
     */
    public static RenderNode valueDupRenderNode(org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gsk_value_dup_render_node(value.handle());
        return new RenderNode(References.get(RESULT, true));
    }
    
    /**
     * Retrieves the `GskRenderNode` stored inside the given `value`.
     */
    public static RenderNode valueGetRenderNode(org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gsk_value_get_render_node(value.handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Stores the given `GskRenderNode` inside `value`.
     * 
     * The [struct@GObject.Value] will acquire a reference to the `node`.
     */
    public static void valueSetRenderNode(org.gtk.gobject.Value value, RenderNode node) {
        gtk_h.gsk_value_set_render_node(value.handle(), node.handle());
    }
    
    /**
     * Stores the given `GskRenderNode` inside `value`.
     * 
     * This function transfers the ownership of the `node` to the `GValue`.
     */
    public static void valueTakeRenderNode(org.gtk.gobject.Value value, RenderNode node) {
        gtk_h.gsk_value_take_render_node(value.handle(), node.getReference().unowned().handle());
    }
    
}
