package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GBinding is the representation of a binding between a property on a
 * #GObject instance (or source) and another property on another #GObject
 * instance (or target).
 * 
 * Whenever the source property changes, the same value is applied to the
 * target property; for instance, the following binding:
 * 
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 *   g_object_bind_property (object1, &#34;property-a&#34;,
 *                           object2, &#34;property-b&#34;,
 *                           G_BINDING_DEFAULT);
 * ]}|
 * 
 * will cause the property named &#34;property-b&#34; of @object2 to be updated
 * every time g_object_set() or the specific accessor changes the value of
 * the property &#34;property-a&#34; of @object1.
 * 
 * It is possible to create a bidirectional binding between two properties
 * of two #GObject instances, so that if either property changes, the
 * other is updated as well, for instance:
 * 
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 *   g_object_bind_property (object1, &#34;property-a&#34;,
 *                           object2, &#34;property-b&#34;,
 *                           G_BINDING_BIDIRECTIONAL);
 * ]}|
 * 
 * will keep the two properties in sync.
 * 
 * It is also possible to set a custom transformation function (in both
 * directions, in case of a bidirectional binding) to apply a custom
 * transformation from the source value to the target value before
 * applying it; for instance, the following binding:
 * 
 * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
 *   g_object_bind_property_full (adjustment1, &#34;value&#34;,
 *                                adjustment2, &#34;value&#34;,
 *                                G_BINDING_BIDIRECTIONAL,
 *                                celsius_to_fahrenheit,
 *                                fahrenheit_to_celsius,
 *                                NULL, NULL);
 * ]}|
 * 
 * will keep the &#34;value&#34; property of the two adjustments in sync; the
 * @celsius_to_fahrenheit function will be called whenever the &#34;value&#34;
 * property of @adjustment1 changes and will transform the current value
 * of the property before applying it to the &#34;value&#34; property of @adjustment2.
 * 
 * Vice versa, the @fahrenheit_to_celsius function will be called whenever
 * the &#34;value&#34; property of @adjustment2 changes, and will transform the
 * current value of the property before applying it to the &#34;value&#34; property
 * of @adjustment1.
 * 
 * Note that #GBinding does not resolve cycles by itself; a cycle like
 * 
 * |{@link [
 *   object1:propertyA -&#62; object2:propertyB
 *   object2:propertyB -&#62; object3:propertyC
 *   object3:propertyC -&#62; object1:propertyA
 * ]}|
 * 
 * might lead to an infinite loop. The loop, in this particular case,
 * can be avoided if the objects emit the #GObject::notify signal only
 * if the value has effectively been changed. A binding is implemented
 * using the #GObject::notify signal, so it is susceptible to all the
 * various ways of blocking a signal emission, like g_signal_stop_emission()
 * or g_signal_handler_block().
 * 
 * A binding will be severed, and the resources it allocates freed, whenever
 * either one of the #GObject instances it refers to are finalized, or when
 * the #GBinding instance loses its last reference.
 * 
 * Bindings for languages with garbage collection can use
 * g_binding_unbind() to explicitly release a binding between the source
 * and target properties, instead of relying on the last reference on the
 * binding, source, and target instances to drop.
 * 
 * #GBinding is available since GObject 2.26
 */
public class Binding extends Object {

    public Binding(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Binding */
    public static Binding castFrom(org.gtk.gobject.Object gobject) {
        return new Binding(gobject.getReference());
    }
    
    /**
     * Retrieves the #GObject instance used as the source of the binding.
     * 
     * A #GBinding can outlive the source #GObject as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return 
     *       
     *         Retrieves the #GObject instance used as the source of the binding.
     * 
     * A #GBinding can outlive the source #GObject as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return %NULL.
     */
    public Object dupSource() {
        var RESULT = gtk_h.g_binding_dup_source(handle());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Retrieves the #GObject instance used as the target of the binding.
     * 
     * A #GBinding can outlive the target #GObject as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return 
     *             
     *           
     *         
     *       
     *       
     *         Retrieves the #GObject instance used as the target of the binding.
     * 
     * A #GBinding can outlive the target #GObject as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return %NULL.
     */
    public Object dupTarget() {
        var RESULT = gtk_h.g_binding_dup_target(handle());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Retrieves the flags passed when constructing the #GBinding.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_binding_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the name of the property of #GBinding:source used as the source
     * of the binding.
     */
    public java.lang.String getSourceProperty() {
        var RESULT = gtk_h.g_binding_get_source_property(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the name of the property of #GBinding:target used as the target
     * of the binding.
     */
    public java.lang.String getTargetProperty() {
        var RESULT = gtk_h.g_binding_get_target_property(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Explicitly releases the binding between the source and the target
     * property expressed by @binding.
     * 
     * This function will release the reference that is being held on
     * the @binding instance if the binding is still bound; if you want to hold on
     * to the #GBinding instance after calling g_binding_unbind(), you will need
     * to hold a reference to it.
     * 
     * Note however that this function does not take ownership of @binding, it
     * only unrefs the reference that was initially created by
     * g_object_bind_property() and is owned by the binding.
     */
    public void unbind() {
        gtk_h.g_binding_unbind(handle());
    }
    
}
