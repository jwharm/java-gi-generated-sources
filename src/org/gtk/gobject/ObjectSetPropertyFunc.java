package org.gtk.gobject;

@FunctionalInterface
public interface ObjectSetPropertyFunc {

    /**
     * The type of the @set_property function of #GObjectClass.
     */
    public void onObjectSetPropertyFunc(Object object, int propertyId, Value value, ParamSpec pspec);
}
