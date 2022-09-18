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
     * Strings printed via {@link org.gtk.gsk.Transform<code>#toString</code> 
     * can be read in again successfully using this function.
     * 
     * If @string does not describe a valid transform, <code>false</code> is
     * returned and <code>null</code> is put in @out_transform.
     */
    public static boolean transformParse(java.lang.String string, Transform[] outTransform) {
        var RESULT = gtk_h.gsk_transform_parse(Interop.allocateNativeString(string).handle(), Interop.allocateNativeArray(outTransform).handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the <code>GskRenderNode</code> stored inside the given <code>value</code>, and acquires
     * a reference to it.
     */
    public static RenderNode valueDupRenderNode(org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gsk_value_dup_render_node(value.handle());
        return new RenderNode(References.get(RESULT, true));
    }
    
    /**
     * Retrieves the <code>GskRenderNode</code> stored inside the given <code>value</code>.
     */
    public static RenderNode valueGetRenderNode(org.gtk.gobject.Value value) {
        var RESULT = gtk_h.gsk_value_get_render_node(value.handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Stores the given <code>GskRenderNode</code> inside <code>value</code>.
     * <p>
     * The {@link [struct@GObject.Value] (ref=struct)} will acquire a reference to the <code>node</code>.
     */
    public static void valueSetRenderNode(org.gtk.gobject.Value value, RenderNode node) {
        gtk_h.gsk_value_set_render_node(value.handle(), node.handle());
    }
    
    /**
     * Stores the given <code>GskRenderNode</code> inside <code>value</code>.
     * <p>
     * This function transfers the ownership of the <code>node</code> to the <code>GValue</code>.
     */
    public static void valueTakeRenderNode(org.gtk.gobject.Value value, RenderNode node) {
        gtk_h.gsk_value_take_render_node(value.handle(), node.getReference().unowned().handle());
    }
    
}
