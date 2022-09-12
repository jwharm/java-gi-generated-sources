package org.gtk.gobject;

/**
 * The type of the @set_property function of #GObjectClass.
 */
@FunctionalInterface
public interface ObjectSetPropertyFunc {
        void onObjectSetPropertyFunc(Object object, int propertyId, Value value, ParamSpec pspec);
}
