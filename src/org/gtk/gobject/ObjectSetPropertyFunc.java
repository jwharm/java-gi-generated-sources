package org.gtk.gobject;

/**
 * The type of the {@code set_property} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectSetPropertyFunc {
        void onObjectSetPropertyFunc(Object object, int propertyId, Value value, ParamSpec pspec);
}
