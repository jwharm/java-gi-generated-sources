package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The class structure for the GObject type.
 * 
 * |[<!-- language="C" -->
 * // Example of implementing a singleton using a constructor.
 * static MySingleton *the_singleton = NULL;
 * 
 * static GObject*
 * my_singleton_constructor (GType                  type,
 *                           guint                  n_construct_params,
 *                           GObjectConstructParam *construct_params)
 * {
 *   GObject *object;
 *   
 *   if (!the_singleton)
 *     {
 *       object = G_OBJECT_CLASS (parent_class)->constructor (type,
 *                                                            n_construct_params,
 *                                                            construct_params);
 *       the_singleton = MY_SINGLETON (object);
 *     }
 *   else
 *     object = g_object_ref (G_OBJECT (the_singleton));
 * 
 *   return object;
 * }
 * ]|
 */
public class ObjectClass extends io.github.jwharm.javagi.ResourceBase {

    public ObjectClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Looks up the #GParamSpec for a property of a class.
     */
    public ParamSpec findProperty(java.lang.String propertyName) {
        var RESULT = gtk_h.g_object_class_find_property(handle(), Interop.allocateNativeString(propertyName).handle());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Installs new properties from an array of #GParamSpecs.
     * 
     * All properties should be installed during the class initializer.  It
     * is possible to install properties after that, but doing so is not
     * recommend, and specifically, is not guaranteed to be thread-safe vs.
     * use of properties on the same type on other threads.
     * 
     * The property id of each property is the index of each #GParamSpec in
     * the @pspecs array.
     * 
     * The property id of 0 is treated specially by #GObject and it should not
     * be used to store a #GParamSpec.
     * 
     * This function should be used if you plan to use a static array of
     * #GParamSpecs and g_object_notify_by_pspec(). For instance, this
     * class initialization:
     * 
     * |[<!-- language="C" -->
     * enum {
     *   PROP_0, PROP_FOO, PROP_BAR, N_PROPERTIES
     * };
     * 
     * static GParamSpec *obj_properties[N_PROPERTIES] = { NULL, };
     * 
     * static void
     * my_object_class_init (MyObjectClass *klass)
     * {
     *   GObjectClass *gobject_class = G_OBJECT_CLASS (klass);
     * 
     *   obj_properties[PROP_FOO] =
     *     g_param_spec_int ("foo", "Foo", "Foo",
     *                       -1, G_MAXINT,
     *                       0,
     *                       G_PARAM_READWRITE);
     * 
     *   obj_properties[PROP_BAR] =
     *     g_param_spec_string ("bar", "Bar", "Bar",
     *                          NULL,
     *                          G_PARAM_READWRITE);
     * 
     *   gobject_class->set_property = my_object_set_property;
     *   gobject_class->get_property = my_object_get_property;
     *   g_object_class_install_properties (gobject_class,
     *                                      N_PROPERTIES,
     *                                      obj_properties);
     * }
     * ]|
     * 
     * allows calling g_object_notify_by_pspec() to notify of property changes:
     * 
     * |[<!-- language="C" -->
     * void
     * my_object_set_foo (MyObject *self, gint foo)
     * {
     *   if (self->foo != foo)
     *     {
     *       self->foo = foo;
     *       g_object_notify_by_pspec (G_OBJECT (self), obj_properties[PROP_FOO]);
     *     }
     *  }
     * ]|
     */
    public void installProperties(int nPspecs, ParamSpec[] pspecs) {
        gtk_h.g_object_class_install_properties(handle(), nPspecs, Interop.allocateNativeArray(pspecs).handle());
    }
    
    /**
     * Installs a new property.
     * 
     * All properties should be installed during the class initializer.  It
     * is possible to install properties after that, but doing so is not
     * recommend, and specifically, is not guaranteed to be thread-safe vs.
     * use of properties on the same type on other threads.
     * 
     * Note that it is possible to redefine a property in a derived class,
     * by installing a property with the same name. This can be useful at times,
     * e.g. to change the range of allowed values or the default value.
     */
    public void installProperty(int propertyId, ParamSpec pspec) {
        gtk_h.g_object_class_install_property(handle(), propertyId, pspec.handle());
    }
    
    /**
     * Registers @property_id as referring to a property with the name
     * @name in a parent class or in an interface implemented by @oclass.
     * This allows this class to "override" a property implementation in
     * a parent class or to provide the implementation of a property from
     * an interface.
     * 
     * Internally, overriding is implemented by creating a property of type
     * #GParamSpecOverride; generally operations that query the properties of
     * the object class, such as g_object_class_find_property() or
     * g_object_class_list_properties() will return the overridden
     * property. However, in one case, the @construct_properties argument of
     * the @constructor virtual function, the #GParamSpecOverride is passed
     * instead, so that the @param_id field of the #GParamSpec will be
     * correct.  For virtually all uses, this makes no difference. If you
     * need to get the overridden property, you can call
     * g_param_spec_get_redirect_target().
     */
    public void overrideProperty(int propertyId, java.lang.String name) {
        gtk_h.g_object_class_override_property(handle(), propertyId, Interop.allocateNativeString(name).handle());
    }
    
}
